public class Person {
    private Person(){};
    static Person instance;
    public static Person getInstance(){
        if(instance==null){
            instance = new Person();
        }
        return instance;
    }
}
