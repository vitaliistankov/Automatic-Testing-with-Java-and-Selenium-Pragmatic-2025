import java.util.ArrayList;
import java.util.List;

public class Building {

    private String buildingName;
    private List<Company> companies = new ArrayList<>();
    private final static int MAXCOMPANIES = 3;

    public Building(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public List<Company> addCompany (Company company) {

        if (companies.size() >= MAXCOMPANIES) {
            System.out.println("достигнат лимита на броят компании");
            return companies; // въобще не се опитваме да я добавяме в сградата
        }

        if (company.isFailed()) {
            System.out.println("няма място за фалирали компании в нашата сграда");
            return companies; // НЕ се добавя в сградата
        }

        companies.add(company);
        System.out.println(company.getCompanyName());
        System.out.println("Брой на добавените компании: " + companies.size());
        return companies;

    }

//    public void addCompany(Company company) {


//        if (companies.size() >= MAXCOMPANIES) {
//            System.out.println("достигнат лимита на броят компании");
//            return; // въобще не се опитваме да я добавяме в сградата
//        }

//        if (company.isFailed()) {
//            System.out.println("няма място за фалирали компании в нашата сграда");
//            return; // НЕ се добавя в сградата
//        }

//        companies.add(company);
//        System.out.println(company.getCompanyName());
//        System.out.println("Брой на добавените компании: " + companies.size());

//    }

    public void printInfo(Company company) {

        for (Company c : companies) {
            System.out.println(c.getCompanyName());
            System.out.println(c.getEmployersNumber());
        }

    }


}


//        for (int i = 0; i < MAXCOMPANIES; i++) {
//            System.out.println(i + "i");

//            Company companyName = companies.get(i);
//            counter++;

//            System.out.println(companyName);

//        }
//        if (counter < 10 && company.isFailed()) {

//            System.out.println("Print result");
//            companies.add()
// ADD
