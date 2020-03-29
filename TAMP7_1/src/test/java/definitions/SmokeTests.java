package definitions;

import net.serenitybdd.jbehave.SerenityStories;
import net.serenitybdd.jbehave.annotations.Metafilter;


//  '+' запускает тесты с тегом, '-' игнорирует тесты с тегом

@Metafilter("+smoke")
public class SmokeTests extends SerenityStories {
}

