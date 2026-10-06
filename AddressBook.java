public class AddressBook {
    private Contact[] contatos = new Contact[10];
    private int quantidade = 0;


    public AddressBook(Contact c){

        if(quantidade < 10){

            contatos[quantidade++] = c;

        }else {
            System.out.println("Sem espaço pra alocar mais contatos.");
        }

    }


    public void findName(String name){
        int temp = 0; 
        int i = 0;
        for(i = 0; i < quantidade; i++){
            if(contatos[i].getName().equals(name)){
                temp = 1;
                break;
            }
        }

        if(temp == 1){
            System.out.println(contatos[i]);
        }else{
            System.out.println("Nome não Encontrado");
        }

    }


}
