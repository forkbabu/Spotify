package io.branch.referral;

import android.app.Activity;
import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class s extends ServerRequest {
    public s(String str, JSONObject jSONObject, Context context) {
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
        String str;
        if (f0Var.b() != null) {
            JSONObject b = f0Var.b();
            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.BranchViewData;
            if (b.has(defines$Jsonkey.d()) && Branch.F().B() != null) {
                try {
                    JSONObject h = h();
                    if (h != null) {
                        Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.Event;
                        if (h.has(defines$Jsonkey2.d())) {
                            str = h.getString(defines$Jsonkey2.d());
                            Activity B = Branch.F().B();
                            j.k().p(f0Var.b().getJSONObject(defines$Jsonkey.d()), str, B, null);
                        }
                    }
                    str = "";
                    Activity B2 = Branch.F().B();
                    j.k().p(f0Var.b().getJSONObject(defines$Jsonkey.d()), str, B2, null);
                } catch (JSONException unused) {
                }
            }
        }
    }

    @Override // io.branch.referral.ServerRequest
    public boolean y() {
        return true;
    }
}
