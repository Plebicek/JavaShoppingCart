package org.example;

import java.util.ArrayList;
import java.util.List;

public class Eshop {
    //TODO: Doplnit atributy pro produkty a zákazníky
    ArrayList<Product> allProducts = new ArrayList<>();
    ArrayList<Customer> allCustomers = new ArrayList<>();

    public Eshop() {
        //TODO: Inicializovat kolekce

    }

    public void addProduct(Product product) {
        //TODO: Doplnit metodu
        allProducts.add(product);

    }

    public void removeProduct(int productId) {
        //TODO: Doplnit metodu
        for (int i = 0; allProducts.size() > i ; i++) {
            if (allProducts.get(i).getId() == productId) {
                allProducts.remove(i);
            }
        }
    }

    public Product findProduct(int productId) {
        for (int i = 0; allProducts.size() > i ; i++) {
            if (allProducts.get(i).getId() == productId) {
                return allProducts.get(i);
            }
        }
        return null; //TODO: Doplnit správnou implementaci
    }

    public void addCustomer(Customer customer) {
        //TODO: Doplnit metodu
        allCustomers.add(customer);
    }

    public void removeCustomer(int customerId) {
        //TODO: Doplnit metodu
        for (int i = 0; allCustomers.size() > i ; i++) {
            if (allCustomers.get(i).getId() == customerId) {
                allCustomers.remove(i);
            }
        }
    }

    public Customer findCustomer(int customerId) {
        for (int i = 0; allCustomers.size() > i ; i++) {
            if (allCustomers.get(i).getId() == customerId) {
                return allCustomers.get(i);
            }
        }
        return null; //TODO: Doplnit správnou implementaci
    }

    public List<Product> listAllProducts() {

        return this.allProducts; //TODO: Doplnit správnou implementaci
    }

    public List<Customer> listAllCustomers() {
        return this.allCustomers; //TODO: Doplnit správnou implementaci
    }

    public List<Product> findProductsByName(String searchTerm) {
        ArrayList<Product> findedProducts = new ArrayList<>();
        for (int i = 0; allProducts.size() > i ; i++) {
            Product product = allProducts.get(i);
            if (product.getName().contains(searchTerm)) {
                findedProducts.add(product);
            }

        }
        return findedProducts; //TODO: Doplnit správnou implementaci
    }

    public List<Customer> findCustomersByEmailDomain(String domain) {
        ArrayList<Customer> findedCostumers = new ArrayList<>();
        for (int i = 0; allCustomers.size() > i ; i++) {
            Customer customer = allCustomers.get(i);
            if (customer.getEmail().contains(domain)) {
                findedCostumers.add(customer);
            }

        }
        return findedCostumers; //TODO: Doplnit správnou implementaci
    }

}