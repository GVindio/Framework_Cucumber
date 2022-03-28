Feature: Changing Background to SkyBlue


@tag1 @alltest
Scenario: Sky Blue Background
Given I am on Techfios Practice Page Scenario1 
And Set SkyBlue Background button exists
When I click on the sky blue button
Then the background color will change to sky blue
 

@tag2 @alltest
Scenario: Sky White Background Change
Given I am on Techfios Practice Page Scenario2
And Set SkyWhite Background button exists
When I click on the sky white button
Then the background color will change to sky white

