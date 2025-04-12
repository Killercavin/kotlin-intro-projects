data class Address(val street: String?)
data class Person(val name: String, val address: Address?)

fun getStreetLength(person: Person?): Int? {
    return person?.address?.street?.length
}
