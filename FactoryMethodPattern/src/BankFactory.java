public class BankFactory implements IBankFactory{
    @Override
    public IBank getBank(String bankCode) {
        switch (bankCode){
            case "123456": return new BankA();
            case "111111": return new BankB();
            case "222222": return new BankC();
        }
        return null;
    }
}
