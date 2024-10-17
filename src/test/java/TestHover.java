import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TestHover {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920 x 1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = false;
        Configuration.timeout = 5000;
    }

    public static String textSolutions() {
        return """
                Solutions
                """;
    }
    public static String textEnterprise() {
        return """
                Enterprise
                """;
    }

    @Test
    void findEnterprize() {
        open("");
        $$("ul li").findBy(Condition.text(textSolutions())).hover();
        $$("ul li a").findBy(Condition.text(textEnterprise())).click();
        $("#hero-section-brand-heading")
                .shouldBe(visible)
                .shouldHave(text("The AI-powered"), Duration.ofSeconds(10))
                .shouldHave(text("developer platform."), Duration.ofSeconds(10));
    }

}
