package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.i;
import com.facebook.login.LoginClient;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class n {
    private final i a;
    private String b;
    private String c;

    n(Context context, String str) {
        PackageInfo packageInfo;
        this.b = str;
        this.a = new i(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    static Bundle h(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    public String a() {
        return this.b;
    }

    public void b(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Bundle h = h(str);
        if (str3 != null) {
            h.putString("2_result", str3);
        }
        if (str4 != null) {
            h.putString("5_error_message", str4);
        }
        if (str5 != null) {
            h.putString("4_error_code", str5);
        }
        if (map != null && !map.isEmpty()) {
            h.putString("6_extras", new JSONObject(map).toString());
        }
        h.putString("3_method", str2);
        this.a.g("fb_mobile_login_method_complete", h);
    }

    public void c(String str, String str2) {
        Bundle h = h(str);
        h.putString("3_method", str2);
        this.a.g("fb_mobile_login_method_not_tried", h);
    }

    public void d(String str, String str2) {
        Bundle h = h(str);
        h.putString("3_method", str2);
        this.a.g("fb_mobile_login_method_start", h);
    }

    public void e(String str, Map<String, String> map, LoginClient.Result.Code code, Map<String, String> map2, Exception exc) {
        Bundle h = h(str);
        if (code != null) {
            h.putString("2_result", code.d());
        }
        if (!(exc == null || exc.getMessage() == null)) {
            h.putString("5_error_message", exc.getMessage());
        }
        JSONObject jSONObject = null;
        if (!map.isEmpty()) {
            jSONObject = new JSONObject(map);
        }
        if (map2 != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            h.putString("6_extras", jSONObject.toString());
        }
        this.a.g("fb_mobile_login_complete", h);
    }

    public void f(LoginClient.d dVar) {
        Bundle h = h(dVar.b());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("login_behavior", dVar.h().toString());
            jSONObject.put("request_code", LoginClient.j());
            jSONObject.put("permissions", TextUtils.join(",", dVar.i()));
            jSONObject.put("default_audience", dVar.e().toString());
            jSONObject.put("isReauthorize", dVar.k());
            String str = this.c;
            if (str != null) {
                jSONObject.put("facebookVersion", str);
            }
            h.putString("6_extras", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.a.h("fb_mobile_login_start", null, h);
    }

    public void g(String str, String str2, String str3) {
        Bundle h = h("");
        h.putString("2_result", LoginClient.Result.Code.ERROR.d());
        h.putString("5_error_message", str2);
        h.putString("3_method", str3);
        this.a.g(str, h);
    }
}
