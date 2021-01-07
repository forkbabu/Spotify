package com.facebook.share.internal;

import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.internal.f0;
import com.facebook.share.model.o;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class g0 implements r {
    g0() {
    }

    @Override // com.facebook.share.internal.r
    public JSONObject a(o oVar) {
        Uri f = oVar.f();
        if (f0.E(f)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", f.toString());
                return jSONObject;
            } catch (JSONException e) {
                throw new FacebookException("Unable to attach images", e);
            }
        } else {
            throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
        }
    }
}
