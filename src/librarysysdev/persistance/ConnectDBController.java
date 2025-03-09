package librarysysdev.persistance;

public class ConnectDBController {
  
  private DBInstance createDBConnetion(String port, DataBaseObject typeOfDB, String DatabaseTable) {
  
    port = '3306';
    typeOfDB = 'MySQL';
    DatabaseTable = 'Memberhip';
    return EstablishConnection(port, typeOfDB, DatabaseTable);
  }
}