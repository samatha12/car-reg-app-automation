Feature: Check vehicle existence
verify whether the vehicle is existing or not using Reg.number

Scenario: Verify with the registration number
Given navigate to the insurance portal home page using URL
When user enter Vehicle reg.number and click on find button
Then Result should be displayed
And close the browser