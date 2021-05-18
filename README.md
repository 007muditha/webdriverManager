# webdriverManager

This is a very simple project created to show the use of web driver manager in resolving web driver dependancies.
If you move to Src>Java>test you'll fild a SampleSelenim.class file
This is just a Junit based sample test which will take you to facebook.com

In the web driver manager implemetation you just need to import it with maven 

        <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>4.4.3</version>
            <scope>test</scope>
        </dependency>
                
 and import it to the class as import io.github.bonigarcia.wdm.WebDriverManager;

Then in the place where you are planning to setup the driver dependancies you can simply add the command

        WebDriverManager.chromedriver().setup();
     
This will resolve the driver dependancies for your project. and you can direcly create the driver instance using 

        dirver = new ChromeDriver();
    
Apart from that let's say the you want to run your test with another compatible brower version. In that case you can easily switch the to compatible brwser version you need using .browserVersion. For example, even though my current chrome version is 90.0.4430, if I want to run the test to crome version "89.0.4389" ( chrome driver which supports chrome 90 will support chrome 89 as well ) The code update is,

    public void setUpChromeDriver() {
        WebDriverManager.chromedriver().driverVersion("88.0.4324").setup();
        driver = new ChromeDriver();
    }
    
Note: How ever the webdriver which will be downloaded by web driver manager will be the compatible web driver for your installed browser
