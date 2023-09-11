# UI Test automation project for [iHerb](https://www.iherb.com/)

![iHerb-Emblem.png](images/iHerb-Emblem.png)

> iHerb is an American e-commerce site that sells natural products, supplements, and herbs

# <a name="Technology">Tools and a technologies</a>
<p  align="center">
  <code><img width="5%" title="IntelliJ IDEA" src="./images/icons/IDEA-logo.svg"></code>
  <code><img width="5%" title="Java" src="./images/icons/java-logo.svg"></code>
  <code><img width="5%" title="Selenide" src="./images/icons/selenide-logo.svg"></code>
  <code><img width="5%" title="Selenoid" src="./images/icons/selenoid-logo.svg"></code>
  <code><img width="5%" title="Gradle" src="./images/icons/gradle-logo.svg"></code>
  <code><img width="5%" title="JUnit5" src="./images/icons/junit5-logo.svg"></code>
  <code><img width="5%" title="Allure Report" src="./images/icons/allure-Report-logo.svg"></code>
  <code><img width="5%" title="Allure TestOps" src="./images/icons/allure-ee-logo.svg"></code>
  <code><img width="5%" title="Github" src="./images/icons/git-logo.svg"></code>
  <code><img width="5%" title="Jenkins" src="./images/icons/jenkins-logo.svg"></code>
  <code><img width="5%" title="Telegram" src="./images/icons/Telegram.svg"></code>
  <code><img width="5%" title="Jira" src="./images/icons/jira-logo.svg"></code>
</p>

The autotests in this project are written in `Java` using `Selenide` framework.\
`Gradle` - is used as a build automation tool.  \
`JUnit5` - to execute tests.\
`Jenkins` - CI/CD for running tests remotely.\
`Selenoid` - to remote launching browsers in `Docker` containers.\
`Allure Report` - for test results visualisation.\
`Telegram Bot` - for test results notifications.\
`Allure TestOps` - as Test Management System.

# <a name="HowToRun">Autotest scenarios (UI)</a>

- [x] Switch website language to  another language (Italian)
- [x] Check categories in a new products page
- [x] Search for Soglar productions test
- [x] Add item to Cart test
- [x] Check carousel of categories in Special products page
- [x] Check that if an unauthorized person clicks on 'My account', a login form will open
- [x] Check that Sales & Offers category in Search is visible
- [x] Check that share widget opens

All Tests are designed with a Page Object pattern

# <a name="HowToRun">How to run</a>

## <a name="GradleCommand">Gradle command</a>
To run locally and in Jenkins the following command is used:
```bash
gradle clean test
```

To run with parameters:
```bash
clean
test
"-DselenoidUrl=${SELENOID_URL}"
"-DbrowserSize=${BROWSER_SIZE}"
"-Dbrowser=${BROWSER}"
"-DbrowserVersion=${BROWSER_VERSION}"
```

## <a name="RunInJenkins">Run in [Jenkins](https://jenkins.autotests.cloud/me/my-views/view/all/job/s.savich_iherb_tests/)</a>
Main page of the build:
<p  align="center">
<img src="images/jenkins-iherb-project.png" alt="jenkins-iherb-project.png" width="950">
</p>

A parametrized Jenkins job:
<p  align="center">
<img src="images/jenkins-parameters.png" alt="jenkins-parameters" width="950">
</p>

# <a name="AllureReport">Test results report in [Allure Report](https://jenkins.autotests.cloud/me/my-views/view/all/job/s.savich_iherb_tests/allure/)</a>

## Main page
Main page of Allure report contains the following blocks:

>- <code><strong>*ALLURE REPORT*</strong></code> - displays date and time of the test, overall number of launched tests, as well as a diagram indicating the percentage and number of successful, failed and broken tests during execution
>- <code><strong>*TREND*</strong></code> - displays trend of running tests for all runs
>- <code><strong>*SUITES*</strong></code> - displays distribution of tests by suites
>- <code><strong>*CATEGORIES*</strong></code> - displays distribution of unsuccessful tests by defect types
<p align="center">
  <img src="images/allure_report.png" alt="AllureReportMain" width="950">
</p>

## List of tests with steps and test artefacts
On the page the list of the tests grouped by suites with status shown for each test.\
Full info about each test can be shown: tags, severity, duration, detailed steps.

<p align="center">
  <img src="images/allure_suits.png" alt="Allure-suits" width="1150">
</p>

# Allure TestOps integration


## <a name="AllureTestOpsProject">Project in Allure TestOps</a>
Test-cases in the project are imported and constantly updated from the code,
so there is no need in complex process of synchronization manual test-cases and autotests.\
It is enough to create and update an autotest in the code and the test-case in TMS always will be in actual state.\
Manual test-cases also can be added in TMS in case of need(via web interface or via code).

<p align="center">
  <img src="images/allure_test_ops.png" alt="AllureTestOps" width="1050">
</p>

<p align="center">
  <img src="images/allure_tests.png" alt="AllureTests" width="1050">
</p>

# Jira integration
<p align="center">
  <img src="images/jira.png" alt="JiraIntegration" width="1050">
</p>

# <a name="TelegramNotifications">Telegram Notifications</a>
Telegram bot sends a brief report to a specified telegram chat by results of each build.
<p  align="center">
<img src="images/telegram_bot.png" alt="TelegramNotification" width="550">
</p>

# Video of running tests
<p align="center">
<img src="/images/videos/iherb_videos.gif" alt="video"/>
</p>
