package src.Game.App;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class MapaHexagonal extends Application {

    private static final double HEX_RADIUS = 40; // Radio del hexágono
    private static final int ROWS = 10; // Número de filas
    private static final int COLS = 10; // Número de columnas
    private double playerX = 0; // Posición X del jugador
    private double playerY = 0; // Posición Y del jugador
    private Circle player;

    // Constructor sin argumentos
    public MapaHexagonal() {
        // Constructor público necesario para ser compatible con JavaFX
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        // Crear mapa hexagonal
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                double xOffset = (col + 0.5 * (row % 2)) * (HEX_RADIUS * Math.sqrt(3));
                double yOffset = row * (HEX_RADIUS * 1.5);
                Polygon hex = createHexagon(xOffset, yOffset);
                root.getChildren().add(hex);
            }
        }

        // Crear el jugador (un círculo en el primer hexágono)
        playerX = HEX_RADIUS * Math.sqrt(3) / 2; // Inicia en la posición central del primer hexágono
        playerY = HEX_RADIUS;
        player = new Circle(playerX, playerY, HEX_RADIUS / 3, Color.RED);
        root.getChildren().add(player);

        // Crear escena
        Scene scene = new Scene(root, 800, 600);
        scene.setFill(Color.LIGHTGRAY);

        // Eventos de teclado para mover al jugador
        scene.setOnKeyPressed(this::handleMovement);

        primaryStage.setTitle("Mapa Hexagonal");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Crear un hexágono en la posición (x, y)
    private Polygon createHexagon(double x, double y) {
        Polygon hex = new Polygon();
        for (int i = 0; i < 6; i++) {
            double angle = Math.toRadians(60 * i);
            double xPoint = x + HEX_RADIUS * Math.cos(angle);
            double yPoint = y + HEX_RADIUS * Math.sin(angle);
            hex.getPoints().addAll(xPoint, yPoint);
        }
        hex.setStroke(Color.BLACK);
        hex.setFill(Color.LIGHTBLUE);
        return hex;
    }

    // Manejar teclas para mover al jugador
    private void handleMovement(KeyEvent event) {
        double dx = 0;
        double dy = 0;

        switch (event.getCode()) {
            case W: // Arriba
                dy = -HEX_RADIUS * 1.5; // Subir una fila
                break;
            case S: // Abajo
                dy = HEX_RADIUS * 1.5; // Bajar una fila
                break;
            case A: // Izquierda
                dx = -HEX_RADIUS * Math.sqrt(3); // Mover a la izquierda
                break;
            case D: // Derecha
                dx = HEX_RADIUS * Math.sqrt(3); // Mover a la derecha
                break;
            default:
                break;
        }

        // Actualizar posición del jugador
        playerX += dx;
        playerY += dy;
        player.setCenterX(playerX);
        player.setCenterY(playerY);
    }

    public static void main(String[] args) {
        launch();
    }
}