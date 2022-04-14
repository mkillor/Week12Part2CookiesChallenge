package com.company.killoran;

public class Cookies implements Comparable<Cookies>{
    private String type;
    private String size;

    public Cookies(String type, String size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Cookies{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cookies o) {


        int compareResult = this.type.compareTo(o.type);

        return compareResult;

    }
}
