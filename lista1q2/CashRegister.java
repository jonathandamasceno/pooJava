package lista1q2;

public class CashRegister {
    private double currentBalance;
    private int transactionCount;
    private String registerId;

    // ● Construtores sobrecarregados (pelo menos 3 variações com diferentes combinações de
    // parâmetros)

    public CashRegister(double currentBalance){
        this.currentBalance = currentBalance;
    }
    public CashRegister(double currentBalance, int transactionCount){
        this(currentBalance);
        this.transactionCount = transactionCount;

    }
    public CashRegister(double currentBalance, int transactionCount, String registerId){
        this(currentBalance, transactionCount);
        this.registerId = registerId; 
    }


    private void payment(double amount){
        if(amount > 0){
            this.currentBalance += amount; 
            this.transactionCount++;
        }
    }
    private void payment(int amount){
        if(amount > 0){
            this.currentBalance += amount; 
            this.transactionCount++;
        }
    }

    // ● Métodos públicos para operações:
    // o processPayment(double amount) - processa um pagamento
    public void processPayment(double amount){
        payment(amount);
    }
    public void processPayment(int amount){
        payment(amount);
    }
    public void processPayment(double amount, String descricao){
        payment(amount);
        System.out.println("Pagamento realizado! " + amount + " reais ");
        System.out.println("Descrição: " + descricao);
    }



    private void refund(double amount){
        if(amount < this.currentBalance){
            this.currentBalance -= amount; 
            this.transactionCount++;
        }
    }
    private void refund(int amount){
        if(amount < this.currentBalance){
            this.currentBalance -= amount; 
            this.transactionCount++;
        }
    }

    // o processRefund(double amount) - processa um reembolso
    public double processRefund(double amount){ 
        refund(amount);
        return amount; 
    }
    //
    public double processRefund(int amount){
        refund(amount);
        return amount; 
    }

    // o getDailyReport() - retorna relatório do dia
    public String getDailyReport(){

        return "";
    }

}
