public class BankAccount {
    private String accountNumber;

    private String customerName;

    private String customerEmail;

    private String customerPhone;
    private double balance;

    //setter dan getter dari atribut accountNumber
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    //setter dan getter dari atribut customerName
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }

    //setter dan getter dari atribut customerEmail
    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }
    public String getCustomerEmail(){
        return this.customerEmail;
    }

    //setter dan getter dari atribut customerPhone
    public void setCustomerPhone(String customerPhone){
        this.customerPhone = customerPhone;
    }
    public String getCustomerPhone(){
        return this.customerPhone;
    }

    //setter dan getter dari atribut balance
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }

    //Constructor untuk memberikan initial value
    public BankAccount(String accNumber, String custPhone, String custEmail, String custName) {
        accountNumber = accNumber;
        customerName = custName;
        customerEmail = custEmail;
        customerPhone = custPhone;
        balance = 0;
    }
    /**
     * This method take care of the deposit transaction Return true on success
     * and false on failure
     *
     * @param amount
     *            the amount to be deposited
     * @return boolean
     */
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method take care of the withdraw transaction Return true on success
     * and false on failure
     *
     * @param amount
     *            the amount to be withdrawn
     * @return boolean
     */
    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        } else {
            balance = balance - amount;
            return true;
        }
    }
}