Feature: Order HP Pen Drive with different quantities

  Scenario Outline: Order with different quantities
    Given User searches for HP Pen Drive
    When Add the first result on the page with quantity <qty>
    Then Cart should display <qty> pen drive

    Examples: 
      | qty |
      |   1 |
      |   3 |
      |   5 |
