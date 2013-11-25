class Methods {
  
  def withReturnType() = {
    "Hello World!"
  }

  def withoutReturnType() {
    println("Hello World!")
  }

  def withArgument(name: String) =  "Hello " + name
}



println("=== Methods ===")

val methods = new Methods

println(methods.withReturnType)
methods.withReturnType()

println(methods.withArgument("Foobar"))
