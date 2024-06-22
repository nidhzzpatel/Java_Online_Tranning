package InfoEmp.Nidhi.directory;

public class Directory {
    private DirectoryEntry[] entries;
    private int size;
    private static final int MAX_SIZE = 100; // Maximum number of entries

    public Directory() {
        this.entries = new DirectoryEntry[MAX_SIZE];
        this.size = 0;
    }

    public boolean addEntry(DirectoryEntry entry) {
        if (size < MAX_SIZE) {
            entries[size] = entry;
            size++;
            return true;
        }
        return false; // Directory is full
    }

    public DirectoryEntry getEntry(String uniqueId) {
        for (DirectoryEntry entry : entries) {
            if (entry != null && entry.getUniqueId().equals(uniqueId)) {
                return entry;
            }
        }
        return null; // Entry not found
    }

    public boolean editEntry(String uniqueId, String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily) {
        for (int i = 0; i < size; i++) {
            DirectoryEntry entry = entries[i];
            if (entry != null && entry.getUniqueId().equals(uniqueId)) {
                if (name != null && !name.isEmpty()) {
                    entry.setName(name);
                }
                if (address != null && !address.isEmpty()) {
                    entry.setAddress(address);
                }
                if (telephoneNumber != null && !telephoneNumber.isEmpty()) {
                    entry.setTelephoneNumber(telephoneNumber);
                }
                if (mobileNumber != null && !mobileNumber.isEmpty()) {
                    entry.setMobileNumber(mobileNumber);
                }
                if (headOfFamily != null && !headOfFamily.isEmpty()) {
                    entry.setHeadOfFamily(headOfFamily);
                }
                return true; // Entry edited successfully
            }
        }
        return false; // Entry not found
    }

    public void printAllEntries() {
        for (int i = 0; i < size; i++) {
            System.out.println(entries[i]);
            System.out.println();
        }
    }
}
