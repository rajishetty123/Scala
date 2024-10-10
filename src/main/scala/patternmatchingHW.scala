object patternmatchingHW {

    def determineBasket(apples: Int, oranges: Int): String = {
      (apples % 2, oranges % 2) match {
        case (1, 0) => "Basket B"
        case (0, 1) => "Basket A"
        case (0, 0) => "Somewhere else"
        case (1, 1) => "Invalid combination"
      }
    }

    def main(args: Array[String]): Unit = {
      val testCases = List(
        (3, 2),
        (4, 1),
        (2, 2),
        (1, 1)
      )

      testCases.foreach { case (apples, oranges) =>
        println(s"For $apples apples and $oranges oranges, pick from: ${determineBasket(apples, oranges)}")
      }
    }
  }


