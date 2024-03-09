package Business;

import Entities.Stage;
import Entities.Entreprise;
import Entities.Etudiant;
import java.util.ArrayList;
import java.util.List;

public class StageBusiness {
    public static List<Stage> listeStages;

    public StageBusiness() {
        listeStages = new ArrayList<>();
        Entreprise entreprise = new Entreprise(1, "Nom de l'entreprise", "Adresse de l'entreprise", "Secteur d'activité de l'entreprise");
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant(3, "Caroline Leclerc", "Ingénierie logicielle", "1ère année"));
        Stage stage = new Stage(1, "Titre du stage", "Description du stage", entreprise, "2024-06-01", "2024-08-31", etudiants);
        listeStages.add(stage);
    }

    public static List<Stage> getAllStages() {
        return listeStages;
    }

    public Stage getStageById(int stageId) {
        for (Stage stage : listeStages) {
            if (stage.getStageId() == stageId) {
                return stage;
            }
        }
        return null;
    }

    public void addStage(Stage stage) {
        listeStages.add(stage);
    }

    public void updateStage(Stage updatedStage) {
        for (int i = 0; i < listeStages.size(); i++) {
            if (listeStages.get(i).getStageId() == updatedStage.getStageId()) {
                listeStages.set(i, updatedStage);
                break;
            }
        }
    }

    public void deleteStage(int stageId) {
        listeStages.removeIf(stage -> stage.getStageId() == stageId);
    }

    public List<Etudiant> getStudentsForStage(int stageId) {
        for (Stage stage : listeStages) {
            if (stage.getStageId() == stageId) {
                return stage.getStudents();
            }
        }
        return null;
    }
}
