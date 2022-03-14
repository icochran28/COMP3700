public class StoreManager {

    private static StoreManager instance = null;

    private SQLiteDataAdapter dao;


    private MainScreen mainScreen;

    private ProductView productView = null;
    private CustomerView customerView = null;
    private OrderView orderView = null;

    public ProductView getProductView() {
        return productView;
    }

    private ProductController productController = null;
    private CustomerController customerController = null;
    private OrderController orderController = null;

    private StoreManager() { }

    public static StoreManager getInstance() {
        if (instance == null)
            instance = new StoreManager("SQLite");
        return instance;
    }

    public SQLiteDataAdapter getDataAccess() {
        return dao;
    }

    private StoreManager(String db) {
        // do some initialization here!!!
        if (db.equals("SQLite"))
            dao = new SQLiteDataAdapter();

        dao.connect();
        productView = new ProductView();
        mainScreen = new MainScreen();
        productController = new ProductController(productView, dao);
        orderView = new OrderView();
        orderController = new OrderController(orderView, dao);
        customerView = new CustomerView();
        customerController = new CustomerController(customerView, dao);
    }


    public MainScreen getMainScreen() {
        return mainScreen;
    }

    public OrderView getOrderView() {
        return orderView;
    }

    public CustomerView getCustomerView() {
            return customerView;
    }
}
