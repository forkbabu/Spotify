package com.facebook.appevents.ml;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.internal.f;
import com.facebook.internal.f0;
import com.facebook.k;
import com.facebook.m;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ModelManager {
    private static final Map<String, d> a = new ConcurrentHashMap();
    private static final Integer b = 259200000;
    private static final List<String> c = Arrays.asList("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
    private static final List<String> d = Arrays.asList("none", "address", "health");
    public static final /* synthetic */ int e = 0;

    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        public String d() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                return ordinal != 1 ? "Unknown" : "app_event_pred";
            }
            return "integrity_detect";
        }

        public String g() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (ordinal != 1) {
                return null;
            }
            return "MTML_APP_EVENT_PRED";
        }
    }

    static class a implements Runnable {
        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x004f A[Catch:{ Exception -> 0x0072, all -> 0x006e }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0050 A[Catch:{ Exception -> 0x0072, all -> 0x006e }] */
        @Override // java.lang.Runnable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.String r0 = "model_request_timestamp"
                java.lang.String r1 = "models"
                boolean r2 = defpackage.uf.c(r7)
                if (r2 == 0) goto L_0x000b
                return
            L_0x000b:
                android.content.Context r2 = com.facebook.k.d()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                java.lang.String r3 = "com.facebook.internal.MODEL_STORE"
                r4 = 0
                android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                r3 = 0
                java.lang.String r3 = r2.getString(r1, r3)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r3 == 0) goto L_0x002a
                boolean r4 = r3.isEmpty()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r4 == 0) goto L_0x0024
                goto L_0x002a
            L_0x0024:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                r4.<init>(r3)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                goto L_0x002f
            L_0x002a:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                r4.<init>()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
            L_0x002f:
                r5 = 0
                long r5 = r2.getLong(r0, r5)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                com.facebook.internal.FeatureManager$Feature r3 = com.facebook.internal.FeatureManager.Feature.ModelRequest     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                boolean r3 = com.facebook.internal.FeatureManager.e(r3)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r3 == 0) goto L_0x0049
                int r3 = r4.length()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r3 == 0) goto L_0x0049
                boolean r3 = com.facebook.appevents.ml.ModelManager.a(r5)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r3 != 0) goto L_0x0067
            L_0x0049:
                org.json.JSONObject r4 = com.facebook.appevents.ml.ModelManager.b()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                if (r4 != 0) goto L_0x0050
                return
            L_0x0050:
                android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                android.content.SharedPreferences$Editor r1 = r2.putString(r1, r3)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                r0.apply()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
            L_0x0067:
                com.facebook.appevents.ml.ModelManager.c(r4)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                com.facebook.appevents.ml.ModelManager.d()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                goto L_0x0072
            L_0x006e:
                r0 = move-exception
                defpackage.uf.b(r0, r7)
            L_0x0072:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.ml.ModelManager.a.run():void");
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    lf.a();
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    gf.a();
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class d {
        String a;
        String b;
        String c;
        int d;
        float[] e;
        File f;
        Model g;
        private Runnable h;

        /* access modifiers changed from: package-private */
        public static class a implements f.a {
            final /* synthetic */ List a;

            /* renamed from: com.facebook.appevents.ml.ModelManager$d$a$a  reason: collision with other inner class name */
            class C0068a implements f.a {
                final /* synthetic */ d a;
                final /* synthetic */ Model b;

                C0068a(a aVar, d dVar, Model model) {
                    this.a = dVar;
                    this.b = model;
                }

                @Override // com.facebook.appevents.internal.f.a
                public void a(File file) {
                    d dVar = this.a;
                    dVar.g = this.b;
                    dVar.f = file;
                    if (dVar.h != null) {
                        this.a.h.run();
                    }
                }
            }

            a(List list) {
                this.a = list;
            }

            @Override // com.facebook.appevents.internal.f.a
            public void a(File file) {
                Model a2 = Model.a(file);
                if (a2 != null) {
                    for (d dVar : this.a) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(dVar.a);
                        sb.append("_");
                        d.d(dVar.c, je.B0(sb, dVar.d, "_rule"), new C0068a(this, dVar, a2));
                    }
                }
            }
        }

        d(String str, String str2, String str3, int i, float[] fArr) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
            this.e = fArr;
        }

        static d c(JSONObject jSONObject) {
            float[] fArr;
            float[] fArr2;
            if (jSONObject == null) {
                return null;
            }
            try {
                String string = jSONObject.getString("use_case");
                String string2 = jSONObject.getString("asset_uri");
                String optString = jSONObject.optString("rules_uri", null);
                int i = jSONObject.getInt("version_id");
                JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
                int i2 = ModelManager.e;
                if (!uf.c(ModelManager.class)) {
                    try {
                        if (!uf.c(ModelManager.class) && jSONArray != null) {
                            try {
                                fArr2 = new float[jSONArray.length()];
                                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                    try {
                                        fArr2[i3] = Float.parseFloat(jSONArray.getString(i3));
                                    } catch (JSONException unused) {
                                    }
                                }
                            } catch (Throwable th) {
                                uf.b(th, ModelManager.class);
                            }
                            fArr = fArr2;
                            return new d(string, string2, optString, i, fArr);
                        }
                        fArr2 = null;
                        fArr = fArr2;
                    } catch (Throwable th2) {
                        uf.b(th2, ModelManager.class);
                    }
                    return new d(string, string2, optString, i, fArr);
                }
                fArr = null;
                return new d(string, string2, optString, i, fArr);
            } catch (Exception unused2) {
                return null;
            }
        }

        /* access modifiers changed from: private */
        public static void d(String str, String str2, f.a aVar) {
            File file = new File(c.a(), str2);
            if (str == null || file.exists()) {
                aVar.a(file);
            } else {
                new f(str, file, aVar).execute(new String[0]);
            }
        }

        static void e(d dVar, List<d> list) {
            File[] listFiles;
            String str = dVar.a;
            int i = dVar.d;
            File a2 = c.a();
            if (!(a2 == null || (listFiles = a2.listFiles()) == null || listFiles.length == 0)) {
                String str2 = str + "_" + i;
                for (File file : listFiles) {
                    String name = file.getName();
                    if (name.startsWith(str) && !name.startsWith(str2)) {
                        file.delete();
                    }
                }
            }
            d(dVar.b, dVar.a + "_" + dVar.d, new a(list));
        }

        /* access modifiers changed from: package-private */
        public d f(Runnable runnable) {
            this.h = runnable;
            return this;
        }
    }

    static boolean a(long j) {
        if (uf.c(ModelManager.class)) {
            return false;
        }
        try {
            if (uf.c(ModelManager.class) || j == 0) {
                return false;
            }
            try {
                if (System.currentTimeMillis() - j < ((long) b.intValue())) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                uf.b(th, ModelManager.class);
                return false;
            }
        } catch (Throwable th2) {
            uf.b(th2, ModelManager.class);
            return false;
        }
    }

    static /* synthetic */ JSONObject b() {
        if (uf.c(ModelManager.class)) {
            return null;
        }
        try {
            return g();
        } catch (Throwable th) {
            uf.b(th, ModelManager.class);
            return null;
        }
    }

    static void c(JSONObject jSONObject) {
        if (!uf.c(ModelManager.class)) {
            try {
                if (!uf.c(ModelManager.class)) {
                    try {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            try {
                                d c2 = d.c(jSONObject.getJSONObject(keys.next()));
                                if (c2 != null) {
                                    a.put(c2.a, c2);
                                }
                            } catch (JSONException unused) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        uf.b(th, ModelManager.class);
                    }
                }
            } catch (Throwable th2) {
                uf.b(th2, ModelManager.class);
            }
        }
    }

    static /* synthetic */ void d() {
        if (!uf.c(ModelManager.class)) {
            try {
                f();
            } catch (Throwable th) {
                uf.b(th, ModelManager.class);
            }
        }
    }

    public static void e() {
        if (!uf.c(ModelManager.class)) {
            try {
                f0.P(new a());
            } catch (Throwable th) {
                uf.b(th, ModelManager.class);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r10.getLanguage().contains("en") != false) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void f() {
        /*
            java.lang.Class<com.facebook.appevents.ml.ModelManager> r0 = com.facebook.appevents.ml.ModelManager.class
            boolean r1 = defpackage.uf.c(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00d3 }
            r1.<init>()     // Catch:{ all -> 0x00d3 }
            java.util.Map<java.lang.String, com.facebook.appevents.ml.ModelManager$d> r2 = com.facebook.appevents.ml.ModelManager.a     // Catch:{ all -> 0x00d3 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00d3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00d3 }
            r3 = 0
            r4 = 0
            r7 = r3
            r9 = 0
        L_0x001c:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x00d3 }
            if (r5 == 0) goto L_0x00bb
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x00d3 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00d3 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ all -> 0x00d3 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00d3 }
            com.facebook.appevents.ml.ModelManager$Task r8 = com.facebook.appevents.ml.ModelManager.Task.MTML_APP_EVENT_PREDICTION     // Catch:{ all -> 0x00d3 }
            java.lang.String r8 = r8.g()     // Catch:{ all -> 0x00d3 }
            boolean r8 = r6.equals(r8)     // Catch:{ all -> 0x00d3 }
            if (r8 == 0) goto L_0x008c
            java.lang.Object r7 = r5.getValue()     // Catch:{ all -> 0x00d3 }
            com.facebook.appevents.ml.ModelManager$d r7 = (com.facebook.appevents.ml.ModelManager.d) r7     // Catch:{ all -> 0x00d3 }
            java.lang.String r8 = r7.b     // Catch:{ all -> 0x00d3 }
            int r10 = r7.d     // Catch:{ all -> 0x00d3 }
            int r9 = java.lang.Math.max(r9, r10)     // Catch:{ all -> 0x00d3 }
            com.facebook.internal.FeatureManager$Feature r10 = com.facebook.internal.FeatureManager.Feature.SuggestedEvents     // Catch:{ all -> 0x00d3 }
            boolean r10 = com.facebook.internal.FeatureManager.e(r10)     // Catch:{ all -> 0x00d3 }
            if (r10 == 0) goto L_0x008b
            boolean r10 = defpackage.uf.c(r0)     // Catch:{ all -> 0x00d3 }
            if (r10 == 0) goto L_0x0057
            goto L_0x007b
        L_0x0057:
            android.content.Context r10 = com.facebook.k.d()     // Catch:{ Exception -> 0x0068 }
            android.content.res.Resources r10 = r10.getResources()     // Catch:{ Exception -> 0x0068 }
            android.content.res.Configuration r10 = r10.getConfiguration()     // Catch:{ Exception -> 0x0068 }
            java.util.Locale r10 = r10.locale     // Catch:{ Exception -> 0x0068 }
            goto L_0x0069
        L_0x0066:
            r10 = move-exception
            goto L_0x0078
        L_0x0068:
            r10 = r3
        L_0x0069:
            if (r10 == 0) goto L_0x007d
            java.lang.String r10 = r10.getLanguage()     // Catch:{ all -> 0x0066 }
            java.lang.String r11 = "en"
            boolean r10 = r10.contains(r11)     // Catch:{ all -> 0x0066 }
            if (r10 == 0) goto L_0x007b
            goto L_0x007d
        L_0x0078:
            defpackage.uf.b(r10, r0)
        L_0x007b:
            r10 = 0
            goto L_0x007e
        L_0x007d:
            r10 = 1
        L_0x007e:
            if (r10 == 0) goto L_0x008b
            com.facebook.appevents.ml.ModelManager$b r10 = new com.facebook.appevents.ml.ModelManager$b
            r10.<init>()
            r7.f(r10)
            r1.add(r7)
        L_0x008b:
            r7 = r8
        L_0x008c:
            com.facebook.appevents.ml.ModelManager$Task r8 = com.facebook.appevents.ml.ModelManager.Task.MTML_INTEGRITY_DETECT
            java.lang.String r8 = r8.g()
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x001c
            java.lang.Object r5 = r5.getValue()
            com.facebook.appevents.ml.ModelManager$d r5 = (com.facebook.appevents.ml.ModelManager.d) r5
            java.lang.String r7 = r5.b
            int r6 = r5.d
            int r9 = java.lang.Math.max(r9, r6)
            com.facebook.internal.FeatureManager$Feature r6 = com.facebook.internal.FeatureManager.Feature.IntelligentIntegrity
            boolean r6 = com.facebook.internal.FeatureManager.e(r6)
            if (r6 == 0) goto L_0x001c
            com.facebook.appevents.ml.ModelManager$c r6 = new com.facebook.appevents.ml.ModelManager$c
            r6.<init>()
            r5.f(r6)
            r1.add(r5)
            goto L_0x001c
        L_0x00bb:
            if (r7 == 0) goto L_0x00d2
            if (r9 <= 0) goto L_0x00d2
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x00d2
            com.facebook.appevents.ml.ModelManager$d r2 = new com.facebook.appevents.ml.ModelManager$d
            java.lang.String r6 = "MTML"
            r8 = 0
            r10 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            com.facebook.appevents.ml.ModelManager.d.e(r2, r1)
        L_0x00d2:
            return
        L_0x00d3:
            r1 = move-exception
            defpackage.uf.b(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.ml.ModelManager.f():void");
    }

    private static JSONObject g() {
        if (uf.c(ModelManager.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            m r = m.r(null, String.format("%s/model_asset", k.e()), null);
            r.D(true);
            r.C(bundle);
            JSONObject f = r.g().f();
            if (f == null) {
                return null;
            }
            return i(f);
        } catch (Throwable th) {
            uf.b(th, ModelManager.class);
            return null;
        }
    }

    public static File h(Task task) {
        if (uf.c(ModelManager.class)) {
            return null;
        }
        try {
            d dVar = a.get(task.g());
            if (dVar == null) {
                return null;
            }
            return dVar.f;
        } catch (Throwable th) {
            uf.b(th, ModelManager.class);
            return null;
        }
    }

    private static JSONObject i(JSONObject jSONObject) {
        if (uf.c(ModelManager.class)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            uf.b(th, ModelManager.class);
            return null;
        }
    }

    public static String[] j(Task task, float[][] fArr, String[] strArr) {
        if (uf.c(ModelManager.class)) {
            return null;
        }
        try {
            d dVar = a.get(task.g());
            if (dVar != null) {
                if (dVar.g != null) {
                    int length = strArr.length;
                    int length2 = fArr[0].length;
                    a aVar = new a(new int[]{length, length2});
                    for (int i = 0; i < length; i++) {
                        System.arraycopy(fArr[i], 0, aVar.a(), i * length2, length2);
                    }
                    a c2 = dVar.g.c(aVar, strArr, task.d());
                    float[] fArr2 = dVar.e;
                    if (!(c2 == null || fArr2 == null || c2.a().length == 0)) {
                        if (fArr2.length != 0) {
                            int ordinal = task.ordinal();
                            if (ordinal == 0) {
                                return k(c2, fArr2);
                            }
                            if (ordinal != 1) {
                                return null;
                            }
                            return l(c2, fArr2);
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            uf.b(th, ModelManager.class);
            return null;
        }
    }

    private static String[] k(a aVar, float[] fArr) {
        if (uf.c(ModelManager.class)) {
            return null;
        }
        try {
            int b2 = aVar.b(0);
            int b3 = aVar.b(1);
            float[] a2 = aVar.a();
            String[] strArr = new String[b2];
            if (b3 != fArr.length) {
                return null;
            }
            for (int i = 0; i < b2; i++) {
                strArr[i] = "none";
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    if (a2[(i * b3) + i2] >= fArr[i2]) {
                        strArr[i] = d.get(i2);
                    }
                }
            }
            return strArr;
        } catch (Throwable th) {
            uf.b(th, ModelManager.class);
            return null;
        }
    }

    private static String[] l(a aVar, float[] fArr) {
        if (uf.c(ModelManager.class)) {
            return null;
        }
        try {
            int b2 = aVar.b(0);
            int b3 = aVar.b(1);
            float[] a2 = aVar.a();
            String[] strArr = new String[b2];
            if (b3 != fArr.length) {
                return null;
            }
            for (int i = 0; i < b2; i++) {
                strArr[i] = "other";
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    if (a2[(i * b3) + i2] >= fArr[i2]) {
                        strArr[i] = c.get(i2);
                    }
                }
            }
            return strArr;
        } catch (Throwable th) {
            uf.b(th, ModelManager.class);
            return null;
        }
    }
}
