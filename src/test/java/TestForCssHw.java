import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.ElementsCollection;

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
        $("#firstName").setValue("Test");
        $("#lastName").setValue("Testov");
        $("#userEmail").setValue("test@gmail.com");
        $("#userNumber").setValue("77777777777");
        $("#currentAddress").setValue("testovoeSms");
      //  $("#genterWrapper #gender-radio-3").click(); don't work
        $("#subjectsContainer").setValue("testovoeSms");


    }
}
