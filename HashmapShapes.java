import java.util.*;

// Enumerations for Shape and Color
enum Shape {
    CIRCLE, SQUARE, TRIANGLE
}

enum Color {
    RED, GREEN, BLUE
}

class GraphicObject {
    private Shape shape;
    private int size;
    private Color color;
    private int x;
    private int y;

    public GraphicObject(Shape shape, int size, Color color, int x, int y) {
        this.shape = shape;
        this.size = size;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shape: " + shape + ", Size: " + size + ", Color: " + color + ", Position: (" + x + ", " + y + ")";
    }
}

public class GraphicObjectCollection {
    public static void main(String[] args) {

        // Create a HashMap to store GraphicObject objects
        HashMap<String, GraphicObject> graphicObjects = new HashMap<>();

        // Populate the HashMap with random graphic objects
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Shape randomShape = Shape.values()[random.nextInt(Shape.values().length)];
            int randomSize = random.nextInt(50) + 1;                                    // Random size between 1 and 50
            Color randomColor = Color.values()[random.nextInt(Color.values().length)];
            int randomX = random.nextInt(100);                                          // Random X position between 0 and 99
            int randomY = random.nextInt(100);                                          // Random Y position between 0 and 99

            GraphicObject graphicObject = new GraphicObject(randomShape, randomSize, randomColor, randomX, randomY);
            graphicObjects.put("Object" + i, graphicObject);
        }

        // Print the string version of the graphic objects
        System.out.println("Graphic Objects:");
        for (Map.Entry<String, GraphicObject> entry : graphicObjects.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}