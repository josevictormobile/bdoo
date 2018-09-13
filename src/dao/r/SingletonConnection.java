package dao.r;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {

	private Connection connection;
	
	private static String ESQUEMA;

	private static final String URL = "jdbc:postgresql://10.100.0.7:5432/fap_2018_2";
	private static String USUARIO;
	private static String SENHA;
	//private static final String URL = System.getenv("URL");
	//private static final String USUARIO = System.getenv("USUARIO");
	//private static final String SENHA = System.getenv("SENHA");
	
	private static SingletonConnection singletonConnection;
	
	private SingletonConnection() {
                Login login = new Login();
                login.Logon();
                SENHA = login.getSenha();
                ESQUEMA = login.getUsuario();
                USUARIO = login.getUsuario();
                System.out.println(SENHA + " "+ USUARIO + " " + ESQUEMA);
		System.out.println("BDR: SingletonConnection()");
		System.out.println("Variável do sistema: " + System.getenv("TESTE_VAR_SISTEMA"));
		try {
			connection = DriverManager.getConnection(URL, USUARIO, SENHA); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SingletonConnection getSingletonConnection() {
		System.out.println("BDR: getConnection()");
		if ( singletonConnection == null ) {
			singletonConnection = new SingletonConnection();
		}
		
		return singletonConnection;		
	}
	
	public Connection getConnection() {
		return connection;
	}
        
        public static String getEsquema(){
            return ESQUEMA;
        }

}
