package io.branch.referral;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class z extends ServerRequest {
    public z(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    @Override // io.branch.referral.ServerRequest
    public void b() {
    }

    @Override // io.branch.referral.ServerRequest
    public void m(int i, String str) {
    }

    @Override // io.branch.referral.ServerRequest
    public boolean n() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // io.branch.referral.ServerRequest
    public boolean p() {
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    public void t(f0 f0Var, Branch branch) {
        try {
            this.c.O("bnc_session_id", f0Var.b().getString(Defines$Jsonkey.SessionID.d()));
            this.c.O("bnc_identity_id", f0Var.b().getString(Defines$Jsonkey.IdentityID.d()));
            this.c.O("bnc_user_url", f0Var.b().getString(Defines$Jsonkey.Link.d()));
            this.c.O("bnc_install_params", "bnc_no_value");
            this.c.O("bnc_session_params", "bnc_no_value");
            this.c.O("bnc_identity", "bnc_no_value");
            this.c.c();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
