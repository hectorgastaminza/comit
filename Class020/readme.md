@startuml
class Mail {
	private String addressFrom;
	private String addressTo;
	private int cost;
}
class Shipment {
	Package[] listPackage;
}
class Package {
	Product[] listProducts;
}
class Letter {
	private String text;
}
class Product {
	private String description;
	private int value;
}

Mail -- Letter
Mail -- Shipment
Mail -- Package
Package  "1" o-- "1.n" Product
Shipment "1" o-- "1.n" Package

@enduml