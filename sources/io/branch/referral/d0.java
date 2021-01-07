package io.branch.referral;

import android.content.Context;
import io.branch.referral.Branch;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class d0 extends y {
    Branch.c j;

    d0(Context context, Branch.c cVar) {
        super(context, Defines$RequestPath.RegisterInstall.d());
        this.j = cVar;
        try {
            x(new JSONObject());
        } catch (JSONException e) {
            e.printStackTrace();
            this.g = true;
        }
    }

    @Override // io.branch.referral.y
    public String B() {
        return "install";
    }

    @Override // io.branch.referral.ServerRequest
    public void b() {
        this.j = null;
    }

    @Override // io.branch.referral.ServerRequest
    public void m(int i, String str) {
        if (this.j != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Branch.c cVar = this.j;
            ((l3a) cVar).a.e(jSONObject, new f(je.x0("Trouble initializing Branch. ", str), i));
        }
    }

    @Override // io.branch.referral.ServerRequest
    public boolean n() {
        return false;
    }

    @Override // io.branch.referral.y, io.branch.referral.ServerRequest
    public void r() {
        super.r();
        long v = this.c.v("bnc_referrer_click_ts");
        long v2 = this.c.v("bnc_install_begin_ts");
        if (v > 0) {
            try {
                h().put(Defines$Jsonkey.ClickedReferrerTimeStamp.d(), v);
            } catch (JSONException unused) {
                return;
            }
        }
        if (v2 > 0) {
            h().put(Defines$Jsonkey.InstallBeginTimeStamp.d(), v2);
        }
        if (!o.e().equals("bnc_no_value")) {
            h().put(Defines$Jsonkey.LinkClickID.d(), o.e());
        }
    }

    @Override // io.branch.referral.y, io.branch.referral.ServerRequest
    public void t(f0 f0Var, Branch branch) {
        super.t(f0Var, branch);
        try {
            this.c.O("bnc_user_url", f0Var.b().getString(Defines$Jsonkey.Link.d()));
            JSONObject b = f0Var.b();
            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.Data;
            if (b.has(defines$Jsonkey.d())) {
                JSONObject jSONObject = new JSONObject(f0Var.b().getString(defines$Jsonkey.d()));
                Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.Clicked_Branch_Link;
                if (jSONObject.has(defines$Jsonkey2.d()) && jSONObject.getBoolean(defines$Jsonkey2.d()) && this.c.q().equals("bnc_no_value") && this.c.t() == 1) {
                    this.c.O("bnc_install_params", f0Var.b().getString(defines$Jsonkey.d()));
                }
            }
            JSONObject b2 = f0Var.b();
            Defines$Jsonkey defines$Jsonkey3 = Defines$Jsonkey.LinkClickID;
            if (b2.has(defines$Jsonkey3.d())) {
                this.c.O("bnc_link_click_id", f0Var.b().getString(defines$Jsonkey3.d()));
            } else {
                this.c.O("bnc_link_click_id", "bnc_no_value");
            }
            if (f0Var.b().has(defines$Jsonkey.d())) {
                this.c.O("bnc_session_params", f0Var.b().getString(defines$Jsonkey.d()));
            } else {
                this.c.O("bnc_session_params", "bnc_no_value");
            }
            Branch.c cVar = this.j;
            if (cVar != null) {
                ((l3a) cVar).a.e(branch.G(), null);
            }
            this.c.O("bnc_app_version", l.d().a());
        } catch (Exception e) {
            e.printStackTrace();
        }
        xjf.c(branch.l);
        branch.l0();
    }

    d0(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }
}
