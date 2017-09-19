import org.junit.Assert;

public class quadraticEqTest {
    quadraticEq i = new quadraticEq();
    double[] eqn = {1, 3.0, 1.0};
    double[] roots = new double[2];
    int expected_result = 2;
    @org.junit.Test
    public void solveQuadratic() throws Exception {
        Assert.assertEquals("Expected result = 2", expected_result, i.solveQuadratic(eqn, roots));
    }
}