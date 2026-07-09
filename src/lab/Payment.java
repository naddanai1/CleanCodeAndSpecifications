package lab;

/** ส่วน A ข้อ 2 — Guard Clause (ลด nesting) */
public class Payment {
    /**
     * เก็บเงินได้เมื่อ: u != null และ u.active และ u.balance > 0
     * @return true ถ้าเก็บเงินได้
     */
    public static boolean canCharge(User user) {
        if(user == null)  return false;
        if(!user.active) return false;
        if(user.balance <= 0) return false;
        
        return true;
    }
}
