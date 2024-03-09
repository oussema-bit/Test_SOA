package Business;

import java.util.ArrayList;
import java.util.List;

import Entities.Entreprise;

public class EntrepriseBusiness {
    private List<Entreprise> entreprises;

    public EntrepriseBusiness() {
        this.entreprises = new ArrayList<>();
    }

    public void createEntreprise(Entreprise entreprise) {
        entreprises.add(entreprise);
    }

    public Entreprise readEntreprise(int companyId) {
        for (Entreprise entreprise : entreprises) {
            if (entreprise.getCompanyId() == companyId) {
                return entreprise;
            }
        }
        return null;
    }

    public void updateEntreprise(Entreprise updatedEntreprise) {
        for (int i = 0; i < entreprises.size(); i++) {
            Entreprise entreprise = entreprises.get(i);
            if (entreprise.getCompanyId() == updatedEntreprise.getCompanyId()) {
                entreprises.set(i, updatedEntreprise);
                break;
            }
        }
    }

    public void deleteEntreprise(int companyId) {
        entreprises.removeIf(entreprise -> entreprise.getCompanyId() == companyId);
    }
}
