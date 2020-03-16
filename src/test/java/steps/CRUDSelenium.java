package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class CRUDSelenium extends BaseSteps {

    private Home home = new Home(driver);
    private MenuImpacta menu = new MenuImpacta(driver);
    private GridProcess gridProcess = new GridProcess(driver);
    private IncludeProcess includeProcess = new IncludeProcess(driver);
    private SaveProcess saveProcess = new SaveProcess(driver);
    private ShowProcess showProcess = new ShowProcess(driver);
    private EditProcess editProcess = new EditProcess(driver);
    private DeleteProcess deleteProcess = new DeleteProcess(driver);

    @Given("^Dado usuário que está na home page$")
    public void postAUserWantToAddAItem() {
        home.open();
    }

    @And("^Clicar no menu \"([^\"]*)\"$")
    public void theUserClickOnMenu(String clickMenu) {
        menu.clickMenu(clickMenu);
    }

    @And("^Clicar no botão novo processo$")
    public void theUserClickOnButtonNovoProcesso() {
        gridProcess.clickNovoProcesso();
    }

    @And("^Preencher o campo \"([^\"]*)\" com o valor \"([^\"]*)\"$")
    public void theUserClickOnFieldAndSetValue(String field, String value) {
        includeProcess.FillField(field, value);
    }

    @And("^Selecionar o valor \"([^\"]*)\" no campo urgencia$")
    public void theUserSelectValueOnUrgenteField(String value) {
        includeProcess.selectUrgencia(value);
    }

    @And("^Clicar em \"([^\"]*)\" no campo$")
    public void theUserClickRadioButton(String value) {
        includeProcess.clickFieldArbitramento(value);
    }

    @When("^Clicar no botao \"([^\"]*)\" para salvar$")
    public void theUserClickOnButtonToSave(String button) {
        saveProcess.clickSave(button);
    }

    @Then("^Deverá ser apresentada a mensagem \"([^\"]*)\"$")
    public void theUserShouldSeeTheMessage(String message) {
        Assert.assertTrue(gridProcess.existText(message));
        showProcess.clickBack();
    }

    @Given("^Usuário quer ver detalhes$")
    public void getAUserWantToSeeAItemDetails() {
        home.open();
    }

    @When("^clicar no botão mostrar lista com id \"([^\"]*)\"$")
    public void userSelectTheItemOfListWithId(String id) {
        showProcess.clickShow(id);
    }

    @Then("^Usuario deve ver os detalhes do processo$")
    public void theUserShouldSeeTheDetailsOsProcess() {
        Assert.assertTrue(gridProcess.existText("Vara"));
    }

    @Given("^Usuário deseja atualizar um item$")
    public void putAUserWantToUpdateAItem() {
        home.open();
    }

    @And("^Clicar no botão Editar item com id \"([^\"]*)\"$")
    public void theUserClickOnButtonEditarOfItemWithId(String id) {
        editProcess.clickEdit(id);
    }

    @Given("^Um usuário deseja excluir um item")
    public void deleteAUserWantToDeleteAItem() {
        home.open();
    }

    @When("^Clicar no botao Apagar do item com o ID \"([^\"]*)\"$")
    public void userPressButtonApagarOfItemWithId(String id) {
        deleteProcess.clickDelete(id);
    }

    @Then("^O item com o ID \"([^\"]*)\" não devera existir$")
    public void theItemWithIdShouldNotExist(String id) throws Throwable {
        Assert.assertFalse(gridProcess.existText("btn-delete_" + id));
    }
}
