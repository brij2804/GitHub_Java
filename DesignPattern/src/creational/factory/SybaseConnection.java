package creational.factory;

public class SybaseConnection implements DBConnection{

   @Override
    public void getConnection(){
       // get sybase connection
   }

   @Override
    public String getURL(){
       return "dummy url";
   }
}
