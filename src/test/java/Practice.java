import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class Practice {
    @BeforeAll
    static void configAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        }
        @Test
        void training1(){
        open("https://www.google.com/");
        }
    }

