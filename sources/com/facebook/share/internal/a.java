package com.facebook.share.internal;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {
    private static final Map<Class<?>, d> a;

    /* renamed from: com.facebook.share.internal.a$a  reason: collision with other inner class name */
    static class C0075a implements d {
        C0075a() {
        }

        @Override // com.facebook.share.internal.a.d
        public void a(JSONObject jSONObject, String str, Object obj) {
            jSONObject.put(str, obj);
        }
    }

    static class b implements d {
        b() {
        }

        @Override // com.facebook.share.internal.a.d
        public void a(JSONObject jSONObject, String str, Object obj) {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : (String[]) obj) {
                jSONArray.put(str2);
            }
            jSONObject.put(str, jSONArray);
        }
    }

    static class c implements d {
        c() {
        }

        @Override // com.facebook.share.internal.a.d
        public void a(JSONObject jSONObject, String str, Object obj) {
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }

    public interface d {
        void a(JSONObject jSONObject, String str, Object obj);
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(String.class, new C0075a());
        hashMap.put(String[].class, new b());
        hashMap.put(JSONArray.class, new c());
    }

    public static JSONObject a(com.facebook.share.model.a aVar) {
        if (aVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : aVar.c()) {
            Object b2 = aVar.b(str);
            if (b2 != null) {
                d dVar = a.get(b2.getClass());
                if (dVar != null) {
                    dVar.a(jSONObject, str, b2);
                } else {
                    StringBuilder V0 = je.V0("Unsupported type: ");
                    V0.append(b2.getClass());
                    throw new IllegalArgumentException(V0.toString());
                }
            }
        }
        return jSONObject;
    }
}
