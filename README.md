# Pengondisian

Penjelasan dan fungsi

Git Init Perintah: Perintah ini digunakan untuk membuat repositori Git baru. Ini adalah langkah pertama yang kamu lakukan saat memulai sebuah proyek secara lokal. Fungsi: Menginisialisasi direktori saat ini agar menjadi folder yang dilacak oleh Git. Setelah perintah ini dijalankan, folder tersembunyi bernama .git akan muncul, yang berfungsi menyimpan semua riwayat perubahan kamu.


Git Status Penjelasan: Anggap saja perintah ini sebagai "pemeriksaan kesehatan" proyek kamu. Fungsi: Memberitahukan kondisi repositori saat ini. Ia akan menunjukkan:

File mana yang telah diubah tetapi belum ditambahkan ke staging area.

File baru yang belum dilacak (untracked files).

File yang sudah siap untuk di-commit.


Git add Penjelasan: Perintah ini digunakan untuk menambahkan perubahan pada file di direktori kerja kamu ke dalam Staging Area (area persiapan). Fungsi: Menandai Perubahan: Memberitahu Git bahwa file tertentu siap untuk disertakan dalam commit berikutnya.

Git Commit Penjelasan: Perintah ini digunakan untuk menyimpan perubahan yang telah kamu tandai (staged) ke dalam riwayat permanen Git. Biasanya digunakan dengan pesan tambahan seperti git commit -m "Pesan perubahan". Fungsi: Membuat "titik simpan" (snapshot) dari proyek kamu. Jika di kemudian hari ada kode yang rusak, kamu bisa kembali ke titik commit ini.


Git Push origin main Penjelasan: Perintah ini mengirimkan semua commit yang ada di komputer lokal kamu ke repositori jarak jauh (remote), seperti GitHub, GitLab, atau Bitbucket. Fungsi:  Push: Mengunggah data.

Perintah yang sering di gunakan dalam penggunaan command line:
1. pwd(Menampilkan lokasi folder (direktori) kamu saat ini.)
2. ls(Menampilkan isi folder.)
3. cd(Untuk berpindah folder.)
4. touch(Membuat file baru kosong.)
5. chomd(Mengubah izin akses file (read, write, execute).)
6. cs..(Untuk menyalin file atau folder.)
7. rm (perintah untuk menghapus apa?, contoh rm "nama file".)
8. perintah mengedit file
9. 
10. 

Langkah-langkah push:
1. git add = Amnil semua perubahan yang dilakukan
2. git commit -m "seubject pesan" = untuk menamai di github
3. git push origin = mempush ke github

Cheat sheet:
1. Repository adalah Tempat penyimpanan proyek beserta seluruh riwayat perubahannya.
Bisa di komputer lokal atau di server (misalnya GitHub).
2. Commit adalah Rekaman perubahan yang kamu simpan ke repository.
Setiap commit biasanya disertai pesan (message) yang menjelaskan perubahan yang dilakukan.
3. Hash adalah Kode unik (biasanya berupa kombinasi angka dan huruf) yang menjadi identitas setiap commit.
4. Checkout adalah Perintah untuk berpindah ke commit, branch, atau versi tertentu dari proyek.
Misalnya ingin melihat kondisi kode di masa lalu.
5. Branch adalah Cabang pengembangan dalam repository.
Digunakan untuk mengerjakan fitur atau perubahan tanpa mengganggu kode utama.
6. Merge adalah Proses menggabungkan perubahan dari satu branch ke branch lain.
Biasanya dilakukan setelah fitur selesai dibuat.
7. Remote adalah Versi repository yang berada di server/internet.
Contoh: repo di GitHub atau GitLab.
8. Clone adalah Menyalin repository dari remote ke komputer lokal.
Biasanya langkah pertama saat mulai bekerja dengan proyek.
9. Push adalah Mengirim commit dari repository lokal ke repository remote.
Agar perubahan bisa dilihat orang lain.
10. Pull adalah Mengambil perubahan terbaru dari repository remote ke lokal.
Biasanya dilakukan sebelum mulai bekerja agar tidak konflik.