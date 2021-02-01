# Remake bibit - Refinaldy Madras 1800018411 RKS H

### Deskripsi
Aplikasi bibit adalah aplikasi yang bertujuan untuk menghubungkan investor dengan manajer invesstasi, sehingga 
investor pemula dapat bertransaksi dengan mudah, adapun instrumen investasi yang disediakan oleh aplikasi ini adalah reksa dana.

Aplikasi ini dibuat dengan menggunakan platform [Android](https://www.android.com/intl/id_id/) dengan bahasa [Kotlin](https://developer.android.com/kotlin?hl=id) dan untuk layout juga dibantu dengan [Material Design](material.io) dari Google, data yang ada di dalam aplikasi
adalah data dummy, data tersebut digunakan untuk kepentingan uji coba front-end pada aplikasi ini dan bukan data sebenarnya.

### Pra-Produksi
[Workflow, Rincian kebutuhan, dan Wireframe](https://drive.google.com/drive/folders/1LC09GQ_MdO6Xkb-p9kguW5UHGFiVrguw?usp=sharing)

[Figma](https://www.figma.com/file/MXwbOZ6pyjp2xi0vOJutRc/RKS-18000184111?node-id=0%3A1)

### Keterangan package

Package :

[activity](https://github.com/refinaldy7/remake-bibit/tree/master/app/src/main/java/com/refinaldy/newbibit/activity) package ini berisikan activity yang ada, isinya hanya dua file activity karena pada aplikasi ini lebih cocok menggunakan fragment dikarenakan sedikit kompleks.

[adapter](https://github.com/refinaldy7/remake-bibit/tree/master/app/src/main/java/com/refinaldy/newbibit/adapter) package ini berisikan adapter yang menghubungkan data dummy dengan recycler view pada list fragment

[dummyData](https://github.com/refinaldy7/remake-bibit/tree/master/app/src/main/java/com/refinaldy/newbibit/dummydata) package ini berisikan dummy data beserta view holder

[listFragment](https://github.com/refinaldy7/remake-bibit/tree/master/app/src/main/java/com/refinaldy/newbibit/listfragment) package ini berisikan fragment untuk list dummy data yang ada

[menuFragment](https://github.com/refinaldy7/remake-bibit/tree/master/app/src/main/java/com/refinaldy/newbibit/menu_fragment) package ini berisikan fragment untuk mengisikan main activity (mengisi tiap menu yang ada pada bottom navigation bar)

[sheetFragment](https://github.com/refinaldy7/remake-bibit/tree/master/app/src/main/java/com/refinaldy/newbibit/sheet_fragment) package ini untuk seluruh action sheet yang ada pada aplikasi.

[Layout](https://github.com/refinaldy7/remake-bibit/tree/master/app/src/main/res/layout) Seluruh resource untuk layout tiap activity, sheet, dan fragment.


### Preview Aplikasi
![Preview Aplikasi](ezgif.com-video-to-gif.gif)


### Kesimpulan
Aplikasi yang dibuat 90% sama dengan aplikasi yang telah dirancang pada bagian pra-produksi, adapun perbedaan yang ada
disebabkan penambahan beberapa sheet pada bagian pembayaran dan juga penambahan story untuk user melihat detail order mereka.
