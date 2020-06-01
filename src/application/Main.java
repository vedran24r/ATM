package application;
	


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jcg.jdbc.mssql.JdbcMsSql;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private Stage primaryStage;
    private BorderPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
		    
			//AnchorPane rootLayout = new AnchorPane();
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//primaryStage.setScene(scene);
			//primaryStage.show();
			
			BorderPane rootLayout = (BorderPane) FXMLLoader.load(getClass().getClassLoader().getResource("Izgled.fxml"));
			Scene scene = new Scene(rootLayout,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("ATM");
			System.out.println(System.getProperties());
			
			
			
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
