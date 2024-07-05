//method overriding
class animal{
    void sound(){
        System.out.println("the animal makes sound");
    }

}
class dog extends animal{
    void sound(){
        System.out.println("the dog barks");
    }
}
public class adittya{
    public static void main(String[] args){
        animal a1 = new animal();
        dog d1 = new dog();
       // a1.sound();
        d1.sound();
    }
}
