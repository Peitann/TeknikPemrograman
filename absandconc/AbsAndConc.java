//pertemuan 3 Teori

package com.mycompany.absandconc;

abstract class TI23Class {
    abstract void display();
}

abstract class D3Class extends TI23Class {
    // Abstract method for display
    abstract void display();
}

abstract class D4Class extends TI23Class {
    // Abstract method for display
    abstract void display();
}

class OneAD3 extends D3Class {
    // Implementasi metode display untuk 1AD3
    void display() {
        System.out.println("Dwika dari 1AD3");
    }
}

class OneBD3 extends D3Class {
    void display() {
        System.out.println("Hanif dari 1BD3");
    }
}

class OneCD3 extends D3Class {
    void display() {
        System.out.println("Ahmed dari 1CD3");
    }
}

class OneAD4 extends D4Class {
    void display() {
        System.out.println("Fredy dari 1AD4");
    }
}

class OneBD4 extends D4Class {
    void display() {
        System.out.println("Fatan dari 1BD4");
    }
}

public class AbsAndConc {
    public static void main(String[] args) {
        // Membuat objek dan memanggil metode display()
        OneAD3 oneAD3 = new OneAD3();
        OneBD3 oneBD3 = new OneBD3();
        OneCD3 oneCD3 = new OneCD3();
        OneAD4 oneAD4 = new OneAD4();
        OneBD4 oneBD4 = new OneBD4();
        oneAD3.display();
        oneBD3.display();
        oneCD3.display();
        oneAD4.display();
        oneBD4.display();
    }
}
