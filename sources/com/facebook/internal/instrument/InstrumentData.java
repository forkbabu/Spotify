package com.facebook.internal.instrument;

import android.os.Build;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.f0;
import com.facebook.k;
import com.facebook.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class InstrumentData {
    private String a;
    private Type b;
    private JSONArray c;
    private String d;
    private String e;
    private String f;
    private Long g;

    public enum Type {
        Unknown,
        Analysis,
        CrashReport,
        CrashShield,
        ThreadCheck;

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            int ordinal = ordinal();
            if (ordinal == 1) {
                return "Analysis";
            }
            if (ordinal == 2) {
                return "CrashReport";
            }
            if (ordinal != 3) {
                return ordinal != 4 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }
    }

    public static class b {
        public static InstrumentData a(Throwable th, Type type) {
            return new InstrumentData(th, type, null);
        }

        public static boolean b(String str) {
            File c = c();
            if (c == null || str == null) {
                return false;
            }
            return new File(c, str).delete();
        }

        public static File c() {
            File file = new File(k.d().getCacheDir(), "instrument");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        }

        public static File[] d() {
            File c = c();
            if (c == null) {
                return new File[0];
            }
            File[] listFiles = c.listFiles(new f());
            return listFiles != null ? listFiles : new File[0];
        }

        public static InstrumentData e(File file) {
            return new InstrumentData(file, (a) null);
        }

        public static JSONObject f(String str, boolean z) {
            File c = c();
            if (!(c == null || str == null)) {
                try {
                    return new JSONObject(f0.N(new FileInputStream(new File(c, str))));
                } catch (Exception unused) {
                    if (z) {
                        b(str);
                    }
                }
            }
            return null;
        }

        public static void g(String str, JSONArray jSONArray, m.c cVar) {
            if (jSONArray.length() != 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(str, jSONArray.toString());
                    m.s(null, String.format("%s/instruments", k.e()), jSONObject, cVar).h();
                } catch (JSONException unused) {
                }
            }
        }

        public static void h() {
            if (k.g()) {
                FeatureManager.a(FeatureManager.Feature.CrashReport, new c());
                FeatureManager.a(FeatureManager.Feature.ErrorReport, new d());
            }
        }

        public static void i(String str, String str2) {
            File c = c();
            if (c != null && str != null && str2 != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(c, str));
                    fileOutputStream.write(str2.getBytes());
                    fileOutputStream.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    InstrumentData(JSONArray jSONArray, a aVar) {
        this.b = Type.Analysis;
        this.g = Long.valueOf(System.currentTimeMillis() / 1000);
        this.c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(this.g.toString());
        stringBuffer.append(".json");
        this.a = stringBuffer.toString();
    }

    public void a() {
        b.b(this.a);
    }

    public int b(InstrumentData instrumentData) {
        Long l = this.g;
        if (l == null) {
            return -1;
        }
        Long l2 = instrumentData.g;
        if (l2 == null) {
            return 1;
        }
        return l2.compareTo(l);
    }

    public boolean c() {
        int ordinal = this.b.ordinal();
        if (ordinal != 1) {
            if ((ordinal != 2 && ordinal != 3 && ordinal != 4) || this.f == null || this.g == null) {
                return false;
            }
            return true;
        } else if (this.c == null || this.g == null) {
            return false;
        } else {
            return true;
        }
    }

    public void d() {
        if (c()) {
            b.i(this.a, toString());
        }
    }

    public String toString() {
        JSONObject jSONObject;
        int ordinal = this.b.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("device_os_version", Build.VERSION.RELEASE);
                    jSONObject.put("device_model", Build.MODEL);
                    String str = this.d;
                    if (str != null) {
                        jSONObject.put("app_version", str);
                    }
                    Long l = this.g;
                    if (l != null) {
                        jSONObject.put("timestamp", l);
                    }
                    String str2 = this.e;
                    if (str2 != null) {
                        jSONObject.put("reason", str2);
                    }
                    String str3 = this.f;
                    if (str3 != null) {
                        jSONObject.put("callstack", str3);
                    }
                    Type type = this.b;
                    if (type != null) {
                        jSONObject.put("type", type);
                    }
                } catch (JSONException unused) {
                }
            }
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            JSONArray jSONArray = this.c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l2 = this.g;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    InstrumentData(java.lang.Throwable r7, com.facebook.internal.instrument.InstrumentData.Type r8, com.facebook.internal.instrument.InstrumentData.a r9) {
        /*
            r6 = this;
            r6.<init>()
            r6.b = r8
            android.content.Context r9 = com.facebook.k.d()
            r0 = 0
            r1 = 0
            if (r9 != 0) goto L_0x000e
            goto L_0x001d
        L_0x000e:
            java.lang.String r2 = r9.getPackageName()
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001d }
            android.content.pm.PackageInfo r9 = r9.getPackageInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x001d }
            java.lang.String r9 = r9.versionName     // Catch:{ NameNotFoundException -> 0x001d }
            goto L_0x001e
        L_0x001d:
            r9 = r0
        L_0x001e:
            r6.d = r9
            if (r7 != 0) goto L_0x0024
            r9 = r0
            goto L_0x0037
        L_0x0024:
            java.lang.Throwable r9 = r7.getCause()
            if (r9 != 0) goto L_0x002f
            java.lang.String r9 = r7.toString()
            goto L_0x0037
        L_0x002f:
            java.lang.Throwable r9 = r7.getCause()
            java.lang.String r9 = r9.toString()
        L_0x0037:
            r6.e = r9
            if (r7 != 0) goto L_0x003c
            goto L_0x0065
        L_0x003c:
            org.json.JSONArray r9 = new org.json.JSONArray
            r9.<init>()
        L_0x0041:
            if (r7 == 0) goto L_0x0061
            if (r7 == r0) goto L_0x0061
            java.lang.StackTraceElement[] r0 = r7.getStackTrace()
            int r2 = r0.length
            r3 = 0
        L_0x004b:
            if (r3 >= r2) goto L_0x0059
            r4 = r0[r3]
            java.lang.String r4 = r4.toString()
            r9.put(r4)
            int r3 = r3 + 1
            goto L_0x004b
        L_0x0059:
            java.lang.Throwable r0 = r7.getCause()
            r5 = r0
            r0 = r7
            r7 = r5
            goto L_0x0041
        L_0x0061:
            java.lang.String r0 = r9.toString()
        L_0x0065:
            r6.f = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r6.g = r7
            java.lang.StringBuffer r7 = new java.lang.StringBuffer
            r7.<init>()
            int r8 = r8.ordinal()
            r9 = 1
            if (r8 == r9) goto L_0x0095
            r9 = 2
            if (r8 == r9) goto L_0x0092
            r9 = 3
            if (r8 == r9) goto L_0x008f
            r9 = 4
            if (r8 == r9) goto L_0x008c
            java.lang.String r8 = "Unknown"
            goto L_0x0097
        L_0x008c:
            java.lang.String r8 = "thread_check_log_"
            goto L_0x0097
        L_0x008f:
            java.lang.String r8 = "shield_log_"
            goto L_0x0097
        L_0x0092:
            java.lang.String r8 = "crash_log_"
            goto L_0x0097
        L_0x0095:
            java.lang.String r8 = "analysis_log_"
        L_0x0097:
            r7.append(r8)
            java.lang.Long r8 = r6.g
            java.lang.String r8 = r8.toString()
            r7.append(r8)
            java.lang.String r8 = ".json"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.instrument.InstrumentData.<init>(java.lang.Throwable, com.facebook.internal.instrument.InstrumentData$Type, com.facebook.internal.instrument.InstrumentData$a):void");
    }

    InstrumentData(File file, a aVar) {
        Type type;
        String name = file.getName();
        this.a = name;
        if (name.startsWith("crash_log_")) {
            type = Type.CrashReport;
        } else if (name.startsWith("shield_log_")) {
            type = Type.CrashShield;
        } else if (name.startsWith("thread_check_log_")) {
            type = Type.ThreadCheck;
        } else if (name.startsWith("analysis_log_")) {
            type = Type.Analysis;
        } else {
            type = Type.Unknown;
        }
        this.b = type;
        JSONObject f2 = b.f(this.a, true);
        if (f2 != null) {
            this.g = Long.valueOf(f2.optLong("timestamp", 0));
            this.d = f2.optString("app_version", null);
            this.e = f2.optString("reason", null);
            this.f = f2.optString("callstack", null);
            this.c = f2.optJSONArray("feature_names");
        }
    }
}
