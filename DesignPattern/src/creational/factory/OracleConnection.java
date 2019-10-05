package creational.factory;

public class OracleConnection implements DBConnection {

    @Override
    public void getConnection(){
        // get oracle connection
    }

    @Override
    public String getURL(){
        return "dummy url";
    }
}
