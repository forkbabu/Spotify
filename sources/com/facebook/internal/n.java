package com.facebook.internal;

import android.net.Uri;
import com.facebook.k;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n {
    private boolean a;
    private String b;
    private boolean c;
    private int d;
    private EnumSet<SmartLoginOption> e;
    private Map<String, Map<String, a>> f;
    private boolean g;
    private j h;
    private boolean i;
    private boolean j;
    private String k;
    private JSONArray l;
    private boolean m;
    private String n;
    private String o;
    private String p;

    public static class a {
        private String a;
        private String b;
        private Uri c;
        private int[] d;

        private a(String str, String str2, Uri uri, int[] iArr) {
            this.a = str;
            this.b = str2;
            this.c = uri;
            this.d = iArr;
        }

        public static a d(JSONObject jSONObject) {
            String optString = jSONObject.optString("name");
            int[] iArr = null;
            if (f0.C(optString)) {
                return null;
            }
            String[] split = optString.split("\\|");
            if (split.length != 2) {
                return null;
            }
            String str = split[0];
            String str2 = split[1];
            if (f0.C(str) || f0.C(str2)) {
                return null;
            }
            String optString2 = jSONObject.optString("url");
            Uri parse = !f0.C(optString2) ? Uri.parse(optString2) : null;
            JSONArray optJSONArray = jSONObject.optJSONArray("versions");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                int[] iArr2 = new int[length];
                for (int i = 0; i < length; i++) {
                    int i2 = -1;
                    int optInt = optJSONArray.optInt(i, -1);
                    if (optInt == -1) {
                        String optString3 = optJSONArray.optString(i);
                        if (!f0.C(optString3)) {
                            try {
                                i2 = Integer.parseInt(optString3);
                            } catch (NumberFormatException unused) {
                                boolean z = k.n;
                            }
                            iArr2[i] = i2;
                        }
                    }
                    i2 = optInt;
                    iArr2[i] = i2;
                }
                iArr = iArr2;
            }
            return new a(str, str2, parse, iArr);
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public int[] c() {
            return this.d;
        }
    }

    public n(boolean z, String str, boolean z2, int i2, EnumSet<SmartLoginOption> enumSet, Map<String, Map<String, a>> map, boolean z3, j jVar, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, boolean z7, String str5, String str6, String str7) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.f = map;
        this.h = jVar;
        this.d = i2;
        this.g = z3;
        this.e = enumSet;
        this.i = z4;
        this.j = z5;
        this.l = jSONArray;
        this.k = str4;
        this.m = z7;
        this.n = str5;
        this.o = str6;
        this.p = str7;
    }

    public static a c(String str, String str2, String str3) {
        n j2;
        Map<String, a> map;
        if (f0.C(str2) || f0.C(str3) || (j2 = FetchedAppSettingsManager.j(str)) == null || (map = j2.f.get(str2)) == null) {
            return null;
        }
        return map.get(str3);
    }

    public boolean a() {
        return this.g;
    }

    public boolean b() {
        return this.j;
    }

    public j d() {
        return this.h;
    }

    public JSONArray e() {
        return this.l;
    }

    public boolean f() {
        return this.i;
    }

    public boolean g() {
        return this.m;
    }

    public String h() {
        return this.b;
    }

    public boolean i() {
        return this.c;
    }

    public String j() {
        return this.n;
    }

    public String k() {
        return this.p;
    }

    public String l() {
        return this.k;
    }

    public int m() {
        return this.d;
    }

    public EnumSet<SmartLoginOption> n() {
        return this.e;
    }

    public String o() {
        return this.o;
    }

    public boolean p() {
        return this.a;
    }
}
