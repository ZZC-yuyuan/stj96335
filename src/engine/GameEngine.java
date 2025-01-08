package engine;

public class GameEngine {
    private boolean running;
    private Renderer renderer;

    public GameEngine() {
        renderer = new Renderer();
    }

    public void start() {
        running = true;
        renderer.init(); // 初始化窗口
        gameLoop();//
    }

    private void gameLoop() {
        while (running) {
            update();
            //
            renderer.render(); // 渲染逻辑
        }
    }

    public void update() {
        // 更新游戏状态的逻辑
    }

    public void stop() {
        running = false;
        renderer.cleanup(); // 清理资源
    }
}