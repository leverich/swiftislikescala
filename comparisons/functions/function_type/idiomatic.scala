def makeIncrementer: Int => Int = 
    number => 1 + number

var increment = makeIncrementer
increment(7)
