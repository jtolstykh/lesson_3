
public class PhoneNumber {

    long num;
    String numType;


    public PhoneNumber() {
        numType = " ";
    }

    public PhoneNumber(long num, String numType) {
        this.num = num;
        this.numType = numType;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "num=" + num +
                ", numType='" + numType + '\'' +
                '}';
    }

      void print(){
          System.out.println(toString());
    }

    void changeType(String newType){
        this.numType = newType;
    }

    public long getNum() {
        return num;
    }



}
