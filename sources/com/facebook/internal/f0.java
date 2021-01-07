package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.adjust.sdk.Constants;
import com.facebook.FacebookException;
import com.facebook.HttpMethod;
import com.facebook.k;
import com.facebook.m;
import com.facebook.q;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class f0 {
    private static int a = 0;
    private static long b = -1;
    private static long c = -1;
    private static long d = -1;
    private static String e = "";
    private static String f = "";
    private static String g = "NoCarrier";

    static class a implements m.c {
        final /* synthetic */ b a;
        final /* synthetic */ String b;

        a(b bVar, String str) {
            this.a = bVar;
            this.b = str;
        }

        @Override // com.facebook.m.c
        public void b(q qVar) {
            if (qVar.e() != null) {
                this.a.b(qVar.e().f());
                return;
            }
            c0.b(this.b, qVar.f());
            this.a.a(qVar.f());
        }
    }

    public interface b {
        void a(JSONObject jSONObject);

        void b(FacebookException facebookException);
    }

    public interface c<T, K> {
        K apply(T t);
    }

    public static class d {
        List<String> a;
        List<String> b;
        List<String> c;

        public d(List<String> list, List<String> list2, List<String> list3) {
            this.a = list;
            this.b = list2;
            this.c = list3;
        }

        public List<String> a() {
            return this.b;
        }

        public List<String> b() {
            return this.c;
        }

        public List<String> c() {
            return this.a;
        }
    }

    public static boolean A() {
        if (uf.c(f0.class)) {
            return false;
        }
        try {
            JSONObject n = n();
            if (n == null) {
                return false;
            }
            try {
                JSONArray jSONArray = n.getJSONArray("data_processing_options");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (jSONArray.getString(i).toLowerCase().equals("ldu")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            uf.b(th, f0.class);
            return false;
        }
    }

    public static boolean B(Uri uri) {
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean C(String str) {
        return str == null || str.length() == 0;
    }

    public static <T> boolean D(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    public static boolean E(Uri uri) {
        return uri != null && ("http".equalsIgnoreCase(uri.getScheme()) || Constants.SCHEME.equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme()));
    }

    public static List<String> F(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static <T, K> List<K> G(List<T> list, c<T, K> cVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            K apply = cVar.apply(t);
            if (apply != null) {
                arrayList.add(apply);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    public static String H(Map<String, String> map) {
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public static String I(String str) {
        return v(Constants.MD5, str.getBytes());
    }

    public static Bundle J(String str) {
        Bundle bundle = new Bundle();
        if (!C(str)) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split("=");
                try {
                    if (split.length == 2) {
                        bundle.putString(URLDecoder.decode(split[0], Constants.ENCODING), URLDecoder.decode(split[1], Constants.ENCODING));
                    } else if (split.length == 1) {
                        bundle.putString(URLDecoder.decode(split[0], Constants.ENCODING), "");
                    }
                } catch (UnsupportedEncodingException unused) {
                    boolean z = k.n;
                }
            }
        }
        return bundle;
    }

    public static boolean K(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            bundle.remove(str);
            return true;
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return true;
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
            return true;
        } else if (!(obj instanceof JSONObject)) {
            return false;
        } else {
            bundle.putString(str, obj.toString());
            return true;
        }
    }

    public static void L(Bundle bundle, String str, String str2) {
        if (!C(str2)) {
            bundle.putString(str, str2);
        }
    }

    public static void M(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            L(bundle, str, uri.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0038 A[SYNTHETIC, Splitter:B:24:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC, Splitter:B:28:0x003d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String N(java.io.InputStream r6) {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0032 }
            r1.<init>(r6)     // Catch:{ all -> 0x0032 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x002d }
            r6.<init>(r1)     // Catch:{ all -> 0x002d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            r0.<init>()     // Catch:{ all -> 0x002b }
            r2 = 2048(0x800, float:2.87E-42)
            char[] r2 = new char[r2]     // Catch:{ all -> 0x002b }
        L_0x0014:
            int r3 = r6.read(r2)     // Catch:{ all -> 0x002b }
            r4 = -1
            if (r3 == r4) goto L_0x0020
            r4 = 0
            r0.append(r2, r4, r3)     // Catch:{ all -> 0x002b }
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x002b }
            r1.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            r6.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            return r0
        L_0x002b:
            r0 = move-exception
            goto L_0x0036
        L_0x002d:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L_0x0036
        L_0x0032:
            r6 = move-exception
            r1 = r0
            r0 = r6
            r6 = r1
        L_0x0036:
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            if (r6 == 0) goto L_0x0040
            r6.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            goto L_0x0042
        L_0x0041:
            throw r0
        L_0x0042:
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.f0.N(java.io.InputStream):java.lang.String");
    }

    public static Map<String, String> O(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    public static void P(Runnable runnable) {
        try {
            k.l().execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x016f A[SYNTHETIC, Splitter:B:52:0x016f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void Q(org.json.JSONObject r10, android.content.Context r11) {
        /*
        // Method dump skipped, instructions count: 439
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.f0.Q(org.json.JSONObject, android.content.Context):void");
    }

    public static String R(byte[] bArr) {
        return v(Constants.SHA1, bArr);
    }

    public static String S(String str) {
        if (str == null) {
            return null;
        }
        return v(Constants.SHA256, str.getBytes());
    }

    public static JSONObject T(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    public static void U(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public static Map<String, String> a(String str) {
        if (str.isEmpty()) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static <T> boolean b(T t, T t2) {
        if (t == null) {
            return t2 == null;
        }
        return t.equals(t2);
    }

    public static Uri c(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(Constants.SCHEME);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    private static void d(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String str2 : cookie.split(";")) {
                String[] split = str2.split("=");
                if (split.length > 0) {
                    instance.setCookie(str, split[0].trim() + "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                }
            }
            instance.removeExpiredCookie();
        }
    }

    public static void e(Context context) {
        d(context, "facebook.com");
        d(context, ".facebook.com");
        d(context, "https://facebook.com");
        d(context, "https://.facebook.com");
    }

    public static String f(String str, String str2) {
        return C(str) ? str2 : str;
    }

    public static Map<String, String> g(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int h(java.io.InputStream r6, java.io.OutputStream r7) {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0024 }
            r1.<init>(r6)     // Catch:{ all -> 0x0024 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0021 }
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0021 }
            r5 = -1
            if (r4 == r5) goto L_0x0018
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0021 }
            int r3 = r3 + r4
            goto L_0x000c
        L_0x0018:
            r1.close()
            if (r6 == 0) goto L_0x0020
            r6.close()
        L_0x0020:
            return r3
        L_0x0021:
            r7 = move-exception
            r0 = r1
            goto L_0x0025
        L_0x0024:
            r7 = move-exception
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            r0.close()
        L_0x002a:
            if (r6 == 0) goto L_0x002f
            r6.close()
        L_0x002f:
            goto L_0x0031
        L_0x0030:
            throw r7
        L_0x0031:
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.f0.h(java.io.InputStream, java.io.OutputStream):int");
    }

    public static void i(File file) {
        File[] listFiles;
        if (file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    i(file2);
                }
            }
            file.delete();
        }
    }

    public static void j(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static String k(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        return context.getClass().getSimpleName();
    }

    public static Date l(Bundle bundle, String str, Date date) {
        long j;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Long) obj).longValue();
        } else if (!(obj instanceof String)) {
            return null;
        } else {
            try {
                j = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (j == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((j * 1000) + date.getTime());
    }

    public static Locale m() {
        Locale locale;
        try {
            locale = k.d().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            locale = null;
        }
        return locale != null ? locale : Locale.getDefault();
    }

    public static JSONObject n() {
        if (uf.c(f0.class)) {
            return null;
        }
        try {
            String string = k.d().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            uf.b(th, f0.class);
            return null;
        }
    }

    private static m o(String str) {
        return new m(null, "me", je.F("fields", "id,name,first_name,middle_name,last_name,link", "access_token", str), HttpMethod.GET, null);
    }

    public static void p(String str, b bVar) {
        JSONObject a2 = c0.a(str);
        if (a2 != null) {
            bVar.a(a2);
            return;
        }
        a aVar = new a(bVar, str);
        m o = o(str);
        o.A(aVar);
        o.h();
    }

    public static String q(Context context) {
        h0.f(context, "context");
        k.z(context);
        return k.e();
    }

    public static Method r(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Object s(JSONObject jSONObject, String str, String str2) {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }

    public static String t(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    public static d u(JSONObject jSONObject) {
        String optString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString2 = optJSONObject.optString("permission");
            if (!(optString2 == null || optString2.equals("installed") || (optString = optJSONObject.optString("status")) == null)) {
                if (optString.equals("granted")) {
                    arrayList.add(optString2);
                } else if (optString.equals("declined")) {
                    arrayList2.add(optString2);
                } else if (optString.equals("expired")) {
                    arrayList3.add(optString2);
                }
            }
        }
        return new d(arrayList, arrayList2, arrayList3);
    }

    private static String v(String str, byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(Integer.toHexString((b2 >> 4) & 15));
                sb.append(Integer.toHexString((b2 >> 0) & 15));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static Object w(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean x() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", k.e())));
            Context d2 = k.d();
            PackageManager packageManager = d2.getPackageManager();
            String packageName = d2.getPackageName();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 65536)) {
                if (packageName.equals(resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean y(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        return str != null && str.matches(".+_cheets|cheets_.+");
    }

    public static boolean z(Uri uri) {
        return uri != null && "content".equalsIgnoreCase(uri.getScheme());
    }
}
