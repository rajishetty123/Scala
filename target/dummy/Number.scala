object Number {

  def categorizeNumber(num: Int): String = num match {
    case n if n > 0 => "Positive"
    case n if n < 0 => "Negative"
    case _ => "Zero"
  }

  def main(args: Array[String]): Unit = {
    val numbers = List(10, -5, 0, 3, -1)

    numbers.foreach(num => println(s"$num is ${categorizeNumber(num)}"))
  }


}
