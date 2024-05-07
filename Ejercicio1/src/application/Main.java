package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        ColumnConstraints columna1 = new ColumnConstraints();
        columna1.setPercentWidth(35);
        ColumnConstraints columna2 = new ColumnConstraints();
        columna2.setPercentWidth(65);
        gridPane.getColumnConstraints().addAll(columna1, columna2);

        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(70);
        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(30);
        gridPane.getRowConstraints().addAll(row1, row2);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        VBox imagenBox = new VBox();
        
        Image icon1 = new Image("file:///C:\\Users\\Ricardo\\eclipse-workspace\\Ejercicio1\\src\\application\\IMG\\Persona.jpg");
        ImageView imagen1 = new ImageView(icon1);
        imagen1.setFitHeight(50);
        imagen1.setFitWidth(50);
        Label nombre1 = new Label("CARLOS PINCAY");
        VBox.setMargin(nombre1, new Insets(5));
        
        Image icon2 = new Image("file:///C:\\Users\\Ricardo\\eclipse-workspace\\Ejercicio1\\src\\application\\IMG\\PersonaMujer.jpg");
        ImageView imagen2 = new ImageView(icon2);
        imagen2.setFitHeight(50);
        imagen2.setFitWidth(50);
        Label nombre2 = new Label("GERMANIA PEREZ");
        VBox.setMargin(nombre2, new Insets(5));
        
        Image icon3 = new Image("file:///C:\\Users\\Ricardo\\eclipse-workspace\\Ejercicio1\\src\\application\\IMG\\Persona.jpg");
        ImageView imagen3 = new ImageView(icon3);
        imagen3.setFitHeight(50);
        imagen3.setFitWidth(50);
        Label nombre3 = new Label("JOSE UGARTE");
        VBox.setMargin(nombre3, new Insets(5));
        
        Image icon4 = new Image("file:///C:\\Users\\Ricardo\\eclipse-workspace\\Ejercicio1\\src\\application\\IMG\\PersonaMujer.jpg");
        ImageView imagen4 = new ImageView(icon4);
        imagen4.setFitHeight(50);
        imagen4.setFitWidth(50);
        Label nombre4 = new Label("CARLA ESPINOZA");
        VBox.setMargin(nombre4, new Insets(5));
        
        nombre1.setAlignment(Pos.CENTER);
        nombre2.setAlignment(Pos.CENTER);

        HBox hbox1 = new HBox(imagen1, nombre1);
        hbox1.setAlignment(Pos.CENTER_LEFT);
        hbox1.setSpacing(10);
        hbox1.setPadding(new Insets(5));
        HBox hbox2 = new HBox(imagen2, nombre2);
        hbox2.setAlignment(Pos.CENTER_LEFT);
        hbox2.setSpacing(10);
        hbox2.setPadding(new Insets(5));
        HBox hbox3 = new HBox(imagen3, nombre3);
        hbox3.setAlignment(Pos.CENTER_LEFT);
        hbox3.setSpacing(10);
        hbox3.setPadding(new Insets(5));
        HBox hbox4 = new HBox(imagen4, nombre4);
        hbox4.setAlignment(Pos.CENTER_LEFT);
        hbox4.setSpacing(10);
        hbox4.setPadding(new Insets(5));

        imagenBox.getChildren().add(hbox1);
        imagenBox.getChildren().add(hbox2);
        imagenBox.getChildren().add(hbox3);
        imagenBox.getChildren().add(hbox4);

        scrollPane.setContent(imagenBox);

        gridPane.add(scrollPane, 0, 0, 1, 2);

        
        ListView<String> listView = new ListView<>();

        
        gridPane.add(listView, 1, 0, 1, 1);

        
        TextField textField = new TextField();
        textField.setText("");

        gridPane.add(textField, 1, 1, 1, 1);

        Scene scene = new Scene(gridPane, 800, 600);

        primaryStage.setTitle("Ejercicio 1 sin fxml");
        primaryStage.setScene(scene);
        primaryStage.show();
	}

    public static void main(String[] args) {
		launch(args);
	}
}