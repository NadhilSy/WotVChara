package com.nadhil.wotvchara;

import java.util.ArrayList;

public class UnitData {

    private static String[] unitNames = {"Agrias Oaks", "Cidolfus Orlandeau", "Dario Hourne", "Delita Heiral"
            , "Fina","Gilgamesh", "Mont Leonis", "Nasha", "Rain", "Ramza Beoulve", "Raviesse","Viktora","Warrior of Light","'Whisper'"};
    private static  String[] seriesFF = {"Final Fantasy Tactics : War of The Lion", "Final Fantasy Tactics : War of the Lion","War of The Vision: Final Fantasy Brave Exvius",
            "Final Fantasy Tactics : War of The Lion","Final Fantasy Brave Exvius","War of The Vision: Final Fantasy Brave Exvius","War of The Vision: Final Fantasy Brave Exvius", "War of The Vision: Final Fantasy Brave Exvius","Final Fantasy Brave Exvius"
            ,"Final Fantasy Tactics : War of the Lion", "War of The Vision: Final Fantasy Brave Exvius","War of The Vision: Final Fantasy Brave Exvius","Final Fantasy","War of The Vision: Final Fantasy Brave Exvius"};

    private static String[] unitDetails = {"Seorang ksatria pengawal kerajaan milik keluarga kerajaan Atkascha dan pengawal pribadi Putri Ovelia. Dia muncul dalam legenda Batu Zodiak, sebuah cerita yang diturunkan di dunia lain Ivalice. Dia dikenal karena kebangsawanan semangat, kesetiaan yang luar biasa, dan rasa keadilan yang kuat. Karena itu, dia tidak bisa tidak mengasihani Ovelia, yang terus diombang-ambingkan oleh kekacauan dunia.",
            "Seorang kesatria dengan reputasi menakutkan di antara musuh-musuhnya karena menjadi jenderal yang tak terkalahkan dalam Perang Lima Puluh Tahun. Dia muncul dalam legenda Batu Zodiak, sebuah cerita yang diturunkan di dunia lain Ivalice. Dia berjuang untuk kebaikan rakyat, tidak pernah demi merebut kekuasaan dan tetap menentang dengan gigih War of the Lions dan peristiwa politik yang memicunya.",
            "Pangeran dari Hourne dan kakak laki-laki Machérie. Meskipun diberkati kemampuan mantra sihir (Spellblade) alami, dia membenci pertempuran lebih dari ayahnya dan tidak memiliki keinginan untuk menggantikan tahta. Sebelum Machérie dikirim untuk menikah, Dario menerima putri raja Fennes, Vinera, sebagai putrinya.",
            "Putra seorang petani yang melayani Bangsawan Beoulve. Dia muncul dalam legenda Batu Zodiak, sebuah cerita yang diturunkan di dunia lain Ivalice. Ayah Ramza, Barbaneth, membawanya masuk setelah kematian orang tuanya. Berkat kebaikannya inilah dia dapat menghadiri Akademy, sebuah institusi yang biasanya hanya tersedia untuk bangsawan muda",
            "Seorang gadis muda yang muncul dari dalam kristal tanpa ingatan masa lalunya, menyimpan namanya sendiri. Meskipun dia menunjukkan kepolosan dan keingintahuan seorang anak, kehebatannya dengan sihir putih dan memanah menunjukkan bahwa ada lebih dari yang dia sendiri pahami.", "Makhluk yang dikelilingi misteri yang sayap bajanya dikatakan melampaui tidak hanya ruang, tetapi juga waktu. Dia mempercayakan Leonis dengan peran sebagai 'penjaga' dan mencoba menghasut raja-raja di setiap negara untuk mempersiapkan 'waktu penghakiman' yang akan datang",
            "Kembar yang lebih tua lahir dari Raja Oelde dan Ratu Helena dari Leonis. Dia tidak menyukai perang dan percaya pada koeksistensi daripada kekuasaan dan penaklukan. Setelah bertemu Machérie, Putri Hourne, dia menyadari bahwa dia perlu menjadi lebih kuat untuk melindungi orang yang dia cintai.",
            "Karena cintanya pada Pangeran Sterne dari Leonis, dia menolak pernikahan yang diatur oleh orang tuanya dan meninggalkan kampung halamannya. Selama ujian pendaftaran untuk «Fortem», divisi yang dipimpin oleh Sterne, dia menuju ke skeleton's den, tapi, karena tidak tahu arah, dia tersesat di dalam gua.",
            "Seorang ksatria Kerajaan Grandshelt. Seorang pilot dewasa sebelum waktunya yang dipercayakan dengan komando sebuah pesawat pada usia delapan belas tahun, ia mempertahankan sikap riang — beberapa mungkin mengatakan sikap malas dan lesu. Dia memiliki kepercayaan yang tak tergoyahkan dari raja dan rakyat, sebagian besar karena reputasi ayahnya sebagai seorang ksatria kerajaan yang kuat.",
            "Putra ketiga dari keluarga militer House Beoulve yang terkenal. Dia muncul dalam legenda Batu Zodiak, sebuah cerita yang diturunkan di dunia lain Ivalice. Setelah banyak pelatihan, ia mencapai gelar ksatria di Akademi Militer Kerajaan. Namun, terlahir dari ibu yang berbeda dari kakak laki-lakinya, yang sudah menduduki jabatan penting di Ordo, dia masih merasa agak rendah diri dengan kehadiran mereka",
            "Seorang pendekar pedang yang menjelajahi tanah sendirian setelah kehilangan orang tua dan adik laki-lakinya. Dia berkelana ke timur jauh untuk tujuan tertentu dan memberi tahu Owe dan Seymore bahwa dia ingin menjadi samurai dari timur, tapi apa tujuan sebenarnya ...?",
            "Seorang 'dragoon' menjelajahi negeri yang tidak suka menghabiskan uang untuk hal-hal selain penampilannya sendiri. Dia menjawab undangan Raja Khury untuk kembali ke tanah airnya di Wezette, dan dia pada gilirannya berjanji dia akan menjadi ratu jika dia memimpin Wezette menuju kemenangan.",
            "Pahlawan hebat yang dinyanyikan dalam dongeng dari dunia yang jauh. Empat Prajurit Cahaya, tanpa ingatan untuk dibicarakan, masing-masing memiliki kristal yang telah kehilangan cahayanya. Mereka menyadari bahwa kristal yang mereka pegang terkait erat untuk menopang dunia mereka dan memulai perjalanan untuk menanamkan cahaya baru kepada mereka.",
            "Seorang wanita ciptaan Sadali yang terus-menerus mengikutinya seperti bayangan, bertindak sebagai pengawal pribadinya. Bibir merah darahnya tidak mengucapkan kata-kata tetapi dikatakan membentuk setengah senyum setelah dia membunuh seseorang yang telah menganiaya tuannya."};

    private static int[] unitImages = {R.drawable.ur_agria, R.drawable.ur_cid, R.drawable.mr_dario,R.drawable.ur_delita, R.drawable.mr_fina,R.drawable.ur_gilga, R.drawable.mr_mont,
    R.drawable.mr_nasha, R.drawable.ur_rain, R.drawable.ur_ramza, R.drawable.mr_ravi,R.drawable.ur_viktora, R.drawable.ur_wol, R.drawable.ur_whisper};
    private static int[] tabelImages = {R.drawable.agrias_xl, R.drawable.cidolfus_xl, R.drawable.dario_xl,R.drawable.delita_xl, R.drawable.fina_xl,R.drawable.gilga_xl, R.drawable.mont_xl, R.drawable.nasha_xl, R.drawable.rain_xl,R.drawable.ramza_xl, R.drawable.raviesse_xl,R.drawable.viktora_xl, R.drawable.wol_xl,R.drawable.whisper_xl};

    private  static String[] limitNames = {"Candescent Hew", "Swordplay: Thunder God", null,"Three-Stage Hallowed Bolt of Truth",null,"Flash",
            "Destiny's Cross", null, "Shining Nova", "Ultima", null,"Enchanting Trap", "Crystal Braver","White Wave"};

    private static String[] LimitVid = {"o-xgayEoUNc", "ApNkUixtBmI", null, "CVcsVUqB1Ec",null,"UguEnsTxOOc", "1CKCV6HRQPA", null, "yCo2_9fG0c8", "ieR6K_Oel9o", null,"uyE-pPgITWk", "lmqVDErnLEI","7Sr4jYTXiMM"};
    private static int[] skillDraw = {R.drawable.agrias_sk, R.drawable.cid_sk, 0,R.drawable.delita_sk ,0, R.drawable.gilga_sk, R.drawable.mont_sk, 0, R.drawable.rain_sk, R.drawable.ramza_sk,0,R.drawable.viktora_sk, R.drawable.wol_sk, R.drawable.whisper_sk};
    private static String[] skillDes = {"Memberikan Damage (L) ke target dalam jangkauan & kemungkinan menimbulkan 'Confusion' selama 3 putaran"
            ,"Memberikan Damage (L) ke target dalam jangkauan & memberikan 'Haste' pada diri sendiri selama 3 putaran"
            ,null
            ,"Memberikan Damage (L) ke target dalam jangkauan & kemungkinan menimbulkan 'Silent' selama 3 putaran"
            ,null
            ,"Memberikan Damage (L) ke target dalam jangkauan berdasarkan stat MAG & peluang menimbulkan 'Slow' selama 3 putaran"
            ,"Memberikan Damage (L) ke target dalam jangkauan"
            ,null
            ,"Menurunkan Resistansi Api target selama 3 putaran, lalu memberikan Damage 2-Hit (L) berdasarkan stat MAG"
            ,"Memberikan Damage Non-Elemental (L) ke target dalam jangkauan berdasarkan statistik MAG & Terjamin Hit."
            ,null
            ,"Memberikan Damage (L) ke target dalam area di sekitar diri & peluang menimbulkan 'Charm' selama 3 putaran"
            ,"Memberikan 3-Hit Damage (M) ke target dalam jangkauan & memberikan efek status (Protect / Shell) pada diri sendiri selama 3 putaran"
            ,"Memberikan Damage (L) ke target dalam area sekitar diri & menurunkan 'Bravery'"};

    private static int[] element = {R.drawable.el_ice,R.drawable.el_thunder,R.drawable.el_wind,R.drawable.el_fire,R.drawable.el_light,R.drawable.el_ice,R.drawable.el_earth,R.drawable.el_ice,R.drawable.el_fire,R.drawable.el_light,R.drawable.el_thunder,R.drawable.el_ice,R.drawable.el_light,R.drawable.el_dark};
    private static int[] rarity = {R.drawable.ur,R.drawable.ur,R.drawable.mr,R.drawable.ur,R.drawable.mr,R.drawable.ur,R.drawable.mr,R.drawable.mr,R.drawable.ur,R.drawable.ur,R.drawable.mr,R.drawable.ur,R.drawable.ur,R.drawable.ur};

    static ArrayList<Unit> getListData(){
        ArrayList<Unit> list = new ArrayList<>();
        for (int position = 0; position < unitNames.length; position++){
            Unit unit = new Unit();
            if (limitNames[position] == null){
                limitNames[position] = "[Tidak Ada Limit Burst]";
            }
            unit.setSkillDes(skillDes[position]);
            unit.setSkillDraw(skillDraw[position]);
            unit.setName(unitNames[position]);
            unit.setDetail(unitDetails[position]);
            unit.setPhoto(unitImages[position]);
            unit.setSeries(seriesFF[position]);
            list.add(unit);
            unit.setTabel(tabelImages[position]);
            unit.setLimName(limitNames[position]);
            unit.setLimVideo(LimitVid[position]);
            unit.setRarity(rarity[position]);
            unit.setElement(element[position]);

        }

        return list;
    }


}
