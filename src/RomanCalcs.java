public class RomanCalcs extends Calculations {




    @Override
    public String addition(String a, String b) {
        int x = romanToArabic(a);
        int y = romanToArabic(b);

        Operation op = new Addition();

        int result = op.execute(x, y);

        return arabicToRoman(result);
    }

    @Override
    public String multiplication(String a, String b) {
        int x = romanToArabic(a);
        int y = romanToArabic(b);

        Operation op = new Multiplication();

        int result = op.execute(x, y);

        return arabicToRoman(result);
    }

    @Override
    public String division(String a, String b) {
        int x = romanToArabic(a);
        int y = romanToArabic(b);

        Operation op = new Division();

        int result = op.execute(x, y);

        return arabicToRoman(result);
    }

    @Override
    public String subtraction(String a, String b) {
        int x = romanToArabic(a);
        int y = romanToArabic(b);

        Operation op = new Subtraction();

        int result = op.execute(x, y);

        if (result <= 0){
            return "Неположительный результат";
        }else{
            return arabicToRoman(result);
        }
    }

    private int romanToArabic(String roman) {
        switch (roman) {
            case "I":    return 1;
            case "II":   return 2;
            case "III":  return 3;
            case "IV":   return 4;
            case "V":    return 5;
            case "VI":   return 6;
            case "VII":  return 7;
            case "VIII": return 8;
            case "IX":   return 9;
            case "X":    return 10;
            default:     return 0;
        }
    }
    private String arabicToRoman(int number) {
        String[] romanNumbers = { "nulla", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
                "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX",
                "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX",
                "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX",
                "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX",
                "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX",
                "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX",
                "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX",
                "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX",
                "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX",
                "C" };
        return romanNumbers[number];
    }

}
