package rajam.sushi;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Karaoke implements Vices {

    public void getAttention(){
        System.out.println("Spending 40k");
    }
}
