public class Account {
    protected double balance; // Attribute untuk menyimpan saldo[cite: 1, 2]

    // Constructor untuk menginisialisasi saldo awal[cite: 1, 2]
    public Account(double bal) {
        balance = bal;[cite: 2]
    }

    // Method untuk mengambil saldo saat ini[cite: 1, 2]
    public double getBalance() {
        return balance;[cite: 2]
    }

    // Method untuk menambah saldo (deposit)[cite: 1, 2]
    public boolean deposit(double amount) {
        if (amount > 0) {[cite: 2]
            balance = balance + amount;[cite: 2]
            return true;[cite: 2]
        } else {
            return false;[cite: 2]
        }
    }

    // Method untuk menarik saldo (withdraw)[cite: 1, 2]
    public boolean withdraw(double amount) {
        if (balance >= amount) {[cite: 2]
            balance = balance - amount;[cite: 2]
            return true;[cite: 2]
        } else {
            return false;[cite: 2]
        }
    }
}