public class Main {
    public static void main(String[] args) {
        int n = 7; // B harfinin genişliği

        for (int i = 0; i < n; i++) { // Dış döngü, B harfinin yüksekliği
            for (int j = 0; j < n; j++) { // İç döngü, B harfinin genişliği
                if (j == 0 ||                        // Sol dikey çizgi
                        (i == 0 && j < n - 1) ||         // Üst yatay çizgi
                        (i == n - 1 && j < n - 1) ||     // Alt yatay çizgi
                        (i == n / 2 && j < n / 2) ||     // Orta yatay çizgi
                        (j == n - 1 && i != 0 && i != n - 1 && i != n / 2)) { // Sağ dikey çizgi
                    System.out.print("*"); // Yıldızları yazdır
                } else {
                    System.out.print(" "); // Boşlukları yazdır
                }
            }
            System.out.println(); // Her satırın sonunda bir satır atla
        }
    }
}
