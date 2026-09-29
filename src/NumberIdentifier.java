public class NumberIdentifier {

    public boolean isArabicNubmer(String nubmer){

        try{
            Integer.parseInt(nubmer);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public boolean isRomanNubmer(String nubmer){

        switch (nubmer){
            case "I": return true;
            case "II": return true;
            case "III": return true;
            case "IV": return true;
            case "V": return true;
            case "VI": return true;
            case "VII": return true;
            case "VIII": return true;
            case "IX": return true;
            case "X": return true;
            default: return false;
        }

    }
}
