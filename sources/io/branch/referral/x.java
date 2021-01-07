package io.branch.referral;

import android.content.Context;
import io.branch.referral.Branch;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class x extends ServerRequest {
    Branch.c i;

    public x(Context context, Branch.c cVar, String str) {
        super(context, Defines$RequestPath.IdentifyUser.d());
        this.i = cVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Defines$Jsonkey.IdentityID.d(), this.c.n());
            jSONObject.put(Defines$Jsonkey.DeviceFingerprintID.d(), this.c.k());
            jSONObject.put(Defines$Jsonkey.SessionID.d(), this.c.B());
            if (!this.c.u().equals("bnc_no_value")) {
                jSONObject.put(Defines$Jsonkey.LinkClickID.d(), this.c.u());
            }
            jSONObject.put(Defines$Jsonkey.Identity.d(), str);
            x(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            this.g = true;
        }
    }

    @Override // io.branch.referral.ServerRequest
    public void b() {
        this.i = null;
    }

    @Override // io.branch.referral.ServerRequest
    public void m(int i2, String str) {
        if (this.i != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Branch.c cVar = this.i;
            ((l3a) cVar).a.e(jSONObject, new f(je.x0("Trouble setting the user alias. ", str), i2));
        }
    }

    @Override // io.branch.referral.ServerRequest
    public boolean n() {
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    public void t(f0 f0Var, Branch branch) {
        try {
            if (h() != null) {
                JSONObject h = h();
                Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.Identity;
                if (h.has(defines$Jsonkey.d())) {
                    this.c.O("bnc_identity", h().getString(defines$Jsonkey.d()));
                }
            }
            this.c.O("bnc_identity_id", f0Var.b().getString(Defines$Jsonkey.IdentityID.d()));
            this.c.O("bnc_user_url", f0Var.b().getString(Defines$Jsonkey.Link.d()));
            JSONObject b = f0Var.b();
            Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.ReferringData;
            if (b.has(defines$Jsonkey2.d())) {
                this.c.O("bnc_install_params", f0Var.b().getString(defines$Jsonkey2.d()));
            }
            Branch.c cVar = this.i;
            if (cVar != null) {
                ((l3a) cVar).a.e(branch.D(), null);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // io.branch.referral.ServerRequest
    public boolean y() {
        return true;
    }

    public x(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }
}
