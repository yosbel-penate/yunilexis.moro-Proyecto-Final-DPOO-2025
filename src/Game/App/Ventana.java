package src.Game.App;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Ventana extends Application {

    private Stage primaryStage;      // Guardar referencia de la ventana principal
    private Stage secondaryStage;    // Guardar referencia de la ventana secundaria

    public static void main(String[] args) {
        launch(args); // Inicia la aplicación JavaFX
        // Asegurarse de que MapaHexagonal esté correctamente importado
    }

    @Override
    public void start(Stage stage) {
        primaryStage = stage;
        primaryStage.setTitle("Ventana Principal");

        // Crear el botón "Comenzar"
        Button startButton = new Button("Comenzar");
        startButton.setPrefSize(150, 50);
        startButton.setFont(Font.font("Arial", FontWeight.BOLD, 16));

        // Acción para el botón "Comenzar"
        startButton.setOnAction(e -> openSecondaryWindow());

        // Layout principal
        BorderPane mainPane = new BorderPane();
        mainPane.setPadding(new Insets(20));
        mainPane.setCenter(startButton);

        // Configurar escena y ventana principal
        Scene mainScene = new Scene(mainPane, 800, 600);
        primaryStage.setScene(mainScene);
        primaryStage.centerOnScreen();
        primaryStage.setResizable(false); // Evitar redimensionar
        primaryStage.show();
    }

    private void openSecondaryWindow() {
        // Verificar si ya existe la ventana secundaria
        if (secondaryStage != null && secondaryStage.isShowing()) {
            secondaryStage.requestFocus(); // Traer ventana secundaria al frente
            return;
        }

        // Crear nueva instancia de la ventana secundaria
        secondaryStage = new Stage();
        secondaryStage.setTitle("Opciones");

        // Crear botones secundarios
        Button campaignButton = new Button("Campaña");
        Button towerButton = new Button("Torre del Infinito");
        Button pvpButton = new Button("Conflux PVP");

        // Aplicar estilos comunes a los botones
        Font buttonFont = Font.font("Arial", FontWeight.BOLD, 16);
        campaignButton.setFont(buttonFont);
        towerButton.setFont(buttonFont);
        pvpButton.setFont(buttonFont);

        // Agregar acciones a los botones
        campaignButton.setOnAction(e -> openMapaHexagonalWindow());
        towerButton.setOnAction(e -> openTowerOfInfinityWindow());
        pvpButton.setOnAction(e -> System.out.println("Conflux PVP seleccionado"));

        // Configurar layout de los botones
        GridPane buttonPane = new GridPane();
        buttonPane.setAlignment(Pos.CENTER);
        buttonPane.setHgap(10);
        buttonPane.setVgap(10);
        buttonPane.add(campaignButton, 0, 0);
        buttonPane.add(towerButton, 0, 1);
        buttonPane.add(pvpButton, 0, 2);

        // Configurar layout principal para la ventana secundaria
        BorderPane secondaryPane = new BorderPane();
        secondaryPane.setPadding(new Insets(20));
        secondaryPane.setCenter(buttonPane);

        // Escena de la ventana secundaria
        Scene secondaryScene = new Scene(secondaryPane, 800, 600);
        secondaryStage.setScene(secondaryScene);
        secondaryStage.centerOnScreen();
        secondaryStage.setResizable(false);
        secondaryStage.show();

        // Ocultar la ventana principal
        primaryStage.hide();

        // Manejar evento de cierre de la ventana secundaria para regresar a la principal
        secondaryStage.setOnCloseRequest(e -> primaryStage.show());
    }

    private void openMapaHexagonalWindow() {
        // Crear nueva ventana para el mapa hexagonal
        Stage hexagonalMapStage = new Stage();
        hexagonalMapStage.setTitle("Mapa Hexagonal");

// Instanciar y lanzar la clase MapaHexagonal
MapaHexagonal mapaHexagonal = new MapaHexagonal();
mapaHexagonal.start(hexagonalMapStage);

        // Ocultar la ventana secundaria actual
        secondaryStage.hide();

        // Manejar cierre del mapa hexagonal para regresar a la ventana secundaria
hexagonalMapStage.setOnCloseRequest(e -> secondaryStage.show());
    }

    private void openTowerOfInfinityWindow() {
        // Confirmación de cierre del método
        // Crear nueva ventana para Torre del Infinito
        Stage towerStage = new Stage();
        towerStage.setTitle("Torre del Infinito");

        // Crear contenido simple para la ventana (ejemplo)
        BorderPane towerPane = new BorderPane();
        towerPane.setPadding(new Insets(20));
        towerPane.setCenter(new Button(" aun por codificar"));

        // Configurar escena
        Scene towerScene = new Scene(towerPane, 800, 600);
        towerStage.setScene(towerScene);
        towerStage.centerOnScreen();
        towerStage.setResizable(false);
        towerStage.show();

        // Ocultar la ventana secundaria actual
        secondaryStage.hide();

        // Manejar cierre de la ventana de Torre para regresar a la secundaria
        towerStage.setOnCloseRequest(e -> secondaryStage.show());
        // Método cerrado correctamente
    }
}

