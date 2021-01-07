package com.facebook.login;

import android.app.AlertDialog;
import com.facebook.FacebookException;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.f0;
import com.facebook.k;
import com.facebook.m;
import com.facebook.q;
import com.spotify.music.C0707R;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class f implements m.c {
    final /* synthetic */ String a;
    final /* synthetic */ Date b;
    final /* synthetic */ Date c;
    final /* synthetic */ DeviceAuthDialog d;

    f(DeviceAuthDialog deviceAuthDialog, String str, Date date, Date date2) {
        this.d = deviceAuthDialog;
        this.a = str;
        this.b = date;
        this.c = date2;
    }

    @Override // com.facebook.m.c
    public void b(q qVar) {
        if (!DeviceAuthDialog.f5(this.d).get()) {
            if (qVar.e() != null) {
                this.d.o5(qVar.e().f());
                return;
            }
            try {
                JSONObject f = qVar.f();
                String string = f.getString("id");
                f0.d u = f0.u(f);
                String string2 = f.getString("name");
                sf.a(DeviceAuthDialog.h5(this.d).e());
                if (!FetchedAppSettingsManager.j(k.e()).n().contains(SmartLoginOption.RequireConfirm) || DeviceAuthDialog.c5(this.d)) {
                    DeviceAuthDialog.l5(this.d, string, u, this.a, this.b, this.c);
                    return;
                }
                DeviceAuthDialog.d5(this.d, true);
                DeviceAuthDialog deviceAuthDialog = this.d;
                String str = this.a;
                Date date = this.b;
                Date date2 = this.c;
                String string3 = deviceAuthDialog.R2().getString(C0707R.string.com_facebook_smart_login_confirmation_title);
                String string4 = deviceAuthDialog.R2().getString(C0707R.string.com_facebook_smart_login_confirmation_continue_as);
                String string5 = deviceAuthDialog.R2().getString(C0707R.string.com_facebook_smart_login_confirmation_cancel);
                String format = String.format(string4, string2);
                AlertDialog.Builder builder = new AlertDialog.Builder(deviceAuthDialog.F2());
                builder.setMessage(string3).setCancelable(true).setNegativeButton(format, new e(deviceAuthDialog, string, u, str, date, date2)).setPositiveButton(string5, new d(deviceAuthDialog));
                builder.create().show();
            } catch (JSONException e) {
                this.d.o5(new FacebookException(e));
            }
        }
    }
}
