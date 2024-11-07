
# Aplikasi Pengelolaan Kontak

Aplikasi ini digunakan untuk menyimpan dan mengelola informasi kontak seperti nama, nomor telepon, dan kategori kontak dalam database SQLite. Aplikasi ini dilengkapi dengan fitur CRUD (Create, Read, Update, Delete), pencarian kontak, validasi input nomor telepon, serta impor dan ekspor data ke dalam format CSV.


## Biodata Pembuat

- **Nama**: Nabila Parastiwi
- **NPM**: 2210010420
- **Kelas**: Reguler 5A Pagi Banjarmasin
- **Mata Kuliah**: Pemrograman Berbasis Objek 2
- **Jurusan**: Teknik Informatika - TI
- **Fakultas**: Teknologi Informatika
- **Kampus**: Universitas Islam Kalimantan Muhammad Arsyad Al-Banjari

## Fitur Aplikasi

1. **CRUD Kontak**
   - Tambah kontak baru.
   - Edit informasi kontak yang sudah ada.
   - Hapus kontak.
   - Menampilkan daftar kontak dalam tabel (JTable).

2. **Kategori Kontak**
   - Kontak dapat dikelompokkan berdasarkan kategori yang dipilih dari JComboBox, seperti "Keluarga", "Teman", atau "Kerja".

3. **Pencarian Kontak**
   - Mencari kontak berdasarkan nama atau nomor telepon.

4. **Validasi Input**
   - Nomor telepon hanya bisa diisi dengan angka dan maksimal 13 digit.

5. **Impor dan Ekspor Data CSV**
   - Ekspor data kontak ke file CSV.
   - Impor data kontak dari file CSV ke dalam aplikasi dan simpan ke database.


## Komponen GUI yang Digunakan

- **JFrame**: Komponen utama sebagai frame aplikasi.
- **JPanel**: Untuk mengelompokkan komponen GUI.
- **JLabel**: Menampilkan teks label untuk field input.
- **JTextField**: Untuk input nama dan nomor telepon.
- **JButton**: Tombol untuk melakukan tindakan seperti tambah, edit, hapus, cari, impor, dan ekspor.
- **JComboBox**: Dropdown untuk memilih kategori kontak.
- **JTable**: Menampilkan daftar kontak.
- **JScrollPane**: Menyediakan scroll pada JTable jika data yang ditampilkan banyak.


## Installation

- **Java Swing** untuk antarmuka pengguna (GUI).
- **SQLite** sebagai database penyimpanan data kontak.
- **NetBeans** sebagai IDE pengembangan aplikasi.

    
## Instruksi Penggunaan

1. **Menjalankan Aplikasi**
   - Buka proyek ini di NetBeans.
   - Pastikan database SQLite sudah terhubung dengan aplikasi.
   - Jalankan aplikasi dari NetBeans.

2. **Menambah Kontak**
   - Isi nama, nomor telepon, dan pilih kategori.
   - Klik tombol "Tambah" untuk menambahkan kontak.

3. **Mengedit Kontak**
   - Pilih kontak yang akan diedit dari tabel.
   - Ubah informasi di form input.
   - Klik tombol "Edit" untuk menyimpan perubahan.

4. **Menghapus Kontak**
   - Pilih kontak yang akan dihapus dari tabel.
   - Klik tombol "Hapus" untuk menghapus kontak dari database.

5. **Mencari Kontak**
   - Masukkan nama atau nomor telepon di kolom pencarian.
   - Klik tombol "Cari" untuk menampilkan hasil pencarian.

6. **Ekspor Kontak ke CSV**
   - Klik tombol "Ekspor Data" untuk menyimpan data kontak dalam format CSV.

7. **Impor Kontak dari CSV**
   - Klik tombol "Impor Data" dan pilih file CSV yang ingin diimpor.
   - Data dari file CSV akan ditambahkan ke database dan ditampilkan di tabel.



## Validasi

- Nomor telepon harus berupa angka dengan maksimal 13 digit.
- Aplikasi akan memberi pesan jika terjadi kesalahan atau data tidak valid.


## Struktur Proyek

- **src**: Folder yang berisi semua file kode sumber aplikasi.
- **DatabaseHelper.java**: Kelas yang berisi metode untuk menghubungkan aplikasi dengan database SQLite.
- **AplikasiPengelolaanNomorFrame.java**: Kelas utama yang berisi antarmuka pengguna dan semua fungsi aplikasi, seperti CRUD, pencarian, validasi, dan ekspor-impor CSV.


## Catatan

Pastikan Anda telah menginstal SQLite di sistem Anda atau menyertakan driver JDBC SQLite jika aplikasi dijalankan di lingkungan lain.

---

**Selamat menggunakan aplikasi! Semoga bermanfaat untuk pengelolaan kontak Anda.**

