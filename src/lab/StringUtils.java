package lab;

/** ส่วน A ข้อ 1 — Intention-Revealing Name + Pure Function */
public class StringUtils {
    /**
     * นับจำนวนสระ a,e,i,o,u (ไม่สนพิมพ์เล็ก/ใหญ่) ในข้อความ
     * @param text ข้อความ, ต้องไม่เป็น null
     * @return จำนวนสระที่พบ
     * @throws IllegalArgumentException ถ้า text เป็น null
     */
    public static int countVowels(String text) {
        if(text==null) throw new IllegalArgumentException("text is null");
        int countVowels=0;
        String vowels ="aeiou";
        text=text.toLowerCase();
        for(int i =0;i<text.length();i++)
            for (int j=0;j< vowels.length(); j++)
                if(text.charAt(i)==vowels.charAt(j)) countVowels++;
       
        return  countVowels;
    }
}
