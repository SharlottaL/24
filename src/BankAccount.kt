import java.time.temporal.TemporalAmount

class BankAccount (
    val owner:String,
    var balance: Double=0.0
)
{
    fun deposit(amount: Int)
    {
        balance += amount
    }
    fun withdraw(amount: Int)
    {
        if (balance < amount)
        {
            println("Недостаточно средств")
            return
        }
        balance -= amount
    }
    fun printBalance()
    {
        println("Баланс $owner: $balance руб")
    }

}