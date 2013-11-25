trait Printer {
  def print() = {
    println("Printer.print")    
  }  
}

abstract class AbstractPrinter  {
  def print: Any
}

class Boat(name: String) {
  def sayHello() = println("Hi, I'm " + name)
}

class BoatWithAbstractPrinter(name: String) extends AbstractPrinter {
  def print() = println("Hi I'm " + name)
}

class HouseBoat(name: String, specs: String) extends Boat(name) {}

class PrintableHouseBoat(name: String, specs: String) extends HouseBoat(name, specs) with Printer {}


println("=== Boat ===")
val boat = new Boat("Herb")
boat.sayHello

println("=== BoatWithAbstractPrinter ===")
val abstractBoat = new BoatWithAbstractPrinter("Dieter")
abstractBoat.print

println("=== HouseBoat ===")
val houseBoat = new HouseBoat("Herb", "Super Fast")
houseBoat.sayHello

println("=== PrintableHouseBoat ===")
val printableHouseBoat = new PrintableHouseBoat("Herb", "Super Fast")
printableHouseBoat.sayHello
printableHouseBoat.print




