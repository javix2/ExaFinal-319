namespace Library1

type Class1() = 
    member this.X = "F#"
module miModulo =      
    
    let rec fiboRec =
        function
        | 0L -> 0L
        | 1L -> 1L
        | n -> fiboRec (n-1L) + fiboRec (n-2L)
