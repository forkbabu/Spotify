package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class d {
    private static final Map<Class<?>, h> a;

    static class a implements h {
        a() {
        }

        @Override // com.facebook.internal.d.h
        public void a(JSONObject jSONObject, String str, Object obj) {
            jSONObject.put(str, obj);
        }

        @Override // com.facebook.internal.d.h
        public void b(Bundle bundle, String str, Object obj) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    static class b implements h {
        b() {
        }

        @Override // com.facebook.internal.d.h
        public void a(JSONObject jSONObject, String str, Object obj) {
            jSONObject.put(str, obj);
        }

        @Override // com.facebook.internal.d.h
        public void b(Bundle bundle, String str, Object obj) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    static class c implements h {
        c() {
        }

        @Override // com.facebook.internal.d.h
        public void a(JSONObject jSONObject, String str, Object obj) {
            jSONObject.put(str, obj);
        }

        @Override // com.facebook.internal.d.h
        public void b(Bundle bundle, String str, Object obj) {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* renamed from: com.facebook.internal.d$d  reason: collision with other inner class name */
    static class C0071d implements h {
        C0071d() {
        }

        @Override // com.facebook.internal.d.h
        public void a(JSONObject jSONObject, String str, Object obj) {
            jSONObject.put(str, obj);
        }

        @Override // com.facebook.internal.d.h
        public void b(Bundle bundle, String str, Object obj) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    static class e implements h {
        e() {
        }

        @Override // com.facebook.internal.d.h
        public void a(JSONObject jSONObject, String str, Object obj) {
            jSONObject.put(str, obj);
        }

        @Override // com.facebook.internal.d.h
        public void b(Bundle bundle, String str, Object obj) {
            bundle.putString(str, (String) obj);
        }
    }

    static class f implements h {
        f() {
        }

        @Override // com.facebook.internal.d.h
        public void a(JSONObject jSONObject, String str, Object obj) {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : (String[]) obj) {
                jSONArray.put(str2);
            }
            jSONObject.put(str, jSONArray);
        }

        @Override // com.facebook.internal.d.h
        public void b(Bundle bundle, String str, Object obj) {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    static class g implements h {
        g() {
        }

        @Override // com.facebook.internal.d.h
        public void a(JSONObject jSONObject, String str, Object obj) {
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }

        @Override // com.facebook.internal.d.h
        public void b(Bundle bundle, String str, Object obj) {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList<String> arrayList = new ArrayList<>();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    arrayList.add((String) obj2);
                } else {
                    StringBuilder V0 = je.V0("Unexpected type in an array: ");
                    V0.append(obj2.getClass());
                    throw new IllegalArgumentException(V0.toString());
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    public interface h {
        void a(JSONObject jSONObject, String str, Object obj);

        void b(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Boolean.class, new a());
        hashMap.put(Integer.class, new b());
        hashMap.put(Long.class, new c());
        hashMap.put(Double.class, new C0071d());
        hashMap.put(String.class, new e());
        hashMap.put(String[].class, new f());
        hashMap.put(JSONArray.class, new g());
    }

    public static Bundle a(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!(obj == null || obj == JSONObject.NULL)) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) obj));
                } else {
                    h hVar = a.get(obj.getClass());
                    if (hVar != null) {
                        hVar.b(bundle, next, obj);
                    } else {
                        StringBuilder V0 = je.V0("Unsupported type: ");
                        V0.append(obj.getClass());
                        throw new IllegalArgumentException(V0.toString());
                    }
                }
            }
        }
        return bundle;
    }

    public static JSONObject b(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    for (String str2 : (List) obj) {
                        jSONArray.put(str2);
                    }
                    jSONObject.put(str, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(str, b((Bundle) obj));
                } else {
                    h hVar = a.get(obj.getClass());
                    if (hVar != null) {
                        hVar.a(jSONObject, str, obj);
                    } else {
                        StringBuilder V0 = je.V0("Unsupported type: ");
                        V0.append(obj.getClass());
                        throw new IllegalArgumentException(V0.toString());
                    }
                }
            }
        }
        return jSONObject;
    }
}
