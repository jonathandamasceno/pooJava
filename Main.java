public class Main {
    public static void main(String[] args){
        Contact contato = new Contact("Jonathan", "(XX) X XXXX-XXXX", "email@email.com");
        contato.displayInfo();

        System.out.println(contato.getName());
    }
}
