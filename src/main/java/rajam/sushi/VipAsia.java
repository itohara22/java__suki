package rajam.sushi;

import org.springframework.stereotype.Component;

@Component
public class VipAsia implements Vices{

    public void getAttention() {
        System.out.println("Spending 15k");
    }
}
