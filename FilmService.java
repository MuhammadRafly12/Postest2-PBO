/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import model.Film;
import java.util.ArrayList;

/**
 *
 * @author Acer-GK
 */

public class FilmService {
    private ArrayList<Film> daftarFilm;

    public FilmService() {
        daftarFilm = new ArrayList<>();
    }

    // Tambah film
    public void tambahFilm(Film film) {
        daftarFilm.add(film);
        System.out.println(">>> Film berhasil ditambahkan!");
    }

    // Tampilkan daftar film
    public void tampilkanFilm() {
        System.out.println("\n================= DAFTAR FILM =================");
        if (daftarFilm.isEmpty()) {
            System.out.println("| No | Judul           | Genre     | Tahun | Rating | Status             |");
            System.out.println("|----|-----------------|-----------|-------|--------|------------------|");
            System.out.println("|          Tabel kosong, belum ada data film!           |");
            return;
        }

        System.out.printf("| %-3s | %-15s | %-9s | %-5s | %-6s | %-16s |\n",
                "No", "Judul", "Genre", "Tahun", "Rating", "Status");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < daftarFilm.size(); i++) {
            Film f = daftarFilm.get(i);
            System.out.printf("| %-3d | %-15s | %-9s | %-5d | %-6.1f | %-16s |\n",
                    i + 1, f.getJudul(), f.getGenre(), f.getTahunRilis(), f.getRating(), f.getStatus());
        }
    }

    // Update film
    public boolean updateFilm(int index, Film filmBaru) {
        if (index < 0 || index >= daftarFilm.size()) return false;
        daftarFilm.set(index, filmBaru);
        return true;
    }

    // Hapus film
    public boolean hapusFilm(int index) {
        if (index < 0 || index >= daftarFilm.size()) return false;
        daftarFilm.remove(index);
        return true;
    }

    // Getter daftarFilm
    public ArrayList<Film> getDaftarFilm() {
        return daftarFilm;
    }
}
