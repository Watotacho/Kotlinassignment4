import java.util.*
fun main(){
    array("wato","Kenya","Lovelace","singing")
    city()
    number()
    println(Arrays.toString(country()))

}
fun array (spt1:String,spt2:String,spt3:String,spt4:String){
    var add=("$spt1,$spt2,$spt3,$spt4")
    var array=add.split(" ")

    println(array)
}
fun city(){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { city->
        println(city.capitalize())
    }
}
fun number(){
    var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers.get(1)+numbers.get(4))

    println(numbers.lastIndex-1)

    for(numbers in numbers.sorted()){
        println(numbers)}

};

fun country():Array<String>{
    var name=arrayOf("Kenya","Uganda","Tanzania")
    return name

}