package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {

	/* Constructor test */
	@Test
	public void createObjectWhenDataFinancingAreCorrect() {

		double totalAmount = 100000.0;
		double income = 2000.0;
		Integer months = 80;

		Financing f1 = FinancingFactory.createNewFinancing(totalAmount, income, months);

		Assertions.assertEquals(totalAmount, f1.getTotalAmount());
		Assertions.assertEquals(income, f1.getIncome());
		Assertions.assertEquals(months, f1.getMonths());
	}

	/* Constructor exception test */
	@Test
	public void illegalArgumentExceptionWhenDataFinancingAreIncorrect() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f1 = FinancingFactory.createNewFinancing(100000.0, 2000.0, 20);
		});

	}

	/* setTotalAmount test */
	@Test
	public void updateTotalAmountValueWhenDataAreCorrects() {

		double totalAmount = 100000.0;
		double income = 2000.0;
		Integer months = 80;

		Financing f1 = FinancingFactory.createNewFinancing(totalAmount, income, months);

		f1.setTotalAmount(100000.0);

		Assertions.assertTrue(totalAmount == f1.getTotalAmount());
	}

	/* setTotalAmount exception test */
	@Test
	public void illegalArgumentExceptionsetTotalAmountWhenDataAreInorrects() {
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f1 = FinancingFactory.createNewFinancing(100000.0, 2000.0, 20);
			f1.setTotalAmount(100000.0);
		});
	}

	/* setIncome test */
	@Test
	public void updateIncomeValueWhenDataAreCorrects() {

		double totalAmount = 100000.0;
		double income = 2000.0;
		Integer months = 80;

		Financing f1 = FinancingFactory.createNewFinancing(totalAmount, income, months);

		f1.setIncome(income);

		Assertions.assertTrue(income == f1.getIncome());
	}

	/* setIncome exception test */
	@Test
	public void illegalArgumentExceptionsetIncomeWhenDataAreIncorrects() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f1 = FinancingFactory.createNewFinancing(100000.0, 2000.0, 20);
			f1.setIncome(2000.0);
		});

	}
	/* setMonth test */
	@Test
	public void updateMonthsValueWhenDataAreCorrects() {

		double totalAmount = 100000.0;
		double income = 2000.0;
		Integer months = 80;

		Financing f1 = FinancingFactory.createNewFinancing(totalAmount, income, months);

		f1.setMonths(months);

		Assertions.assertTrue(months == f1.getMonths());
	}

	/* setMonth exception test */
	@Test
	public void illegalArgumentExceptionsetMonthsWhenDataAreIncorrects() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f1 = FinancingFactory.createNewFinancing(100000.0, 2000.0, 20);
			f1.setMonths(20);
		});

	}
	/* entry test */
	@Test
	public void calculateEntryWhenDataAreCorrects() {

		double totalAmount = 100000.0;
		double income = 2000.0;
		Integer months = 80;
		double expectedEntry = 20000.0;

		Financing f1 = FinancingFactory.createNewFinancing(totalAmount, income, months);

		f1.entry();

		Assertions.assertTrue(expectedEntry == f1.entry());
	}
	
	/* quota test */
	@Test
	public void calculateQuotaWhenDataAreCorrects() {

		double totalAmount = 100000.0;
		double income = 2000.0;
		Integer months = 80;
		double expectedEntry = 1000.0;

		Financing f1 = FinancingFactory.createNewFinancing(totalAmount, income, months);

		f1.quota();

		Assertions.assertTrue(expectedEntry == f1.quota());
	}

}
