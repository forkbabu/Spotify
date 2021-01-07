package com.spotify.music;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.loginflow.LoginActivity;

public final /* synthetic */ class h {
    public final /* synthetic */ MainActivity a;

    public /* synthetic */ h(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0012: APUT  (r1v2 java.lang.Object[]), (0 ??[int, short, byte, char]), (r2v0 java.lang.String) */
    public final void a(boolean z) {
        MainActivity mainActivity = this.a;
        int i = MainActivity.W0;
        mainActivity.getClass();
        Object[] objArr = new Object[1];
        objArr[0] = z ? "onLoggedInSessionEnded" : "goToLogin";
        Logger.b("MainActivityLifecycle %s", objArr);
        Intent intent = mainActivity.getIntent();
        if (z) {
            intent = mainActivity.t0.a(mainActivity).a;
        }
        mainActivity.Z.m();
        intent.putExtra("Forwarded intent", "forwarded");
        mainActivity.startActivity(LoginActivity.V0(mainActivity, intent, 268468224, z));
        mainActivity.overridePendingTransition(0, 0);
    }
}
