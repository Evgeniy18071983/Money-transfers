fun main () {

var transferAmount: Int = 65000 //сумма перевода в рублях
var commission = transferAmount/10000*75 //сумма комиссии
val result = if(commission < 35) 35 else commission
println("копеек - ${result*100}")
}





