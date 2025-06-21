import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customers = new HashMap<>();

    public CustomerRepositoryImpl() {
        customers.put("3331", new Customer("3331", "Papun"));
        customers.put("3330", new Customer("3330", "Manas"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customers.get(id);
    }
}
