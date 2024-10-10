import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestForCssHw {

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.browserSize = "1920 x 1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000;

    }


    @Test
    void formTest() {
        open("automation-practice-form");
        $("#firstName").setValue("Test");
        $("#lastName").setValue("Testov");
        $("#userEmail").setValue("test@gmail.com");
       // $("#gender-radio-1").press;
        $("#userNumber").setValue("77777777777");
        // $("#gender-radio-1").press;
        $("#currentAddress").setValue("testovoeSms");


      //  $("[id=search]").shouldHave(text("https://selenide.org"));
    }
}
