@accueil
Feature: Accueil - OrangeHRM
  En tant que utilisateur orange je souhaite acceder au module Recruitment

  Background: 
    Given Je me connecte sur l application OrangeHRM
    When Je saisie le login "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur login
    Then Redirection vers l accueil

  @recruitment
  Scenario: Acceder au module Recruitment
    When Je clique sur le module Recruitment
    Then Je verifie l affichage de la page Recruitment "Candidates"

  @PIM
  Scenario: Acceder au module PIM
    When Je clique sur le module PIM
    Then Je verifie l affichage de la page PIM "Configuration"

  @Admin
  Scenario: Acceder au module Admin
    When Je clique sur le module Admin
    And Je saisie le username "Slim"
    And Je clique sur le boutton Search
    Then Je verifie l affichage du message "No Records Found"
