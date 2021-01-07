package com.google.android.exoplayer2.util;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.l;
import com.google.android.exoplayer2.audio.m;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.video.r;
import com.google.android.exoplayer2.video.s;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.mobile.android.video.exo.u;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f0 {
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f = new byte[0];
    private static final Pattern g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    private static final Pattern h = Pattern.compile("%([A-Fa-f0-9]{2})");
    private static HashMap<String, String> i;
    private static final String[] j = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "slo", "sk", "wel", "cy"};
    private static final int[] k = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    static class a implements s {
        a() {
        }

        @Override // com.google.android.exoplayer2.video.s
        public /* synthetic */ void H(ej ejVar) {
            r.d(this, ejVar);
        }

        @Override // com.google.android.exoplayer2.video.s
        public /* synthetic */ void Q(int i, long j) {
            r.a(this, i, j);
        }

        @Override // com.google.android.exoplayer2.video.s
        public /* synthetic */ void V(ej ejVar) {
            r.e(this, ejVar);
        }

        @Override // com.google.android.exoplayer2.video.s
        public /* synthetic */ void h(int i, int i2, int i3, float f) {
            r.g(this, i, i2, i3, f);
        }

        @Override // com.google.android.exoplayer2.video.s
        public /* synthetic */ void m(String str, long j, long j2) {
            r.c(this, str, j, j2);
        }

        @Override // com.google.android.exoplayer2.video.s
        public /* synthetic */ void p(Surface surface) {
            r.b(this, surface);
        }

        @Override // com.google.android.exoplayer2.video.s
        public /* synthetic */ void z(d0 d0Var) {
            r.f(this, d0Var);
        }
    }

    static class b implements m {
        b() {
        }

        @Override // com.google.android.exoplayer2.audio.m
        public /* synthetic */ void C(int i, long j, long j2) {
            l.f(this, i, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.m
        public /* synthetic */ void N(ej ejVar) {
            l.b(this, ejVar);
        }

        @Override // com.google.android.exoplayer2.audio.m
        public /* synthetic */ void W(d0 d0Var) {
            l.d(this, d0Var);
        }

        @Override // com.google.android.exoplayer2.audio.m
        public /* synthetic */ void b(int i) {
            l.e(this, i);
        }

        @Override // com.google.android.exoplayer2.audio.m
        public /* synthetic */ void l(ej ejVar) {
            l.c(this, ejVar);
        }

        @Override // com.google.android.exoplayer2.audio.m
        public /* synthetic */ void r(String str, long j, long j2) {
            l.a(this, str, j, j2);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2;
        String str = Build.DEVICE;
        b = str;
        String str2 = Build.MANUFACTURER;
        c = str2;
        String str3 = Build.MODEL;
        d = str3;
        e = str + ", " + str3 + ", " + str2 + ", " + i2;
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    }

    public static boolean A(int i2) {
        return i2 == Integer.MIN_VALUE || i2 == 1073741824;
    }

    public static boolean B(int i2) {
        return i2 == 3 || i2 == 2 || i2 == Integer.MIN_VALUE || i2 == 1073741824 || i2 == 4;
    }

    public static boolean C(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean D(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static String E(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (a >= 21) {
            replace = Locale.forLanguageTag(replace).toLanguageTag();
        }
        if (!replace.isEmpty() && !"und".equals(replace)) {
            str = replace;
        }
        String Q = Q(str);
        int i2 = 0;
        String str2 = N(Q, "-")[0];
        if (str2.length() != 3) {
            return Q;
        }
        if (i == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + j.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            while (true) {
                String[] strArr = j;
                if (i2 >= strArr.length) {
                    break;
                }
                hashMap.put(strArr[i2], strArr[i2 + 1]);
                i2 += 2;
            }
            i = hashMap;
        }
        String str4 = i.get(str2);
        if (str4 == null) {
            return Q;
        }
        StringBuilder V0 = je.V0(str4);
        V0.append(Q.substring(3));
        return V0.toString();
    }

    public static <T> T[] F(T[] tArr, int i2) {
        g.a(i2 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i2);
    }

    public static <T> T[] G(T[] tArr, int i2, int i3) {
        boolean z = false;
        g.a(i2 >= 0);
        if (i3 <= tArr.length) {
            z = true;
        }
        g.a(z);
        return (T[]) Arrays.copyOfRange(tArr, i2, i3);
    }

    public static long H(String str) {
        Matcher matcher = g.matcher(str);
        if (matcher.matches()) {
            int i2 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i2 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                if ("-".equals(matcher.group(11))) {
                    i2 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                StringBuilder V0 = je.V0("0.");
                V0.append(matcher.group(8));
                gregorianCalendar.set(14, new BigDecimal(V0.toString()).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i2 != 0 ? timeInMillis - ((long) (i2 * 60000)) : timeInMillis;
        }
        throw new ParserException(je.x0("Invalid date/time format: ", str));
    }

    public static <T> void I(List<T> list, int i2, int i3) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            throw new IllegalArgumentException();
        } else if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    public static long J(long j2, t0 t0Var, long j3, long j4) {
        if (t0.c.equals(t0Var)) {
            return j2;
        }
        long j5 = t0Var.a;
        long j6 = Long.MIN_VALUE;
        long j7 = j2 - j5;
        if (((j5 ^ j2) & (j2 ^ j7)) >= 0) {
            j6 = j7;
        }
        long j8 = t0Var.b;
        long j9 = Long.MAX_VALUE;
        long j10 = j2 + j8;
        if (((j8 ^ j10) & (j2 ^ j10)) >= 0) {
            j9 = j10;
        }
        boolean z = false;
        boolean z2 = j6 <= j3 && j3 <= j9;
        if (j6 <= j4 && j4 <= j9) {
            z = true;
        }
        if (z2 && z) {
            return Math.abs(j3 - j2) <= Math.abs(j4 - j2) ? j3 : j4;
        }
        if (z2) {
            return j3;
        }
        return z ? j4 : j6;
    }

    public static long K(long j2, long j3, long j4) {
        if (j4 >= j3 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return (j3 / j4) * j2;
        }
        double d2 = (double) j3;
        double d3 = (double) j4;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = (double) j2;
        Double.isNaN(d4);
        return (long) (d4 * (d2 / d3));
    }

    public static void L(long[] jArr, long j2, long j3) {
        int i2 = 0;
        if (j3 >= j2 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
        } else if (j3 >= j2 || j2 % j3 != 0) {
            double d2 = (double) j2;
            double d3 = (double) j3;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = d2 / d3;
            while (i2 < jArr.length) {
                double d5 = (double) jArr[i2];
                Double.isNaN(d5);
                jArr[i2] = (long) (d5 * d4);
                i2++;
            }
        } else {
            long j5 = j2 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j5;
                i2++;
            }
        }
    }

    public static String[] M(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] N(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] O(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return M(str.trim(), "(\\s*,\\s*)");
    }

    public static int[] P(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = list.get(i2).intValue();
        }
        return iArr;
    }

    public static String Q(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    public static String R(String str) {
        return str == null ? str : str.toUpperCase(Locale.US);
    }

    public static String S(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.charAt(i4) == '%') {
                i3++;
            }
        }
        if (i3 == 0) {
            return str;
        }
        int i5 = length - (i3 * 2);
        StringBuilder sb = new StringBuilder(i5);
        Matcher matcher = h.matcher(str);
        while (i3 > 0 && matcher.find()) {
            sb.append((CharSequence) str, i2, matcher.start());
            sb.append((char) Integer.parseInt(matcher.group(1), 16));
            i2 = matcher.end();
            i3--;
        }
        if (i2 < length) {
            sb.append((CharSequence) str, i2, length);
        }
        if (sb.length() != i5) {
            return null;
        }
        return sb.toString();
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int b(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = binarySearch ^ -1;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            i2 = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i2) : i2;
    }

    public static <T extends Comparable<? super T>> int c(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i2;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (((Comparable) list.get(binarySearch)).compareTo(t) == 0);
            i2 = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static int d(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            i2 = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static int e(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int f(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static float g(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int h(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long i(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static boolean j(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int k(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = k[((i4 >>> 24) ^ (bArr[i2] & 255)) & BitmapRenderer.ALPHA_VISIBLE] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static String l(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String m(byte[] bArr) {
        return new String(bArr, Charset.forName(Constants.ENCODING));
    }

    public static String n(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, Charset.forName(Constants.ENCODING));
    }

    public static String o(String str, int i2) {
        String[] O = O(str);
        if (O.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : O) {
            if (i2 == s.f(s.c(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static Looper p() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static long q(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d2 = (double) j2;
        double d3 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 * d3);
    }

    public static int r(Context context) {
        ConnectivityManager connectivityManager;
        int i2 = 0;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i2 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                        return 3;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 4;
                    case 13:
                        return 5;
                    case 16:
                    default:
                        return 6;
                    case 18:
                        return 2;
                }
            }
        } catch (SecurityException unused) {
        }
        return i2;
    }

    public static int s(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    public static int t(int i2, int i3) {
        if (i2 == Integer.MIN_VALUE) {
            return i3 * 3;
        }
        if (i2 != 1073741824) {
            if (i2 == 2) {
                return i3 * 2;
            }
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i3 * 4;
    }

    public static Point u(Context context) {
        String str;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int i2 = a;
        if (i2 <= 29 && defaultDisplay.getDisplayId() == 0 && D(context)) {
            if ("Sony".equals(c) && d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            if (i2 < 28) {
                str = y("sys.display-size");
            } else {
                str = y("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] M = M(str.trim(), "x");
                    if (M.length == 2) {
                        int parseInt = Integer.parseInt(M[0]);
                        int parseInt2 = Integer.parseInt(M[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                Log.e("Util", "Invalid display size: " + str);
            }
        }
        Point point = new Point();
        int i3 = a;
        if (i3 >= 23) {
            Display.Mode mode = defaultDisplay.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        } else if (i3 >= 17) {
            defaultDisplay.getRealSize(point);
            return point;
        } else {
            defaultDisplay.getSize(point);
            return point;
        }
    }

    public static long v(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d2 = (double) j2;
        double d3 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 / d3);
    }

    public static q0[] w(s0 s0Var, n<com.google.android.exoplayer2.drm.s> nVar) {
        p0[] a2 = ((u) s0Var).a(new Handler(), new a(), new b(), f.a, d.a, null);
        q0[] q0VarArr = new q0[a2.length];
        for (int i2 = 0; i2 < a2.length; i2++) {
            q0VarArr[i2] = a2[i2].getCapabilities();
        }
        return q0VarArr;
    }

    public static int x(int i2) {
        if (i2 == 13) {
            return 1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    private static String y(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            Log.e("Util", "Failed to read system property " + str, e2);
            return null;
        }
    }

    public static byte[] z(String str) {
        return str.getBytes(Charset.forName(Constants.ENCODING));
    }
}
