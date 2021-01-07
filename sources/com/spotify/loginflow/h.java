package com.spotify.loginflow;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.session.model.LoginResponse;
import io.reactivex.functions.g;

public final /* synthetic */ class h implements g {
    public final /* synthetic */ QuickLoginActivity a;

    public /* synthetic */ h(QuickLoginActivity quickLoginActivity) {
        this.a = quickLoginActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        String str;
        QuickLoginActivity quickLoginActivity = this.a;
        LoginResponse loginResponse = (LoginResponse) obj;
        boolean booleanExtra = quickLoginActivity.getIntent().getBooleanExtra("startMainActivityAfterLogin", true);
        Logger.b("QuickLoginActivity - onSuccess. shouldStartMainActivity: %s", Boolean.valueOf(booleanExtra));
        Logger.b("QuickLoginActivity - LoginResponse:  %s", (String) loginResponse.map(l.a, m.a, k.a, i.a, j.a));
        if (!loginResponse.isSuccess()) {
            if (loginResponse.isError()) {
                StringBuilder V0 = je.V0("Error message: ");
                V0.append(loginResponse.asError().error());
                str = V0.toString();
            } else {
                str = "";
            }
            throw new AssertionError(je.x0("The user could not be logged in. ", str));
        }
        if (booleanExtra) {
            quickLoginActivity.startActivity(quickLoginActivity.getPackageManager().getLaunchIntentForPackage(quickLoginActivity.getPackageName()));
        }
        Logger.b("QuickLoginActivity - finish", new Object[0]);
        quickLoginActivity.finish();
    }
}
