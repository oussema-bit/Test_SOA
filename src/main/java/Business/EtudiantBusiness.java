package Business;

import Entities.Etudiant;
import Entities.Stage;
import java.util.ArrayList;
import java.util.List;

public class EtudiantBusiness {
    private static List<Etudiant> etudiants;

    public EtudiantBusiness() {
        etudiants = new ArrayList<>();
        etudiants.add(new Etudiant(1, "Alice Dupont", "Marketing digital", "3ème année"));
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }

    public List<Etudiant> getStudentsByStageId(int stageId) {
        List<Etudiant> studentsForStage = new ArrayList<>();
        List<Stage> allStages = StageBusiness.getAllStages();
        for (Stage stage : allStages) {
            if (stage.getStageId() == stageId) {
                studentsForStage.addAll(stage.getStudents());
                break;
            }
        }
        
        return studentsForStage;
    }

    public void addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    public Etudiant getEtudiantById(int studentId) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getStudentId() == studentId) {
                return etudiant;
            }
        }
        return null;
    }
}
