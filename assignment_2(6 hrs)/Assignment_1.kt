open class BankAccount(
    public var accountHolderName: String,
    internal var bankName: String,
    private var balance: Double
) {
    protected fun showBalance() {
        println("Account Holder: $accountHolderName")
        println("Bank: $bankName")
        println("Balance: $$balance")
    }

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }
}

class SavingsAccount(
    accountHolderName: String,
    bankName: String,
    balance: Double
) : BankAccount(accountHolderName, bankName, balance) {
    fun displayBalance() {
        showBalance()
    }
}

fun main() {
    val savings = SavingsAccount("Saurabh", "SBI Bank", 5000.0)
    savings.deposit(2000.0)
    savings.displayBalance()
}
