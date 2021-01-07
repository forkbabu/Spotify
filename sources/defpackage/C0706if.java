package defpackage;

import android.util.Patterns;
import com.adjust.sdk.Constants;
import com.spotify.music.features.ads.model.Ad;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: if  reason: invalid class name and default package and case insensitive filesystem */
public final class C0706if {
    private static Map<String, String> a = null;
    private static Map<String, String> b = null;
    private static Map<String, String> c = null;
    private static JSONObject d = null;
    private static boolean e = false;

    C0706if() {
    }

    static float[] a(JSONObject jSONObject, String str) {
        if (uf.c(C0706if.class)) {
            return null;
        }
        try {
            if (!e) {
                return null;
            }
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            try {
                String lowerCase = str.toLowerCase();
                JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                String optString = jSONObject.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                i(jSONObject2, jSONArray);
                l(fArr, h(jSONObject2));
                JSONObject b2 = b(jSONObject2);
                if (b2 == null) {
                    return null;
                }
                l(fArr, g(b2, jSONArray, optString, jSONObject2.toString(), lowerCase));
                return fArr;
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            uf.b(th, C0706if.class);
            return null;
        }
    }

    private static JSONObject b(JSONObject jSONObject) {
        if (uf.c(C0706if.class)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return null;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject b2 = b(optJSONArray.getJSONObject(i));
                if (b2 != null) {
                    return b2;
                }
            }
            return null;
        } catch (JSONException unused) {
        } catch (Throwable th) {
            uf.b(th, C0706if.class);
        }
    }

    static String c(String str, String str2, String str3) {
        if (uf.c(C0706if.class)) {
            return null;
        }
        try {
            return (str3 + " | " + str2 + ", " + str).toLowerCase();
        } catch (Throwable th) {
            uf.b(th, C0706if.class);
            return null;
        }
    }

    static void d(File file) {
        if (!uf.c(C0706if.class)) {
            try {
                d = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                d = new JSONObject(new String(bArr, Constants.ENCODING));
                try {
                    HashMap hashMap = new HashMap();
                    a = hashMap;
                    hashMap.put("ENGLISH", "1");
                    a.put("GERMAN", "2");
                    a.put("SPANISH", "3");
                    a.put("JAPANESE", "4");
                    HashMap hashMap2 = new HashMap();
                    b = hashMap2;
                    hashMap2.put("VIEW_CONTENT", Ad.DEFAULT_SKIPPABLE_AD_DELAY);
                    b.put("SEARCH", "1");
                    b.put("ADD_TO_CART", "2");
                    b.put("ADD_TO_WISHLIST", "3");
                    b.put("INITIATE_CHECKOUT", "4");
                    b.put("ADD_PAYMENT_INFO", "5");
                    b.put("PURCHASE", "6");
                    b.put("LEAD", "7");
                    b.put("COMPLETE_REGISTRATION", "8");
                    HashMap hashMap3 = new HashMap();
                    c = hashMap3;
                    hashMap3.put("BUTTON_TEXT", "1");
                    c.put("PAGE_TITLE", "2");
                    c.put("RESOLVED_DOCUMENT_LINK", "3");
                    c.put("BUTTON_ID", "4");
                    e = true;
                } catch (Throwable th) {
                    uf.b(th, C0706if.class);
                }
            } catch (Exception unused) {
            }
        }
    }

    static boolean e() {
        if (uf.c(C0706if.class)) {
            return false;
        }
        try {
            return e;
        } catch (Throwable th) {
            uf.b(th, C0706if.class);
            return false;
        }
    }

    private static boolean f(String[] strArr, String[] strArr2) {
        if (uf.c(C0706if.class)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (str2.contains(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            uf.b(th, C0706if.class);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x005e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float[] g(org.json.JSONObject r17, org.json.JSONArray r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
        // Method dump skipped, instructions count: 357
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0706if.g(org.json.JSONObject, org.json.JSONArray, java.lang.String, java.lang.String, java.lang.String):float[]");
    }

    private static float[] h(JSONObject jSONObject) {
        if (uf.c(C0706if.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            String lowerCase = jSONObject.optString("text").toLowerCase();
            String lowerCase2 = jSONObject.optString("hint").toLowerCase();
            String lowerCase3 = jSONObject.optString("classname").toLowerCase();
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (f(new String[]{"$", "amount", "price", "total"}, strArr)) {
                double d2 = (double) fArr[0];
                Double.isNaN(d2);
                fArr[0] = (float) (d2 + 1.0d);
            }
            if (f(new String[]{"password", "pwd"}, strArr)) {
                double d3 = (double) fArr[1];
                Double.isNaN(d3);
                fArr[1] = (float) (d3 + 1.0d);
            }
            if (f(new String[]{"tel", "phone"}, strArr)) {
                double d4 = (double) fArr[2];
                Double.isNaN(d4);
                fArr[2] = (float) (d4 + 1.0d);
            }
            if (f(new String[]{"search"}, strArr)) {
                double d5 = (double) fArr[4];
                Double.isNaN(d5);
                fArr[4] = (float) (d5 + 1.0d);
            }
            if (optInt >= 0) {
                double d6 = (double) fArr[5];
                Double.isNaN(d6);
                fArr[5] = (float) (d6 + 1.0d);
            }
            if (optInt == 3 || optInt == 2) {
                double d7 = (double) fArr[6];
                Double.isNaN(d7);
                fArr[6] = (float) (d7 + 1.0d);
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                double d8 = (double) fArr[7];
                Double.isNaN(d8);
                fArr[7] = (float) (d8 + 1.0d);
            }
            if (lowerCase3.contains("checkbox")) {
                double d9 = (double) fArr[8];
                Double.isNaN(d9);
                fArr[8] = (float) (d9 + 1.0d);
            }
            if (f(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                double d10 = (double) fArr[10];
                Double.isNaN(d10);
                fArr[10] = (float) (d10 + 1.0d);
            }
            if (lowerCase3.contains("radio") && lowerCase3.contains("button")) {
                double d11 = (double) fArr[12];
                Double.isNaN(d11);
                fArr[12] = (float) (d11 + 1.0d);
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    l(fArr, h(optJSONArray.getJSONObject(i)));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            uf.b(th, C0706if.class);
            return null;
        }
    }

    private static boolean i(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        boolean z2;
        if (uf.c(C0706if.class)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int i = 0;
            while (true) {
                if (i >= optJSONArray.length()) {
                    z = false;
                    z2 = false;
                    break;
                } else if (optJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                    z = true;
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    jSONArray.put(optJSONArray.getJSONObject(i2));
                }
            } else {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                    if (i(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            uf.b(th, C0706if.class);
            return false;
        }
    }

    private static boolean j(String str, String str2) {
        if (uf.c(C0706if.class)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            uf.b(th, C0706if.class);
            return false;
        }
    }

    private static boolean k(String str, String str2, String str3, String str4) {
        if (uf.c(C0706if.class)) {
            return false;
        }
        try {
            return j(d.optJSONObject("rulesForLanguage").optJSONObject(a.get(str)).optJSONObject("rulesForEvent").optJSONObject(b.get(str2)).optJSONObject("positiveRules").optString(c.get(str3)), str4);
        } catch (Throwable th) {
            uf.b(th, C0706if.class);
            return false;
        }
    }

    private static void l(float[] fArr, float[] fArr2) {
        if (!uf.c(C0706if.class)) {
            for (int i = 0; i < fArr.length; i++) {
                try {
                    fArr[i] = fArr[i] + fArr2[i];
                } catch (Throwable th) {
                    uf.b(th, C0706if.class);
                    return;
                }
            }
        }
    }

    private static void m(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (!uf.c(C0706if.class)) {
            try {
                String lowerCase = jSONObject.optString("text", "").toLowerCase();
                String lowerCase2 = jSONObject.optString("hint", "").toLowerCase();
                if (!lowerCase.isEmpty()) {
                    sb.append(lowerCase);
                    sb.append(" ");
                }
                if (!lowerCase2.isEmpty()) {
                    sb2.append(lowerCase2);
                    sb2.append(" ");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        try {
                            m(optJSONArray.getJSONObject(i), sb, sb2);
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                uf.b(th, C0706if.class);
            }
        }
    }
}
