val list = List(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150)

val l1 = list.filter(_ < 100)

val l2 = l1.filter(_%4 == 0)

val l3 = l2.map(x => x / 4)

val l4 = l3.dropRight(1)

l4.foreach(println)

  list.filter(_ < 100)
 .filter(_%4 == 0).map(x => x / 4).dropRight(1)
 .foreach(println)

