package io.branch.referral;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class b0 extends ServerRequest {
    public b0(String str, JSONObject jSONObject, Context context) {
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

    @Override // io.branch.referral.ServerRequest
    public void t(f0 f0Var, Branch branch) {
        JSONObject h = h();
        if (h != null) {
            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.Bucket;
            if (h.has(defines$Jsonkey.d())) {
                Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.Amount;
                if (h.has(defines$Jsonkey2.d())) {
                    try {
                        int i = h.getInt(defines$Jsonkey2.d());
                        String string = h.getString(defines$Jsonkey.d());
                        this.c.I(string, this.c.j(string) - i);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
