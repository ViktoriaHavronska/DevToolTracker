package src.Week_4.DevToolTracker.model;
import java.util.Objects;

public class DevTool {
    private String name;
    ToolType type;
    private int rating;
    LearningStatus status;

    public DevTool(String name, ToolType type, int rating, LearningStatus status) {
        this.name = name;
        this.type = type;
        this.rating = rating;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ToolType getType() {
        return type;
    }

    public void setType(ToolType type) {
        this.type = type;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 10)
            this.rating = rating;
        else
            throw new IllegalArgumentException("Rating must be between 1 and 10");
    }

    public LearningStatus getStatus() {
        return status;
    }

    public void setStatus(LearningStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DevTool{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", rating=" + rating +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DevTool devTool = (DevTool) o;
        return rating == devTool.rating && Objects.equals(name, devTool.name) && type == devTool.type && status == devTool.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, rating, status);
    }
}
