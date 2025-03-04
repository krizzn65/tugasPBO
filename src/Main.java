class BangunDatar {
    double luas() {
        return 0;
    }

    double keliling() {
        return 0;
    }
}

class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        return sisi * sisi;
    }

    @Override
    double keliling() {
        return 4 * sisi;
    }
}

class Lingkaran extends BangunDatar {
    double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double luas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    double keliling() {
        return 2 * Math.PI * jariJari;
    }
}

class Segitiga extends BangunDatar {
    double alas, tinggi;

    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    double keliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}

public class Main {
    public static void main(String[] args) {
        BangunDatar[] bangunDatars = {
            new Persegi(5),
            new Lingkaran(7),
            new Segitiga(6, 8)
        };

        for (BangunDatar bd : bangunDatars) {
            tampilkanBangunDatar(bd);
        }
    }

    static void tampilkanBangunDatar(BangunDatar bangun) {
        String jenis = bangun.getClass().getSimpleName();
        System.out.println("Jenis Bangun Datar: " + jenis);
        System.out.println("Luas: " + bangun.luas());
        System.out.println("Keliling: " + bangun.keliling());
    }
}
