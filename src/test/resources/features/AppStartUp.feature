Feature: Starting up the app

  @Android
  Scenario: As a user I want to install the Android app
    Given I install the "Android" app on the emulator
    Then I see the app in the Android emulator
    Then I enter the Android price
    Then I click button Android NL
    Then I click on the Android calculate button
    Then the Android amount is equal to "242.00"

  @Android
  Scenario: As a user I want to install the Android app with SplashScreen
    Given I install the "AndroidSplash" app on the emulator with splashScreen
    Then I see the splashscreen

  @iOS
  Scenario: As a user I want to install the iOS app and calculate price for NL
    Given I install the "iOS" app on the emulator
    Then I see the app in the iOS emulator
    Then I enter the iOS price
    Then I select listitem iOS "NL"
    Then I click on the iOS calculate button
    Then the iOS amount is equal to "242.0"

  @iOS
  Scenario: As a user I want to install the iOS app and calculate price for FR
    Given I install the "iOS" app on the emulator
    Then I see the app in the iOS emulator
    Then I enter the iOS price
    Then I select listitem iOS "FR"
    Then I click on the iOS calculate button
    Then the iOS amount is equal to "240.0"

  @iOS
  Scenario: As a user I want to install the iOS app and calculate price for DE
    Given I install the "iOS" app on the emulator
    Then I see the app in the iOS emulator
    Then I enter the iOS price
    Then I select listitem iOS "DE"
    Then I click on the iOS calculate button
    Then the iOS amount is equal to "250.0"

