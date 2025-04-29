package org.example;

public class Dev {

    private Computer comp;
    public Dev() {
        System.out.println("Dev is created");
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build(){
        System.out.println("Working awesome project");
        comp.compile();
    }
}
