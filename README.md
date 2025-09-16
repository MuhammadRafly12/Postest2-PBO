Nama : Muhammad Rafly

NIM :2409116118

# Sistem Manajemen Film/Series

## Deskripsi Program
Program ini adalah aplikasi **manajemen data film/series** berbasis **Java PBO**.  
Program ini memungkinkan pengguna untuk melakukan **CRUD (Create, Read, Update, Delete)** pada data film.  

Fitur utama:  
- Menambahkan film baru dengan atribut: judul, genre, tahun rilis, rating, dan status.  
- Melihat daftar film dalam bentuk **tabel rapi**.  
- Memperbarui data film sesuai nomor urut.  
- Menghapus film berdasarkan nomor urut.  
- Menampilkan pesan khusus jika tabel kosong.  

Program ini dirancang menggunakan konsep **Object-Oriented Programming (PBO)**:  
- Terdapat **3 class**: `Film`, `FilmService`, dan `Main`.  
- Setiap atribut menggunakan **access modifier** `private` dengan **getter/setter**.  
- Constructor diterapkan di class `Film` untuk inisialisasi data.  
- Program diatur dalam **packages**:  
  - `model` buat menyimpan class `Film`  
  - `service` untuk menyimpan logika CRUD (`FilmService`)  
  - `main` untuk menyimpan menu utama (`Main`)  

---

## Alur Program
1. **Menu Utama**:  
   Ketika program dijalankan, muncul menu pilihan:  

<img width="456" height="229" alt="image" src="https://github.com/user-attachments/assets/961c7768-83a9-49be-bb12-457b2629609a" />

Pengguna memasukkan nomor menu sesuai pilihan.  

2. **Tambah Film**:  
Pengguna memasukkan data film: judul, genre, tahun rilis, rating, dan status.  
Data disimpan dalam list `ArrayList<Film>` di class `FilmService`.  

<img width="416" height="191" alt="image" src="https://github.com/user-attachments/assets/30ff3456-c800-4856-b6df-65477ff8bb8d" />


3. **Lihat Film**:  
Program menampilkan daftar film dalam bentuk **tabel rapi**.  
Jika belum ada data, tampilkan pesan:  

<img width="812" height="128" alt="image" src="https://github.com/user-attachments/assets/f84e3f75-6c64-4d28-a8b2-bed85d021bb7" />

4. **Update Film**:  
Program menampilkan daftar film dengan nomor urut.  
Pengguna memilih nomor film yang ingin diubah, kemudian memasukkan data baru.  
Data lama diganti dengan data baru menggunakan method `updateFilm()`.  

<img width="896" height="298" alt="image" src="https://github.com/user-attachments/assets/022d3782-48fd-4561-83b7-149904837f87" />


5. **Hapus Film**:  
Sama seperti update, program menampilkan daftar film.  
Pengguna memilih nomor film yang ingin dihapus.  
Film tersebut dihapus menggunakan method `hapusFilm()`.  

<img width="871" height="212" alt="image" src="https://github.com/user-attachments/assets/3e7e0f86-01ab-4c41-9199-5c9d78c30ba8" />

6. **Keluar Program**:  
Jika memilih menu keluar, program berhenti dan menampilkan pesan:  

<img width="908" height="69" alt="image" src="https://github.com/user-attachments/assets/a6e49dbd-e3e0-4a55-94fc-dc0a64b2dc64" />
