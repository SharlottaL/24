 class Book(
    val title: String,
    val author:String,
    val pages: Int = 0
)
 {
    fun describe()
     {
      println("<<${title}>>, ${author}, ${pages}")
     }
 }