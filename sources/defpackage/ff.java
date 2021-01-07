package defpackage;

import com.facebook.appevents.AppEvent;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.n;
import com.facebook.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ff  reason: default package */
public final class ff {
    private static boolean a = false;
    private static final List<a> b = new ArrayList();
    private static final Set<String> c = new HashSet();

    /* access modifiers changed from: package-private */
    /* renamed from: ff$a */
    public static class a {
        String a;
        List<String> b;

        a(String str, List<String> list) {
            this.a = str;
            this.b = list;
        }
    }

    public static void a() {
        if (!uf.c(ff.class)) {
            try {
                a = true;
                b();
            } catch (Throwable th) {
                uf.b(th, ff.class);
            }
        }
    }

    private static synchronized void b() {
        ArrayList arrayList;
        synchronized (ff.class) {
            if (!uf.c(ff.class)) {
                try {
                    n n = FetchedAppSettingsManager.n(k.e(), false);
                    if (n != null) {
                        String k = n.k();
                        if (!k.isEmpty()) {
                            JSONObject jSONObject = new JSONObject(k);
                            b.clear();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                                if (jSONObject2 != null) {
                                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                                        c.add(next);
                                    } else {
                                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                        a aVar = new a(next, new ArrayList());
                                        if (optJSONArray != null) {
                                            try {
                                                arrayList = new ArrayList();
                                                for (int i = 0; i < optJSONArray.length(); i++) {
                                                    arrayList.add(optJSONArray.getString(i));
                                                }
                                            } catch (JSONException unused) {
                                                arrayList = new ArrayList();
                                            }
                                            aVar.b = arrayList;
                                        }
                                        b.add(aVar);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception unused2) {
                } catch (Throwable th) {
                    uf.b(th, ff.class);
                }
            }
        }
    }

    public static void c(Map<String, String> map, String str) {
        if (!uf.c(ff.class)) {
            try {
                if (a) {
                    ArrayList arrayList = new ArrayList(map.keySet());
                    Iterator it = new ArrayList(b).iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar.a.equals(str)) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                String str2 = (String) it2.next();
                                if (aVar.b.contains(str2)) {
                                    map.remove(str2);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                uf.b(th, ff.class);
            }
        }
    }

    public static void d(List<AppEvent> list) {
        if (!uf.c(ff.class)) {
            try {
                if (a) {
                    Iterator<AppEvent> it = list.iterator();
                    while (it.hasNext()) {
                        if (c.contains(it.next().d())) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                uf.b(th, ff.class);
            }
        }
    }
}
