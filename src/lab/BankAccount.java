package lab;

/** ส่วน A ข้อ 3 — Assertion vs Exception (Design by Contract) */
public class BankAccount {
    private int balance;
    public BankAccount(int initialBalance) { this.balance = initialBalance; }
    public int getBalance() { return balance; }

    /**
     * ถอนเงินออกจากบัญชี
     * @param amount จำนวนเงินที่ถอน ต้อง > 0
     * @throws IllegalArgumentException ถ้า amount <= 0
     */
    public void withdraw(int amount) {
        
        if(amount <= 0) throw new IllegalArgumentException("no money");
        assert amount <= balance;
        balance -= amount;
            
        // TODO: amount <= 0  -> throw IllegalArgumentException  (input ภายนอก = exception)
        // TODO: assert amount <= balance                        (เงื่อนไขภายใน = assert)
        // TODO: balance ลดลงเท่ากับ amount
    }
}
