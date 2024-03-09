package Entities;

import java.util.Objects;

public class Etudiant {
    private int studentId;
    private String name;
    private String specialization;
    private String studyLevel;

    public Etudiant() {
    }

    public Etudiant(int studentId, String name, String specialization, String studyLevel) {
        this.studentId = studentId;
        this.name = name;
        this.specialization = specialization;
        this.studyLevel = studyLevel;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getStudyLevel() {
        return studyLevel;
    }

    public void setStudyLevel(String studyLevel) {
        this.studyLevel = studyLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return studentId == etudiant.studentId &&
                Objects.equals(name, etudiant.name) &&
                Objects.equals(specialization, etudiant.specialization) &&
                Objects.equals(studyLevel, etudiant.studyLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, specialization, studyLevel);
    }
}
