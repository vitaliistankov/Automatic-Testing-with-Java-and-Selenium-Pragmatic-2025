public class CollectionsDemo {
    public static void main(String[] args) {
        Building b1 = new Building("NV Tower");
        Building b2 = new Building("Business Park, 1");

//        Company company1 = new Company("Proxiad", 250, true);
        Company c1 = new Company("Proxiad", 250, false);
        Company c2 = new Company("Apple", 5000, true);
        Company c3 = new Company("Acronis", 500, false);
        Company c4 = new Company("EPAM", 2500, false);
        Company c5= new Company("SAP", 100, true);

        b1.addCompany(c1);
//        b1.addCompany(c2);
        b2.addCompany(c2);
        b1.addCompany(c3);
        b1.addCompany(c4);
        b1.addCompany(c5);


        b1.printInfo(c1);


    }
}
