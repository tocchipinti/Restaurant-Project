package models

data class Order(val table: Table, val products: Collection<Product>, val employee: Employee)
