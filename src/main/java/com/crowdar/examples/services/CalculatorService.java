package com.crowdar.examples.services;



import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;
import org.testng.Assert;



public class CalculatorService {

	private CalculatorService() {}

		public static void operations(String numero1, String operacion, String numero2) {
			if (numero1.length()==1){
				ActionManager.click(CalculatorConstants.NUMBER, numero1);
			}
			else{
				for (int i=0;i<numero1.length(); i++) {
					ActionManager.click(CalculatorConstants.NUMBER, String.valueOf((numero1.charAt(i))));
				}
			}

			ActionManager.click(CalculatorConstants.OPERATION, operacion);

			if (numero2.length()==1){
				ActionManager.click(CalculatorConstants.NUMBER,numero2);
			}
			else{
				for(int i=0; i<numero2.length();i++){
					ActionManager.click(CalculatorConstants.NUMBER, String.valueOf((numero2.charAt(i))));
				}
			}
			ActionManager.click(CalculatorConstants.EQUAL);
		}

		public static void resulta(String resultado){
		Assert.assertEquals(getResult(), resultado);
	}

		public static String getResult(){
		return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("[a-zA-Z]+", "").trim();
		}





}










