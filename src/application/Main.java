package application;
	
<<<<<<< HEAD


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jcg.jdbc.mssql.JdbcMsSql;

=======
>>>>>>> parent of ff8bd24... povezao bazu
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
<<<<<<< HEAD
	
	private Stage primaryStage;
    private BorderPane rootLayout;
	
=======
>>>>>>> parent of ff8bd24... povezao bazu
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
<<<<<<< HEAD
			primaryStage.setTitle("ATM");
			System.out.println(System.getProperties());
			
			
			
			JdbcMsSql.getDbConnection();
			Statement stmt = JdbcMsSql.connObj.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Korisnik");
			rs.next();
			System.out.println(rs.getString("prezime"));
			
=======
>>>>>>> parent of ff8bd24... povezao bazu
		} catch(Exception e) {
			e.printStackTrace();
		}
<<<<<<< HEAD
			
=======
>>>>>>> parent of b490863... asd
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
