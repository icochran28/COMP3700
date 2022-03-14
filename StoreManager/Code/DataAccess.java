public interface DataAccess {
    void connect();

    void saveProduct(ProductModel product);

    ProductModel loadProduct(int productID);

     OrderModel loadOrder(int orderId);

     void saveOrder(OrderModel order);

     void saveCustomer(CustomerModel customer);

     CustomerModel loadCustomer(int customerID);

    // void loadUser(int uderId);
    // void saveUser(UserModel user);


}
