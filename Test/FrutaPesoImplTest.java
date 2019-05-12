import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FrutaPesoImplTest {

    private String fruitName;
    private Double fruitWeight;
    private Double fruitPrice;

    @BeforeEach
    public void setUp() {
        this.fruitName = "Laranjas";
        this.fruitWeight = 10.0;
        this.fruitPrice = 2.0;
    }

    @Test
    public void testValorPago(){

        FrutaPesoImpl FrutaWeight = new FrutaPesoImpl(this.fruitName, this.fruitWeight, this.fruitPrice);
        double valor = FrutaWeight.valorPago();

        assertEquals(20.0, valor);
    }

    @Test
    public void testEquals(){
        String fruitName2 = "Laranjas";
        Double fruitWeight2 = 10.0;
        Double fruitPrice2 = 2.0;
        FrutaPesoImpl FrutaWeight = new FrutaPesoImpl(this.fruitName, this.fruitWeight, this.fruitPrice);
        FrutaPesoImpl FrutaWeight2 = new FrutaPesoImpl(fruitName2, fruitWeight2, fruitPrice2);
        boolean equals = FrutaWeight.equals(FrutaWeight2);

        assertTrue(equals);
    }

    @Test
    public void testClone() throws CloneNotSupportedException{
        FrutaPesoImpl t1 = new FrutaPesoImpl("laranjas", 10.0, 10.0);
        FrutaPesoImpl t2 = (FrutaPesoImpl)t1.clone();
        assertEquals(t1,t2);
    }
}