Feature: Login Functionality

  @wip
  Scenario Outline: Login with different credentials
    Given the user navigates to login page
    When the user logged in with the username and password of the <rowindex> of excelfile
#    Then the user fullname should be same with the <rowindex> of excelfile

    Examples:
      | rowindex |
      | 1        |
      | 2        |
      | 3        |
      | 4        |
      | 5        |
      | 6        |
      | 7        |
      | 8        |
      | 9        |
      | 10       |
      | 11       |
      | 12       |
      | 13       |
      | 14       |
      | 15       |

