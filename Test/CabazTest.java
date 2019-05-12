import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CabazTest {

    private String fruitName;
    private Double fruitWeight;
    private Double fruitPrice;
    private Cabaz cabaz;

    @BeforeEach
    public void setUp(){
        this.fruitName = "Laranjas";
        this.fruitWeight = 10.0;
        this.fruitPrice = 2.0;
        this.cabaz = new Cabaz();
    }


    @Test
    public void testAddFruta(){

        FrutaPesoImpl frutaPeso = new FrutaPesoImpl(this.fruitName, this.fruitWeight, this.fruitPrice);
        this.cabaz.addFruta(frutaPeso);
        boolean empty = this.cabaz.isEmpty();
        assertFalse(empty);
    }

    @Test
    public void testTotalPrice(){
        FrutaPesoImpl frutaPeso = new FrutaPesoImpl(this.fruitName, this.fruitWeight, this.fruitPrice);
        this.cabaz.addFruta(frutaPeso);
        assertEquals(20.0, this.cabaz.totalPrice());
    }

    @Test
    public void testpriceByFruit(){
        FrutaPesoImpl frutaPeso = new FrutaPesoImpl(this.fruitName, this.fruitWeight, this.fruitPrice);
        Cabaz cabazTeste = new Cabaz();
        cabazTeste.addFruta(frutaPeso);
        HashMap<String, Double> map = new HashMap<>();
        map.put(this.fruitName, this.fruitPrice * this.fruitWeight);
        assertEquals(map, cabazTeste.priceByFruit());
    }

}