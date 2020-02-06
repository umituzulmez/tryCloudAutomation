@TalkModuleThreeDots
Feature:Talk module three dots


  Scenario: The "Add to favorites" option is displayed

    Given the user login the page
    When the user navigates to Talk module
    And the user clicks on three dots
    Then the user should see "Add to favorites"
    
    