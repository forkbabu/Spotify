package io.branch.referral;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import io.branch.referral.Branch;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public abstract class y extends ServerRequest {
    private final Context i;

    y(Context context, String str) {
        super(context, str);
        this.i = context;
    }

    static boolean D(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("open") || str.equalsIgnoreCase("install");
        }
        return false;
    }

    public abstract String B();

    /* access modifiers changed from: package-private */
    public boolean C(f0 f0Var) {
        if (f0Var.b() != null) {
            JSONObject b = f0Var.b();
            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.BranchViewData;
            if (b.has(defines$Jsonkey.d())) {
                try {
                    JSONObject jSONObject = f0Var.b().getJSONObject(defines$Jsonkey.d());
                    String B = B();
                    if (Branch.F().B() == null) {
                        return j.k().m(jSONObject, B);
                    }
                    Activity B2 = Branch.F().B();
                    boolean z = true;
                    if (B2 instanceof Branch.d) {
                        z = true ^ ((Branch.d) B2).a();
                    }
                    if (z) {
                        return j.k().p(jSONObject, B, B2, Branch.F());
                    }
                    return j.k().m(jSONObject, B);
                } catch (JSONException unused) {
                }
            }
        }
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    public void r() {
        JSONObject h = h();
        try {
            if (!this.c.e().equals("bnc_no_value")) {
                h.put(Defines$Jsonkey.AndroidAppLinkURL.d(), this.c.e());
            }
            if (!this.c.w().equals("bnc_no_value")) {
                h.put(Defines$Jsonkey.AndroidPushIdentifier.d(), this.c.w());
            }
            if (!this.c.l().equals("bnc_no_value")) {
                h.put(Defines$Jsonkey.External_Intent_URI.d(), this.c.l());
            }
            if (!this.c.C("bnc_external_intent_extra").equals("bnc_no_value")) {
                h.put(Defines$Jsonkey.External_Intent_Extra.d(), this.c.C("bnc_external_intent_extra"));
            }
        } catch (JSONException unused) {
        }
        Branch.t = false;
    }

    @Override // io.branch.referral.ServerRequest
    public void t(f0 f0Var, Branch branch) {
        Branch.F().k0();
        this.c.O("bnc_link_click_identifier", "bnc_no_value");
        this.c.O("bnc_google_search_install_identifier", "bnc_no_value");
        this.c.O("bnc_google_play_install_referrer_extras", "bnc_no_value");
        this.c.O("bnc_external_intent_uri", "bnc_no_value");
        this.c.O("bnc_external_intent_extra", "bnc_no_value");
        this.c.O("bnc_app_link", "bnc_no_value");
        this.c.O("bnc_push_identifier", "bnc_no_value");
        this.c.K(Boolean.FALSE);
        this.c.O("bnc_install_referrer", "bnc_no_value");
        this.c.L(false);
        if (this.c.v("bnc_previous_update_time") == 0) {
            r rVar = this.c;
            rVar.M("bnc_previous_update_time", rVar.v("bnc_last_known_update_time"));
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.branch.referral.ServerRequest
    public boolean v() {
        JSONObject h = h();
        if (!h.has(Defines$Jsonkey.AndroidAppLinkURL.d()) && !h.has(Defines$Jsonkey.AndroidPushIdentifier.d()) && !h.has(Defines$Jsonkey.LinkIdentifier.d())) {
            return false;
        }
        h.remove(Defines$Jsonkey.DeviceFingerprintID.d());
        h.remove(Defines$Jsonkey.IdentityID.d());
        h.remove(Defines$Jsonkey.FaceBookAppLinkChecked.d());
        h.remove(Defines$Jsonkey.External_Intent_Extra.d());
        h.remove(Defines$Jsonkey.External_Intent_URI.d());
        h.remove(Defines$Jsonkey.FirstInstallTime.d());
        h.remove(Defines$Jsonkey.LastUpdateTime.d());
        h.remove(Defines$Jsonkey.OriginalInstallTime.d());
        h.remove(Defines$Jsonkey.PreviousUpdateTime.d());
        h.remove(Defines$Jsonkey.InstallBeginTimeStamp.d());
        h.remove(Defines$Jsonkey.ClickedReferrerTimeStamp.d());
        h.remove(Defines$Jsonkey.HardwareID.d());
        h.remove(Defines$Jsonkey.IsHardwareIDReal.d());
        h.remove(Defines$Jsonkey.LocalIP.d());
        try {
            h.put(Defines$Jsonkey.TrackingDisabled.d(), true);
        } catch (JSONException unused) {
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // io.branch.referral.ServerRequest
    public void x(JSONObject jSONObject) {
        super.x(jSONObject);
        String a = l.d().a();
        if (!l.i(a)) {
            jSONObject.put(Defines$Jsonkey.AppVersion.d(), a);
        }
        jSONObject.put(Defines$Jsonkey.FaceBookAppLinkChecked.d(), this.c.f("bnc_triggered_by_fb_app_link"));
        jSONObject.put(Defines$Jsonkey.IsReferrable.d(), this.c.t());
        jSONObject.put(Defines$Jsonkey.Debug.d(), false);
        String a2 = l.d().a();
        long b = l.d().b();
        long e = l.d().e();
        int i2 = 2;
        if ("bnc_no_value".equals(this.c.C("bnc_app_version"))) {
            if (e - b < 86400000) {
                i2 = 0;
            }
            if (!TextUtils.isEmpty(this.i.getApplicationContext().getSharedPreferences("com.mobileapptracking", 0).getString("mat_id", null))) {
                i2 = 5;
            }
        } else if (this.c.C("bnc_app_version").equals(a2)) {
            i2 = 1;
        }
        jSONObject.put(Defines$Jsonkey.Update.d(), i2);
        jSONObject.put(Defines$Jsonkey.FirstInstallTime.d(), b);
        jSONObject.put(Defines$Jsonkey.LastUpdateTime.d(), e);
        long v = this.c.v("bnc_original_install_time");
        if (v == 0) {
            this.c.M("bnc_original_install_time", b);
        } else {
            b = v;
        }
        jSONObject.put(Defines$Jsonkey.OriginalInstallTime.d(), b);
        long v2 = this.c.v("bnc_last_known_update_time");
        if (v2 < e) {
            this.c.M("bnc_previous_update_time", v2);
            this.c.M("bnc_last_known_update_time", e);
        }
        jSONObject.put(Defines$Jsonkey.PreviousUpdateTime.d(), this.c.v("bnc_previous_update_time"));
        try {
            jSONObject.put(Defines$Jsonkey.Environment.d(), (l.d().j() ? Defines$Jsonkey.NativeApp : Defines$Jsonkey.InstantApp).d());
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.branch.referral.ServerRequest
    public boolean z() {
        return true;
    }

    y(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
        this.i = context;
    }
}
