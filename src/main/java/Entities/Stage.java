package Entities;

import java.util.List;
import java.util.Objects;

public class Stage {
    private int stageId;
    private String title;
    private String description;
    private Entreprise company;
    private String startDate;
    private String endDate;
    private List<Etudiant> students;

    public Stage() {
    }

    public Stage(int stageId, String title, String description, Entreprise company, String startDate, String endDate, List<Etudiant> students) {
        this.stageId = stageId;
        this.title = title;
        this.description = description;
        this.company = company;
        this.startDate = startDate;
        this.endDate = endDate;
        this.students = students;
    }

    public int getStageId() {
        return stageId;
    }

    public void setStageId(int stageId) {
        this.stageId = stageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Entreprise getCompany() {
        return company;
    }

    public void setCompany(Entreprise company) {
        this.company = company;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public List<Etudiant> getStudents() {
        return students;
    }

    public void setStudents(List<Etudiant> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stage stage = (Stage) o;
        return stageId == stage.stageId &&
                Objects.equals(title, stage.title) &&
                Objects.equals(description, stage.description) &&
                Objects.equals(company, stage.company) &&
                Objects.equals(startDate, stage.startDate) &&
                Objects.equals(endDate, stage.endDate) &&
                Objects.equals(students, stage.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stageId, title, description, company, startDate, endDate, students);
    }
}
