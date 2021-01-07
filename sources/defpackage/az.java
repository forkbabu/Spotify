package defpackage;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: az  reason: default package */
public class az implements yy, ez {
    private dz a;

    private static String c(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // defpackage.ez
    public void a(dz dzVar) {
        this.a = dzVar;
        ty.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // defpackage.yy
    public void b(String str, Bundle bundle) {
        dz dzVar = this.a;
        if (dzVar != null) {
            try {
                dzVar.a("$A$:" + c(str, bundle));
            } catch (JSONException unused) {
                ty.f().h("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
