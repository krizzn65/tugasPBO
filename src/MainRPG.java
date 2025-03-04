class Karakter {
    String nama;
    int health;
    int damage;

    Karakter(String nama, int health, int damage) {
        this.nama = nama;
        this.health = health;
        this.damage = damage;
    }

    void serang(Karakter musuh) {
        musuh.health -= damage;
        System.out.println(nama + " menyerang " + musuh.nama + " dengan damage " + damage);
    }

    void tampilkanStatus() {
        System.out.println(nama + " - HP: " + health);
    }
}

class Warrior extends Karakter {
    Warrior(String nama) {
        super(nama, 200, 20);
    }

    @Override
    void serang(Karakter musuh) {
        System.out.println(nama + " menebas " + musuh.nama);
        musuh.health -= damage + 5;
    }
}

class Mage extends Karakter {
    Mage(String nama) {
        super(nama, 150, 25);
    }

    @Override
    void serang(Karakter musuh) {
        System.out.println(nama + " melempar bola api ke " + musuh.nama);
        musuh.health -= damage;
    }
}

class Assassin extends Karakter {
    Assassin(String nama) {
        super(nama, 100, 30);
    }

    @Override
    void serang(Karakter musuh) {
        System.out.println(nama + " menusuk cepat ke " + musuh.nama);
        musuh.health -= damage + 10;
    }
}

public class MainRPG {
    public static void main(String[] args) {
        Karakter dewa = new Warrior("Dewa");
        Karakter raka = new Mage("Raka");
        Karakter gerung = new Assassin("Gerung");

        dewa.serang(raka);
        raka.serang(gerung);
        gerung.serang(dewa);

        dewa.tampilkanStatus();
        raka.tampilkanStatus();
        gerung.tampilkanStatus();
    }
}
