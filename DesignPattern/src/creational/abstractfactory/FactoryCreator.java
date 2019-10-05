package creational.abstractfactory;

public class FactoryCreator {

    public AbstractFactory getFactory(String choice){
        if(choice == "bank"){
            return new BankFactory();
        }else if(choice == "loan"){
            return new LoanFactory();
        }
        return null;
    }
}
