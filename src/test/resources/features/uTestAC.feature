#Autor: Maloney David
@stories
Feature: UTest website
  As a user, I want to automate the UTest website with screamplay.
  @scenario2
  Scenario: Register new user
    Given new user on the UTEST platform
      | userName | userLastName | userEmail            | userBirthDay | userBirthMonth | userBirthYear | userLanguages | addCity  | addCode | addCountry | devMobile | devModel | devOS              | endPassword |
      | Andres   | Martinez     | amartines@11test.com | 26           | 2              | 1998          | Spanish       | Colombia | 0854    | Panama     | Huawei    | Mate 8   | Android 8.0 (Oreo) | Panama123*  |
    When automate new user registration
    Then be able to enter the UTest system