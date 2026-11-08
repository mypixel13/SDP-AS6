# Assignment 6 - Visitor Pattern (Library Items)

Topic: library items (Book, Magazine, Dvd) with different operations.



## Pattern roles
- Element interface: LibraryItem
- Concrete elements: Book, Magazine, Dvd
- Visitor interface: LibraryVisitor
- Concrete visitors: LateFeeVisitor, ShippingWeightVisitor, CatalogPrinterVisitor
- Object structure: Library

## Clean Code principles
1. Meaningful names: Item classes are nouns, visitors end with "Visitor".
2. No instanceof: double dispatch replaces type checks.
3. Single Responsibility: each visitor does one operation for all item types.
4. Open/Closed: CatalogPrinterVisitor was added without changing any element.
5. No magic numbers: fees and weights are named constants.
6. Encapsulation: fields are private, visitors read data through getters only.
