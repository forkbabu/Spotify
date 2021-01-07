package defpackage;

import com.facebook.internal.logging.b;
import com.facebook.k;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bg  reason: default package */
public class bg {
    private static boolean a;
    private static final b b = cg.c(dg.c(), eg.a());
    private static final Map<String, Integer> c = new HashMap();

    static {
        new Random();
    }

    protected static void a() {
        if (!a) {
            a = true;
            k.l().execute(new ag());
            ((cg) b).b();
        }
    }

    static void b(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONObject("monitoring_config").getJSONArray("sample_rates");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("key");
                int i2 = jSONObject2.getInt("value");
                if (!"default".equals(string)) {
                    c.put(string, Integer.valueOf(i2));
                }
            }
        } catch (JSONException unused) {
        }
    }
}
