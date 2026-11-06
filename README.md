#  🌱 CatatUang - MoneyTrack App

**CatatUang** adalah aplikasi manajemen keuangan pribadi modern berbasis Android yang dirancang untuk membantu pengguna mengelola arus kas, tabungan, dan anggaran harian secara cerdas, rapi, dan teratur.

Aplikasi ini dibangun menggunakan **Jetpack Compose**, **Material 3**, dan arsitektur UI modern di Android.

---

## 📱 Fitur Utama

### 1. 🔑 Halaman Login & Autentikasi (`LoginScreen`)
- **Desain Modern & Clean**: Dilengkapi badge indikator *"Aman & Terenkripsi"* dan opsi *"Demo Langsung"*.
- **Form Login Interaktif**:
  - Input Email / No. Handphone.
  - Input Kata Sandi dengan fitur *show/hide password* (toggle visibilitas).
  - Checkbox *"Ingat Saya"* dan tautan *"Lupa Kata Sandi?"*.
- **Masuk Cepat (Quick Login)**: Opsi masuk menggunakan akun **Google** atau **Biometrik** (Fingerprint).

### 2. 📊 Halaman Dashboard & Beranda (`DashboardScreen`)
- **Header Profil & Status Arus**: Menampilkan salam pengguna, tanggal terkini, serta indikator status keuangan (`• Arus Sehat`).
- **Kartu Total Saldo Aktif**:
  - Menampilkan Total Saldo, Total Pemasukan, dan Total Pengeluaran.
  - **Privacy Mode**: Fitur ikon mata untuk menyembunyikan/menampilkan nominal saldo.
- **Aksi Cepat (Quick Actions)**:
  - ➕ **Catat Masuk**: Menambah transaksi pemasukan.
  - ➖ **Catat Keluar**: Menambah transaksi pengeluaran.
  - 🏷️ **Kategori**: Pengelompokan jenis pengeluaran & pemasukan.
  - 📊 **Laporan**: Ringkasan laporan keuangan secara komprehensif.
- **Grafik Arus Kas 7 Hari**:
  - Visualisasi grafik batang (Bar Chart) arus kas mingguan.
  - *Highlight Tooltip* interaktif yang menampilkan puncak transaksi (misal: `Rp 1,2 jt`).
- **Bottom Navigation Bar**:
  - Navigasi mulus antara menu **Beranda**, **Transaksi**, dan **Profil**.

---

## 🛠️ Teknologi & Stack

- **Bahasa Pemrograman**: Kotlin 2.0+
- **UI Toolkit**: Jetpack Compose (Material 3)
- **Komponen Material**: `androidx.compose.material3`, `material-icons-extended`
- **Min SDK**: API Level 24 (Android 7.0 Nougat)
- **Target SDK**: API Level 34 (Android 14)
- **Build System**: Gradle dengan Kotlin DSL (`build.gradle.kts`)

---

## 📂 Struktur Proyek

```text
app/src/main/java/com/example/moneytrack/
├── MainActivity.kt                      # Entry point & Navigasi State (Login <-> Dashboard)
└── ui/
    ├── screens/
    │   ├── LoginScreen.kt              # Desain UI Halaman Login
    │   └── DashboardScreen.kt          # Desain UI Halaman Dashboard & Bar Chart
    └── theme/
        ├── Color.kt                    # Token Warna UI CatatUang
        └── Theme.kt                    # Custom Material3 Theme
```

---

## 🚀 Cara Menjalankan Proyek

### Persyaratan:
- **Android Studio**: Ladybug / Koala atau versi lebih baru.
- **JDK**: Java 11 atau lebih tinggi.
- **Perangkat**: Emulator Android atau HP Fisik (Android 7.0+).

### Langkah Pemasangan:
1. **Clone / Buka Proyek**:
   Buka direktori proyek ini di Android Studio.
2. **Sync Gradle**:
   Tunggu hingga proses Sync Gradle selesai (`Gradle Sync`).
3. **Jalankan Aplikasi**:
   - Hubungkan HP Android Anda via kabel USB (pastikan *USB Debugging* aktif) atau gunakan Emulator.
   - Pilih nama perangkat di bagian atas Android Studio.
   - Tekan tombol **Run 'app'** (`▶️`) atau tekan `Shift + F10`.

---

## 🎨 Cuplikan Desain (UI Screenshots)

| Halaman Login | Halaman Dashboard |
| :---: | :---: |
| *(Selamat Datang di CatatUang)* | *(Beranda & Total Saldo)* |

---

## 📄 Lisensi
Dipersembahkan untuk pengembangan aplikasi keuangan pribadi modern.
