package defpackage;

import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.f0;
import com.facebook.internal.n;
import com.facebook.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hf  reason: default package */
public final class hf {
    private static boolean a = false;
    private static final List<a> b = new ArrayList();
    private static final Set<String> c = new CopyOnWriteArraySet();

    /* access modifiers changed from: package-private */
    /* renamed from: hf$a */
    public static class a {
        String a;
        Map<String, String> b;

        a(String str, Map<String, String> map) {
            this.a = str;
            this.b = map;
        }
    }

    public static void a() {
        if (!uf.c(hf.class)) {
            try {
                a = true;
                c();
            } catch (Throwable th) {
                uf.b(th, hf.class);
            }
        }
    }

    private static String b(String str, String str2) {
        if (uf.c(hf.class)) {
            return null;
        }
        try {
            Iterator it = new ArrayList(b).iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar != null) {
                    if (str.equals(aVar.a)) {
                        for (String str3 : aVar.b.keySet()) {
                            if (str2.equals(str3)) {
                                return aVar.b.get(str3);
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            uf.b(th, hf.class);
        }
        return null;
    }

    private static void c() {
        String k;
        if (!uf.c(hf.class)) {
            try {
                n n = FetchedAppSettingsManager.n(k.e(), false);
                if (n != null && (k = n.k()) != null) {
                    if (!k.isEmpty()) {
                        JSONObject jSONObject = new JSONObject(k);
                        b.clear();
                        c.clear();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (jSONObject2 != null) {
                                JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                                a aVar = new a(next, new HashMap());
                                if (optJSONObject != null) {
                                    aVar.b = f0.g(optJSONObject);
                                    b.add(aVar);
                                }
                                if (jSONObject2.has("process_event_name")) {
                                    c.add(aVar.a);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                uf.b(th, hf.class);
            }
        }
    }

    public static String d(String str) {
        if (uf.c(hf.class)) {
            return null;
        }
        try {
            if (!a) {
                return str;
            }
            boolean z = false;
            if (!uf.c(hf.class)) {
                try {
                    z = c.contains(str);
                } catch (Throwable th) {
                    uf.b(th, hf.class);
                }
            }
            return z ? "_removed_" : str;
        } catch (Throwable th2) {
            uf.b(th2, hf.class);
            return null;
        }
    }

    public static void e(Map<String, String> map, String str) {
        if (!uf.c(hf.class)) {
            try {
                if (a) {
                    HashMap hashMap = new HashMap();
                    Iterator it = new ArrayList(map.keySet()).iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        String b2 = b(str, str2);
                        if (b2 != null) {
                            hashMap.put(str2, b2);
                            map.remove(str2);
                        }
                    }
                    if (hashMap.size() > 0) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : hashMap.entrySet()) {
                                jSONObject.put((String) entry.getKey(), entry.getValue());
                            }
                            map.put("_restrictedParams", jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                uf.b(th, hf.class);
            }
        }
    }
}
