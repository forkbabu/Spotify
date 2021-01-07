package io.branch.referral;

import android.content.Context;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class t extends ServerRequest {
    private boolean i = true;

    public t(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    @Override // io.branch.referral.ServerRequest
    public void b() {
    }

    @Override // io.branch.referral.ServerRequest
    public void m(int i2, String str) {
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
            f0Var.b().getString("url");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.branch.referral.ServerRequest
    public boolean v() {
        return true;
    }
}
