package ru.netology.manager;

public class ProductManager {

    public Product[] searchBy(String text) {
        // ваш код
    }

    public boolean matches(Product product, String search) {
        // ваш код
    }
}

//if (product instanceof Book) {
//        Book book = (Book) product;
//        if (book.getName().equalsIgnoreCase(search)) {
//        return true;
//        }
//        if (book.getAuthor().equalsIgnoreCase(search)) {
//        return true;
//        }
//        return false;
//        }

//public class ProductManager {
//    // добавьте необходимые поля, конструкторы и методы
//
//    public Product[] searcyBy(String text) {
//        Product[] result = new Product[0];
//        for (Product product: repository.findAll()) {
//            if (matches(product, text)) {
//                Product[] tmp = new Product[result.length + 1];
//                // используйте System.arraycopy, чтобы скопировать всё из result в tmp
//                tmp[tmp.length - 1] = product;
//                result = tmp;
//            }
//        }
//        return result;
//    }
//
//    public boolean matches(Product product, String search) {
//        // ваш код
//    }
