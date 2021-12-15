namespace Library1

type Class1() = 
    member this.X = "F#"

module miModulo = 

    let esPalindrome (str : string) =
        let rec check(s : int, e : int) =
            if s = e then true
            elif str.[s] <> str.[e] then false
            else check(s + 1, e - 1)
        
        check(0, str.Length - 1)