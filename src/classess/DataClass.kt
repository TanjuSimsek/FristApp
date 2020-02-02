package classes

data class AccountData(
    val accountName: String,
    val accountSurname: String,
    val accountType: String = "Default Value",
    val brancName: String = "Default Value",
    val branchCode: String = "Default Value",
    val brancNumber: String = "Default Value"
//primaryContr, degişkenlerin var yada var ile tanımlanması gerekiyor,equls ,hashcode,tostring,copy bu değerleri direkt erişebilme yetenegi var.
) {

    fun printLog() {
        accountName
    }
}

data class AccountData2(val accountName: String) {
    var accountType = "Default Value"
    var brancName = "Default Value"
    var branchCode = "Default Value"
    var brancNumber = "Default Value"

    fun printLog() {
        accountName
    }
}

class AccountNonData(val accountName: String) {
    var accountType = "Default Value"
    var brancName = "Default Value"
    var branchCode = "Default Value"
    var brancNumber = "Default Value"

    fun printLog() {
        accountName
    }
}

fun main() {

    val accountDataInstance1 = AccountData(
        "Gökhan",
        "ÖZTÜRK",
        "BankAccount",
        "Kadıköy",
        "0024",
        "325235"
    )

    val accountDataInstance2 = AccountData(
        "Ayşe",
        "ÖZTÜRK",
        "BankAccount",
        "Kadıköy",
        "0024",
        "325235"
    )

    var copyAccountDataInstance1: AccountData = accountDataInstance1.copy("Ayşe")

/* -------------------------------------------------------------------------------------------------------------------*/

    val accountData2Instance1 = AccountData2("Gökhan")
    accountData2Instance1.accountType = "Bank Account"
    accountData2Instance1.brancName = "Kadıköy"
    accountData2Instance1.branchCode = "0024"
    accountData2Instance1.brancNumber = "325235"

    val accountData2Instance2 = AccountData2("Ayşe")
    accountData2Instance2.accountType = "Bank Account"
    accountData2Instance2.brancName = "Kadıköy"
    accountData2Instance2.branchCode = "0024"
    accountData2Instance2.brancNumber = "325235"

    var copyAccountData2Instance1: AccountData2 = accountData2Instance1.copy("Ayşe")


    val accountNonData = AccountNonData("Mehmet Emin Yılmaz")
    accountNonData.accountType = "BankAccount"
    var copyAccount2: AccountNonData

    accountDataInstance1.equals(accountDataInstance2)
    accountNonData.equals(accountNonData)

    println(accountDataInstance1.hashCode())
    println(accountNonData.hashCode())

    println(accountDataInstance1.toString())
    println(accountNonData.toString())
}