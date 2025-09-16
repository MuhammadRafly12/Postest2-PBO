/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;
import model.Film;
import service.FilmService;
import java.util.Scanner;
/**
 *
 * @author Acer-GK
 */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilmService service = new FilmService();
        boolean running = true;

        while (running) {
            System.out.println("\n===============================");
            System.out.println("      SISTEM MANAJEMEN FILM");
            System.out.println("===============================");
            System.out.println("1. Tambah Film");
            System.out.println("2. Lihat Film");
            System.out.println("3. Update Film");
            System.out.println("4. Hapus Film");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // buang enter

            switch (pilihan) {
                case 1:
                    System.out.print("Judul: ");
                    String judul = scanner.nextLine();
                    System.out.print("Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Tahun Rilis: ");
                    int tahun = scanner.nextInt();
                    System.out.print("Rating: ");
                    double rating = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Status: ");
                    String status = scanner.nextLine();

                    service.tambahFilm(new Film(judul, genre, tahun, rating, status));
                    break;

                case 2:
                    service.tampilkanFilm();
                    break;

                case 3:
                    service.tampilkanFilm();
                    System.out.print("Nomor film yang ingin diupdate: ");
                    int idxUpdate = scanner.nextInt() - 1;
                    scanner.nextLine();

                    System.out.print("Judul baru: ");
                    String judulBaru = scanner.nextLine();
                    System.out.print("Genre baru: ");
                    String genreBaru = scanner.nextLine();
                    System.out.print("Tahun Rilis baru: ");
                    int tahunBaru = scanner.nextInt();
                    System.out.print("Rating baru: ");
                    double ratingBaru = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Status baru: ");
                    String statusBaru = scanner.nextLine();

                    if (service.updateFilm(idxUpdate, new Film(judulBaru, genreBaru, tahunBaru, ratingBaru, statusBaru)))
                        System.out.println(">>> Film berhasil diupdate!");
                    else
                        System.out.println("Nomor tidak valid!");
                    break;

                case 4:
                    service.tampilkanFilm();
                    System.out.print("Nomor film yang ingin dihapus: ");
                    int idxHapus = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (service.hapusFilm(idxHapus))
                        System.out.println(">>> Film berhasil dihapus!");
                    else
                        System.out.println("Nomor tidak valid!");
                    break;

                case 5:
                    running = false;
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}


