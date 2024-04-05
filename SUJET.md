---
titre: Java avancé - Examen de TP
sous-titre: Gestion de tâches avec Java Swing et SOLID
auteur: Philippe \textsc{Roussille}
date: 3iL 1A 2023
sommaire: true
---

# Modalités

L'objectif de ce TP est de créer une application de gestion de tâches en utilisant Java Swing. Cette application permettra aux utilisateurs de créer, visualiser, modifier et supprimer des tâches, en mettant l'accent sur la conception SOLID.

**Durée :** 1h30-2h

**Documents papiers autorisés** : tous

**Fichiers autorisés** : dépôts Git de TP, accès à la documentation Java en ligne, accès à StackOverflow.

**Utilitaires interdits** : ChatGPT, modèles de langue


# Grille de notation

## Non respect des consignes de rendu

- Mauvais fork : **-5**
- Clonage incorrect du dépôt forké : **-1**
- Absence/mauvais contenu du fichier `AUTHORS` : **-20**
- Absence/mauvais contenu du fichier `DONE.md` : **-10**
- Fichiers `AUTHORS` et `DONE.md` sur une autre branche que la branche par défaut : **-5**
- Commits irréguliers : **-5**
- Compilation échouée : **-50 (si non compilable)**

**Remarque :** Le non-respect strict des consignes de rendu **peut conduire à une note de 0 pour l'examen**.

## Bonnes pratiques (maximum 12 points)

- Respect des principes SOLID : **(2 points)**
- Nomination appropriée des classes et méthodes : **(1 point)**
- Utilisation de commentaires explicatifs : **(1 point)**
- Gestion correcte des exceptions : **(1 point)**
- Utilisation de l'encapsulation : **(1 point)**
- Respect des conventions de codage : **(1 point)**
- Utilisation de Javadoc pour documenter les classes et méthodes : **(2 points)**
- Documentation claire sur l'utilisation de Git : **(3 points)**

## Implémentation des fonctionnalités (maximum 18 points)

- Ajout d'une tâche : **(3 points)**
  - Formulaire de saisie des détails de la tâche.
  - Bouton "Ajouter".
  - Test unitaire associé.
  - Explication du travail réalisé.

- Modification d'une tâche : **(3 points)**
  - Mécanisme de sélection et de modification de la tâche.
  - Bouton "Modifier".
  - Test unitaire associé.
  - Explication du travail réalisé.

- Suppression d'une tâche : **(3 points)**
  - Mécanisme de sélection et de suppression de la tâche.
  - Bouton "Supprimer".
  - Test unitaire associé.
  - Explication du travail réalisé.

- Visualisation des tâches : **(3 points)**
  - Affichage des détails des tâches existantes.
  - Mécanisme de filtrage ou de tri des tâches.
  - Test unitaire associé.
  - Explication du travail réalisé.

- Gestion des priorités : **(3 points)**
  - Possibilité de définir la priorité lors de l'ajout ou de la modification de la tâche.
  - Test unitaire associé.
  - Explication du travail réalisé.

- Possibilité d'évolution : **(3 points)**
  - Description claire des fonctionnalités potentielles à ajouter dans le futur pour améliorer l'application.
  - Réflexion sur la modularité et la scalabilité de l'application pour faciliter les évolutions futures.

## Utilisation de `git` (maximum 2 points)

- Utilisation appropriée de Git : **(2 points)**
  - Commits réguliers et significatifs.
  - Utilisation appropriée des branches.

## Bonus (8 points)

- Implémentation de la sérialisation des tâches : **(8 points)**
  - Sauvegarde des tâches lors de la fermeture de l'application.
  - Chargement des tâches lors de l'ouverture de l'application.
  - Test unitaire associé.

# Rendu du projet

Le rendu du projet doit être effectué via Git, en forkant le dépôt situé à [https://github.com/PhilR3iL/3il-rodez-java-22-examen-tp](https://github.com/PhilR3iL/3il-rodez-java-22-examen-tp).

## Instructions pour le rendu

1. **Fork du dépôt :**
   - Chaque étudiant doit commencer par créer un fork du dépôt de l'examen sur GitHub en se rendant à l'URL : [https://github.com/PhilR3iL/3il-rodez-java-22-examen-tp](https://github.com/PhilR3iL/3il-rodez-java-22-examen-tp).

2. **Clonage du dépôt forké :**
   - Après avoir forké le dépôt, chaque étudiant doit cloner son propre fork sur sa machine virtuelle en utilisant la commande `git clone`.

3. **Ajout du fichier `AUTHORS` et `DONE.md` :**
   - À la racine du dépôt forké, chaque étudiant doit inclure un fichier nommé `AUTHORS` (sans extension) qui contient son nom et son email. **Ce fichier est indispensable pour que votre projet soit corrigé. L'absence ou la mauvaise réalisation de ce fichier dispense votre travail d'être corrigé.**
   - Le fichier `DONE.md` est un document dans lequel vous allez récapituler les réalisations de votre projet, conformément aux exigences de l'examen de TP. Ce fichier vous permettra de fournir une vue d'ensemble claire et concise de l'état d'avancement de votre travail. Assurez-vous de détailler toutes les fonctionnalités que vous avez implémentées, ainsi que les aspects architecturaux, les bonnes pratiques de programmation suivies et les étapes de livraison du projet. Ce document sera crucial pour l'évaluation de votre projet, car il permettra de comprendre rapidement ce que vous avez accompli et de vérifier si vous avez respecté les exigences de l'examen. Soyez précis et exhaustif dans vos réponses pour présenter au mieux votre travail.

4. **Développement du projet :**
   - Les étudiants doivent travailler sur leur propre copie du projet, en implémentant les fonctionnalités demandées et en suivant les consignes fournies dans l'énoncé du TP.

5. **Validation et suivi du projet :**
   - Les étudiants sont encouragés à valider régulièrement leur travail en effectuant des commits et des pushs sur leur fork du dépôt.

Les étudiants sont encouragés à suivre attentivement ces instructions pour assurer une soumission réussie et une évaluation appropriée de leur travail.

# Fonctionnalités

1. Ajout d'une tâche : Les utilisateurs doivent pouvoir ajouter de nouvelles tâches en fournissant un titre, une description, une date d'échéance, etc.
2. Modification d'une tâche : Les utilisateurs doivent pouvoir modifier les détails d'une tâche existante.
3. Suppression d'une tâche : Les utilisateurs doivent pouvoir supprimer une tâche de la liste.
4. Visualisation des tâches : Affichez la liste des tâches existantes avec leurs détails.
5. Gestion des priorités : Implémentez la possibilité pour les utilisateurs de définir des priorités pour les tâches (haute, moyenne, basse).

# Architecture

1. **Modèle :**
   - Créez une classe Task pour représenter une tâche. Assurez-vous que la classe Task respecte le principe de responsabilité unique en se concentrant uniquement sur la gestion des données d'une tâche.
   - Utilisez des interfaces ou des classes abstraites pour séparer la logique métier de la gestion des données, ce qui permettra une meilleure extensibilité et facilité de maintenance.

2. **Vue :**
   - Implémentez une interface utilisateur Swing permettant aux utilisateurs d'interagir avec les tâches. Cette interface devrait inclure des composants tels que des boutons pour ajouter, modifier, supprimer des tâches, une liste pour afficher les tâches existantes, etc.
   - Assurez-vous que la vue est séparée du modèle et du contrôleur, suivant ainsi le principe d'interface ségrégée.

3. **Contrôleur :**
   - Créez une classe Controller pour gérer les interactions entre la vue et le modèle. Le contrôleur devrait être responsable de la mise à jour du modèle en réponse aux actions de l'utilisateur, ainsi que de la mise à jour de la vue pour refléter les changements dans le modèle.
   - Appliquez le principe d'inversion de dépendance en faisant en sorte que le contrôleur dépende des abstractions plutôt que des implémentations concrètes.

4. **Tests :**
   - Écrivez des tests unitaires pour chaque composant de votre application (modèle, vue, contrôleur) en utilisant (si vous jugez nécessaire) un framework de test comme JUnit. Assurez-vous que chaque classe est testée de manière isolée et que les tests sont répétables et autonomes.

## Détails du modèle des tâches

Le modèle des tâches est responsable de la gestion des données relatives aux tâches, y compris leur création, modification, suppression et affichage. Voici ce que le modèle des tâches doit contenir :

### Classe Task (Classe représentant une tâche)

La classe `Task` représente une tâche dans l'application. Elle doit inclure les attributs suivants :

- `id`: Un identifiant unique (entier) pour chaque tâche.
- `titre`: Le titre de la tâche.
- `description`: La description de la tâche.
- `dateEcheance`: La date d'échéance de la tâche.
- `priorite`: La priorité de la tâche (haute, moyenne, basse, etc.).
- Tout autre attribut nécessaire pour représenter une tâche, selon les besoins de l'application.

La classe `Task` doit également inclure les méthodes suivantes :

- Constructeurs pour initialiser une tâche avec les valeurs appropriées.
- Des méthodes d'accès (getters) pour accéder aux valeurs des attributs.
- Des méthodes de modification (setters) pour modifier les valeurs des attributs.
- Des méthodes pour effectuer des opérations sur les tâches, telles que la comparaison, la validation, etc.
- Tout autre méthode nécessaire pour manipuler les tâches, selon les besoins de l'application.

La classe `Task` doit être conçue de manière à respecter le principe de responsabilité unique, en se concentrant uniquement sur la gestion des données d'une tâche, sans inclure de logique métier ou d'opérations complexes.

### Interface ou classe abstraite pour la gestion des tâches

En plus de la classe `Task`, vous devrez également créer une interface ou une classe abstraite pour définir un ensemble de méthodes communes pour la gestion des tâches. Cela permettra de séparer la logique métier de la gestion des données et de faciliter l'extensibilité de l'application.

L'interface ou la classe abstraite pourrait inclure des méthodes telles que :

- `ajouterTache(Task tache)`: Pour ajouter une nouvelle tâche.
- `modifierTache(Task tache)`: Pour modifier une tâche existante.
- `supprimerTache(Task tache)`: Pour supprimer une tâche.
- `getTaches()`: Pour obtenir la liste de toutes les tâches.
- Tout autre méthode nécessaire pour la gestion des tâches, selon les besoins de l'application.

Les classes concrètes implémenteront cette interface ou étendront cette classe abstraite pour fournir une implémentation spécifique de la gestion des tâches, en fonction des exigences de l'application.

## Vue de l'application

### Interface Utilisateur (UI)

L'interface utilisateur doit être conçue de manière à permettre aux utilisateurs d'effectuer les opérations suivantes :

1. **Ajout de tâche :**
   - Un formulaire pour saisir les détails d'une nouvelle tâche, y compris le titre, la description, la date d'échéance et la priorité.
   - Un bouton "Ajouter" pour soumettre la nouvelle tâche.

2. **Modification de tâche :**
   - Un moyen pour les utilisateurs de sélectionner une tâche existante à modifier, par exemple une liste déroulante ou une liste.
   - Un formulaire pré-rempli avec les détails de la tâche sélectionnée, permettant aux utilisateurs de modifier les informations.
   - Un bouton "Modifier" pour appliquer les modifications à la tâche sélectionnée.

3. **Suppression de tâche :**
   - Un moyen pour les utilisateurs de sélectionner une tâche existante à supprimer, par exemple une liste déroulante ou une liste.
   - Un bouton "Supprimer" pour supprimer la tâche sélectionnée.

4. **Visualisation des tâches :**
   - Une liste ou un tableau affichant toutes les tâches existantes avec leurs détails, y compris le titre, la description, la date d'échéance et la priorité.
   - Un mécanisme permettant aux utilisateurs de filtrer ou de trier les tâches en fonction de différents critères, par exemple la priorité ou la date d'échéance.

5. **Gestion des priorités :**
   - Un moyen pour les utilisateurs de définir la priorité d'une tâche lors de son ajout ou de sa modification, par exemple à l'aide d'un menu déroulant ou de boutons radio.

### Conseils d'implémentation avec Java Swing

Pour implémenter l'interface utilisateur avec Java Swing, vous utiliserez les composants Swing standard tels que `JFrame`, `JPanel`, `JLabel`, `JTextField`, `JList`, etc. Voici comment vous pourriez organiser votre interface utilisateur :

- Créez une classe principale (`MainFrame`) étendant `JFrame` pour représenter la fenêtre principale de l'application.
- Divisez la fenêtre principale en panneaux (`JPanel`) pour organiser les différents éléments de l'interface utilisateur, tels que le formulaire d'ajout de tâche, la liste des tâches, etc.
- Utilisez les composants Swing appropriés pour créer les éléments de l'interface utilisateur, en ajoutant des gestionnaires de disposition (Layout Managers) pour organiser les composants de manière appropriée.
- Ajoutez des écouteurs d'événements (`ActionListener`, `ListSelectionListener`, etc.) pour détecter les actions de l'utilisateur et déclencher les actions correspondantes dans le contrôleur.

L'interface utilisateur Swing devrait être conçue de manière à être conviviale et intuitive, permettant aux utilisateurs d'interagir facilement avec les tâches et de gérer leur liste de tâches de manière efficace.

# Sérialisation des tâches

Pour assurer la persistance des données des tâches entre les sessions de l'application, vous devez implémenter un mécanisme de sérialisation des tâches dans un fichier. Cela permettra de sauvegarder les tâches dans un fichier lors de la fermeture de l'application et de les charger à nouveau lors de son ouverture ultérieure.

## Sauvegarde des tâches

Lors de la fermeture de l'application, les tâches actuellement enregistrées dans l'application doivent être sérialisées et sauvegardées dans un fichier sur le disque. Voici les étapes à suivre pour réaliser cette opération :

1. **Sérialisation des tâches :** Utilisez les fonctionnalités de sérialisation de Java pour convertir les objets représentant les tâches en une séquence d'octets. Assurez-vous que la classe `Task` implémente l'interface `Serializable` pour permettre la sérialisation de ses instances.

2. **Écriture dans un fichier :** Une fois les tâches sérialisées, écrivez la séquence d'octets dans un fichier sur le disque. Choisissez un format de fichier approprié, tel que JSON, XML ou un format binaire, en fonction de vos préférences et des besoins de l'application.

## Chargement des tâches

Lors de l'ouverture de l'application, les tâches précédemment sauvegardées doivent être chargées à partir du fichier sur le disque et restaurées dans l'application. Voici les étapes à suivre pour réaliser cette opération :

1. **Lecture du fichier :** Ouvrez le fichier contenant les données sérialisées des tâches en lecture depuis le disque.

2. **Désérialisation des tâches :** Utilisez les fonctionnalités de désérialisation de Java pour convertir la séquence d'octets lue à partir du fichier en objets représentant les tâches. Assurez-vous de manipuler les éventuelles exceptions liées à la désérialisation.

3. **Intégration dans l'application :** Une fois les tâches désérialisées, intégrez-les dans l'application en les ajoutant au modèle des tâches existant. Assurez-vous de rafraîchir l'interface utilisateur pour refléter les changements dans la liste des tâches.

## Gestion des erreurs et exceptions

Pendant les opérations de sauvegarde et de chargement des tâches, assurez-vous de gérer correctement les erreurs et les exceptions qui pourraient survenir. Cela inclut la gestion des erreurs liées à l'accès au fichier, les problèmes de sérialisation/désérialisation, ainsi que les erreurs liées au format des données du fichier.

Assurez-vous également de fournir des messages d'erreur significatifs et des mécanismes de récupération pour informer l'utilisateur en cas de problème lors de la sauvegarde ou du chargement des tâches.

## Exemple de code

Voici un exemple de code Java illustrant comment réaliser la sérialisation et la désérialisation des tâches :

```java
import java.io.*;

public class TaskSerialization {

    // Méthode pour sauvegarder les tâches dans un fichier
    public void saveTasksToFile(TaskList taskList, String filePath) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(taskList);
        } catch (IOException e) {
            e.printStackTrace();
            // Gestion de l'erreur de sauvegarde des tâches
        }
    }

    // Méthode pour charger les tâches à partir d'un fichier
    public TaskList loadTasksFromFile(String filePath) {
        TaskList taskList = new TaskList();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            taskList = (TaskList) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            // Gestion de l'erreur de chargement des tâches
        }
        return taskList;
    }
}
```

# Bonnes pratiques

1. **SOLID :**
   - Assurez-vous que chaque classe respecte les principes SOLID, en particulier le principe de responsabilité unique, le principe ouvert/fermé et le principe de substitution de Liskov.
2. **Nomination des classes et méthodes :**
   - Utilisez des noms significatifs pour les classes, les méthodes et les variables afin de rendre votre code plus lisible et compréhensible.
3. **Commentaires :**
   - Ajoutez des commentaires là où cela est nécessaire pour expliquer la logique complexe ou le fonctionnement des parties importantes du code.
4. **Gestion des exceptions :**
   - Utilisez la gestion des exceptions de manière appropriée pour gérer les erreurs ou les situations imprévues qui pourraient survenir pendant l'exécution de l'application.
5. **Encapsulation :**
   - Utilisez l'encapsulation pour protéger les données et limiter l'accès direct aux membres internes des classes.

# Livraison du projet

Une fois le travail terminé, vous devrez fournir :

- Le code source de l'application, organisé en packages selon l'architecture MVC.
- Une documentation expliquant l'architecture de l'application, les choix de conception, les fonctionnalités implémentées et les bonnes pratiques suivies.
- Des captures d'écran de l'application en cours d'exécution, montrant les différentes fonctionnalités en action.
