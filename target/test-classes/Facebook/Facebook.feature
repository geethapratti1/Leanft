Feature: User should work on Facebook
Scenario Outline: User should give valid Credentials.
Given User should launch the browser.
When User should login with "<UserName>" and "<Password>"

Examples:
|UserName |Password|
|geetha   |gee123|
|Madhuri  |madh111|
|Senthil  |ses222 |
