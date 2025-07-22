package src.Week_4.DevToolTracker.controller;
import src.Week_4.DevToolTracker.service.ToolService;

public class MainMenu {
    public static void main(String[] args) {
        ToolService service = new ToolService();
        ToolController controller = new ToolController(service);
        controller.run();
    }
}
