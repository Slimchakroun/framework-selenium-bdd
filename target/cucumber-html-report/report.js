$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("accueil/Accueil.feature");
formatter.feature({
  "line": 2,
  "name": "Accueil - OrangeHRM",
  "description": "En tant que utilisateur orange je souhaite acceder au module Recruitment",
  "id": "accueil---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@accueil"
    }
  ]
});
formatter.before({
  "duration": 8580270300,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Je me connecte sur l application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Je saisie le login \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Je clique sur login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Redirection vers l accueil",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.jeMeConnecteSurLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 4337569400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    }
  ],
  "location": "AuthentificationOutlineStepDefinition.jeSaisieLeLogin(String)"
});
formatter.result({
  "duration": 76983100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 27
    }
  ],
  "location": "AuthentificationOutlineStepDefinition.jeSaisieLeMotDePasse(String)"
});
formatter.result({
  "duration": 62398600,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.jeCliqueSurLogin()"
});
formatter.result({
  "duration": 3386377800,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.redirectionVersLAccueil()"
});
formatter.result({
  "duration": 30069100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Acceder au module Recruitment",
  "description": "",
  "id": "accueil---orangehrm;acceder-au-module-recruitment",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@recruitment"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Je clique sur le module Recruitment",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Je verifie l affichage de la page Recruitment \"Candidates\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccueilStepDefinition.jeCliqueSurLeModuleRecruitment()"
});
formatter.result({
  "duration": 1642397400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Candidates",
      "offset": 47
    }
  ],
  "location": "AccueilStepDefinition.jeVerifieLAffichageDeLaPageRecruitment(String)"
});
formatter.result({
  "duration": 23174000,
  "status": "passed"
});
formatter.after({
  "duration": 1409209800,
  "status": "passed"
});
formatter.before({
  "duration": 8241873000,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Je me connecte sur l application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Je saisie le login \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Je clique sur login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Redirection vers l accueil",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.jeMeConnecteSurLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 5512294900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    }
  ],
  "location": "AuthentificationOutlineStepDefinition.jeSaisieLeLogin(String)"
});
formatter.result({
  "duration": 62366000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 27
    }
  ],
  "location": "AuthentificationOutlineStepDefinition.jeSaisieLeMotDePasse(String)"
});
formatter.result({
  "duration": 57964600,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.jeCliqueSurLogin()"
});
formatter.result({
  "duration": 3509880800,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.redirectionVersLAccueil()"
});
formatter.result({
  "duration": 26530900,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Acceder au module PIM",
  "description": "",
  "id": "accueil---orangehrm;acceder-au-module-pim",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@PIM"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "Je clique sur le module PIM",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Je verifie l affichage de la page PIM \"Configuration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccueilStepDefinition.jeCliqueSurLeModulePIM()"
});
formatter.result({
  "duration": 1707537700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Configuration",
      "offset": 39
    }
  ],
  "location": "AccueilStepDefinition.jeVerifieLAffichageDeLaPagePIM(String)"
});
formatter.result({
  "duration": 23142100,
  "status": "passed"
});
formatter.after({
  "duration": 1254927400,
  "status": "passed"
});
});