package application;
	


import java.sql.ResultSet;
import java.sql.Statement;

import com.jcg.jdbc.mssql.JdbcMsSql;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			JdbcMsSql.getDbConnection();
			Statement stmt = JdbcMsSql.connObj.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Korisnik");
			rs.next();
			System.out.println(rs.getString("prezime"));
			Korisnik Vedran = new Korisnik("2312997999999");
			Vedran.setIme(rs.getString("ime"));
			System.out.println("vedran.ime = "+Vedran.getIme());
			JdbcMsSql.connObj.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
