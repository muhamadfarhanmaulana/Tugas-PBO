public class Main {
    public static void main(String[] args) {
        // 1. Membuat objek Bank
        Bank bank = new Bank();

        // 2. Menambahkan nasabah baru[cite: 4]
        bank.addCustomer("Budi", "Santoso");
        bank.addCustomer("Siti", "Aminah");

        // 3. Mengambil nasabah pertama (indeks 0)[cite: 4]
        Customer customer1 = bank.getCustomer(0);
        System.out.println("Nasabah 1: " + customer1.getFirstName() + " " + customer1.getLastName());[cite: 3]

        // 4. Membuat dan menambahkan akun/rekening ke nasabah pertama[cite: 2, 3]
        Account account1 = new Account(500000); // Saldo awal Rp 500.000[cite: 2]
        customer1.setAccount(account1);[cite: 3]

        // 5. Melakukan Transaksi Deposit dan Withdraw[cite: 2]
        System.out.println("Saldo Awal: Rp " + customer1.getAccount(0).getBalance());[cite: 2, 3]
        
        customer1.getAccount(0).deposit(200000); // Setor Rp 200.000[cite: 2, 3]
        System.out.println("Setelah Deposit Rp 200.000: Rp " + customer1.getAccount(0).getBalance());[cite: 2, 3]

        customer1.getAccount(0).withdraw(150000); // Tarik Rp 150.000[cite: 2, 3]
        System.out.println("Setelah Withdraw Rp 150.000: Rp " + customer1.getAccount(0).getBalance());[cite: 2, 3]

        // 6. Menampilkan total nasabah di bank[cite: 4]
        System.out.println("Total Nasabah Bank: " + bank.getNumOfCustomers());[cite: 4]
    }
}