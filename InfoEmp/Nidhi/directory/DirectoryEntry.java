package InfoEmp.Nidhi.directory;

public class DirectoryEntry {
    private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private final String uniqueId;

    public DirectoryEntry(String uniqueId, String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
    }

    public String getUniqueId() {
        return uniqueId;
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

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getHeadOfFamily() {
        return headOfFamily;
    }

    public void setHeadOfFamily(String headOfFamily) {
        this.headOfFamily = headOfFamily;
    }

    @Override
    public String toString() {
        return "Unique ID: " + uniqueId +
                "\nName: " + name +
                "\nAddress: " + address +
                "\nTelephone Number: " + telephoneNumber +
                "\nMobile Number: " + mobileNumber +
                "\nHead of Family: " + headOfFamily;
    }
}
