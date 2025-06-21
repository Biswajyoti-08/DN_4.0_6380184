public class CustomerService {
    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void displayCustomer(String id) {
        Customer customer = repository.findCustomerById(id);
        if (customer != null) {
            System.out.println("Customer ID: " + customer.getId());
            System.out.println("Customer Name: " + customer.getName());
        } else {
            System.out.println("Customer not found.");
        }
    }
}
