package com.spotify.music.features.ads;

import com.spotify.base.java.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

public class h0 {
    private p91 d(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j) {
        return new p91(null, null, null, str3, str4, str2, null, null, str5, null, str6, null, str, j, true);
    }

    public p91 a(String str, String str2, String str3, String str4) {
        return d(str, str2, str3, str4, "event_clicked", "", null, 0);
    }

    public p91 b(String str, String str2, String str3, String str4, String str5) {
        String str6;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", str5);
            str6 = jSONObject.toString();
        } catch (JSONException unused) {
            Logger.d("Unable to format json message", new Object[0]);
            str6 = "";
        }
        return d(str, str2, str3, str4, "event_errored", str6, null, 0);
    }

    public p91 c(String str, String str2, String str3, String str4) {
        return d(str, str2, str3, str4, "event_viewed", "", null, 0);
    }
}
