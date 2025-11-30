package models

data class Station(
    val name: String,
    var singlePrice: Double,
    var returnPrice: Double,
    var salesCount: Int = 0
) {

    fun getPrice(type: TicketType): Double {
        return if (type == TicketType.SINGLE) singlePrice else returnPrice
    }

    fun increaseSales(count: Int = 1) {
        salesCount += count
    }

    override fun toString(): String {
        return "$name | Single £$singlePrice | Return £$returnPrice | Sales $salesCount"
    }
}
