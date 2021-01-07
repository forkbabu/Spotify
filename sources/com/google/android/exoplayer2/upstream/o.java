package com.google.android.exoplayer2.upstream;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.i;
import com.google.android.exoplayer2.util.m;
import com.google.android.exoplayer2.util.z;
import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class o implements f, a0 {
    public static final Map<String, int[]> n;
    public static final long[] o = {5700000, 3500000, 2000000, 1100000, 470000};
    public static final long[] p = {200000, 148000, 132000, 115000, 95000};
    public static final long[] q = {2200000, 1300000, 970000, 810000, 490000};
    public static final long[] r = {5300000, 3200000, 2000000, 1400000, 690000};
    private static o s;
    private final Context a;
    private final SparseArray<Long> b;
    private final m<f.a> c;
    private final z d;
    private final i e;
    private int f;
    private long g;
    private long h;
    private int i;
    private long j;
    private long k;
    private long l;
    private long m;

    public static final class b {
        private final Context a;
        private SparseArray<Long> b;
        private int c;
        private i d;
        private boolean e;

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(android.content.Context r11) {
            /*
                r10 = this;
                r10.<init>()
                if (r11 != 0) goto L_0x0007
                r0 = 0
                goto L_0x000b
            L_0x0007:
                android.content.Context r0 = r11.getApplicationContext()
            L_0x000b:
                r10.a = r0
                int r0 = com.google.android.exoplayer2.util.f0.a
                if (r11 == 0) goto L_0x002a
                java.lang.String r0 = "phone"
                java.lang.Object r11 = r11.getSystemService(r0)
                android.telephony.TelephonyManager r11 = (android.telephony.TelephonyManager) r11
                if (r11 == 0) goto L_0x002a
                java.lang.String r11 = r11.getNetworkCountryIso()
                boolean r0 = android.text.TextUtils.isEmpty(r11)
                if (r0 != 0) goto L_0x002a
                java.lang.String r11 = com.google.android.exoplayer2.util.f0.R(r11)
                goto L_0x0036
            L_0x002a:
                java.util.Locale r11 = java.util.Locale.getDefault()
                java.lang.String r11 = r11.getCountry()
                java.lang.String r11 = com.google.android.exoplayer2.util.f0.R(r11)
            L_0x0036:
                java.util.Map<java.lang.String, int[]> r0 = com.google.android.exoplayer2.upstream.o.n
                java.lang.Object r11 = r0.get(r11)
                int[] r11 = (int[]) r11
                r0 = 4
                if (r11 != 0) goto L_0x0046
                int[] r11 = new int[r0]
                r11 = {x00a8: FILL_ARRAY_DATA  , data: [2, 2, 2, 2} // fill-array
            L_0x0046:
                android.util.SparseArray r1 = new android.util.SparseArray
                r2 = 6
                r1.<init>(r2)
                r2 = 1000000(0xf4240, double:4.940656E-318)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r3 = 0
                r1.append(r3, r2)
                long[] r2 = com.google.android.exoplayer2.upstream.o.o
                r4 = r11[r3]
                r4 = r2[r4]
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r5 = 2
                r1.append(r5, r4)
                long[] r4 = com.google.android.exoplayer2.upstream.o.p
                r6 = 1
                r7 = r11[r6]
                r7 = r4[r7]
                java.lang.Long r4 = java.lang.Long.valueOf(r7)
                r7 = 3
                r1.append(r7, r4)
                long[] r4 = com.google.android.exoplayer2.upstream.o.q
                r5 = r11[r5]
                r8 = r4[r5]
                java.lang.Long r4 = java.lang.Long.valueOf(r8)
                r1.append(r0, r4)
                r0 = 5
                long[] r4 = com.google.android.exoplayer2.upstream.o.r
                r5 = r11[r7]
                r7 = r4[r5]
                java.lang.Long r4 = java.lang.Long.valueOf(r7)
                r1.append(r0, r4)
                r0 = 7
                r11 = r11[r3]
                r3 = r2[r11]
                java.lang.Long r11 = java.lang.Long.valueOf(r3)
                r1.append(r0, r11)
                r10.b = r1
                r11 = 2000(0x7d0, float:2.803E-42)
                r10.c = r11
                com.google.android.exoplayer2.util.i r11 = com.google.android.exoplayer2.util.i.a
                r10.d = r11
                r10.e = r6
                return
                fill-array 0x00a8: FILL_ARRAY_DATA  , data: [2, 2, 2, 2]
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.o.b.<init>(android.content.Context):void");
        }

        public o a() {
            return new o(this.a, this.b, this.c, this.d, this.e);
        }
    }

    /* access modifiers changed from: private */
    public static class c extends BroadcastReceiver {
        private static c c;
        private final Handler a = new Handler(Looper.getMainLooper());
        private final ArrayList<WeakReference<o>> b = new ArrayList<>();

        private c() {
        }

        public static synchronized c a(Context context) {
            c cVar;
            synchronized (c.class) {
                if (c == null) {
                    c = new c();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(c, intentFilter);
                }
                cVar = c;
            }
            return cVar;
        }

        private void c() {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                if (this.b.get(size).get() == null) {
                    this.b.remove(size);
                }
            }
        }

        public synchronized void b(o oVar) {
            c();
            this.b.add(new WeakReference<>(oVar));
            this.a.post(new a(this, oVar));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                c();
                for (int i = 0; i < this.b.size(); i++) {
                    o oVar = this.b.get(i).get();
                    if (oVar != null) {
                        o.i(oVar);
                    }
                }
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("AD", new int[]{1, 1, 0, 0});
        hashMap.put("AE", new int[]{1, 4, 4, 4});
        hashMap.put("AF", new int[]{4, 4, 3, 3});
        hashMap.put("AG", new int[]{3, 1, 0, 1});
        hashMap.put("AI", new int[]{1, 0, 0, 3});
        hashMap.put("AL", new int[]{1, 2, 0, 1});
        hashMap.put("AM", new int[]{2, 2, 2, 2});
        hashMap.put("AO", new int[]{3, 4, 2, 0});
        hashMap.put("AR", new int[]{2, 3, 2, 2});
        hashMap.put("AS", new int[]{3, 0, 4, 2});
        hashMap.put("AT", new int[]{0, 3, 0, 0});
        hashMap.put("AU", new int[]{0, 3, 0, 1});
        hashMap.put("AW", new int[]{1, 1, 0, 3});
        hashMap.put("AX", new int[]{0, 3, 0, 2});
        hashMap.put("AZ", new int[]{3, 3, 3, 3});
        hashMap.put("BA", new int[]{1, 1, 0, 1});
        hashMap.put("BB", new int[]{0, 2, 0, 0});
        hashMap.put("BD", new int[]{2, 1, 3, 3});
        hashMap.put("BE", new int[]{0, 0, 0, 1});
        hashMap.put("BF", new int[]{4, 4, 4, 1});
        hashMap.put("BG", new int[]{0, 1, 0, 0});
        hashMap.put("BH", new int[]{2, 1, 3, 4});
        hashMap.put("BI", new int[]{4, 4, 4, 4});
        hashMap.put("BJ", new int[]{4, 4, 4, 4});
        hashMap.put("BL", new int[]{1, 0, 2, 2});
        hashMap.put("BM", new int[]{1, 2, 0, 0});
        hashMap.put("BN", new int[]{4, 1, 3, 2});
        hashMap.put("BO", new int[]{1, 2, 3, 2});
        hashMap.put("BQ", new int[]{1, 1, 2, 4});
        hashMap.put("BR", new int[]{2, 3, 3, 2});
        hashMap.put("BS", new int[]{2, 1, 1, 4});
        hashMap.put("BT", new int[]{3, 0, 3, 1});
        hashMap.put("BW", new int[]{4, 4, 1, 2});
        hashMap.put("BY", new int[]{0, 1, 1, 2});
        hashMap.put("BZ", new int[]{2, 2, 2, 1});
        hashMap.put("CA", new int[]{0, 3, 1, 3});
        hashMap.put("CD", new int[]{4, 4, 2, 2});
        hashMap.put("CF", new int[]{4, 4, 3, 0});
        hashMap.put("CG", new int[]{3, 4, 2, 4});
        hashMap.put("CH", new int[]{0, 0, 1, 0});
        hashMap.put("CI", new int[]{3, 4, 3, 3});
        hashMap.put("CK", new int[]{2, 4, 1, 0});
        hashMap.put("CL", new int[]{1, 2, 2, 3});
        hashMap.put("CM", new int[]{3, 4, 3, 1});
        hashMap.put("CN", new int[]{2, 0, 2, 3});
        hashMap.put("CO", new int[]{2, 3, 2, 2});
        hashMap.put("CR", new int[]{2, 3, 4, 4});
        hashMap.put("CU", new int[]{4, 4, 3, 1});
        hashMap.put("CV", new int[]{2, 3, 1, 2});
        hashMap.put("CW", new int[]{1, 1, 0, 0});
        hashMap.put("CY", new int[]{1, 1, 0, 0});
        hashMap.put("CZ", new int[]{0, 1, 0, 0});
        hashMap.put("DE", new int[]{0, 1, 1, 3});
        hashMap.put("DJ", new int[]{4, 3, 4, 1});
        hashMap.put("DK", new int[]{0, 0, 1, 1});
        hashMap.put("DM", new int[]{1, 0, 1, 3});
        hashMap.put("DO", new int[]{3, 3, 4, 4});
        hashMap.put("DZ", new int[]{3, 3, 4, 4});
        hashMap.put("EC", new int[]{2, 3, 4, 3});
        hashMap.put("EE", new int[]{0, 1, 0, 0});
        hashMap.put("EG", new int[]{3, 4, 2, 2});
        hashMap.put("EH", new int[]{2, 0, 3, 3});
        hashMap.put("ER", new int[]{4, 2, 2, 0});
        hashMap.put("ES", new int[]{0, 1, 1, 1});
        hashMap.put("ET", new int[]{4, 4, 4, 0});
        hashMap.put("FI", new int[]{0, 0, 1, 0});
        hashMap.put("FJ", new int[]{3, 0, 3, 3});
        hashMap.put("FK", new int[]{3, 4, 2, 2});
        hashMap.put("FM", new int[]{4, 0, 4, 0});
        hashMap.put("FO", new int[]{0, 0, 0, 0});
        hashMap.put("FR", new int[]{1, 0, 3, 1});
        hashMap.put("GA", new int[]{3, 3, 2, 2});
        hashMap.put("GB", new int[]{0, 1, 3, 3});
        hashMap.put("GD", new int[]{2, 0, 4, 4});
        hashMap.put("GE", new int[]{1, 1, 1, 4});
        hashMap.put("GF", new int[]{2, 3, 4, 4});
        hashMap.put("GG", new int[]{0, 1, 0, 0});
        hashMap.put("GH", new int[]{3, 3, 2, 2});
        hashMap.put("GI", new int[]{0, 0, 0, 1});
        hashMap.put("GL", new int[]{2, 2, 0, 2});
        hashMap.put("GM", new int[]{4, 4, 3, 4});
        hashMap.put("GN", new int[]{3, 4, 4, 2});
        hashMap.put("GP", new int[]{2, 1, 1, 4});
        hashMap.put("GQ", new int[]{4, 4, 3, 0});
        hashMap.put("GR", new int[]{1, 1, 0, 2});
        hashMap.put("GT", new int[]{3, 3, 3, 3});
        hashMap.put("GU", new int[]{1, 2, 4, 4});
        hashMap.put("GW", new int[]{4, 4, 4, 1});
        hashMap.put("GY", new int[]{3, 2, 1, 1});
        hashMap.put("HK", new int[]{0, 2, 3, 4});
        hashMap.put("HN", new int[]{3, 2, 3, 2});
        hashMap.put("HR", new int[]{1, 1, 0, 1});
        hashMap.put("HT", new int[]{4, 4, 4, 4});
        hashMap.put("HU", new int[]{0, 1, 0, 0});
        hashMap.put("ID", new int[]{3, 2, 3, 4});
        hashMap.put("IE", new int[]{1, 0, 1, 1});
        hashMap.put("IL", new int[]{0, 0, 2, 3});
        hashMap.put("IM", new int[]{0, 0, 0, 1});
        hashMap.put("IN", new int[]{2, 2, 4, 4});
        hashMap.put("IO", new int[]{4, 2, 2, 2});
        hashMap.put("IQ", new int[]{3, 3, 4, 2});
        hashMap.put("IR", new int[]{3, 0, 2, 2});
        hashMap.put("IS", new int[]{0, 1, 0, 0});
        hashMap.put("IT", new int[]{1, 0, 1, 2});
        hashMap.put("JE", new int[]{1, 0, 0, 1});
        hashMap.put("JM", new int[]{2, 3, 3, 1});
        hashMap.put("JO", new int[]{1, 2, 1, 2});
        hashMap.put("JP", new int[]{0, 2, 1, 1});
        hashMap.put("KE", new int[]{3, 4, 4, 3});
        hashMap.put("KG", new int[]{1, 1, 2, 2});
        hashMap.put("KH", new int[]{1, 0, 4, 4});
        hashMap.put("KI", new int[]{4, 4, 4, 4});
        hashMap.put("KM", new int[]{4, 3, 2, 3});
        hashMap.put("KN", new int[]{1, 0, 1, 3});
        hashMap.put("KP", new int[]{4, 2, 4, 2});
        hashMap.put("KR", new int[]{0, 1, 1, 1});
        hashMap.put("KW", new int[]{2, 3, 1, 1});
        hashMap.put("KY", new int[]{1, 1, 0, 1});
        hashMap.put("KZ", new int[]{1, 2, 2, 3});
        hashMap.put("LA", new int[]{2, 2, 1, 1});
        hashMap.put("LB", new int[]{3, 2, 0, 0});
        hashMap.put("LC", new int[]{1, 1, 0, 0});
        hashMap.put("LI", new int[]{0, 0, 2, 4});
        hashMap.put("LK", new int[]{2, 1, 2, 3});
        hashMap.put("LR", new int[]{3, 4, 3, 1});
        hashMap.put("LS", new int[]{3, 3, 2, 0});
        hashMap.put("LT", new int[]{0, 0, 0, 0});
        hashMap.put("LU", new int[]{0, 0, 0, 0});
        hashMap.put("LV", new int[]{0, 0, 0, 0});
        hashMap.put("LY", new int[]{4, 4, 4, 4});
        hashMap.put("MA", new int[]{2, 1, 2, 1});
        hashMap.put("MC", new int[]{0, 0, 0, 1});
        hashMap.put("MD", new int[]{1, 1, 0, 0});
        hashMap.put("ME", new int[]{1, 2, 1, 2});
        hashMap.put("MF", new int[]{1, 1, 1, 1});
        hashMap.put("MG", new int[]{3, 4, 2, 2});
        hashMap.put("MH", new int[]{4, 0, 2, 4});
        hashMap.put("MK", new int[]{1, 0, 0, 0});
        hashMap.put("ML", new int[]{4, 4, 2, 0});
        hashMap.put("MM", new int[]{3, 3, 1, 2});
        hashMap.put("MN", new int[]{2, 3, 2, 3});
        hashMap.put("MO", new int[]{0, 0, 4, 4});
        hashMap.put("MP", new int[]{0, 2, 4, 4});
        hashMap.put("MQ", new int[]{2, 1, 1, 4});
        hashMap.put("MR", new int[]{4, 2, 4, 2});
        hashMap.put("MS", new int[]{1, 2, 3, 3});
        hashMap.put("MT", new int[]{0, 1, 0, 0});
        hashMap.put("MU", new int[]{2, 2, 3, 4});
        hashMap.put("MV", new int[]{4, 3, 0, 2});
        hashMap.put("MW", new int[]{3, 2, 1, 0});
        hashMap.put("MX", new int[]{2, 4, 4, 3});
        hashMap.put("MY", new int[]{2, 2, 3, 3});
        hashMap.put("MZ", new int[]{3, 3, 2, 1});
        hashMap.put("NA", new int[]{3, 3, 2, 1});
        hashMap.put("NC", new int[]{2, 0, 3, 3});
        hashMap.put("NE", new int[]{4, 4, 4, 3});
        hashMap.put("NF", new int[]{1, 2, 2, 2});
        hashMap.put("NG", new int[]{3, 4, 3, 1});
        hashMap.put("NI", new int[]{3, 3, 4, 4});
        hashMap.put("NL", new int[]{0, 2, 3, 3});
        hashMap.put("NO", new int[]{0, 1, 1, 0});
        hashMap.put("NP", new int[]{2, 2, 2, 2});
        hashMap.put("NR", new int[]{4, 0, 3, 1});
        hashMap.put("NZ", new int[]{0, 0, 1, 2});
        hashMap.put("OM", new int[]{3, 2, 1, 3});
        hashMap.put("PA", new int[]{1, 3, 3, 4});
        hashMap.put("PE", new int[]{2, 3, 4, 4});
        hashMap.put("PF", new int[]{2, 2, 0, 1});
        hashMap.put("PG", new int[]{4, 3, 3, 1});
        hashMap.put("PH", new int[]{3, 0, 3, 4});
        hashMap.put("PK", new int[]{3, 3, 3, 3});
        hashMap.put("PL", new int[]{1, 0, 1, 3});
        hashMap.put("PM", new int[]{0, 2, 2, 0});
        hashMap.put("PR", new int[]{1, 2, 3, 3});
        hashMap.put("PS", new int[]{3, 3, 2, 4});
        hashMap.put("PT", new int[]{1, 1, 0, 0});
        hashMap.put("PW", new int[]{2, 1, 2, 0});
        hashMap.put("PY", new int[]{2, 0, 2, 3});
        hashMap.put("QA", new int[]{2, 2, 1, 2});
        hashMap.put("RE", new int[]{1, 0, 2, 2});
        hashMap.put("RO", new int[]{0, 1, 1, 2});
        hashMap.put("RS", new int[]{1, 2, 0, 0});
        hashMap.put("RU", new int[]{0, 1, 1, 1});
        hashMap.put("RW", new int[]{4, 4, 2, 4});
        hashMap.put("SA", new int[]{2, 2, 2, 1});
        hashMap.put("SB", new int[]{4, 4, 3, 0});
        hashMap.put("SC", new int[]{4, 2, 0, 1});
        hashMap.put("SD", new int[]{4, 4, 4, 3});
        hashMap.put("SE", new int[]{0, 1, 0, 0});
        hashMap.put("SG", new int[]{0, 2, 3, 3});
        hashMap.put("SH", new int[]{4, 4, 2, 3});
        hashMap.put("SI", new int[]{0, 0, 0, 0});
        hashMap.put("SJ", new int[]{2, 0, 2, 4});
        hashMap.put("SK", new int[]{0, 1, 0, 0});
        hashMap.put("SL", new int[]{4, 3, 3, 3});
        hashMap.put("SM", new int[]{0, 0, 2, 4});
        hashMap.put("SN", new int[]{3, 4, 4, 2});
        hashMap.put("SO", new int[]{3, 4, 4, 3});
        hashMap.put("SR", new int[]{2, 2, 1, 0});
        hashMap.put("SS", new int[]{4, 3, 4, 3});
        hashMap.put("ST", new int[]{3, 4, 2, 2});
        hashMap.put("SV", new int[]{2, 3, 3, 4});
        hashMap.put("SX", new int[]{2, 4, 1, 0});
        hashMap.put("SY", new int[]{4, 3, 2, 1});
        hashMap.put("SZ", new int[]{4, 4, 3, 4});
        hashMap.put("TC", new int[]{1, 2, 1, 1});
        hashMap.put("TD", new int[]{4, 4, 4, 2});
        hashMap.put("TG", new int[]{3, 3, 1, 0});
        hashMap.put("TH", new int[]{1, 3, 4, 4});
        hashMap.put("TJ", new int[]{4, 4, 4, 4});
        hashMap.put("TL", new int[]{4, 2, 4, 4});
        hashMap.put("TM", new int[]{4, 1, 2, 2});
        hashMap.put("TN", new int[]{2, 2, 1, 2});
        hashMap.put("TO", new int[]{3, 3, 3, 1});
        hashMap.put("TR", new int[]{2, 2, 1, 2});
        hashMap.put("TT", new int[]{1, 3, 1, 2});
        hashMap.put("TV", new int[]{4, 2, 2, 4});
        hashMap.put("TW", new int[]{0, 0, 0, 0});
        hashMap.put("TZ", new int[]{3, 3, 4, 3});
        hashMap.put("UA", new int[]{0, 2, 1, 2});
        hashMap.put("UG", new int[]{4, 3, 3, 2});
        hashMap.put("US", new int[]{1, 1, 3, 3});
        hashMap.put("UY", new int[]{2, 2, 1, 1});
        hashMap.put("UZ", new int[]{2, 2, 2, 2});
        hashMap.put("VA", new int[]{1, 2, 4, 2});
        hashMap.put("VC", new int[]{2, 0, 2, 4});
        hashMap.put("VE", new int[]{4, 4, 4, 3});
        hashMap.put("VG", new int[]{3, 0, 1, 3});
        hashMap.put("VI", new int[]{1, 1, 4, 4});
        hashMap.put("VN", new int[]{0, 2, 4, 4});
        hashMap.put("VU", new int[]{4, 1, 3, 1});
        hashMap.put("WS", new int[]{3, 3, 3, 2});
        hashMap.put("XK", new int[]{1, 2, 1, 0});
        hashMap.put("YE", new int[]{4, 4, 4, 3});
        hashMap.put("YT", new int[]{2, 2, 2, 3});
        hashMap.put("ZA", new int[]{2, 4, 2, 2});
        hashMap.put("ZM", new int[]{3, 2, 2, 1});
        hashMap.put("ZW", new int[]{3, 3, 2, 1});
        n = Collections.unmodifiableMap(hashMap);
    }

    static void i(o oVar) {
        int i2;
        synchronized (oVar) {
            Context context = oVar.a;
            if (context == null) {
                i2 = 0;
            } else {
                i2 = f0.r(context);
            }
            if (oVar.i != i2) {
                oVar.i = i2;
                if (i2 != 1 && i2 != 0 && i2 != 8) {
                    oVar.l = oVar.j(i2);
                    long b2 = oVar.e.b();
                    oVar.l(oVar.f > 0 ? (int) (b2 - oVar.g) : 0, oVar.h, oVar.l);
                    oVar.g = b2;
                    oVar.h = 0;
                    oVar.k = 0;
                    oVar.j = 0;
                    oVar.d.c();
                }
            }
        }
    }

    private long j(int i2) {
        Long l2 = this.b.get(i2);
        if (l2 == null) {
            l2 = this.b.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    public static synchronized o k(Context context) {
        o oVar;
        synchronized (o.class) {
            if (s == null) {
                s = new b(context).a();
            }
            oVar = s;
        }
        return oVar;
    }

    private void l(int i2, long j2, long j3) {
        if (i2 != 0 || j2 != 0 || j3 != this.m) {
            this.m = j3;
            this.c.b(new b(i2, j2, j3));
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a0
    public synchronized void a(k kVar, m mVar, boolean z) {
        if (z) {
            g.m(this.f > 0);
            long b2 = this.e.b();
            int i2 = (int) (b2 - this.g);
            this.j += (long) i2;
            long j2 = this.k;
            long j3 = this.h;
            this.k = j2 + j3;
            if (i2 > 0) {
                this.d.a((int) Math.sqrt((double) j3), (((float) j3) * 8000.0f) / ((float) i2));
                if (this.j >= 2000 || this.k >= 524288) {
                    this.l = (long) this.d.b(0.5f);
                }
                l(i2, this.h, this.l);
                this.g = b2;
                this.h = 0;
            }
            this.f--;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.f
    public a0 b() {
        return this;
    }

    @Override // com.google.android.exoplayer2.upstream.f
    public void c(f.a aVar) {
        this.c.c(aVar);
    }

    @Override // com.google.android.exoplayer2.upstream.f
    public synchronized long d() {
        return this.l;
    }

    @Override // com.google.android.exoplayer2.upstream.a0
    public synchronized void e(k kVar, m mVar, boolean z, int i2) {
        if (z) {
            this.h += (long) i2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.f
    public void f(Handler handler, f.a aVar) {
        this.c.a(handler, aVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a0
    public synchronized void g(k kVar, m mVar, boolean z) {
        if (z) {
            if (this.f == 0) {
                this.g = this.e.b();
            }
            this.f++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a0
    public void h(k kVar, m mVar, boolean z) {
    }

    @Deprecated
    public o() {
        this(null, new SparseArray(), SnackbarUtilsKt.SNACKBAR_ACTION_DURATION, i.a, false);
    }

    private o(Context context, SparseArray<Long> sparseArray, int i2, i iVar, boolean z) {
        Context context2;
        int i3;
        if (context == null) {
            context2 = null;
        } else {
            context2 = context.getApplicationContext();
        }
        this.a = context2;
        this.b = sparseArray;
        this.c = new m<>();
        this.d = new z(i2);
        this.e = iVar;
        if (context == null) {
            i3 = 0;
        } else {
            i3 = f0.r(context);
        }
        this.i = i3;
        this.l = j(i3);
        if (context != null && z) {
            c.a(context).b(this);
        }
    }
}
