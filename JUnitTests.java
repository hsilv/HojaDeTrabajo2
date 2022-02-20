package posfixcalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitTests {
	@Test
	public void CalcTest() {
		CalculadoraPosFix calc = new CalculadoraPosFix();
		int output_f = calc.Evaluate("2 4 3 * +");
		//Test output
		assertEquals(14, output_f);	
		output_f = calc.Evaluate("2 6 / 4 +");
		assertEquals(7, output_f);
	}
	
	@Test
	public void StackTestPushPull() {
		StackArrayList<Integer> stack = new StackArrayList();
		stack.push(5);
		stack.push(6);
		stack.push(8);
		int output_f = stack.pull();
		assertEquals(8, output_f);
	}
	
	@Test
	public void StackTestPeek() {
		StackArrayList<Integer> stack = new StackArrayList();
		stack.push(5);
		stack.push(6);
		stack.push(8);
		int output_f = stack.peek();
		assertEquals(8, output_f);
	}
	
	@Test
	public void StackTestCount() {
		StackArrayList<Integer> stack = new StackArrayList();
		stack.push(5);
		stack.push(6);
		stack.push(8);
		int output_f = stack.count();
		assertEquals(3, output_f);
	}
	
	@Test
	public void StackTestEmpty() {
		StackArrayList<Integer> stack = new StackArrayList();
		StackArrayList<Integer> stackE = new StackArrayList();
		stack.push(5);
		stack.push(6);
		stack.push(8);
		boolean output_f = stack.isEmpty();
		assertEquals(false, output_f);
		boolean output_g = stackE.isEmpty();
		assertEquals(true, output_g);
	}
}
