package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.a;
import com.facebook.appevents.i;
import com.facebook.internal.f0;
import com.facebook.login.LoginClient;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public abstract class p implements Parcelable {
    Map<String, String> a;
    protected LoginClient b;

    p(LoginClient loginClient) {
        this.b = loginClient;
    }

    public static a c(Collection<String> collection, Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        Date l = f0.l(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        Date l2 = f0.l(bundle, "data_access_expiration_time", new Date(0));
        String string2 = bundle.getString("granted_scopes");
        ArrayList arrayList = !f0.C(string2) ? new ArrayList(Arrays.asList(string2.split(","))) : collection;
        String string3 = bundle.getString("denied_scopes");
        ArrayList arrayList2 = !f0.C(string3) ? new ArrayList(Arrays.asList(string3.split(","))) : null;
        String string4 = bundle.getString("expired_scopes");
        ArrayList arrayList3 = !f0.C(string4) ? new ArrayList(Arrays.asList(string4.split(","))) : null;
        if (f0.C(string)) {
            return null;
        }
        String string5 = bundle.getString("graph_domain");
        String string6 = bundle.getString("signed_request");
        if (string6 == null || string6.isEmpty()) {
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = string6.split("\\.");
            if (split.length == 2) {
                return new a(string, str, new JSONObject(new String(Base64.decode(split[1], 0), Constants.ENCODING)).getString("user_id"), arrayList, arrayList2, arrayList3, accessTokenSource, l, new Date(), l2, string5);
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new FacebookException("Failed to retrieve user_id from signed_request");
    }

    /* access modifiers changed from: protected */
    public void a(String str, Object obj) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, obj == null ? null : obj.toString());
    }

    /* access modifiers changed from: package-private */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public String e(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", f());
            j(jSONObject);
        } catch (JSONException e) {
            e.getMessage();
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: package-private */
    public abstract String f();

    /* access modifiers changed from: protected */
    public void g(String str) {
        String a2 = this.b.p.a();
        i iVar = new i(this.b.f(), a2);
        Bundle E = je.E("fb_web_login_e2e", str);
        E.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        E.putString("app_id", a2);
        iVar.h("fb_dialogs_web_login_dialog_complete", null, E);
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i, int i2, Intent intent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void j(JSONObject jSONObject) {
    }

    /* access modifiers changed from: package-private */
    public abstract boolean k(LoginClient.d dVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        f0.U(parcel, this.a);
    }

    p(Parcel parcel) {
        this.a = f0.O(parcel);
    }
}
