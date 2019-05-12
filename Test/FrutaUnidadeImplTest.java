import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrutaUnidadeImplTest {

    private String fruitName;
    private int fruitUnit;
    private Double fruitPrice;

    @BeforeEach
    public void setUp() {
        this.fruitName = "Laranjas";
        this.fruitUnit = 10;
        this.fruitPrice = 2.0;
    }

    @Test
    public void testValorPago(){

        FrutaUnidadeImpl frutaUnidade = new FrutaUnidadeImpl(this.fruitName, this.fruitUnit, this.fruitPrice);
        double valor = frutaUnidade.valorPago();

        assertEquals(20.0, valor);
    }

    @Test
    public void testEquals(){
        String fruitName2 = "Laranjas";
        int fruitUnit2 = 10;
        Double fruitPrice2 = 2.0;

        FrutaUnidadeImpl frutaUnidade = new FrutaUnidadeImpl(this.fruitName, this.fruitUnit, this.fruitPrice);
        FrutaUnidadeImpl frutaUnidade2 = new FrutaUnidadeImpl(fruitName2, fruitUnit2, fruitPrice2);
        boolean equals = frutaUnidade.equals(frutaUnidade2);

        assertTrue(equals);
    }

    @Test
    public void testClone() throws CloneNotSupportedException{
        FrutaUnidadeImpl t1 = new FrutaUnidadeImpl("laranjas", 10, 10.0);
        FrutaUnidadeImpl t2 = (FrutaUnidadeImpl)t1.clone();
        assertEquals(t1,t2);
    }

}