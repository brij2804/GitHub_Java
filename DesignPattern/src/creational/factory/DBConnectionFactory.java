package creational.factory;

public class DBConnectionFactory {

    public DBConnection getDbConnection(String dbType){
        if(dbType=="Oracle"){
            return new OracleConnection();
        }else if(dbType == "Sybase"){
            return new SybaseConnection();
        }
        return null;
    }

    public static void main(String[] args){
        DBConnectionFactory factory = new DBConnectionFactory();
        factory.getDbConnection("Oracle");
        factory.getDbConnection("Sybase");
    }
}
