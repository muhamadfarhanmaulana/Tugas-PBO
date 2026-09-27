public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Budi", "Santoso");
        bank.addCustomer("Siti", "Aminah");

        System.out.println("=== SISTEM PERBANKAN ===");
        System.out.println("Total Nasabah Terdaftar: " + bank.getNumOfCustomers() + "\n");

        Customer customer1 = bank.getCustomer(0);
        System.out.println("Nasabah: " + customer1.getFirstName() + " " + customer1.getLastName());

        Account acc1 = new Account(500000);
        customer1.setAccount(acc1);

        System.out.println("Saldo Awal: Rp " + customer1.getAccount(0).getBalance());

        boolean depositSuccess = customer1.getAccount(0).deposit(200000);
        if (depositSuccess) {
            System.out.println("Deposit Rp 200.000 Berhasil!");
        }
        System.out.println("Saldo Saat Ini: Rp " + customer1.getAccount(0).getBalance());

        boolean withdrawSuccess = customer1.getAccount(0).withdraw(150000);
        if (withdrawSuccess) {
            System.out.println("Withdraw Rp 150.000 Berhasil!");
        }
        System.out.println("Saldo Akhir: Rp " + customer1.getAccount(0).getBalance());
    }
}