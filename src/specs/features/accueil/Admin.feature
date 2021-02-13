@admin
Feature: Admin - OrangeHRM
  En tant que utilisateur orange je souhaite acceder au module Admin

  Background: 
    Given Je me connecte sur l application OrangeHRM
    When Je saisie le login "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur login
    Then Redirection vers l accueil

  @search-user
  Scenario: Acceder au module Admin
    When Je clique sur le module Admin
    And Je saisie le username "Slim" 
    And Je clique sur le boutton Search
    Then Je verifie l affichage du message Search "No Records Found"

  @add-user
  Scenario: Add User
    When Je clique sur le module Admin
    And Je verifie l affichage de la page Admin "User Management"
    And Je clique sur le boutton Add
    And Je choisis le role Admin
    And Je saisie dans Employee Name "David Morris" 
    And Je verifie le nom d'employee "David Morris"
    And Je saisie dans le username "David"
    And Je choisis Disabled pour le Status
    And Je saisie dans le password "david123"
    And Je saisie dans Confirm password "david123"
    And Je clique sur le boutton Save
    Then Je verifie l affichage du message Save "Successfully Saved" 
