Feature: Starting up the app

  @Android
  Scenario: As a user I want to install the Android app
    Given I install the "Android" app on the emulator
    Then I see the app in the Android emulator
    Then I enter the Android price
    Then I click button Android NL
    Then I click on the Android calculate button
    Then the Android amount is equal to "242.00"

  @iOS
  Scenario: As a user I want to install the iOS app
    Given I install the "iOS" app on the emulator
    Then I see the app in the iOS emulator
    Then I enter the iOS price
    Then I click button iOS NL
    Then I click on the iOS calculate button
    Then the iOS amount is equal to "242.0"


