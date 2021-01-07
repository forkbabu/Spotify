package com.facebook;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.facebook.internal.d0;
import com.facebook.internal.f0;
import com.facebook.internal.h0;
import com.facebook.internal.y;
import com.facebook.p;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class m {
    private static final String k;
    private static Pattern l = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    private static volatile String m;
    public static final /* synthetic */ int n = 0;
    private a a;
    private HttpMethod b;
    private String c;
    private JSONObject d;
    private boolean e;
    private Bundle f;
    private c g;
    private Object h;
    private String i;
    private boolean j;

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {
        final /* synthetic */ ArrayList a;
        final /* synthetic */ p b;

        a(ArrayList arrayList, p pVar) {
            this.a = arrayList;
            this.b = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((c) pair.first).b((q) pair.second);
                    }
                    for (p.a aVar : this.b.i()) {
                        aVar.a(this.b);
                    }
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class b {
        private final m a;
        private final Object b;

        public b(m mVar, Object obj) {
            this.a = mVar;
            this.b = obj;
        }

        public m a() {
            return this.a;
        }

        public Object b() {
            return this.b;
        }
    }

    public interface c {
        void b(q qVar);
    }

    /* access modifiers changed from: private */
    public interface d {
        void a(String str, String str2);
    }

    public interface e extends c {
        void a(long j, long j2);
    }

    /* access modifiers changed from: private */
    public static class g implements d {
        private final OutputStream a;
        private final y b;
        private boolean c = true;
        private boolean d = false;

        public g(OutputStream outputStream, y yVar, boolean z) {
            this.a = outputStream;
            this.b = yVar;
            this.d = z;
        }

        @Override // com.facebook.m.d
        public void a(String str, String str2) {
            c(str, null, null);
            f("%s", str2);
            h();
            y yVar = this.b;
            if (yVar != null) {
                yVar.b("    " + str, str2);
            }
        }

        public void b(String str, Object... objArr) {
            if (!this.d) {
                if (this.c) {
                    this.a.write("--".getBytes());
                    this.a.write(m.k.getBytes());
                    this.a.write("\r\n".getBytes());
                    this.c = false;
                }
                this.a.write(String.format(str, objArr).getBytes());
                return;
            }
            this.a.write(URLEncoder.encode(String.format(Locale.US, str, objArr), Constants.ENCODING).getBytes());
        }

        public void c(String str, String str2, String str3) {
            if (!this.d) {
                b("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    b("; filename=\"%s\"", str2);
                }
                f("", new Object[0]);
                if (str3 != null) {
                    f("%s: %s", "Content-Type", str3);
                }
                f("", new Object[0]);
                return;
            }
            this.a.write(String.format("%s=", str).getBytes());
        }

        public void d(String str, Uri uri, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            c(str, str, str2);
            if (this.a instanceof u) {
                Cursor cursor = null;
                try {
                    cursor = k.d().getContentResolver().query(uri, null, null, null, null);
                    int columnIndex = cursor.getColumnIndex("_size");
                    cursor.moveToFirst();
                    long j = cursor.getLong(columnIndex);
                    cursor.close();
                    ((u) this.a).b(j);
                    i = 0;
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } else {
                i = f0.h(k.d().getContentResolver().openInputStream(uri), this.a) + 0;
            }
            f("", new Object[0]);
            h();
            y yVar = this.b;
            if (yVar != null) {
                yVar.b(je.x0("    ", str), String.format(Locale.ROOT, "<Data: %d>", Integer.valueOf(i)));
            }
        }

        public void e(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            c(str, str, str2);
            OutputStream outputStream = this.a;
            if (outputStream instanceof u) {
                ((u) outputStream).b(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = f0.h(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.a) + 0;
            }
            f("", new Object[0]);
            h();
            y yVar = this.b;
            if (yVar != null) {
                yVar.b(je.x0("    ", str), String.format(Locale.ROOT, "<Data: %d>", Integer.valueOf(i)));
            }
        }

        public void f(String str, Object... objArr) {
            b(str, objArr);
            if (!this.d) {
                b("\r\n", new Object[0]);
            }
        }

        public void g(String str, Object obj, m mVar) {
            OutputStream outputStream = this.a;
            if (outputStream instanceof w) {
                ((w) outputStream).a(mVar);
            }
            if (m.q(obj)) {
                a(str, m.t(obj));
            } else if (obj instanceof Bitmap) {
                c(str, str, "image/png");
                ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, this.a);
                f("", new Object[0]);
                h();
                y yVar = this.b;
                if (yVar != null) {
                    yVar.b("    " + str, "<Image>");
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                c(str, str, "content/unknown");
                this.a.write(bArr);
                f("", new Object[0]);
                h();
                y yVar2 = this.b;
                if (yVar2 != null) {
                    yVar2.b(je.x0("    ", str), String.format(Locale.ROOT, "<Data: %d>", Integer.valueOf(bArr.length)));
                }
            } else if (obj instanceof Uri) {
                d(str, (Uri) obj, null);
            } else if (obj instanceof ParcelFileDescriptor) {
                e(str, (ParcelFileDescriptor) obj, null);
            } else if (obj instanceof f) {
                f fVar = (f) obj;
                Parcelable b2 = fVar.b();
                String a2 = fVar.a();
                if (b2 instanceof ParcelFileDescriptor) {
                    e(str, (ParcelFileDescriptor) b2, a2);
                } else if (b2 instanceof Uri) {
                    d(str, (Uri) b2, a2);
                } else {
                    throw new IllegalArgumentException("value is not a supported type.");
                }
            } else {
                throw new IllegalArgumentException("value is not a supported type.");
            }
        }

        public void h() {
            if (!this.d) {
                f("--%s", m.k);
            } else {
                this.a.write("&".getBytes());
            }
        }

        public void i(String str, JSONArray jSONArray, Collection<m> collection) {
            OutputStream outputStream = this.a;
            if (!(outputStream instanceof w)) {
                a(str, jSONArray.toString());
                return;
            }
            w wVar = (w) outputStream;
            c(str, null, null);
            b("[", new Object[0]);
            int i = 0;
            for (m mVar : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                wVar.a(mVar);
                if (i > 0) {
                    b(",%s", jSONObject.toString());
                } else {
                    b("%s", jSONObject.toString());
                }
                i++;
            }
            b("]", new Object[0]);
            y yVar = this.b;
            if (yVar != null) {
                yVar.b(je.x0("    ", str), jSONArray.toString());
            }
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i2 = 0; i2 < nextInt; i2++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        k = sb.toString();
    }

    public m() {
        this(null, null, null, null, null);
    }

    public static HttpURLConnection G(p pVar) {
        URL url;
        Iterator it = pVar.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                m mVar = (m) it.next();
                if (HttpMethod.GET.equals(mVar.b)) {
                    String str = mVar.i;
                    if (!f0.C(str)) {
                        if (str.startsWith("v")) {
                            str = str.substring(1);
                        }
                        String[] split = str.split("\\.");
                        if ((split.length < 2 || Integer.parseInt(split[0]) <= 2) && (Integer.parseInt(split[0]) < 2 || Integer.parseInt(split[1]) < 4)) {
                            z = false;
                        }
                    }
                    if (z) {
                        Bundle bundle = mVar.f;
                        if (!bundle.containsKey("fields") || f0.C(bundle.getString("fields"))) {
                            LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                            int i2 = y.e;
                            k.v(loggingBehavior);
                        }
                    }
                }
            } else {
                try {
                    break;
                } catch (MalformedURLException e2) {
                    throw new FacebookException("could not construct URL for request", e2);
                }
            }
        }
        if (pVar.size() == 1) {
            url = new URL(pVar.f(0).o());
        } else {
            url = new URL(d0.b());
        }
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = f(url);
            z(pVar, httpURLConnection);
            return httpURLConnection;
        } catch (IOException | JSONException e3) {
            f0.j(httpURLConnection);
            throw new FacebookException("could not construct request body", e3);
        }
    }

    private void d() {
        if (this.a != null) {
            if (!this.f.containsKey("access_token")) {
                String n2 = this.a.n();
                y.d(n2);
                this.f.putString("access_token", n2);
            }
        } else if (!this.j && !this.f.containsKey("access_token")) {
            String e2 = k.e();
            String j2 = k.j();
            if (f0.C(e2) || f0.C(j2)) {
                boolean z = k.n;
            } else {
                this.f.putString("access_token", je.y0(e2, "|", j2));
            }
        }
        this.f.putString("sdk", "android");
        this.f.putString("format", "json");
        k.v(LoggingBehavior.GRAPH_API_DEBUG_INFO);
        k.v(LoggingBehavior.GRAPH_API_DEBUG_WARNING);
    }

    private String e(String str, Boolean bool) {
        if (!bool.booleanValue() && this.b == HttpMethod.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f.keySet()) {
            Object obj = this.f.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (q(obj)) {
                buildUpon.appendQueryParameter(str2, t(obj).toString());
            } else if (this.b == HttpMethod.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", obj.getClass().getSimpleName()));
            }
        }
        return buildUpon.toString();
    }

    private static HttpURLConnection f(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        if (m == null) {
            m = String.format("%s.%s", "FBAndroidSDK", "7.1.0");
            if (!f0.C(null)) {
                m = String.format(Locale.ROOT, "%s/%s", m, null);
            }
        }
        httpURLConnection.setRequestProperty("User-Agent", m);
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    public static List<q> i(p pVar) {
        h0.e(pVar, "requests");
        try {
            HttpURLConnection G = G(pVar);
            try {
                return j(G, pVar);
            } finally {
                f0.j(G);
            }
        } catch (Exception e2) {
            List<q> a2 = q.a(pVar.k(), null, new FacebookException(e2));
            x(pVar, a2);
            f0.j(null);
            return a2;
        }
    }

    public static List<q> j(HttpURLConnection httpURLConnection, p pVar) {
        List<q> d2 = q.d(httpURLConnection, pVar);
        f0.j(httpURLConnection);
        int size = pVar.size();
        ArrayList arrayList = (ArrayList) d2;
        if (size == arrayList.size()) {
            x(pVar, d2);
            d.f().d();
            return d2;
        }
        throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", Integer.valueOf(arrayList.size()), Integer.valueOf(size)));
    }

    private String m() {
        if (l.matcher(this.c).matches()) {
            return this.c;
        }
        return String.format("%s/%s", this.i, this.c);
    }

    private static boolean p(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof f);
    }

    /* access modifiers changed from: private */
    public static boolean q(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    public static m r(a aVar, String str, c cVar) {
        return new m(null, str, null, null, null);
    }

    public static m s(a aVar, String str, JSONObject jSONObject, c cVar) {
        m mVar = new m(aVar, str, null, HttpMethod.POST, cVar);
        mVar.d = jSONObject;
        return mVar;
    }

    /* access modifiers changed from: private */
    public static String t(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void u(org.json.JSONObject r6, java.lang.String r7, com.facebook.m.d r8) {
        /*
            java.util.regex.Pattern r0 = com.facebook.m.l
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r1 = r0.matches()
            r2 = 1
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = r0.group(r2)
            goto L_0x0013
        L_0x0012:
            r0 = r7
        L_0x0013:
            java.lang.String r1 = "me/"
            boolean r1 = r0.startsWith(r1)
            r3 = 0
            if (r1 != 0) goto L_0x0027
            java.lang.String r1 = "/me/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r0 = 0
            goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = ":"
            int r0 = r7.indexOf(r0)
            java.lang.String r1 = "?"
            int r7 = r7.indexOf(r1)
            r1 = 3
            if (r0 <= r1) goto L_0x0040
            r1 = -1
            if (r7 == r1) goto L_0x003e
            if (r0 >= r7) goto L_0x0040
        L_0x003e:
            r7 = 1
            goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            java.util.Iterator r0 = r6.keys()
        L_0x0045:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0066
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r6.opt(r1)
            if (r7 == 0) goto L_0x0061
            java.lang.String r5 = "image"
            boolean r5 = r1.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0061
            r5 = 1
            goto L_0x0062
        L_0x0061:
            r5 = 0
        L_0x0062:
            v(r1, r4, r8, r5)
            goto L_0x0045
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.m.u(org.json.JSONObject, java.lang.String, com.facebook.m$d):void");
    }

    private static void v(String str, Object obj, d dVar, boolean z) {
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    v(String.format("%s[%s]", str, next), jSONObject.opt(next), dVar, z);
                }
            } else if (jSONObject.has("id")) {
                v(str, jSONObject.optString("id"), dVar, z);
            } else if (jSONObject.has("url")) {
                v(str, jSONObject.optString("url"), dVar, z);
            } else if (jSONObject.has("fbsdk:create_object")) {
                v(str, jSONObject.toString(), dVar, z);
            }
        } else if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                v(String.format(Locale.ROOT, "%s[%d]", str, Integer.valueOf(i2)), jSONArray.opt(i2), dVar, z);
            }
        } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
            dVar.a(str, obj.toString());
        } else if (Date.class.isAssignableFrom(cls)) {
            dVar.a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
        }
    }

    private static void w(p pVar, y yVar, int i2, URL url, OutputStream outputStream, boolean z) {
        Iterator it;
        String c2;
        g gVar = new g(outputStream, yVar, z);
        char c3 = 1;
        char c4 = 0;
        if (i2 == 1) {
            m f2 = pVar.f(0);
            HashMap hashMap = new HashMap();
            for (String str : f2.f.keySet()) {
                Object obj = f2.f.get(str);
                if (p(obj)) {
                    hashMap.put(str, new b(f2, obj));
                }
            }
            if (yVar != null) {
                yVar.a("  Parameters:\n");
            }
            Bundle bundle = f2.f;
            for (String str2 : bundle.keySet()) {
                Object obj2 = bundle.get(str2);
                if (q(obj2)) {
                    gVar.g(str2, obj2, f2);
                }
            }
            if (yVar != null) {
                yVar.a("  Attachments:\n");
            }
            y(hashMap, gVar);
            JSONObject jSONObject = f2.d;
            if (jSONObject != null) {
                u(jSONObject, url.getPath(), gVar);
                return;
            }
            return;
        }
        String str3 = null;
        if (f0.C(null)) {
            Iterator it2 = pVar.iterator();
            while (true) {
                if (it2.hasNext()) {
                    a aVar = ((m) it2.next()).a;
                    if (!(aVar == null || (c2 = aVar.c()) == null)) {
                        str3 = c2;
                        break;
                    }
                } else if (f0.C(null)) {
                    str3 = k.e();
                }
            }
        }
        if (!f0.C(str3)) {
            gVar.a("batch_app_id", str3);
            HashMap hashMap2 = new HashMap();
            JSONArray jSONArray = new JSONArray();
            Iterator it3 = pVar.iterator();
            while (it3.hasNext()) {
                m mVar = (m) it3.next();
                mVar.getClass();
                JSONObject jSONObject2 = new JSONObject();
                Object[] objArr = new Object[2];
                objArr[c4] = d0.b();
                objArr[c3] = mVar.m();
                String format = String.format("%s/%s", objArr);
                mVar.d();
                Uri parse = Uri.parse(mVar.e(format, Boolean.TRUE));
                Object[] objArr2 = new Object[2];
                objArr2[c4] = parse.getPath();
                objArr2[c3] = parse.getQuery();
                String format2 = String.format("%s?%s", objArr2);
                jSONObject2.put("relative_url", format2);
                jSONObject2.put("method", mVar.b);
                a aVar2 = mVar.a;
                if (aVar2 != null) {
                    y.d(aVar2.n());
                }
                ArrayList arrayList = new ArrayList();
                for (String str4 : mVar.f.keySet()) {
                    Object obj3 = mVar.f.get(str4);
                    if (p(obj3)) {
                        Locale locale = Locale.ROOT;
                        it = it3;
                        Object[] objArr3 = new Object[2];
                        objArr3[c4] = "file";
                        objArr3[1] = Integer.valueOf(hashMap2.size());
                        String format3 = String.format(locale, "%s%d", objArr3);
                        arrayList.add(format3);
                        hashMap2.put(format3, new b(mVar, obj3));
                    } else {
                        it = it3;
                    }
                    it3 = it;
                    c4 = 0;
                }
                if (!arrayList.isEmpty()) {
                    jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
                }
                if (mVar.d != null) {
                    ArrayList arrayList2 = new ArrayList();
                    u(mVar.d, format2, new n(mVar, arrayList2));
                    jSONObject2.put("body", TextUtils.join("&", arrayList2));
                }
                jSONArray.put(jSONObject2);
                it3 = it3;
                c3 = 1;
                c4 = 0;
            }
            gVar.i("batch", jSONArray, pVar);
            if (yVar != null) {
                yVar.a("  Attachments:\n");
            }
            y(hashMap2, gVar);
            return;
        }
        throw new FacebookException("App ID was not specified at the request or Settings.");
    }

    static void x(p pVar, List<q> list) {
        int size = pVar.size();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            m f2 = pVar.f(i2);
            if (f2.g != null) {
                arrayList.add(new Pair(f2.g, list.get(i2)));
            }
        }
        if (arrayList.size() > 0) {
            a aVar = new a(arrayList, pVar);
            Handler h2 = pVar.h();
            if (h2 == null) {
                aVar.run();
            } else {
                h2.post(aVar);
            }
        }
    }

    private static void y(Map<String, b> map, g gVar) {
        for (String str : map.keySet()) {
            b bVar = map.get(str);
            if (p(bVar.b())) {
                gVar.g(str, bVar.b(), bVar.a());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010f, code lost:
        r5 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void z(com.facebook.p r16, java.net.HttpURLConnection r17) {
        /*
        // Method dump skipped, instructions count: 337
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.m.z(com.facebook.p, java.net.HttpURLConnection):void");
    }

    public final void A(c cVar) {
        k.v(LoggingBehavior.GRAPH_API_DEBUG_INFO);
        k.v(LoggingBehavior.GRAPH_API_DEBUG_WARNING);
        this.g = cVar;
    }

    public final void B(JSONObject jSONObject) {
        this.d = jSONObject;
    }

    public final void C(Bundle bundle) {
        this.f = bundle;
    }

    public final void D(boolean z) {
        this.j = z;
    }

    public final void E(Object obj) {
        this.h = obj;
    }

    public final void F(String str) {
        this.i = str;
    }

    public final q g() {
        m[] mVarArr = {this};
        h0.f(mVarArr, "requests");
        ArrayList arrayList = (ArrayList) i(new p(Arrays.asList(mVarArr)));
        if (arrayList.size() == 1) {
            return (q) arrayList.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    public final o h() {
        m[] mVarArr = {this};
        h0.f(mVarArr, "requests");
        p pVar = new p(Arrays.asList(mVarArr));
        h0.e(pVar, "requests");
        o oVar = new o(pVar);
        oVar.executeOnExecutor(k.l(), new Void[0]);
        return oVar;
    }

    public final a k() {
        return this.a;
    }

    public final c l() {
        return this.g;
    }

    public final Bundle n() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public final String o() {
        String str;
        String str2;
        if (this.b != HttpMethod.POST || (str2 = this.c) == null || !str2.endsWith("/videos")) {
            str = d0.b();
        } else {
            Collection<String> collection = d0.a;
            str = String.format("https://graph-video.%s", k.o());
        }
        String format = String.format("%s/%s", str, m());
        d();
        return e(format, Boolean.FALSE);
    }

    public String toString() {
        StringBuilder Z0 = je.Z0("{Request: ", " accessToken: ");
        Object obj = this.a;
        if (obj == null) {
            obj = "null";
        }
        Z0.append(obj);
        Z0.append(", graphPath: ");
        Z0.append(this.c);
        Z0.append(", graphObject: ");
        Z0.append(this.d);
        Z0.append(", httpMethod: ");
        Z0.append(this.b);
        Z0.append(", parameters: ");
        Z0.append(this.f);
        Z0.append("}");
        return Z0.toString();
    }

    public m(a aVar, String str, Bundle bundle, HttpMethod httpMethod) {
        this(aVar, str, bundle, httpMethod, null);
    }

    public static class f<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();
        private final String a;
        private final RESOURCE b;

        static class a implements Parcelable.Creator<f> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (l) null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(RESOURCE resource, String str) {
            this.a = str;
            this.b = resource;
        }

        public String a() {
            return this.a;
        }

        public RESOURCE b() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeParcelable(this.b, i);
        }

        f(Parcel parcel, l lVar) {
            this.a = parcel.readString();
            this.b = (RESOURCE) parcel.readParcelable(k.d().getClassLoader());
        }
    }

    public m(a aVar, String str, Bundle bundle, HttpMethod httpMethod, c cVar) {
        this.e = true;
        this.j = false;
        this.a = aVar;
        this.c = str;
        this.i = null;
        A(cVar);
        this.b = httpMethod == null ? HttpMethod.GET : httpMethod;
        if (bundle != null) {
            this.f = new Bundle(bundle);
        } else {
            this.f = new Bundle();
        }
        if (this.i == null) {
            this.i = k.n();
        }
    }
}
