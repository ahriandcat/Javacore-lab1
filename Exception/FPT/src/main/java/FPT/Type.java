package FPT;

public enum Type {
    phone ("Điện Thoại"),laptop("Laptop"),Apple("Apple"),accessory("Phụ kiện");
    String value;
    Type(String value) {
        this.value=value;
    }
    public String getValue(){
        return value;
    }
}
