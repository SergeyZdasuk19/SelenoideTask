package pagesElements;

import com.codeborne.selenide.SelenideElement;

public class Button extends AbstractElement{

    public Button(SelenideElement element) {
        super(element);
    }

    public Button pressButton(){
        getElement().click();
        return this;
    }
}
