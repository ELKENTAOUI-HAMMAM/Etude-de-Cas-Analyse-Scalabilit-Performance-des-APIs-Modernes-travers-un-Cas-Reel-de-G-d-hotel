# Étude de Cas : Analyse Scalabilité/Performance des APIs Modernes

Ce projet implémente une plateforme de réservation d'hôtels exposant les **mêmes** fonctionnalités métier via 4 protocoles différents pour comparer leurs performances :
- **REST**
- **SOAP**
- **GraphQL**
- **gRPC**

## Prérequis
- Java 17+
- Maven
- Docker (pour la base de données)

## Installation et Démarrage

1. **Démarrer la Base de Données**
   ```bash
   docker-compose up -d
   ```
   Ceci démarrera une instance MySQL sur le port 3307.

2. **Compiler le Projet**
   ```bash
   mvn clean install
   ```
   Cette étape va :
   - Générer les sources gRPC à partir de `src/main/proto/hotel.proto`.
   - Compiler tout le code Java.

3. **Lancer l'Application**
   ```bash
   mvn spring-boot:run
   ```
   L'application démarrera sur le port **8080** (Web) et **9090** (gRPC).

## Accès aux APIs

### REST
- URL de base : `http://localhost:8080/api/rest`
- Exemples :
    - `GET /reservations`
    - `POST /reservations?clientId=1&chambreId=1`

### SOAP
- WSDL : `http://localhost:8080/services/reservations?wsdl`
- Endpoint : `http://localhost:8080/services/reservations`

### GraphQL
- Interface GraphiQL : `http://localhost:8080/graphiql`
- Endpoint : `http://localhost:8080/graphql`
- Exemple de Query :
  ```graphql
  query {
    getAllReservations {
      id
      client { nom }
    }
  }
  ```

### gRPC
- Serveur : `localhost:9090`
- Outil recommandé : BloomRPC ou Postman (avec support gRPC).

## Tests de Performance
Utilisez les outils suivants pour tester les endpoints :
- **JMeter** : Scénarios complexes HTTP/SOAP.
- **k6** : Tests de charge scriptés en JS.
- **Gatling** : Tests haute performance.
