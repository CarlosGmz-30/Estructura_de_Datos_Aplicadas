public class tarea {
    private String tittle;
    private Date creationTime;
    private String description;

    public tarea(String tittle, Date creationTime, String description) {
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

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
