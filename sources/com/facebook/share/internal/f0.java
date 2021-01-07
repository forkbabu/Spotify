package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.facebook.internal.z;
import com.facebook.share.model.o;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class f0 implements r {
    final /* synthetic */ UUID a;
    final /* synthetic */ ArrayList b;

    f0(UUID uuid, ArrayList arrayList) {
        this.a = uuid;
        this.b = arrayList;
    }

    @Override // com.facebook.share.internal.r
    public JSONObject a(o oVar) {
        z.b a2 = c.a(this.a, oVar);
        if (a2 == null) {
            return null;
        }
        this.b.add(a2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", a2.g());
            if (oVar.g()) {
                jSONObject.put("user_generated", true);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new FacebookException("Unable to attach images", e);
        }
    }
}
