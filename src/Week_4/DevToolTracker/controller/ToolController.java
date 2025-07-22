package src.Week_4.DevToolTracker.controller;

import src.Week_4.DevToolTracker.model.*;
import src.Week_4.DevToolTracker.service.ToolService;

import java.util.Scanner;

public class ToolController {
    private final ToolService service;
    private final Scanner scanner;

    public ToolController(ToolService service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean running = true;

        while (running) {
            printMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> addTool();
                case "2" -> service.printAllTools();
                case "3" -> findByStatus();
                case "4" -> updateTool();
                case "5" -> deleteTool();
                case "6" -> {
                    service.saveToFile("devtools.txt");
                    System.out.println("Tools saved to file.");
                }
                case "7" -> {
                    service.loadFromFile("devtools.txt");
                    System.out.println("Tools loaded from file.");
                }
                case "8" -> printSorted();
                case "9" -> printTopTool();
                case "0" -> {
                    System.out.println("Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n=== DevTool Tracker Menu ===");
        System.out.println("1. Add new tool");
        System.out.println("2. Show all tools");
        System.out.println("3. Filter tools by status");
        System.out.println("4. Update a tool");
        System.out.println("5. Delete a tool");
        System.out.println("6. Save tools to file");
        System.out.println("7. Load tools from file");
        System.out.println("8. Show tools sorted by rating");
        System.out.println("9. Show most important tool");
        System.out.println("0. Exit");
        System.out.print("Choose: ");
    }

    private void addTool() {
        System.out.print("Tool name: ");
        String name = scanner.nextLine();

        System.out.print("Tool type (LANGUAGE, FRAMEWORK, LIBRARY, TOOL, PLATFORM): ");
        ToolType type = ToolType.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Rating (1-10): ");
        int rating = Integer.parseInt(scanner.nextLine());

        System.out.print("Learning status (PLANNED, LEARNING, MASTERED): ");
        LearningStatus status = LearningStatus.valueOf(scanner.nextLine().toUpperCase());

        service.addTool(new DevTool(name, type, rating, status));
        System.out.println("✅ Tool added.");
    }

    private void findByStatus() {
        System.out.print("Enter status: ");
        LearningStatus status = LearningStatus.valueOf(scanner.nextLine().toUpperCase());
        var list = service.findByStatus(status);
        list.forEach(System.out::println);
    }

    private void updateTool() {
        System.out.print("Tool name to update: ");
        String name = scanner.nextLine();

        System.out.print("New rating: ");
        int rating = Integer.parseInt(scanner.nextLine());

        System.out.print("New status: ");
        LearningStatus status = LearningStatus.valueOf(scanner.nextLine().toUpperCase());

        if (service.updateTool(name, rating, status)) {
            System.out.println("Tool updated.");
        } else {
            System.out.println("Tool not found.");
        }
    }

    private void deleteTool() {
        System.out.print("Tool name to delete: ");
        String name = scanner.nextLine();
        if (service.deleteToolByName(name)) {
            System.out.println("Tool deleted.");
        } else {
            System.out.println("Tool not found.");
        }
    }

    private void printSorted() {
        var sorted = service.sortByRatingDescending();
        sorted.forEach(System.out::println);
    }

    private void printTopTool() {
        service.findMostImportantTool()
                .ifPresentOrElse(
                        tool -> System.out.println("Top tool: " + tool),
                        () -> System.out.println("No tools available.")
                );
    }
}
