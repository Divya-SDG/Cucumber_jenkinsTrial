Feature: salesforce testcases
Scenario Outline: user enter the  username and password and succesfully login

Given user will launch browser  with salesforce  website
Then enter valid username "<username>"
Then enter valid password "<password>"

Examples:
 | username | password |
 | divya | pop |
|divya2 | pop2 |



