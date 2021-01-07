package io.branch.referral;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class c0 extends ServerRequest {
    public c0(Context context) {
        super(context, Defines$RequestPath.RegisterClose.d());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Defines$Jsonkey.DeviceFingerprintID.d(), this.c.k());
            jSONObject.put(Defines$Jsonkey.IdentityID.d(), this.c.n());
            jSONObject.put(Defines$Jsonkey.SessionID.d(), this.c.B());
            if (!this.c.u().equals("bnc_no_value")) {
                jSONObject.put(Defines$Jsonkey.LinkClickID.d(), this.c.u());
            }
            if (l.d() != null) {
                jSONObject.put(Defines$Jsonkey.AppVersion.d(), l.d().a());
            }
            x(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            this.g = true;
        }
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
        this.c.O("bnc_session_params", "bnc_no_value");
    }

    public c0(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }
}
