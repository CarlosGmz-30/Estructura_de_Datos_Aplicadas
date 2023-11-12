public class tarea {
    private String tittle;
    private String creationTime;
    private String description;

    public tarea(String tittle, String creationTime, String description) {
        this.tittle = tittle;
        this.creationTime = creationTime;
        this.description = description;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
