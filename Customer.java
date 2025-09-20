package scenarioCustomValidation;

// Step 2: Create a Customer class with annotated fields
class Customer {
    @NotEmpty
    private String name;

    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters (for completeness)
    public String getName() { return name; }
    public String getEmail() { return email; }
}
