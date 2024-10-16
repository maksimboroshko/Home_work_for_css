import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestCssForFig {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920 x 1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000;
    }

    public static String value1() {
        return  "@ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(&quot;page.html&quot;);\n" +
                "\n" +
                "    $(&quot;#first&quot;).should(visible).click();\n" +
                "    $(&quot;#second&quot;).should(visible).click();\n" +
                "  }\n" +
                "}";

    }

    @Test
    void findTest() {
        open("selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-box").$("button.Link--muted").scrollTo().click();
        $(".wiki-rightbar").shouldHave(text("SoftAssertions")).click();

        $(".markdown-body").shouldHave(Condition.attribute("value", value1()));
        //$(".markdown-body").shouldHave(Condition.text("@ExtendWith({SoftAssertsExtension.class})"));
    }
}
