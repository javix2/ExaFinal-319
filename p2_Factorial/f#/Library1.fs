namespace Library1

type Class1() = 
    member this.X = "F#"
module miModulos = 
    let rec factorial n =
      if n <= 1 then 1
      else n*factorial(n-1)
