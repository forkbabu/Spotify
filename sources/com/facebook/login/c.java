package com.facebook.login;

import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.m;
import com.facebook.q;
import org.json.JSONException;
import org.json.JSONObject;

class c implements m.c {
    final /* synthetic */ DeviceAuthDialog a;

    c(DeviceAuthDialog deviceAuthDialog) {
        this.a = deviceAuthDialog;
    }

    @Override // com.facebook.m.c
    public void b(q qVar) {
        if (!DeviceAuthDialog.f5(this.a).get()) {
            FacebookRequestError e = qVar.e();
            if (e != null) {
                int i = e.i();
                if (i != 1349152) {
                    switch (i) {
                        case 1349172:
                        case 1349174:
                            DeviceAuthDialog.g5(this.a);
                            return;
                        case 1349173:
                            this.a.n5();
                            return;
                        default:
                            this.a.o5(qVar.e().f());
                            return;
                    }
                } else {
                    if (DeviceAuthDialog.h5(this.a) != null) {
                        sf.a(DeviceAuthDialog.h5(this.a).e());
                    }
                    if (DeviceAuthDialog.i5(this.a) != null) {
                        DeviceAuthDialog deviceAuthDialog = this.a;
                        deviceAuthDialog.s5(DeviceAuthDialog.i5(deviceAuthDialog));
                        return;
                    }
                    this.a.n5();
                }
            } else {
                try {
                    JSONObject f = qVar.f();
                    DeviceAuthDialog.j5(this.a, f.getString("access_token"), Long.valueOf(f.getLong("expires_in")), Long.valueOf(f.optLong("data_access_expiration_time")));
                } catch (JSONException e2) {
                    this.a.o5(new FacebookException(e2));
                }
            }
        }
    }
}
