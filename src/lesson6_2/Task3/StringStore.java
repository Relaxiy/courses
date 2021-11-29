package lesson6_2.Task3;

public class StringStore {
    private String storedString;

    StringStore(){
        storedString = "";
    }
    StringStore(String[] storedString){
        this.storedString = String.join("%", storedString);
    }
    public void addString(String str){
        if(!str.contains("%")) {
            String[] strings = str.split(" ");
            this.storedString += "%" + String.join("%", strings);
        }
    }
    public void addString(String[] strArray){
            for (String value : strArray) {
                if(!value.contains("%")) this.storedString += "%" + value;
            }
    }

    public String getStoredString() {
        return storedString;
    }
}
