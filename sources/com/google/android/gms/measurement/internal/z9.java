package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.common.e;
import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.measurement.f9;
import com.google.android.gms.internal.measurement.kb;
import com.google.android.gms.internal.measurement.w7;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class z9 extends b6 {
    private static final String[] g = {"firebase_", "google_", "ga_"};
    private static final String[] h = {"_err"};
    private SecureRandom c;
    private final AtomicLong d = new AtomicLong(0);
    private int e;
    private Integer f = null;

    z9(f5 f5Var) {
        super(f5Var);
    }

    private final int A0(String str) {
        if (!c0("event param", str)) {
            return 3;
        }
        if (!h0("event param", null, null, str)) {
            return 14;
        }
        if (!b0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    private final int C0(String str) {
        if (!p0("event param", str)) {
            return 3;
        }
        if (!h0("event param", null, null, str)) {
            return 14;
        }
        if (!b0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    public static Bundle D(List<y9> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (y9 y9Var : list) {
            String str = y9Var.n;
            if (str != null) {
                bundle.putString(y9Var.b, str);
            } else {
                Long l = y9Var.f;
                if (l != null) {
                    bundle.putLong(y9Var.b, l.longValue());
                } else {
                    Double d2 = y9Var.p;
                    if (d2 != null) {
                        bundle.putDouble(y9Var.b, d2.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    static MessageDigest D0() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance(Constants.MD5);
                if (instance != null) {
                    return instance;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    private final Object F(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return H(String.valueOf(obj), i, z);
            }
            if (!w7.b() || !super.j().r(t.B0) || !super.j().r(t.A0) || !z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable instanceof Bundle) {
                    Bundle B = B((Bundle) parcelable);
                    if (!B.isEmpty()) {
                        arrayList.add(B);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    private final int F0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (!super.j().r(t.i0) || !"_lgclid".equals(str)) ? 36 : 100;
    }

    public static String H(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    private static void J(Bundle bundle, int i, String str, Object obj) {
        if (o0(bundle, i)) {
            bundle.putString("_ev", H(str, 40, true));
            if (obj == null) {
                return;
            }
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", (long) String.valueOf(obj).length());
            }
        }
    }

    private final void V(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i;
        int i2;
        String str4;
        int i3;
        String str5;
        if (bundle != null) {
            boolean r = super.j().r(t.C0);
            if (r) {
                i = 0;
            } else {
                i = super.j().w();
            }
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i4 = 0;
            while (it.hasNext()) {
                String str6 = (String) it.next();
                if (list == null || !list.contains(str6)) {
                    i2 = z ? A0(str6) : 0;
                    if (i2 == 0) {
                        i2 = C0(str6);
                    }
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    J(bundle, i2, str6, i2 == 3 ? str6 : null);
                    bundle.remove(str6);
                } else {
                    if (Y(bundle.get(str6))) {
                        super.l().J().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str6);
                        i3 = 22;
                        str4 = str6;
                    } else {
                        str4 = str6;
                        i3 = u(str, str2, str6, bundle.get(str6), bundle, list, z, false);
                    }
                    if (i3 != 0 && !"_ev".equals(str4)) {
                        J(bundle, i3, str4, bundle.get(str4));
                        bundle.remove(str4);
                    } else if (Z(str4) && (!r || !g0(str4, f6.d))) {
                        int i5 = i4 + 1;
                        if (i5 > i) {
                            if (r) {
                                str5 = "Item cannot contain custom parameters";
                            } else {
                                StringBuilder sb = new StringBuilder(63);
                                sb.append("Child bundles can't contain more than ");
                                sb.append(i);
                                sb.append(" custom params");
                                str5 = sb.toString();
                            }
                            super.l().G().c(str5, super.e().v(str2), super.e().t(bundle));
                            o0(bundle, r ? 23 : 5);
                            bundle.remove(str4);
                        }
                        i4 = i5;
                    }
                }
            }
        }
    }

    static boolean W(Context context) {
        if (context == null) {
            throw new NullPointerException("null reference");
        } else if (Build.VERSION.SDK_INT >= 24) {
            return n0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        } else {
            return n0(context, "com.google.android.gms.measurement.AppMeasurementService");
        }
    }

    static boolean X(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean Y(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean Z(String str) {
        g.i(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    static boolean f0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean g0(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (v0(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static byte[] i0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList<Bundle> m0(List<oa> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (oa oaVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", oaVar.a);
            bundle.putString("origin", oaVar.b);
            bundle.putLong("creation_timestamp", oaVar.f);
            bundle.putString("name", oaVar.c.b);
            f.n(bundle, oaVar.c.I1());
            bundle.putBoolean("active", oaVar.n);
            String str = oaVar.o;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            r rVar = oaVar.p;
            if (rVar != null) {
                bundle.putString("timed_out_event_name", rVar.a);
                m mVar = oaVar.p.b;
                if (mVar != null) {
                    bundle.putBundle("timed_out_event_params", mVar.p2());
                }
            }
            bundle.putLong("trigger_timeout", oaVar.q);
            r rVar2 = oaVar.r;
            if (rVar2 != null) {
                bundle.putString("triggered_event_name", rVar2.a);
                m mVar2 = oaVar.r.b;
                if (mVar2 != null) {
                    bundle.putBundle("triggered_event_params", mVar2.p2());
                }
            }
            bundle.putLong("triggered_timestamp", oaVar.c.c);
            bundle.putLong("time_to_live", oaVar.s);
            r rVar3 = oaVar.t;
            if (rVar3 != null) {
                bundle.putString("expired_event_name", rVar3.a);
                m mVar3 = oaVar.t.b;
                if (mVar3 != null) {
                    bundle.putBundle("expired_event_params", mVar3.p2());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private static boolean n0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private static boolean o0(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    private final boolean q0(String str, String str2, int i, Object obj) {
        int i2;
        if (obj instanceof Parcelable[]) {
            i2 = ((Parcelable[]) obj).length;
        } else if (!(obj instanceof ArrayList)) {
            return true;
        } else {
            i2 = ((ArrayList) obj).size();
        }
        if (i2 <= i) {
            return true;
        }
        super.l().J().d("Parameter array is too long; discarded. Value kind, name, array length", str, str2, Integer.valueOf(i2));
        return false;
    }

    static Bundle[] r0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    private final boolean t0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e2 = xr.a(context).e(str, 64);
            if (e2 == null || (signatureArr = e2.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e3) {
            super.l().E().b("Error obtaining certificate", e3);
            return true;
        } catch (PackageManager.NameNotFoundException e4) {
            super.l().E().b("Package name not found", e4);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0166 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int u(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Object r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24, boolean r25) {
        /*
        // Method dump skipped, instructions count: 361
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.z9.u(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    static boolean v0(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static long w(long j, long j2) {
        return ((j2 * 60000) + j) / 86400000;
    }

    static boolean w0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static long y(m mVar) {
        long j = 0;
        if (mVar == null) {
            return 0;
        }
        p pVar = new p(mVar);
        while (pVar.hasNext()) {
            Object o2 = mVar.o2((String) pVar.next());
            if (o2 instanceof Parcelable[]) {
                j += (long) ((Parcelable[]) o2).length;
            }
        }
        return j;
    }

    static long z(byte[] bArr) {
        if (bArr != null) {
            int i = 0;
            g.o(bArr.length > 0);
            long j = 0;
            int length = bArr.length - 1;
            while (length >= 0 && length >= bArr.length - 8) {
                j += (((long) bArr[length]) & 255) << i;
                i += 8;
                length--;
            }
            return j;
        }
        throw new NullPointerException("null reference");
    }

    public static boolean z0(String str) {
        for (String str2 : h) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Bundle A(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(Constants.MEDIUM, str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            super.l().H().b("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle B(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object G = G(str, bundle.get(str));
                if (G == null) {
                    super.l().J().b("Param value can't be null", super.e().y(str));
                } else {
                    M(bundle2, str, G);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public final SecureRandom B0() {
        super.b();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final Bundle C(String str, String str2, Bundle bundle, List<String> list, boolean z, boolean z2) {
        Set<String> set;
        int i;
        Bundle bundle2;
        int i2;
        z9 z9Var = this;
        List<String> list2 = list;
        boolean z3 = w7.b() && super.j().r(t.C0);
        boolean g0 = z3 ? g0(str2, c6.d) : z2;
        if (bundle == null) {
            return null;
        }
        Bundle bundle3 = new Bundle(bundle);
        int w = super.j().w();
        if (super.j().x(str, t.a0)) {
            set = new TreeSet<>(bundle.keySet());
        } else {
            set = bundle.keySet();
        }
        int i3 = 0;
        for (String str3 : set) {
            if (list2 == null || !list2.contains(str3)) {
                i = z ? z9Var.A0(str3) : 0;
                if (i == 0) {
                    i = z9Var.C0(str3);
                }
            } else {
                i = 0;
            }
            if (i != 0) {
                J(bundle3, i, str3, i == 3 ? str3 : null);
                bundle3.remove(str3);
                i2 = w;
                bundle2 = bundle3;
            } else {
                i2 = w;
                bundle2 = bundle3;
                int u = u(str, str2, str3, bundle.get(str3), bundle3, list, z, g0);
                if (z3 && u == 17) {
                    J(bundle2, u, str3, Boolean.FALSE);
                } else if (u != 0 && !"_ev".equals(str3)) {
                    J(bundle2, u, u == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (Z(str3)) {
                    int i4 = i3 + 1;
                    if (i4 > i2) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Event can't contain more than ");
                        sb.append(i2);
                        sb.append(" params");
                        super.l().G().c(sb.toString(), super.e().v(str2), super.e().t(bundle));
                        o0(bundle2, 5);
                        bundle2.remove(str3);
                        i3 = i4;
                        w = i2;
                        bundle3 = bundle2;
                        z9Var = this;
                        list2 = list;
                    } else {
                        i3 = i4;
                    }
                }
            }
            w = i2;
            bundle3 = bundle2;
            z9Var = this;
            list2 = list;
        }
        return bundle3;
    }

    /* access modifiers changed from: package-private */
    public final r E(String str, String str2, Bundle bundle, String str3, long j, boolean z) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (v(str2, z) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str3);
            return new r(str2, new m(B(C(str, str2, bundle2, Collections.singletonList("_o"), false, false))), str3, j);
        }
        super.l().E().b("Invalid conditional property event name", super.e().z(str2));
        throw new IllegalArgumentException();
    }

    public final int E0() {
        if (this.f == null) {
            e b = e.b();
            Context i = super.i();
            b.getClass();
            int i2 = com.google.android.gms.common.g.e;
            int i3 = 0;
            try {
                i3 = i.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            this.f = Integer.valueOf(i3 / Constants.ONE_SECOND);
        }
        return this.f.intValue();
    }

    /* access modifiers changed from: package-private */
    public final Object G(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return F(256, obj, true, true);
        }
        if (!w0(str)) {
            i = 100;
        }
        return F(i, obj, false, true);
    }

    public final boolean G0() {
        try {
            super.i().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final URL I(long j, String str, String str2, long j2) {
        try {
            g.i(str2);
            g.i(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j), Integer.valueOf(E0())), str2, str, Long.valueOf(j2));
            if (str.equals(super.j().K())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            super.l().E().b("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void K(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            super.l().H().b("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* access modifiers changed from: package-private */
    public final void L(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    super.f().M(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void M(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (w7.b() && super.j().r(t.B0) && super.j().r(t.A0) && (obj instanceof Bundle[])) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                super.l().J().c("Not putting event parameter. Invalid value type. name, type", super.e().y(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public final void N(kb kbVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            kbVar.m(bundle);
        } catch (RemoteException e2) {
            this.a.l().H().b("Error returning int value to wrapper", e2);
        }
    }

    public final void O(kb kbVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            kbVar.m(bundle);
        } catch (RemoteException e2) {
            this.a.l().H().b("Error returning long value to wrapper", e2);
        }
    }

    public final void P(kb kbVar, Bundle bundle) {
        try {
            kbVar.m(bundle);
        } catch (RemoteException e2) {
            this.a.l().H().b("Error returning bundle value to wrapper", e2);
        }
    }

    public final void Q(kb kbVar, String str) {
        try {
            kbVar.m(je.E("r", str));
        } catch (RemoteException e2) {
            this.a.l().H().b("Error returning string value to wrapper", e2);
        }
    }

    public final void R(kb kbVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            kbVar.m(bundle);
        } catch (RemoteException e2) {
            this.a.l().H().b("Error returning bundle list to wrapper", e2);
        }
    }

    public final void S(kb kbVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            kbVar.m(bundle);
        } catch (RemoteException e2) {
            this.a.l().H().b("Error returning boolean value to wrapper", e2);
        }
    }

    public final void T(kb kbVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            kbVar.m(bundle);
        } catch (RemoteException e2) {
            this.a.l().H().b("Error returning byte array to wrapper", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void U(f4 f4Var, int i) {
        Iterator it = new TreeSet(f4Var.d.keySet()).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (Z(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                super.l().G().c(sb.toString(), super.e().v(f4Var.a), super.e().t(f4Var.d));
                o0(f4Var.d, 5);
                f4Var.d.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a0(String str, double d2) {
        try {
            SharedPreferences.Editor edit = super.i().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString(Constants.DEEPLINK, str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d2));
            return edit.commit();
        } catch (Exception e2) {
            super.l().E().b("Failed to persist Deferred Deep Link. exception", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b0(String str, int i, String str2) {
        if (str2 == null) {
            super.l().G().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            super.l().G().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean c0(String str, String str2) {
        if (str2 == null) {
            super.l().G().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            super.l().G().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                super.l().G().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    super.l().G().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d0(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                super.l().J().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean e0(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                throw new NullPointerException("null reference");
            } else if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            } else {
                if (this.a.I()) {
                    super.l().G().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", a4.w(str));
                }
                return false;
            }
        } else if (f9.b() && super.j().r(t.k0) && !TextUtils.isEmpty(str3)) {
            return true;
        } else {
            if (TextUtils.isEmpty(str2)) {
                if (this.a.I()) {
                    super.l().G().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (str2 == null) {
                throw new NullPointerException("null reference");
            } else if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            } else {
                super.l().G().b("Invalid admob_app_id. Analytics disabled.", a4.w(str2));
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean h0(String str, String[] strArr, String[] strArr2, String str2) {
        boolean z;
        if (str2 == null) {
            super.l().G().b("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = g;
        int length = strArr3.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr3[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            super.l().G().c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (strArr == null || !g0(str2, strArr) || (strArr2 != null && g0(str2, strArr2))) {
            return true;
        } else {
            super.l().G().c("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void j0(int i, String str, String str2, int i2) {
        Bundle bundle = new Bundle();
        o0(bundle, i);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            bundle.putString(str, str2);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.a.E().W("auto", "_err", bundle);
    }

    /* access modifiers changed from: package-private */
    public final int k0(String str) {
        if (!p0("user property", str)) {
            return 6;
        }
        if (!h0("user property", e6.a, null, str)) {
            return 15;
        }
        if (!b0("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int l0(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = d0("user property referrer", str, F0(str), obj);
        } else {
            z = d0("user property", str, F0(str), obj);
        }
        return z ? 0 : 7;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.b6
    public final void m() {
        super.b();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                super.l().H().a("Utils falling back to Random for random id");
            }
        }
        this.d.set(nextLong);
    }

    /* access modifiers changed from: package-private */
    public final boolean p0(String str, String str2) {
        if (str2 == null) {
            super.l().G().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            super.l().G().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        super.l().G().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            super.l().G().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.b6
    public final boolean r() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Object s0(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return F(F0(str), obj, true, false);
        }
        return F(F0(str), obj, false, false);
    }

    public final int t() {
        return e.b().c(super.i(), 12451000);
    }

    /* access modifiers changed from: package-private */
    public final boolean u0(String str) {
        super.b();
        if (xr.a(super.i()).a(str) == 0) {
            return true;
        }
        super.l().L().b("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int v(String str, boolean z) {
        String[] strArr = c6.a;
        if (!p0("event", str)) {
            return 2;
        }
        if (z) {
            if (!h0("event", strArr, c6.b, str)) {
                return 13;
            }
        } else if (!h0("event", strArr, null, str)) {
            return 13;
        }
        if (!b0("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final long x(Context context, String str) {
        super.b();
        if (context != null) {
            g.i(str);
            PackageManager packageManager = context.getPackageManager();
            MessageDigest D0 = D0();
            if (D0 == null) {
                super.l().E().a("Could not get MD5 instance");
            } else if (packageManager == null) {
                return 0;
            } else {
                try {
                    if (t0(context, str)) {
                        return 0;
                    }
                    Signature[] signatureArr = xr.a(context).e(super.i().getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        return z(D0.digest(signatureArr[0].toByteArray()));
                    }
                    super.l().H().a("Could not get signatures");
                } catch (PackageManager.NameNotFoundException e2) {
                    super.l().E().b("Package name not found", e2);
                    return 0;
                }
            }
            return -1;
        }
        throw new NullPointerException("null reference");
    }

    /* access modifiers changed from: package-private */
    public final boolean x0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return super.j().J().equals(str);
    }

    public final long y0() {
        long andIncrement;
        long j;
        if (this.d.get() == 0) {
            synchronized (this.d) {
                long nanoTime = System.nanoTime();
                ((d) super.d()).getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i = this.e + 1;
                this.e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.d) {
            this.d.compareAndSet(-1, 1);
            andIncrement = this.d.getAndIncrement();
        }
        return andIncrement;
    }
}
