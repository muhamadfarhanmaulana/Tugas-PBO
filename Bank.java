public class Bank {
    private Customer[] customers; // Array objek Customer[cite: 4]
    private int numberOfCustomers; // Menghitung jumlah nasabah[cite: 4]

    // Constructor menginisialisasi array dengan ukuran tertentu (> 5)[cite: 4]
    public Bank() {
        customers = new Customer[10]; // Ukuran maksimum array diatur ke 10[cite: 4]
        numberOfCustomers = 0;[cite: 4]
    }

    // Method untuk menambahkan nasabah baru[cite: 4]
    public void addCustomer(String f, String l) {
        if (numberOfCustomers < customers.length) {
            customers[numberOfCustomers++] = new Customer(f, l);[cite: 4]
        }
    }

    // Getter untuk mendapatkan jumlah nasabah saat ini[cite: 4]
    public int getNumOfCustomers() {
        return numberOfCustomers;[cite: 4]
    }

    // Getter untuk mengambil nasabah berdasarkan indeks[cite: 4]
    public Customer getCustomer(int index) {
        return customers[index];[cite: 4]
    }
}