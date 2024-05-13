# Laporan Praktikum Pertemuan 11

## Aryo Adi Putro/06

## Percobaan 1

### Hasil Percobaan 1

> ![alt text](image-3.png)
> 

- Hasil jika index pada insertat adalah -1 :
> ![alt text](image-1.png)

### Pertanyaan percobaan 1

1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
- Karena pada baris pertama belum memasukkan nilai apa-apa.

2. Jelaskan kegunaan variable temp secara umum pada setiap method!
- Digunakan untuk menyimpan data sementara sebelum dipindahkan

3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut
> ![alt text](image-2.png)
- Digunakan untuk memeriksa apakah node berikutnya setelah node saat ini adalah node terakhir dalam linked list nya. jika ya, maka tail akan menjadi node saat ini (temp.next).

## Percobaan 2

### Hasil percobaan 2

> ![alt text](image.png)

### Pertanyaan percobaan 2

1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
- Break digunakan untuk keluar dari looping setelah node dengan kunci yang cocok ditemukan dan dihapus. Jika tidak menggunakan break iterasi akan terus dilanjutkan meskipun node yang diinginkan sudah dihapus.

2. Jelaskan kegunaan kode dibawah pada method remove
> ![alt text](image-4.png)
- Kode berikut digunakan untuk memeriksa apakah data elemen selanjutnya dalam linked list sama dengan parameter key. Jika ditemukan, maka elemen selanjutnya dihapus dari node.

## Tugas 

1. Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah dipelajari sebelumnya untuk menginputkan data.
> ![alt text](image-5.png)
``` java
public class Main {
    public static void main(String[] args) {
        SLL mhs = new SLL();

        mhs.print();

        mhs.addFirst(111, "bambang");
        mhs.print();
        
        mhs.addLast(112, "coki");
        mhs.print();

        mhs.addFirst(113, "adrian");
        mhs.print();
        
        mhs.insertAfter(112, 114, "eko");
        mhs.print();
        
        mhs.insertAt(3, 115, "dewi");
        mhs.print();
    }
}
```
- Hasil run :
> ![alt text](image-6.png)

2. Buatlah implementasi program antrian layanan unit kemahasiswaan sesuai dengan kondisi yang ditunjukkan pada soal nomor 1! Ketentuan
- Implementasi antrian menggunakan Queue berbasis Linked List!
- Program merupakan proyek baru, bukan modifikasi dari soal nomor 1!

- Hasil run :
- Membuat antrian :
> ![alt text](image-7.png)

- Cek Antrian terdepan :
> ![alt text](image-8.png)

- Cek Antrian terakhir :
> ![alt text](image-9.png)

- Cek semua antrian :
> ![alt text](image-10.png)

- Cek antrian dengan nama :
> ![alt text](image-12.png)

- Cek antrian dengan nomer antrian :
> ![alt text](image-13.png)

- Mengeluarkan antrian :
> ![alt text](image-11.png)