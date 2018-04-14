val t1 = List (1,2,3)
val t2 = List (1,2,3,2.4,5,6,7)
val t3 = t2.length/t1.length
val t4 = t2.length
val t5 = t4%t3

val t7 = List.fill(t3)(t1).flatten
val t6 = t1.slice(0,t5)

//val t = List(1,2,3,4)
//val t1 = List(1,2,3,4,5,6,7,8,9,10,11)
//val t2 = t1.length / t.length
//val t3 = List.fill(t2)(t).flatten
//val t4 = t1.length % t.length
//val t5 = t.slice(0, t4)
//t3 ++ t5
(List(1,2), List(5,5)).zipped.map(_ + _)