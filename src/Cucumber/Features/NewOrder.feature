Feature: Add new order after login

  Scenario: Add new order


    Given User is logged in to CodersLab shop

    When User selects Hummingbird Printed Sweater

    And User selects M size

    And User selects 5 products

    And User adds products to the cart

    And User goes to Checkout page

    And User confirms address

    And User selects Pick up in store option

    And User selects Pay by Check option

    And User clicks Order with an obligation to pay button

    Then Screen shot with order confirmation
