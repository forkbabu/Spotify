package com.google.android.datatransport.cct.a;

import android.util.SparseArray;
import com.google.android.datatransport.cct.a.i;

public abstract class zzt {

    public static abstract class a {
        public abstract a a(zzb zzb);

        public abstract a b(zzc zzc);

        public abstract zzt c();
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class zzb extends Enum<zzb> {
        public static final zzb A;
        public static final zzb B;
        public static final zzb C;
        public static final zzb D = new zzb("COMBINED", 20, 100);
        private static final SparseArray<zzb> E;
        public static final zzb a;
        public static final zzb b;
        public static final zzb c;
        public static final zzb f;
        public static final zzb n;
        public static final zzb o;
        public static final zzb p;
        public static final zzb q;
        public static final zzb r;
        public static final zzb s;
        public static final zzb t;
        public static final zzb u;
        public static final zzb v;
        public static final zzb w;
        public static final zzb x;
        public static final zzb y;
        public static final zzb z;
        private final int zzw;

        static {
            zzb zzb = new zzb("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
            a = zzb;
            zzb zzb2 = new zzb("GPRS", 1, 1);
            b = zzb2;
            zzb zzb3 = new zzb("EDGE", 2, 2);
            c = zzb3;
            zzb zzb4 = new zzb("UMTS", 3, 3);
            f = zzb4;
            zzb zzb5 = new zzb("CDMA", 4, 4);
            n = zzb5;
            zzb zzb6 = new zzb("EVDO_0", 5, 5);
            o = zzb6;
            zzb zzb7 = new zzb("EVDO_A", 6, 6);
            p = zzb7;
            zzb zzb8 = new zzb("RTT", 7, 7);
            q = zzb8;
            zzb zzb9 = new zzb("HSDPA", 8, 8);
            r = zzb9;
            zzb zzb10 = new zzb("HSUPA", 9, 9);
            s = zzb10;
            zzb zzb11 = new zzb("HSPA", 10, 10);
            t = zzb11;
            zzb zzb12 = new zzb("IDEN", 11, 11);
            u = zzb12;
            zzb zzb13 = new zzb("EVDO_B", 12, 12);
            v = zzb13;
            zzb zzb14 = new zzb("LTE", 13, 13);
            w = zzb14;
            zzb zzb15 = new zzb("EHRPD", 14, 14);
            x = zzb15;
            zzb zzb16 = new zzb("HSPAP", 15, 15);
            y = zzb16;
            zzb zzb17 = new zzb("GSM", 16, 16);
            z = zzb17;
            zzb zzb18 = new zzb("TD_SCDMA", 17, 17);
            A = zzb18;
            zzb zzb19 = new zzb("IWLAN", 18, 18);
            B = zzb19;
            zzb zzb20 = new zzb("LTE_CA", 19, 19);
            C = zzb20;
            SparseArray<zzb> sparseArray = new SparseArray<>();
            E = sparseArray;
            sparseArray.put(0, zzb);
            sparseArray.put(1, zzb2);
            sparseArray.put(2, zzb3);
            sparseArray.put(3, zzb4);
            sparseArray.put(4, zzb5);
            sparseArray.put(5, zzb6);
            sparseArray.put(6, zzb7);
            sparseArray.put(7, zzb8);
            sparseArray.put(8, zzb9);
            sparseArray.put(9, zzb10);
            sparseArray.put(10, zzb11);
            sparseArray.put(11, zzb12);
            sparseArray.put(12, zzb13);
            sparseArray.put(13, zzb14);
            sparseArray.put(14, zzb15);
            sparseArray.put(15, zzb16);
            sparseArray.put(16, zzb17);
            sparseArray.put(17, zzb18);
            sparseArray.put(18, zzb19);
            sparseArray.put(19, zzb20);
        }

        private zzb(String str, int i, int i2) {
            this.zzw = i2;
        }

        public static zzb d(int i) {
            return E.get(i);
        }

        public int a() {
            return this.zzw;
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class zzc extends Enum<zzc> {
        public static final zzc A;
        public static final zzc B;
        private static final SparseArray<zzc> C;
        public static final zzc a;
        public static final zzc b;
        public static final zzc c;
        public static final zzc f;
        public static final zzc n;
        public static final zzc o;
        public static final zzc p;
        public static final zzc q;
        public static final zzc r;
        public static final zzc s;
        public static final zzc t;
        public static final zzc u;
        public static final zzc v;
        public static final zzc w;
        public static final zzc x;
        public static final zzc y;
        public static final zzc z;
        private final int zzu;

        static {
            zzc zzc = new zzc("MOBILE", 0, 0);
            a = zzc;
            zzc zzc2 = new zzc("WIFI", 1, 1);
            b = zzc2;
            zzc zzc3 = new zzc("MOBILE_MMS", 2, 2);
            c = zzc3;
            zzc zzc4 = new zzc("MOBILE_SUPL", 3, 3);
            f = zzc4;
            zzc zzc5 = new zzc("MOBILE_DUN", 4, 4);
            n = zzc5;
            zzc zzc6 = new zzc("MOBILE_HIPRI", 5, 5);
            o = zzc6;
            zzc zzc7 = new zzc("WIMAX", 6, 6);
            p = zzc7;
            zzc zzc8 = new zzc("BLUETOOTH", 7, 7);
            q = zzc8;
            zzc zzc9 = new zzc("DUMMY", 8, 8);
            r = zzc9;
            zzc zzc10 = new zzc("ETHERNET", 9, 9);
            s = zzc10;
            zzc zzc11 = new zzc("MOBILE_FOTA", 10, 10);
            t = zzc11;
            zzc zzc12 = new zzc("MOBILE_IMS", 11, 11);
            u = zzc12;
            zzc zzc13 = new zzc("MOBILE_CBS", 12, 12);
            v = zzc13;
            zzc zzc14 = new zzc("WIFI_P2P", 13, 13);
            w = zzc14;
            zzc zzc15 = new zzc("MOBILE_IA", 14, 14);
            x = zzc15;
            zzc zzc16 = new zzc("MOBILE_EMERGENCY", 15, 15);
            y = zzc16;
            zzc zzc17 = new zzc("PROXY", 16, 16);
            z = zzc17;
            zzc zzc18 = new zzc("VPN", 17, 17);
            A = zzc18;
            zzc zzc19 = new zzc("NONE", 18, -1);
            B = zzc19;
            SparseArray<zzc> sparseArray = new SparseArray<>();
            C = sparseArray;
            sparseArray.put(0, zzc);
            sparseArray.put(1, zzc2);
            sparseArray.put(2, zzc3);
            sparseArray.put(3, zzc4);
            sparseArray.put(4, zzc5);
            sparseArray.put(5, zzc6);
            sparseArray.put(6, zzc7);
            sparseArray.put(7, zzc8);
            sparseArray.put(8, zzc9);
            sparseArray.put(9, zzc10);
            sparseArray.put(10, zzc11);
            sparseArray.put(11, zzc12);
            sparseArray.put(12, zzc13);
            sparseArray.put(13, zzc14);
            sparseArray.put(14, zzc15);
            sparseArray.put(15, zzc16);
            sparseArray.put(16, zzc17);
            sparseArray.put(17, zzc18);
            sparseArray.put(-1, zzc19);
        }

        private zzc(String str, int i, int i2) {
            this.zzu = i2;
        }

        public static zzc d(int i) {
            return C.get(i);
        }

        public int a() {
            return this.zzu;
        }
    }

    public static a a() {
        return new i.a();
    }

    public abstract zzb b();

    public abstract zzc c();
}
