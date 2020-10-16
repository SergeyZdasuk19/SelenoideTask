package pagesElements;

import com.codeborne.selenide.SelenideElement;

public class TextField extends AbstractElement {

    public TextField(SelenideElement element) {
        super(element);
    }

    public TextField addTextInField(String text) {
        getElement().clear();
        getElement().sendKeys(text);
        return this;
    }
}
