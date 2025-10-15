package Lab10_1;

public class DataValidator {
    public static boolean isValid(String string){ return string != null && !string.isEmpty(); } // ฟังก์ชันตรวจสอบความถูกต้องของสตริง
    public static boolean isValid(int age){ return age >= 18 && age <= 120; } // ฟังก์ชันตรวจสอบความถูกต้องของอายุ
    public static boolean isValid(String password, int minLength){ // ฟังก์ชันตรวจสอบความถูกต้องของรหัสผ่าน
        return password != null && password.length() >= minLength; // ตรวจสอบว่ารหัสผ่านไม่เป็น null และมีความยาวไม่น้อยกว่าความยาวขั้นต่ำ
    }
}