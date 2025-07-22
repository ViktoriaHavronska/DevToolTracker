package src.Week_4.DevToolTracker.service;
import src.Week_4.DevToolTracker.model.DevTool;
import src.Week_4.DevToolTracker.model.LearningStatus;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class ToolService {
    private final List<DevTool> tools = new ArrayList<>();

    public void addTool(DevTool tool) {
        if (tools.stream().noneMatch(t -> t.getName().equalsIgnoreCase(tool.getName()))) {
            tools.add(tool);
        } else {
            System.out.println("Tool already exists.");
        }
    }

    public void printAllTools() {
        tools.forEach(System.out::println);
    }

    public List<DevTool> findByStatus(LearningStatus status) {
        return tools.stream()
                .filter(tool -> tool.getStatus() == status)
                .collect(Collectors.toList());
    }

    public List<DevTool> sortByRatingDescending() {
        return tools.stream()
                .sorted(Comparator.comparing(DevTool::getRating).reversed())
                .collect(Collectors.toList());
    }

    public Optional<DevTool> findMostImportantTool() {
        return tools.stream()
                .max(Comparator.comparingInt(DevTool::getRating));
    }

    public boolean updateTool(String name, int newRating, LearningStatus newStatus) {
        for (DevTool tool : tools) {
            if (tool.getName().equalsIgnoreCase(name)) {
                tool.setRating(newRating);
                tool.setStatus(newStatus);
                return true;
            }
        }
        return false;
    }

    public boolean deleteToolByName(String name) {
        return tools.removeIf(tool -> tool.getName().equalsIgnoreCase(name));
    }

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (DevTool tool : tools) {
                writer.write(tool.getName() + "," + tool.getType() + "," + tool.getRating() + "," + tool.getStatus());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        tools.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                tools.add(new DevTool(
                        parts[0],
                        Enum.valueOf(src.Week_4.DevToolTracker.model.ToolType.class, parts[1]),
                        Integer.parseInt(parts[2]),
                        Enum.valueOf(LearningStatus.class, parts[3])
                ));
            }
        } catch (IOException e) {
            System.out.println("Error loading from file: " + e.getMessage());
        }
    }
}
