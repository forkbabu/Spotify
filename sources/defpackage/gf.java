package defpackage;

import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.m;
import com.facebook.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: gf  reason: default package */
public final class gf {
    private static boolean a = false;
    private static boolean b = false;

    public static void a() {
        if (!uf.c(gf.class)) {
            try {
                a = true;
                b = m.g("FBSDKFeatureIntegritySample", k.e(), false);
            } catch (Throwable th) {
                uf.b(th, gf.class);
            }
        }
    }

    public static void b(Map<String, String> map) {
        if (!uf.c(gf.class)) {
            try {
                if (a && map.size() != 0) {
                    try {
                        ArrayList arrayList = new ArrayList(map.keySet());
                        JSONObject jSONObject = new JSONObject();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            String str2 = map.get(str);
                            if (c(str) || c(str2)) {
                                map.remove(str);
                                if (!b) {
                                    str2 = "";
                                }
                                jSONObject.put(str, str2);
                            }
                        }
                        if (jSONObject.length() != 0) {
                            map.put("_onDeviceParams", jSONObject.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                uf.b(th, gf.class);
            }
        }
    }

    private static boolean c(String str) {
        if (uf.c(gf.class)) {
            return false;
        }
        try {
            String str2 = null;
            if (!uf.c(gf.class)) {
                try {
                    float[] fArr = new float[30];
                    Arrays.fill(fArr, 0.0f);
                    String[] j = ModelManager.j(ModelManager.Task.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
                    str2 = j == null ? "none" : j[0];
                } catch (Throwable th) {
                    uf.b(th, gf.class);
                }
            }
            return !"none".equals(str2);
        } catch (Throwable th2) {
            uf.b(th2, gf.class);
            return false;
        }
    }
}
