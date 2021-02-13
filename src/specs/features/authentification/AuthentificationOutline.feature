@connexion
Feature: Authentification - OrangeHRM
  En tant que utilisateur je souhaite m'authentifier

  @ct-passant
  Scenario: Authentification - OrangeHRM
    Given Je me connecte sur l application OrangeHRM
    When Je saisie le login "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur login
    Then Redirection vers l accueil

  @cnx-non-passant
  Scenario Outline: Authentification - OrangeHRM
    Given Je me connecte sur l application OrangeHRM
    When Je saisie le login "<login>"
    And Je saisie le mot de passe "<password>"
    And Je clique sur login
    Then Je verifie les messages d'erreurs de la page connexion "<messages>"

    Examples: 
      | login | password | messages                 |
      |       |          | Username cannot be empty |
      | test  | test123  | Invalid credentials      |
      | Admin | test123  | Invalid credentials      |
      | test  | admin123 | Invalid credentials      |

  @forgot-password
  Scenario: Verification mot de passe oublié
    Given Je me connecte sur l application OrangeHRM
    When Je clique sur le lien forgot your password "Forgot your password?" 
    And Je verifie la page Forgot Your Password "Forgot Your Password?" 
    And Je saisie username "Admin" 
    And Je clique sur le bouton Reset Password
    Then Je verifie la reinitialisation du mot de passe "There is a password reset request already in the system." 

  @widgets
  Scenario: Verification des widgets
    Given Je me connecte sur l application OrangeHRM
    When Je clique sur le widget LinkedIn
    Then Redirection vers la page LinkedIn
    When Je clique sur le widget Facebook
    Then Redirection vers la page Facebook
    When Je clique sur le widget Twitter
    Then Redirection vers la page Twitter
    When Je clique sur le widget Youtube
    Then Redirection vers la page Youtube
