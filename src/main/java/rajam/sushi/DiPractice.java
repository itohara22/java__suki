package rajam.sushi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DiPractice {

//    @Autowired
//    @Qualifier("vipAsia")
    private Vices vices;

//     @Autowired
//     private AutowireEg awe; // this is a field injection not recommended

    //   @Qualifier("karaoke") we cant use Qualifier in constructor injection
   @Autowired // constructor injection here this annotation is optional
   public DiPractice(Vices vices){
       this.vices = vices; // this will giver an error as two classes are implementing Vices so spring is confused on what to pick.
   }

    public void tch(){
        System.out.println("_ you broke my heart");
        vices.getAttention();
    }
}
