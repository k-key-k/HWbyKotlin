package Glava6

class BankAccount(private var sum: Int){
    fun display(){
        println("Sum = $sum")
    }

    inner class Transaction {
        fun pay(s: Int){
            sum -= s
            display()
        }
    }
    inner class Transaction1 (private var sum: Int) {
        fun pay1(){
            this@BankAccount.sum -= this@Transaction1.sum
            display()
        }
    }
}
class A {
    private val n: Int = 1
    inner class B {
        private val n: Int = 1
        fun action(){
            println(n)
            println(this.n)
            println(this@B.n)
            println(this@A.n)
        }
    }
}

fun main(){
    val acc = BankAccount(3400)
    acc.Transaction().pay(2500)

    val acc1 = BankAccount(3400)
    acc1.Transaction1(2500).pay1()
}