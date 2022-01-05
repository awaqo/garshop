# Program Penjualan Mobil : GarShop (Garasi Shop)
Mata kuliah Pemrograman 2
### 👑 GANTENG SQUAD
| No. | Nama | NIM | Kelas  |
| ----------- | ----------- | ----------- | ----------- |
| 1 | Adhit Fatwa | 20104004 | S1SE-04-A |
| 2 | Aqil Jawadal Furqon | 20104016 | S1SE-04-A |
| 3 | Bintang Ahmada Farhan Adama | 20104020 | S1SE-04-A |
| 4 | Brahmasta Bagus Aryandra | 20104021 | S1SE-04-A |
| 5 | Rasyid Ramadhani | 20104099 | S1SE-04-A |

## Dasar Teori

### A. PENGENALAN PEMROGRAMAN BERIORIENTASI OBJEK (`BAB 3 & 4`)

Pemrograman Berorientasi Objek, Deklarasi Class, Atribut, dan Akses Obyek 
Pemrograman Berorientasi Objek (Object Oriented Programming/OOP) merupakan pemrograman yang berorientasikan kepada objek, dimana semua data dan fungsi dibungkus dalam class- class atau object-object. PBO memiliki beberapa karakteristik mendasar, antara lain  adalah abstraksi, encapculation (pembungkusan), inheritance  (pewarisan), dan polymorphism. Class  adalah  wadah  yang  berisi  abstraksi  (pemodelan)  dari  suatu  fungsi objek (benda),  yang  mendeskripsikan  data  (sifat  karakteristik)  dan  fungsi  yang  dimiliki oleh  objek tersebut. Attributes merupakan nilai (type) data  yang  terdapat pada  suatu object  yang berasal dari class. Attributes merepresentasikan karakteristik dari suatu object. Metode/method adalah sesuatu yang dapat dilakukan oleh objek. Method dalam implementasi program ditulis dalam bentuk fungsi. Metode menentukan apa yang  terjadi ketika objek  itu dibuat serta berbagai operasi yang dapat dilakukan objek.oleh karna itu untuk dapat  mengakses  anggota-anggota  dari  suatu  obyek,  maka harus dibuat instance dari class tersebut terlebih dahulu. 

Information Hiding dan Encapsulation
Information Hiding adalah menyembunyikan atribut dan method suatu objek dari objek lain. Informasi dari suatu class disembunyikan agar anggotaanggota tersebut tidak dapat diakses dari luar. Adapun caranya adalah    cukup    dengan    memberikan    akses    control    private    ketika mendeklarasikan suatu atribut atau method. Encapsulation (Enkapsulasi) adalah suatu cara untuk menyembunyikan implementasi detail dari suatu class. Enkapsulasi mempunyai dua hal mendasar, yaitu Information hiding dan Menyediakan suatu perantara (method) untuk pengaksesan data. 

Contructor (konstruktor) adalah suatu method yang pertama kali dijalankan pada saat pembuatan suatu obyek. Konstruktor ini merupakan method yang berfungsi untuk menginisialisasi variabel-variabel instans yang akan di miliki oleh objek. Konstruktor dipanggil pada saat proses instansiasi kelas menjadi objek. Beberapa karakteristik yang dimiliki oleh constructor : 

1. Method constructor harus memiliki nama yang sama dengan nama class. 
2. Tidak mengembalikan suatu nilai (tidak ada keyword return). 
3. Satu   class   memiliki   lebih   dari   satu   constructor   (overloading constructor). 
4. Dapat  ditambah  access  modifier public,  private,  protected  maupun default. 
5. Suatu constructor bisa dipanggil oleh constructor lain dalam satu class. 

Overloading Constructor merupakan suatu class yang mempunyai lebih dari 1 constructor dengan syarat daftar parameternya tidak boleh ada yang sama. Constructor tidak dapat dipanggil secara langsung, namun harus dipanggil dengan menggunakan operator new pada pembentukan sebuah class. 

### B. MENGELOLA CLASS (`BAB 5`)
- Package, Class, Kata Kunci This

 Package adalah suatu cara untuk memanage class-class yang kita buat pakage akan sangat bermanfaat jika class-class yang kita buat sangat banyak sehingga perlu dikelompokan berdasarkan kategori tertentu. Jadi yang harus diperhatikan adalah biasanya nama class utama harus sama dengan nama package. Perintah import digunakan untuk memberitahukan kepada program untuk mengacu pada class-class yang terdapat dalam package tertentu, buka menjalankan class-class tersebut. Sedangkan   untuk   mengimpor   class   tertentu   anda   dapat menuliskan nama class setelah nama package. Kata kunci ini digunakan dalam sebuah kelas untuk menyatakan object sekarang. Kata kunci this sangat berguna untuk menunjukkan suatu member dalam class-nya sendiri. this dapat digunakan baik untuk data  member  maupun  untuk  function  member,  serta  dapat  juga digunakan untuk konstruktor. 

### C. KONSEP INHERITANCE (`BAB 6`)

  Dengan  konsep  inheritance,  sebuah  class  dapat  mempunyai  class turunan. Suatu class yang mempunyai class turunan dinamakan parent class atau base class. Sedangkan class turunan itu sendiri seringkali disebut subclass atau child class. Suatu subclass dapat mewarisi apa-apa yang dipunyai oleh parent class-nya. Kesimpulannya, boleh dikatakan bahwa suatu subclass adalah tidak lain hanya memperluas (extend) parent class-nya. Di dalam Java untuk mendeklarasikan suatu class sebagai subclass dilakukan dengan cara menambahkan kata kunci extends setelah deklarasi nama class, kemudian diikuti dengan nama parent class-nya. 
  Java hanya memperkenankan adanya single inheritance. Konsep single inheritance hanya memperbolehkan suatu sublass mempunyai satu parent class. Dengan konsep single inheritance ini, masalah pewarisan akan dapat diamati dengan mudah. Suatu parent class dapat tidak mewariskan sebagian member-nya kepada subclass-nya. Sejauh mana suatu member dapat diwariskan ke class lain, ataupun suatu member dapat diakses dari class lain, sangat berhubungan dengan access control (kontrol pengaksesan). Kata kunci super dipakai untuk merujuk pada member dari parent class, sebagaimana kata kunci this yang dipakai untuk merujuk pada member dari class itu sendiri. 
Ada beberapa hal yang harus diingat ketika menggunakan pemanggil constuktor super: 

1. Pemanggil super() HARUS DIJADIKAN PERNYATAAN PERTAMA DALAM constructor. 
2. Pemanggil super() hanya dapat digunakan dalam definisi constructor. 
3. Termasuk  constructor  this()  dan  pemanggil  super()  TIDAK  BOLEH  TERJADI  DALAM constructor YANG SAMA.

### D. OVERLOADING DAN OVERRIDING (`BAB 7`)

Overloading adalah suatu keadaan dimana ada beberapa method dengan nama yang sama  pada suatu class tetapi dengan parameter yang berbeda atau (mempunyai implementasi dan return value). Tujuan dibuatnya overloading yaitu untuk memudahkan pengguna method dengan fungsi yang hampir sama.
Overloading ini dapat terjadi pada class yang sama atau pada suatu parent class dan subclass-nya. Overloading mempunyai ciri-ciri sebagai berikut : 

1. Nama Method harus sama 
2. Daftar parameter harus berbeda 
3. Return type boleh sama,juga boleh berbeda. 

Overriding tidak sama dengan overloading, Overriding merupakan mekanisme dimana sebuah metode dapat dideklarasikan ulang pada kelas turunannya. Overriding mempunyai ciri-ciri sebagai berikut : 

1. Nama Method harus sama 
2. Daftar parameter harus sama 
3. Return type harus sama

Method  yang terkena override (overiden  method) diharuskan  tidak boleh mempunyai modifier yang lebih luas aksesnya dari method yang meng- overide (overriding method). 

### E. POLIMORFISME (`BAB 8`)

  Polymorphism (polimorfisme) adalah kemampuan untuk mempunyai beberapa bentuk class yang berbeda. Polimorfisme ini terjadi pada saat suatu obyek bertipe parent class, akan tetapi pemanggilan constructornya melalui subclass. Virtual Method Invocation (VMI) bisa terjadi jika terjadi polimorfisme dan  overriding.  Pada saat  obyek  yang sudah  dibuat  tersebut  memanggil overridden method pada parent class, kompiler Java akan melakukan invocation (pemanggilan) terhadap overriding method pada subclass, dimana yang  seharusnya  dipanggil  adalah  overridden  method. Polymorphic arguments adalah tipe suatu parameter yang menerima suatu nilai  yang bertipe subclass-nya. Pernyataan instanceof sangat berguna untuk mengetahui tipe asal dari suatu polymorphic arguments. Seringkali pemakaian instanceof diikuti dengan casting object dari tipe parameter ke tipe asal.

### F. EXCEPTION (`BAB 9`)

   Exception adalah suatu kondisi abnormal yang terjadi pada saat menjalankan program. Teknik yang dipakai dalam Java untuk menangani kondisi yang tidak biasa saat menjalankan operasi normal dalam program dinamakan exception handling. Karena dalam java segala sesuatu merupakan objek, maka exception juga akan direpresentasikan dalam sebuah objek yang menjelaskan tentang exception tersebut. Contoh exception adalah pembagian bilangan dengan 0, pengisian elemen array diluar ukuran array, kegagalan koneksi database, file yang akan dibuka tidak ada, dan mengakses objek yang belum diinisialisasi. Terdapat dua penanganan exception yaitu: 
   a. Menangani sendiri exception tersebut. 
   b. Meneruskannya ke luar dengan cara membuat objek tentang exception tersebut dan melemparkannya (throw) keluar agar ditangani oleh kode yang memanggil method(method yang didalamnya terdapat exception) tersebut. Ada  lima  keyword  yang  digunakan  oleh  Java  untuk  menangani exception yaitu try, catch, finally, throw dan throws. 

- Tipe-Tipe Exception 
Pada exception, superclass tertinggi adalah class Throwable, tetapi kita hampir tidak pernah menggunakan class ini secara langsung. Dibawah class Throwable terdapat dua subclass yaitu class Error dan class Exception. 
- Penggunaan Blok try-catch 
Untuk menangani exception dalam program, dengan meletakkan kode program yang memungkinkan terjadinya exception didalam blok try, diikuti dengan blok catch yang menentukan jenis exception yang ingin ditangani.
- Menggunakan Keyword ”finally” 
Terdapat kode yang harus dijalankan walaupun terjadi atau tidak terjadi exception, misalkan kita membuka file, hal ini memungkinkan terjadinya exception misal file tidak ada, file tidak bisa dibuka, selanjutnya yang harus dilakukan adalah menutup file tersebut. 
- Menggunakan Keyword ”throw ” dan ”throws” 
Secara eksplisit, kita dapat melempar (throw) exception dari program menggunakan keyword throw. Jika exception tersebut adalah checked exception, maka pada method harus ditambahkan throws. Jika exception tersebut adalah unchecked exception, maka pada method tidak perlu ditambahkan throws.
 
<hr>

## Penjelasan Program

Berikut ini adalah penjelasan program kami yang bernama GarShop dan kaitannya dengan materi pada modul 3-9.

### ☂️ Pengenalan Pemrograman Berorientasi Objek `Modul 3`
1. Class
<br> Pada program Garshop ini terdapat banyak sekali class yang terdeklarasi. Sebagai contoh berikut contoh class koneksi pada branc db :

```java
public class koneksi {
    Connection conn = null;
    public static Connection koneksi(){
        String driver = "com.mysql.jdbc.Driver";
        String host = "jdbc:mysql://localhost/Garshop";
        String user = "root";
        String pass = "";
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(host,user,pass);
//            System.out.println("Koneksi Berhasil");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi Gagal "+e);
        }
        return null;
    }
}
```

Class diatas digunakan untuk mengkoneksikan antara program GarShop dengan database yang telah kami buat. Untuk access modifier-nya kami buat public, menyesuaikan dengan kebutuhan kami.

2. Atribut
<br> Dalam program kami juga membutuhkan sebuah atribut, sebagai contoh berikut deklarasi atribut dari branch model class Mitsubshi :

```java
private int cc;
private String plat;
private String jenis;
```

Atribut diatas adalah atribut yang memiliki access modifier private yang hanya akan digunakan pada class ini. Atribut tersebut juga dapat digolongkan dalam kategori Information Hiding, yaitu menyembunyikan atribut dan methode suatu objek dari objek lainnya. Atribut tersebut masing-masing akan digunakan untuk menampung nilai mesin cc, plat nomor mobil, dan juga jenis mobil yang ditawarkan.

3. Method
<br> Pada class yang sama kami juga hadirkan contoh methode yang bernama setJenis :

```java
public void setJenis(String jenis) {
        this.jenis = jenis;
    }
```

Methode diatas dibuat untuk memperbarui nilai pada variabel jenis pada parameter.

4. Objek
<br> Berikut contoh program akses anggota obyek pada brach model methode jual :

```java
public void jual(Toyota toyota, String kondisi) {
        try {
            st = cn.createStatement();
            String query = "INSERT INTO mobil VALUES (" +
                    "'"+ toyota.getPlat() +"', " +
                    "'"+ toyota.getMerk() +"', " +
                    "'Toyota', " +
                    "'"+ toyota.getTahun() +"', " +
                    "'"+ toyota.getHarga() +"', " +
                    "'"+ toyota.getCc() +"', " +
                    "'"+ kondisi +"', " +
                    "'"+ toyota.getJenis() +"'" +
                    ")";
            st.execute(query);
            System.out.println("Data Berhasil Ditambahkan");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
```

Program diatas memanggil obyek toyota.getPalt, getMerk, GetTahun dan lain sebagainya. Output dari program ini nantinya akan memberikan perintah kepada database untuk menerima/menginput data dari user data tentang mobil yang akan dijual.
<br><br>

### ☂️ Dasar Pemrograman Berorientasi Objek `Modul 4`

1. Information Hiding
<br> Information Hiding adalah menyembunyikan atribut dan method suatu objek dari objek lain. Contoh penerapannya dalam program kami yaitu :
```java
    private String merk;
    private int tahun;
    private int harga;
```

2. Encapsulation
<br> Enkapsulasi(encapsulation) adalah metode untuk mengatur struktur pada class dengan tujuan untuk menentukan hak akses pada property atau method. Contoh penerapan enkapsulasi pada program kami yaitu : 
```java
    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
```

3. Constructor
<br> Pada materi PBO juga terdapat constructor, yaitu suatu method yang pertama kali dijalankan pada saat pembuatan suatu obyek. Berikut adalah contoh program pada GarShop pada package model class Mitsubishi dan constructornya :

```java
public class Mitsubishi extends Mobil {
    private int cc;
    private String plat;
    private String jenis;

    public Mitsubishi(String plat, String merk, int tahun, int harga, int cc,  String jenis) {
        super(merk, tahun, harga);
        this.cc = cc;
        this.plat = plat;
        this.jenis = jenis;
    }
}    
```

4. Overloading Constructor merupakan suatu class yang mempunyai lebih dari 1 constructor dengan syarat daftar parameternya tidak boleh ada yang sama. Contoh pada program kami pada package model class Mitsubishi dan constructor-constructornya:

```java
public class Mitsubishi extends Mobil {
    private int cc;
    private String plat;
    private String jenis;

    public Mitsubishi(String plat, String merk, int tahun, int harga, int cc,  String jenis) {
        super(merk, tahun, harga);
        this.cc = cc;
        this.plat = plat;
        this.jenis = jenis;
    }

    public Mitsubishi(String merk, int tahun, int harga, int cc, String plat) {
        super(merk, tahun, harga);
        this.cc = cc;
        this.plat = plat;
    }

    public Mitsubishi() {

    }
}    
```
<br><br>

### ☂️ Mengelola Class `Modul 5`

1. Package 
<br> Package adalah suatu cara untuk memenej class-class yang kita buat pakage akan sangat bermanfaat jika class-class yang kita buat sangat banyak sehingga perlu dikelompokan berdasarkan kategori tertentu. Berikut Contohnya pada program kami pada package model class Mitsubishi :

```java
package com.tubes.model;
```

Package diatas memiliki arti bahwa program disimpan pada package com kemudian ke package tubes lalu ke package model.

2. Import Class
<br> Perintah import digunakan untuk memberitahukan kepada program untuk mengacu pada class-class yang terdapat dalam package tertentu, buka menjalankan class-class tersebut. Berikut Contohnya pada program kami pada


```java
import com.tubes.db.koneksi;
```

Kode program diatas berarti program ini akan meng-impor class koneksi yang berada pada package com, tubes, dan db.

3. Kata kunci this
<br> Kata kunci ini digunakan dalam sebuah kelas untuk menyatakan object sekarang. Berikut Contohnya pada program kami pada package model class Mitsubishi : 

```java
public Mitsubishi(String merk, int tahun, int harga, int cc, String plat) {
        super(merk, tahun, harga);
        this.cc = cc;
        this.plat = plat;
    }
```

Terdapat dua kata kunci this pada kode program diatas. Yang pertama this untuk variabel cc, jadi nantinya nilai cc akan diperbarui ke nilai terbaru, begitu juga berlaku pada this variabel plat yang nilainya akan diperbarui.
<br><br>

### ☂️ Konsep Inhertence `Modul 6`

Di dalam Java untuk mendeklarasikan suatu class sebagai subclass dilakukan dengan cara menambahkan kata kunci extends setelah deklarasi nama class, kemudian diikuti dengan nama parent class-nya. Berikut adalah contoh deklarasi inheritance pada program kami :

```java
public class Mitsubishi extends Mobil {
. . .
}
```

Maksud dari contoh diatas adalah class Mitsubishi adalah subclass/turunan dari Class Mobil. Yang berarti mewarisi sifat dari class utamanya.
<br><br>

### ☂️ Overloading dan Overriding `Modul 7`

Overloading adalah suatu keadaan dimana ada beberapa method dengan nama yang sama pada suatu class tetapi dengan parameter yang berbeda (mempunyai implementasi dan return value).

<br><br>

### ☂️ Polimorfisme `Modul 8`
<br><br>

### ☂️ Exception `Modul 9`

Untuk menangani exception dalam program, dengan meletakkan kode program yang memungkinkan terjadinya exception didalam blok try, diikuti dengan blok catch yang menentukan jenis exception yang ingin ditangani.
<br> Contoh penggunaan exception handling dengan try-catch pada program kami yaitu :
```java
    @Override
    public String[][] beli(Mitsubishi mitsubishi, int jumlah) {
        String[][] data1 = new String[0][0];

        try {
            st = cn.createStatement();
            String sql = "SELECT * FROM mobil  WHERE tipe = 'Mitsubishi'";
            rs = st.executeQuery(sql);

            int i = 0;
            String[][] data = new String[jumlah][7];

            while (rs.next()) {
                data[i][0] = rs.getString("no_plat");
                data[i][1] = rs.getString("merk");
                data[i][2] = rs.getString("tahun");
                data[i][3] = rs.getString("harga");
                data[i][4] = rs.getString("cc");
                data[i][5] = rs.getString("kondisi");
                data[i][6] = rs.getString("jenis");
                i++;
            }
            return data;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data1;
    }
```
<hr>

