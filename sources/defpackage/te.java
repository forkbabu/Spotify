package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: te  reason: default package */
public final class te {
    private static final Set<te> d = new HashSet();
    private String a;
    private List<String> b;
    private String c;

    private te(String str, List<String> list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    private static void a(JSONObject jSONObject) {
        if (!uf.c(te.class)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("k");
                        String optString2 = optJSONObject.optString("v");
                        if (!optString.isEmpty()) {
                            d.add(new te(next, Arrays.asList(optString.split(",")), optString2));
                        }
                    }
                }
            } catch (Throwable th) {
                uf.b(th, te.class);
            }
        }
    }

    public static Set<String> b() {
        if (uf.c(te.class)) {
            return null;
        }
        try {
            HashSet hashSet = new HashSet();
            for (te teVar : d) {
                hashSet.add(teVar.d());
            }
            return hashSet;
        } catch (Throwable th) {
            uf.b(th, te.class);
            return null;
        }
    }

    static Set<te> e() {
        if (uf.c(te.class)) {
            return null;
        }
        try {
            return new HashSet(d);
        } catch (Throwable th) {
            uf.b(th, te.class);
            return null;
        }
    }

    static void g(String str) {
        if (!uf.c(te.class)) {
            try {
                d.clear();
                a(new JSONObject(str));
            } catch (JSONException unused) {
            } catch (Throwable th) {
                uf.b(th, te.class);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List<String> c() {
        if (uf.c(this)) {
            return null;
        }
        try {
            return new ArrayList(this.b);
        } catch (Throwable th) {
            uf.b(th, this);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public String d() {
        if (uf.c(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            uf.b(th, this);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public String f() {
        if (uf.c(this)) {
            return null;
        }
        try {
            return this.c;
        } catch (Throwable th) {
            uf.b(th, this);
            return null;
        }
    }
}
