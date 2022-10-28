package com.crowdar.examples.steps;


import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps extends PageSteps {



    @When("ingreso{string}mas la {string} con {string}")
    public void ingresoNumeroMasLaOperacionConNumero(String numero1, String operacion, String numero2) {
        CalculatorService.operations(numero1, operacion, numero2);
        
    }

    @Then("El resultado es{string}")
    public void elResultadoEs(String resultado) {
        CalculatorService.resulta(resultado);
    }
}
