package engine;

public class Renderer {
    private javax.swing.JFrame frame;
    private java.awt.Canvas canvas;
    private java.awt.Graphics graphics;

    public Renderer() {
        initialize();
    }

    private void initialize() {
        frame = new javax.swing.JFrame("游戏窗口");
        canvas = new java.awt.Canvas();
        canvas.setPreferredSize(new java.awt.Dimension(800, 600));
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public void clear() {
        graphics = canvas.getGraphics();
        graphics.setColor(java.awt.Color.BLACK);
        graphics.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    public void drawSquare(int x, int y, int size) {
        graphics.setColor(java.awt.Color.RED);
        graphics.fillRect(x, y, size, size);
    }

    public void render() {
        clear();
        drawSquare(100, 100, 50); // 在窗口中绘制一个正方形
    }

    public void init() {
    }

    public void cleanup() {
    }
}