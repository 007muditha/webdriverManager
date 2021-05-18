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
    
    
