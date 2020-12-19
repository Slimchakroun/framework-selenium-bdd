$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentification/AuthentificationOutline.feature");
formatter.feature({
  "line": 2,
  "name": "Authentification - OrangeHRM",
  "description": "En tant que utilisateur je souhaite m\u0027authentifier",
  "id": "authentification---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@connexion"
    }
  ]
});
formatter.before({
  "duration": 8572559600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#@ct-passant"
    },
    {
      "line": 6,
      "value": "#Scenario: Authentification - OrangeHRM"
    },
    {
      "line": 7,
      "value": "#Given Je me connecte sur l application OrangeHRM"
    },
    {
      "line": 8,
      "value": "#When Je saisie le login \"Admin\""
    },
    {
      "line": 9,
      "value": "#And Je saisie le mot de passe \"admin123\""
    },
    {
      "line": 10,
      "value": "#And Je clique sur login"
    },
    {
      "line": 11,
      "value": "#Then Redirection vers l accueil"
    },
    {
      "line": 12,
      "value": "#"
    },
    {
      "line": 13,
      "value": "#@cnx-non-passant"
    },
    {
      "line": 14,
      "value": "#Scenario Outline: Authentification - OrangeHRM"
    },
    {
      "line": 15,
      "value": "#Given Je me connecte sur l application OrangeHRM"
    },
    {
      "line": 16,
      "value": "#When Je saisie le login \"\u003clogin\u003e\""
    },
    {
      "line": 17,
      "value": "#And Je saisie le mot de passe \"\u003cpassword\u003e\""
    },
    {
      "line": 18,
      "value": "#And Je clique sur login"
    },
    {
      "line": 19,
      "value": "#Then Je verifie les messages d\u0027erreurs de la page connexion \"\u003cmessages\u003e\""
    },
    {
      "line": 20,
      "value": "#"
    },
    {
      "line": 21,
      "value": "#Examples:"
    },
    {
      "line": 22,
      "value": "#| login | password | messages                 |"
    },
    {
      "line": 23,
      "value": "#|       |          | Username cannot be empty |"
    },
    {
      "line": 24,
      "value": "#| test  | test123  | Invalid credentials      |"
    },
    {
      "line": 25,
      "value": "#| Admin | test123  | Invalid credentials      |"
    },
    {
      "line": 26,
      "value": "#| test  | admin123 | Invalid credentials      |"
    },
    {
      "line": 27,
      "value": "#"
    },
    {
      "line": 28,
      "value": "#@forgot-password"
    },
    {
      "line": 29,
      "value": "#Scenario: Verification mot de passe oublié"
    },
    {
      "line": 30,
      "value": "#Given Je me connecte sur l application OrangeHRM"
    },
    {
      "line": 31,
      "value": "#When Je clique sur le lien forgot your password \"Forgot your password?\""
    },
    {
      "line": 32,
      "value": "#And Je verifie la page Forgot Your Password \"Forgot Your Password?\""
    },
    {
      "line": 33,
      "value": "#And Je saisie username \"Admin\""
    },
    {
      "line": 34,
      "value": "#And Je clique sur le bouton Reset Password"
    },
    {
      "line": 35,
      "value": "#Then Je verifie la reinitialisation du mot de passe \"There is a password reset request already in the system.\""
    }
  ],
  "line": 38,
  "name": "Verification des widgets",
  "description": "",
  "id": "authentification---orangehrm;verification-des-widgets",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@widgets"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "Je me connecte sur l application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "Je clique sur le widget LinkedIn",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 41,
      "value": "#Then Redirection vers la page LinkedIn"
    }
  ],
  "line": 42,
  "name": "Je clique sur le widget Facebook",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "Redirection vers la page Facebook",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Je clique sur le widget Twitter",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "Redirection vers la page Twitter",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "Je clique sur le widget Youtube",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "Redirection vers la page Youtube",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.jeMeConnecteSurLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 33230227099,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.jeCliqueSurLeWidgetLinkedIn()"
});
formatter.result({
  "duration": 67721500,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.jeCliqueSurLeWidgetFacebook()"
});
formatter.result({
  "duration": 77288000,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.redirectionVersLaPageFacebook()"
});
formatter.result({
  "duration": 14174201,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"//h2[@dir\u003d\u0027auto\u0027]\"}\n  (Session info: chrome\u003d87.0.4280.88)\n  (Driver info: chromedriver\u003d87.0.4280.20 (c99e81631faa0b2a448e658c0dbd8311fb04ddbd-refs/branch-heads/4280@{#355}),platform\u003dWindows NT 10.0.18363 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 13 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027DESKTOP-3IUQDVQ\u0027, ip: \u0027192.168.1.140\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.9\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:58392}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d87.0.4280.20 (c99e81631faa0b2a448e658c0dbd8311fb04ddbd-refs/branch-heads/4280@{#355}), userDataDir\u003dC:\\Users\\UTILIS~1\\AppData\\Local\\Temp\\scoped_dir3592_1631031747}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d87.0.4280.88, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 0c456ed16fca2d8f8b71a61fced23f22\n*** Element info: {Using\u003did, value\u003d//h2[@dir\u003d\u0027auto\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:595)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:389)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:215)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:340)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.getText(Unknown Source)\r\n\tat com.e2eTests.automation.stepDefinitions.AuthentificationOutlineStepDefinition.redirectionVersLaPageFacebook(AuthentificationOutlineStepDefinition.java:109)\r\n\tat ✽.Then Redirection vers la page Facebook(authentification/AuthentificationOutline.feature:43)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.jeCliqueSurLeWidgetTwitter()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.redirectionVersLaPageTwitter()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.jeCliqueSurLeWidgetYoutube()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.redirectionVersLaPageYoutube()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current page URL is : https://opensource-demo.orangehrmlive.com/");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1819521600,
  "status": "passed"
});
});