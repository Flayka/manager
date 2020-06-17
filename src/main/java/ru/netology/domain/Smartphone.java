package ru.netology.domain;

public class Smartphone extends Product {

    private String manufacturer;

    public Smartphone() {
        super();
    }

    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Book book = (Book) o;
//        return pages == book.pages &&
//                publishedYear == book.publishedYear &&
//                Objects.equals(author, book.author);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), author, pages, publishedYear);
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "author='" + author + '\'' +
//                ", pages=" + pages +
//                ", publishedYear=" + publishedYear +
//                '}';
//    }
}
