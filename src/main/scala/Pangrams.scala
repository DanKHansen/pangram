object Pangrams:
   def isPangram(input: String): Boolean = input.filter(_.isLetter).toLowerCase.toSet.size == 26