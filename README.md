This example demonstrates the bug report on https://bugs.chromium.org/p/chromedriver/issues/detail?id=1551

Steps to reproduce:

1. Run `npm install`:
    This installs the chromedriver in version 2.24.1 and for the node.js example selenium-webdriver 3.0.0-beta-3.

2. Compile and run the java example. Maven and Java 8 are a prerequisite.

    `mvn package exec:java`
    
    The browser opens, loads Google, but no query is submitted.

3. Run the Javascript example

    `export PATH=node_modules/chromedriver/lib/chromedriver:$PATH`
    
    `node chromedrivertest.js`
    The browser opens, loads Google, but no query is submitted.

4. (Bonus) Open the pom.xml in IntelliJ, perform a right click on the class ChromedriverTest to run the class directly.
    This actually works as expected! The browser opens, loads Google and searches for ChromeDriver.

5. (Bonus) Remote Webdriver with chromedriver

    `./node_modules/chromedriver/lib/chromedriver/chromedriver --verbose`
    
    Run RemoteChromedriverTest from IntelliJ
    This doesn't work. The output from the logfile is included in the repository here in logfile.txt


