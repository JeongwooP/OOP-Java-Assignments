import java.util.Arrays;

abstract class PairMap{
    protected String keyArray [];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class Dictionary extends PairMap{
    private static int index;

    public Dictionary(int num){
        keyArray = new String[num];
        valueArray = new String[num];
    }

    @Override
    String get(String key) {
        int loc = Arrays.asList(keyArray).indexOf(key);

        if(loc != -1)
            return valueArray[loc];
        else
            return null;
    }

    @Override
    void put(String key, String value) {
        int loc = Arrays.asList(keyArray).indexOf(key);

        if(loc != -1)
            valueArray[loc] = value;
        else{
            keyArray[index] = key;
            valueArray[index] = value;
            index++;
        }
    }

    @Override
    String delete(String key) {
        int loc = Arrays.asList(keyArray).indexOf(key);
        String value;

        keyArray[loc] = null;
        value = valueArray[loc];
        valueArray[loc] = null;
        return value;
    }

    @Override
    int length() {
        int size = 0;

        for(int i = 0; i < keyArray.length; i++){
            if(keyArray[i] != null)
                size++;
        }

        return size;
    }
}

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        System.out.println("유효한 길이: " + dic.length());   //legnth 출력
    }
}
