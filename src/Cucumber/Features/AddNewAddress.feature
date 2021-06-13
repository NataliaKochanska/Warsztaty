Feature: Add new address after login

    Scenario Outline: Add new address


        Given User is logged in to CodersLab shop

        When User goes to "Address" page

        And User goes to "Create new address" page

        And keywords <alias>, <address>, <city>, <postcode>, <phone> are entered in input fields

        Then new address is saved and correct


        Examples:

            |alias           |address      |city   |postcode|phone    |
            |Delivery address|Wroclawska 22|Wroclaw|50-222  |213213213|





