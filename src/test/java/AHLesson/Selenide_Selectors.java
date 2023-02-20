package AHLesson;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;


public class Selenide_Selectors {

    public void selenideSelectors(){

        SelenideElement selenideElement;
        $(Selectors.byCssSelector("#input")).click();
        $(Selectors.by("type", "button")).click();
        $(Selectors.by("type$", "button")).click();
        $(Selectors.by("type^", "button")).click();
        //$(Selectors.shadowCss()).click();
        $(Selectors.byAttribute("type*", "button")).click();
        $(Selectors.byAttribute("type$", "button")).click();
        $(Selectors.byAttribute("type~", "button")).click();
        $(Selectors.byClassName("class")).click();
        $(Selectors.byId("id")).click();
        $(Selectors.byLinkText("linkText")).click();
        $(Selectors.byName("name")).click();
        $(Selectors.byPartialLinkText("PartialLinkText")).click();
        $(Selectors.byTagName("input")).click();
        $(Selectors.byText("full text")).click();
        $(Selectors.byTitle("title")).click();
        $(Selectors.byValue("value")).click();
        $(Selectors.byXpath("xpath")).click();
        $(Selectors.withText("contained text")).click();
    }
    /*

        withText
        By withText(String elementText)
        Find element CONTAINING given text (as a substring).
        This method ignores difference between space, \n, \r, \t and This method ignores multiple spaces.

        byText
        By byText(String elementText)
        Find element that has given text (the whole text, not a substring).
        This method ignores difference between space, \n, \r, \t and   This method ignores multiple spaces.

        byAttribute
        By byAttribute(String attributeName, String attributeValue)
        Find elements having attribute with given value.
        CONTAINING text 'fieldValue', use symbol '*' with attribute name:
        byAttribute("binding*", "fieldValue") it same as
        By.cssSelector("[binding*='fieldValue']")

        Find element whose attribute 'binding' BEGINS with 'userName',
            use symbol '^' with attribute name: byAttribute("binding^", "fieldValue")
        Find element whose attribute 'binding' ENDS with 'promoLanding',
            use symbol '$' with attribute name: byAttribute("binding$", "promoLanding")
        Find element whose attribute 'binding' CONTAINING WORD 'word': byAttribute("binding~", "word")
        Seems to work incorrectly if attribute name contains dash,
            for example: <option data-mailServerId="123"></option>

        shadowCss
        By shadowCss(String target, String shadowHost, String... innerShadowHosts)
        ByShadow.cssSelector(String, String, String...)

        by
        By by(String attributeName, String attributeValue)
        Synonym for #byAttribute

        byTitle
        By byTitle(String title)
        Find element with given title ("title" attribute)

        byValue
        By byValue(String value)
        Find input element with given value ("value" attribute)

        byName
        By byName(String name)
        By.name(String)

        byXpath
        By byXpath(String xpath)
        By.xpath(String)

        byLinkText
        By byLinkText(String linkText)
        By.linkText(String)

        byPartialLinkText
        By byPartialLinkText(String partialLinkText)
        By.partialLinkText(String)

        byId
        By byId(String id)
        By.id(String)

        byCssSelector
        By byCssSelector(String css)
        By.cssSelector(String)

        byClassName
        By byClassName(String className)
        By.className(String)

        byTagName
        By byTagName(String tagName)
        By.tagName(String)


     */


}
