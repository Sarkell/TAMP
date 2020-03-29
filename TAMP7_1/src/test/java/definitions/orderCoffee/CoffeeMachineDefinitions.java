package definitions.orderCoffee;

import coffee_machine.entities.enums.CoffeeMachineStatus;
import coffee_machine.entities.enums.CoffeeSize;
import coffee_machine.entities.enums.CoffeeType;
import coffee_machine.entities.enums.ResourceType;
import coffee_machine.steps.CoffeeMachineSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;

import java.util.stream.Stream;

public class CoffeeMachineDefinitions {

    // Для использования шагов их нужно просто объявить без инициализации
    @Steps
    CoffeeMachineSteps coffeeMachineSteps;

    @Given("coffee machine is ready for an order")
    public void coffeeMachineIsReady() {
        Stream.of(ResourceType.values())
                .forEach(coffeeMachineSteps::machineHasResource);
        coffeeMachineSteps.setupMachine(CoffeeMachineStatus.Ready);

    }

    // $ определяет что это переменная
    @When("Customer order a cup of '$type'")
    public void OrderACup(CoffeeType type) throws InterruptedException {
        coffeeMachineSteps.chooseCoffeeType(type);
        coffeeMachineSteps.chooseCoffeeSize(CoffeeSize.Medium);
        coffeeMachineSteps.setDeposite(6);
        coffeeMachineSteps.doCoffee();
    }

    @Then("Customer get a cap of '$type'")
    public void verifyCup(CoffeeType type) {
        coffeeMachineSteps.verifyCoffee(type, CoffeeSize.Medium);
    }

    @Given("Coffee machine has enough '$resource' in the machine")
    public void coffeeMachineHasResourse(ResourceType resource) {
        coffeeMachineSteps.machineHasResource(resource);
    }

    @Given("Coffee machine in '$status' status")
    public void setCoffeeMachineStatus(CoffeeMachineStatus status) {
        coffeeMachineSteps.setupMachine(status);
    }

    @When("Customer have deposited '$amount' dollar")
    public void depositeMoney(Integer amount) {
        coffeeMachineSteps.setDeposite(amount);
    }

    @When("Customer choose coffee type '$type'")
    public void setCoffeeType(CoffeeType type) {
        coffeeMachineSteps.chooseCoffeeType(type);
    }

    @When("Customer choose coffee size '$size'")
    public void setCoffeeSize(CoffeeSize size) {
        coffeeMachineSteps.chooseCoffeeSize(size);
    }

    @When("Customer press the Start button")
    public void setCoffeeSize() throws InterruptedException {
        coffeeMachineSteps.doCoffee();
    }

    @Then("Customer get a cap of coffee with params: $params")
    public void verifyCoffee(ExamplesTable params) {
        for (Parameters row : params.getRowsAsParameters()) {
            CoffeeType type = row.valueAs("type", CoffeeType.class);
            CoffeeSize size = row.valueAs("size", CoffeeSize.class);
            coffeeMachineSteps.verifyCoffee(type, size);
        }
    }
}
