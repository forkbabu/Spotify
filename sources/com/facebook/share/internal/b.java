package com.facebook.share.internal;

import com.facebook.FacebookRequestError;
import com.facebook.m;
import com.facebook.q;
import com.facebook.share.internal.DeviceShareDialogFragment;
import org.json.JSONException;
import org.json.JSONObject;

class b implements m.c {
    final /* synthetic */ DeviceShareDialogFragment a;

    b(DeviceShareDialogFragment deviceShareDialogFragment) {
        this.a = deviceShareDialogFragment;
    }

    @Override // com.facebook.m.c
    public void b(q qVar) {
        FacebookRequestError e = qVar.e();
        if (e != null) {
            this.a.e5(e);
            return;
        }
        JSONObject f = qVar.f();
        DeviceShareDialogFragment.c cVar = new DeviceShareDialogFragment.c();
        try {
            cVar.e(f.getString("user_code"));
            cVar.c(f.getLong("expires_in"));
            this.a.f5(cVar);
        } catch (JSONException unused) {
            this.a.e5(new FacebookRequestError(0, "", "Malformed server response"));
        }
    }
}
