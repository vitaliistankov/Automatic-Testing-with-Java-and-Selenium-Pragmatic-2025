
public class Company {
private String companyName;
private int employersNumber;
private boolean isFailed;

    public Company(String companyName, int employersNumber, boolean isFailed) {
        this.companyName = companyName;
        this.employersNumber = employersNumber;
        this.isFailed = isFailed;
    }

    public boolean isFailed() {
        return isFailed;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getEmployersNumber() {
        return employersNumber;
    }
}
