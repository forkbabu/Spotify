package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.d0;
import com.facebook.internal.f0;
import com.facebook.login.LoginClient;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

/* access modifiers changed from: package-private */
public abstract class r extends p {
    r(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public boolean i(int i, int i2, Intent intent) {
        LoginClient.Result result;
        LoginClient.d dVar = this.b.p;
        if (intent == null) {
            result = LoginClient.Result.a(dVar, "Operation canceled");
        } else {
            String str = null;
            if (i2 == 0) {
                Bundle extras = intent.getExtras();
                String string = extras.getString(AppProtocol.LogMessage.SEVERITY_ERROR);
                if (string == null) {
                    string = extras.getString("error_type");
                }
                if (extras.get("error_code") != null) {
                    str = extras.get("error_code").toString();
                }
                if ("CONNECTION_FAILURE".equals(str)) {
                    String string2 = extras.getString("error_message");
                    if (string2 == null) {
                        string2 = extras.getString("error_description");
                    }
                    result = LoginClient.Result.c(dVar, string, string2, str);
                } else {
                    result = LoginClient.Result.a(dVar, string);
                }
            } else if (i2 != -1) {
                result = LoginClient.Result.b(dVar, "Unexpected resultCode from authorization.", null);
            } else {
                Bundle extras2 = intent.getExtras();
                String string3 = extras2.getString(AppProtocol.LogMessage.SEVERITY_ERROR);
                if (string3 == null) {
                    string3 = extras2.getString("error_type");
                }
                String obj = extras2.get("error_code") != null ? extras2.get("error_code").toString() : null;
                String string4 = extras2.getString("error_message");
                if (string4 == null) {
                    string4 = extras2.getString("error_description");
                }
                String string5 = extras2.getString("e2e");
                if (!f0.C(string5)) {
                    g(string5);
                }
                if (string3 == null && obj == null && string4 == null) {
                    try {
                        result = LoginClient.Result.e(dVar, p.c(dVar.i(), extras2, AccessTokenSource.FACEBOOK_APPLICATION_WEB, dVar.a()));
                    } catch (FacebookException e) {
                        result = LoginClient.Result.b(dVar, null, e.getMessage());
                    }
                } else {
                    if (string3.equals("logged_out")) {
                        a.p = true;
                    } else if (!d0.a.contains(string3)) {
                        if (d0.b.contains(string3)) {
                            result = LoginClient.Result.a(dVar, null);
                        } else {
                            result = LoginClient.Result.c(dVar, string3, string4, obj);
                        }
                    }
                    result = null;
                }
            }
        }
        if (result != null) {
            this.b.e(result);
        } else {
            this.b.l();
        }
        return true;
    }

    r(Parcel parcel) {
        super(parcel);
    }
}
