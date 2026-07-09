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
     * คืนค่า index เเรกที่พบ key ถ้าไม่พบให้ -1
     * @param arr อาร์เรย์ที่ต้องการหาต้องไม่เป็น null
     * @param key ค่าที่ต้องการค้นหา
     * @return ถ้าเจอร์ key ให้ส่ง i หรือ ถ้าไม่เจอให้ -1
     * @throws IllegalArgumentException ถ้าเป็น arr เป็น null
     */
    public static int firstIndexOf(int[] arr, int key) {
        if (arr == null) throw new IllegalArgumentException("arr must not be null");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    // TODO ข้อ 5: เขียน JavaDoc ให้เมธอดนี้
    /**
     * คำนวณพื้นที่วงกลมจาก radius ที่กำหนด
     * @param radius รัศมีของวงกลม ตอนมีค่า >=0
     * @return สูตรหาพื้นที่วงกลม
     * @throws IllegalArgumentException ถ้า radius < 0
     */
    public static double circleArea(double radius) {
        if (radius < 0) throw new IllegalArgumentException("radius must be >= 0");
        return Math.PI * radius * radius;
    }

    // TODO ข้อ 6: เขียน JavaDoc ให้เมธอดนี้
    //   (เมธอดนี้ตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็ก;
    //    input null ให้คืน string ว่าง)

    /**
     * ตัดช่องว่างหน้า-หลัง เเล้วเเปลงข้อความเป็นตัวพิมพ์เล็ก
     * @param s ข้อความที่ต้องที่เป็นปกติ รับค่า null ได้
     * @return  ข้อมูลที่มีการตัดช่องว่างหน้า-หลัง เเล้วเเปลงเป็นตัวพิมพ์เล็ก หรือ "" ถ้า s เป็น null
     */
    public static String normalize(String s) {
        if (s == null) return "";
        return s.trim().toLowerCase();
    }
}
