

object testSet extends App {
  // 변경 불가능한 집합 만들고 사용기 
  var cars = Set("BMW","Audi")
  cars = cars + "Benz"
//  cars += "Benz"
  println(cars) //Set("BMW","Audi","Benz")
}