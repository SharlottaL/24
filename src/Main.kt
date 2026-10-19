//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //24.1
val book1 = Book("Martin Eden", "Jack London" ,448 )
val book2 = Book("Crooked House", "Agatha Christie" ,308 )
val book3 = Book("Towards zero", "Agatha Christie" ,238 )
book1.describe()
book2.describe()
book3.describe()

    //24.2
    val chel = BankAccount("Lili", 100000.0)
    chel.deposit(500)
    chel.printBalance()
    chel.withdraw(300)
    chel.printBalance()
    chel.withdraw(100001)
    chel.printBalance()
    //24.3
    val user1 = User(166, "Botanichka", "botanichkagigantika@gmail.com")
    val user2 = User(166, "Botanichka", "botanichkagigantika@gmail.com")

    println(user1 == user2)
    println(user1 === user2)
    println(user1)
    val user3 = user1.copy(email = "botanichkagigantika@mail.ru")
    println(user1)
    println(user3)
    val (id, name, email) = user1
    println("id=$id, name=$name, email=$email")
    //24.4
    val products = listOf(
        Product("Молоко", 120,87),
       Product( "Мясо", 320,9),
        Product("Хлеб",44,6)
    )
    var sum = 0
    for(product in products)
    {
        sum += product.price * product.quantity
    }
    val maxP = products.maxBy{it.price}
    val increased = maxP.copy(quantity = maxP.quantity + 1)
    println("Итого: $sum руб")
    for (product in products)
    {
        println(product)
    }
    println("Обновлённый: $increased")
}