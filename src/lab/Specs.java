package lab;

/**
 * ==========================================================================
 *  ส่วน B — ฝึกเขียน Spec (JavaDoc) เอง
 * --------------------------------------------------------------------------
 *  โค้ดข้างล่างนี้ "ทำงานถูกต้องแล้ว" — ห้ามแก้ตัวโค้ด
 *  หน้าที่ของนิสิต: อ่านโค้ด แล้วเติม JavaDoc ให้แต่ละเมธอด
 *
 *  ต้องมีอย่างน้อย:
 *    - บรรทัดสรุปว่าเมธอด "ทำอะไร" (what, ไม่ใช่ how)
 *    - @param   ของทุกพารามิเตอร์ พร้อมข้อจำกัด (pre-condition)
 *    - @return  อธิบายค่าที่คืน (post-condition)
 *    - @throws  ทุก exception ที่โยน พร้อมเงื่อนไข
 * ==========================================================================
 */
public class Specs {

    // TODO ข้อ 4: เขียน JavaDoc ให้เมธอดนี้
    /**
     * วนลูบอาร์เรย์หา key โดยส่งค่ากลับไปเป็น 1 ถ้าไม่ใช่ส่ง -1 กลับไป
     * @param arr อาร์เรย์ ที่มาต้องไม่เป็น null
     * @param key วนลูปถ้าในอาร์เรย์เท่ากับ key ส่งค่า i กลับ
     * @return ถ้าไม่ใช่ key ส่งค่า -1 กลับ
     */
    public static int firstIndexOf(int[] arr, int key) {
        if (arr == null) throw new IllegalArgumentException("arr must not be null");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    // TODO ข้อ 5: เขียน JavaDoc ให้เมธอดนี้
    /** ส่งค่า radius ที่มากกว่าหรือเท่ากับ 0
     * 
     * @param radius ค่า radius ต้องมากกว่าหรือเท่ากับ 0 จึงส่งค่ากลับได้
     * @return ส่งค่าพายคูณรัศมีคูณรัศมี
     */
    public static double circleArea(double radius) {
        if (radius < 0) throw new IllegalArgumentException("radius must be >= 0");
        return Math.PI * radius * radius;
    }

    // TODO ข้อ 6: เขียน JavaDoc ให้เมธอดนี้
    //   (เมธอดนี้ตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็ก;
    //    input null ให้คืน string ว่าง)
    /**ส่งสตริงที่ไม่ใช่ null
     * 
     * @param s ถ้าสตริง s เป็น null ส่งค่าค่าเปล่ากลับ
     * @return ถ้าไม่ใช่ส่งสตริงตัวพิมเล็กกลับไปแ
     */
    public static String normalize(String s) {
        if (s == null) return "";
        return s.trim().toLowerCase();
    }
}
