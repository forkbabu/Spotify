package io.branch.referral;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import org.json.JSONObject;

public class f0 {
    private int a;
    private Object b;

    public f0(String str, int i) {
        this.a = i;
    }

    public String a() {
        try {
            JSONObject b2 = b();
            if (b2 == null || !b2.has(AppProtocol.LogMessage.SEVERITY_ERROR) || !b2.getJSONObject(AppProtocol.LogMessage.SEVERITY_ERROR).has("message")) {
                return "";
            }
            String string = b2.getJSONObject(AppProtocol.LogMessage.SEVERITY_ERROR).getString("message");
            if (string == null || string.trim().length() <= 0) {
                return string;
            }
            return string + ".";
        } catch (Exception unused) {
            return "";
        }
    }

    public JSONObject b() {
        Object obj = this.b;
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        return new JSONObject();
    }

    public int c() {
        return this.a;
    }

    public void d(Object obj) {
        this.b = obj;
    }
}
