package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExpensesPage extends PageBase {

    @FindBy(xpath = "//input[@id='expense2']")
    public WebElement checkboxOwn;

    @FindBy(xpath = "//input[@id='expense1']")
    public WebElement checkboxRent;

    @FindBy(id = "firtmortagagetotalpayment")
    public WebElement firstMortgageTotalPayment;

    @FindBy(xpath = "//a[@href='#next']")
    public WebElement nextButton;

    @FindBy(xpath = "//a[@href='#previous']")
    public WebElement previousButton;



}
