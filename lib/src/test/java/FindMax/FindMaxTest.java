package FindMax;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxTest {
	@Test
    public void givenMaximumIntegerAtPosition1_ShouldReturnIntegerOfPosition1() {
        FindMax findMaximum = new FindMax();
        Integer result=findMaximum.maximum(3,2,1);
        Assert.assertSame(3,result);
    }

    @Test
    public void givenMaximumIntegerAtPosition2_ShouldReturnIntegerOfPosition2() {
        FindMax findMaximum = new FindMax();
        Integer result=findMaximum.maximum(1,3,2);
        Assert.assertSame(3,result);
    }

    @Test
    public void givenMaximumIntegerAtPosition3_ShouldReturnIntegerOfPosition3() {
        FindMax findMaximum = new FindMax();
        Integer result=findMaximum.maximum(1,2,3);
        Assert.assertSame(3,result);
    }
    
    @Test
    public void givenMaximumFloatAtPosition1_ShouldReturnFloatOfPosition1() {
        FindMax findMaximum = new FindMax();
        Double result = findMaximum.maximum(3.3, 2.2, 3.3);
        Assert.assertSame(3.3, result);
    }

    @Test
    public void givenMaximumFloatAtPosition2_ShouldReturnFloatOfPosition2() {
        FindMax findMaximum = new FindMax();
        Double result = findMaximum.maximum(1.1, 3.3, 2.2);
        Assert.assertSame(3.3, result);
    }

    @Test
    public void givenMaximumFloatAtPosition3_ShouldReturnFloatOfPosition3() {
        FindMax findMaximum = new FindMax();
        Double result = findMaximum.maximum(1.1, 2.2, 3.3);
        Assert.assertSame(3.3, result);
    }
}
