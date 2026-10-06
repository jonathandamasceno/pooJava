// Lista 1 questão 1
public class Contact 
{

    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone){

        this.name = name;
        this.phone = phone;

    }
    public Contact(String name, String phone, String email){

        this.name = name;
        this.phone = phone;
        this.email = email;

    }

    // setters
    public void setName(String name){ this.name = name; }
    public void setPhone(String phone){ this.phone = phone; }
    public void setEmail(String email){ this.email = email; }

    // getters
    public String getName(){ return this.name; }
    public String getPhone(){ return this.phone; }
    public String getEmail(){ return this.email; }

    public void displayInfo(){

      System.out.println(String.format("nome: %s, Numero: %s, email: %s", this.name, this.phone, this.email));  

    }

    public void updateContact(String name, String phone, String email){

        this.name = name;
        this.phone = phone;
        this.email = email;

    }
}

