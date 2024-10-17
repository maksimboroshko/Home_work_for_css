import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestCssForFig {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920 x 1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = false;
        Configuration.timeout = 5000;
    }

    public static String value1() {
        return   """
        @ExtendWith({SoftAssertsExtension.class})
        class Tests {
          @Test
          void test() {
            Configuration.assertionMode = SOFT;
            open("page.html");

            $("#first").should(visible).click();
            $("#second").should(visible).click();
          }
        }
        """;
    }
    @Test
    void findTest() {
        open("selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-box").$("button.Link--muted").scrollTo().click();
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(Condition.text(value1()));

    }
}
