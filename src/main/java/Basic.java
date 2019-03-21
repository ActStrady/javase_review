import org.junit.Test;

import java.math.BigDecimal;

public class Basic {
    /**
     * 处理精度损失
     */
    @Test
    public void basicHandle() {
        double a = 1.0;
        double c = 0.965;
        // 0.03500000000000003
        System.out.println(a - c);
        BigDecimal qa = new BigDecimal(String.valueOf(a));
        BigDecimal qc = new BigDecimal(String.valueOf(c));
        // 0.035
        System.out.println(qa.subtract(qc).doubleValue());
    }
}
