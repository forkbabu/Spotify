package io.branch.referral;

import android.content.Context;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class w extends ServerRequest {
    public w(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    @Override // io.branch.referral.ServerRequest
    public void b() {
    }

    @Override // io.branch.referral.ServerRequest
    public String l() {
        return super.l() + this.c.n();
    }

    @Override // io.branch.referral.ServerRequest
    public void m(int i, String str) {
    }

    @Override // io.branch.referral.ServerRequest
    public boolean n() {
        return true;
    }

    @Override // io.branch.referral.ServerRequest
    public void t(f0 f0Var, Branch branch) {
        Iterator<String> keys = f0Var.b().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                int i = f0Var.b().getInt(next);
                this.c.j(next);
                this.c.I(next, i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
