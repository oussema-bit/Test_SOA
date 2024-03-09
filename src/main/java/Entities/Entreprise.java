package Entities;

import java.util.Objects;

public class Entreprise {
    private int companyId;
    private String name;
    private String address;
    private String sector;

    public Entreprise() {
    }

    public Entreprise(int companyId, String name, String address, String sector) {
        this.companyId = companyId;
        this.name = name;
        this.address = address;
        this.sector = sector;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entreprise that = (Entreprise) o;
        return companyId == that.companyId &&
                Objects.equals(name, that.name) &&
                Objects.equals(address, that.address) &&
                Objects.equals(sector, that.sector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId, name, address, sector);
    }
}
