Feature: Starting up the app

  @Android
  Scenario: As a user I want to install the Android app with SplashScreen
    Given I install the "AndroidSplash" app on the emulator with splashScreen
    Then I see the splashscreen

  @Android
  Scenario: As a user I want to install the Android app and calculate tax for Netherlands
    Given I install the "Android" app on the emulator
    Then I see the app in the Android emulator
    Then I enter the Android price
    Then I select country list
    Then I select "NL" as country
    Then I see the flag
    Then the Android amount is equal to "242.00"

  @Android
  Scenario: As a user I want to install the Android app and calculate tax for France
    Given I install the "Android" app on the emulator
    Then I see the app in the Android emulator
    Then I enter the Android price
    Then I select country list
    Then I select "FR" as country
    Then I see the flag
    Then the Android amount is equal to "240.00"


  @iOS
  Scenario: As a user I want to install the iOS app and check the error handling for negative number
    Given I install the "iOS" app on the emulator
    Then I see the app in the iOS emulator
    Then I enter the iOS price "-1"
    Then I click on the iOS calculate button

  @iOS
  Scenario: As a user I want to install the iOS app and check the error handling for zero number
    Given I install the "iOS" app on the emulator
    Then I see the app in the iOS emulator
    Then I enter the iOS price "0"
    Then I click on the iOS calculate button

  @iOS
  Scenario: As a user I want to install the iOS app and calculate price for NL
    Given I install the "iOS" app on the emulator
    Then I see the app in the iOS emulator
    Then I enter the iOS price "200"
    Then I select listitem iOS "NL"
    Then I click on the iOS calculate button
    Then the iOS amount is equal to "242.0"

  @iOS
  Scenario: As a user I want to install the iOS app and calculate price for FR
    Given I install the "iOS" app on the emulator
    Then I see the app in the iOS emulator
    Then I enter the iOS price "200"
    Then I select listitem iOS "FR"
    Then I click on the iOS calculate button
    Then the iOS amount is equal to "240.0"

  @iOS
  Scenario: As a user I want to install the iOS app and calculate price for DE
    Given I install the "iOS" app on the emulator
    Then I see the app in the iOS emulator
    Then I enter the iOS price "200"
    Then I select listitem iOS "DE"
    Then I click on the iOS calculate button
    Then the iOS amount is equal to "250.0"

