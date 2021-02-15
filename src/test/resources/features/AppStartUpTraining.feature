Feature: Starting up the Training'a App & check elements * click button

  @iOS
  Scenario: As a user I want to install the iOS app and check the error handling for negative number
    Given I install the training "iOSTraining" app on the emulator
    Then I click on the popup
    Then I see the training app in the iOS emulator
    Then I see the text field
    Then I see the text input field
    Then I see the calculate button
    Then I click on the calculate button
