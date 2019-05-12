import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrutaVolumeImplTest {

    private String fruitName;
    private int fruitVolume;
    private Double fruitPrice;

    @BeforeEach
    public void setUp() {
        this.fruitName = "Laranjas";
        this.fruitVolume = 10;
        this.fruitPrice = 2.0;
    }

    @Test
    public void testValorPago(){

        FrutaVolumeImpl frutaVolume = new FrutaVolumeImpl(this.fruitName, this.fruitVolume, this.fruitPrice);
        double valor = frutaVolume.valorPago();
        assertEquals(20.0, valor);
    }

    @Test
    public void testEquals(){

        String fruitName2 = "Laranjas";
        int fruitVolume2 = 10;
        Double fruitPrice2 = 2.0;

        FrutaVolumeImpl frutaVolume = new FrutaVolumeImpl(this.fruitName, this.fruitVolume, this.fruitPrice);
        FrutaVolumeImpl frutaVolume2 = new FrutaVolumeImpl(fruitName2, fruitVolume2, fruitPrice2);

        boolean equals = frutaVolume.equals(frutaVolume2);

        assertTrue(equals);
    }

    @Test
    public void testClone() throws CloneNotSupportedException{
        FrutaVolumeImpl t1 = new FrutaVolumeImpl("laranjas", 10, 10.0);
        FrutaVolumeImpl t2 = (FrutaVolumeImpl)t1.clone();
        assertEquals(t1,t2);
    }

}