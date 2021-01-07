package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: mm9  reason: default package */
public abstract class mm9 {
    public static mm9 a(String str, String str2) {
        return new km9(str, str2);
    }

    public static mm9 b(JSONObject jSONObject) {
        try {
            return new km9(jSONObject.getString("uri"), jSONObject.getString("name"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public abstract String c();

    public abstract String d();
}
