# ConstructionXpert-Services---Microservices
# ConstructionXpert Services

## Description
**ConstructionXpert Services** est une application de gestion de projets de construction développée en utilisant une architecture microservices. Chaque microservice gère une partie distincte des fonctionnalités, comme la gestion des projets, la gestion des tâches, et la gestion des ressources. L'application utilise des API RESTful sécurisées pour la communication entre les services.

## Architecture
L'application est divisée en plusieurs microservices :

1. **Gestion des Projets** : Gère la création, la mise à jour, l'affichage, et la suppression des projets.
2. **Gestion des Tâches** : Gère la création, la mise à jour, l'affichage, et la suppression des tâches associées à un projet.
3. **Gestion des Ressources** : Gère l'ajout, la mise à jour, l'affichage, et la suppression des ressources nécessaires aux projets.

### Technologies Utilisées
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **Spring Web**
- **MySQL** (pour `Gestion des Projets` et `Gestion des Tâches`)
- **PostgreSQL** (pour `Gestion des Ressources`)
- **Flyway** pour la gestion des migrations de la base de données
- **Eureka** pour le service de registry/discovery
- **Maven** pour la gestion des dépendances

## Structure des Microservices

### 1. **Gestion des Projets**
- **Base de données :** MySQL
- **Fonctionnalités :**
  - Créer un nouveau projet.
  - Afficher la liste des projets existants.
  - Mettre à jour les détails d'un projet existant.
  - Supprimer un projet existant.

### 2. **Gestion des Tâches**
- **Base de données :** MySQL
- **Fonctionnalités :**
  - Créer une nouvelle tâche.
  - Afficher la liste des tâches associées à un projet.
  - Mettre à jour les détails d'une tâche existante.
  - Supprimer une tâche existante.

### 3. **Gestion des Ressources**
- **Base de données :** PostgreSQL
- **Fonctionnalités :**
  - Ajouter de nouvelles ressources.
  - Afficher la liste des ressources disponibles.
  - Mettre à jour les détails d'une ressource existante.
  - Supprimer une ressource existante.

## Configuration et Installation

### Prérequis
- Java 17 installé.
- Maven installé.
- MySQL et PostgreSQL installés et configurés.

### Cloner le Repository
```bash
git clone https://github.com/votre-utilisateur/constructionxpert-services.git
cd constructionxpert-services
