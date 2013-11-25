
println("=== Array ===")
val numbers = Array(1, 2, 3, 4, 5)

for(number <- numbers) {
  println("Number: " + number) 
}

println("=== List ===")

val numbersInList = List(1, 2, 3, 4, 5, 6)
numbersInList.map(number => number * 2)

println("5th Element: " + numbersInList(5))

for(number <- numbersInList) {
  println("Number in List: " + number) 
}

val equalNumbers = numbersInList.filter(number => number % 2 == 0)
println("Equal numbers in list: " + equalNumbers)

println("=== Map ===")

val localizedNumbers = Map(1 -> "one", 2 -> "two", 3 -> "three")
println("Translation for 1: " + localizedNumbers(1))

localizedNumbers(1) match {
  case "one" => println("This is english")
}

localizedNumbers(2) match {
  case "one" => println("This is english")
  case _ => println("I really don't understand you")
}