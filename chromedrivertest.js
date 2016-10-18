var webdriver = require('selenium-webdriver'),
    By = webdriver.By,
    until = webdriver.until;

var driver = new webdriver.Builder()
    .forBrowser('chrome')
    .setChromeOptions()
    .build();

driver.get("http://www.google.com/ncr");
driver.findElement(By.id("lst-ib")).then(elem => {
    elem.sendKeys("ChromeDriver");
    elem.submit();
});
driver.wait(until.titleIs('ChromeDriver - Google Search'), 1000);
driver.quit();
