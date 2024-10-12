import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class TestForCssHw {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.browserSize = "1920 x 1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000;
    }

    @Test
    void formTest() {
        open("automation-practice-form");
        File fileToUpload = new File("/Users/maksimborosko/Desktop/test.png");
        $("#uploadPicture").uploadFile(fileToUpload);
        $("#firstName").setValue("Test");
        $("#lastName").setValue("Testov");
        $("#userEmail").setValue("test@gmail.com");
        $("#userNumber").setValue("77777777777");
        $("#currentAddress").setValue("testovoeSms");
        $("#dateOfBirthInput").sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), "18 Feb 2000");
        $("label[for='gender-radio-1']").click();
        $("label[for='hobbies-checkbox-1']").scrollTo().click();
        $("label[for='hobbies-checkbox-2']").scrollTo().click();
        $("label[for='hobbies-checkbox-3']").scrollTo().click();
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Noida").pressEnter();
        $("#subjectsInput").setValue("testovoeSms"); // оставилп последним , т.к не понял как работать после заполнения этого поля








    }
}
