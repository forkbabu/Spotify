package com.spotify.music;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.goldenpath.a;

public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ MainActivity a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ j(MainActivity mainActivity, Bundle bundle, Intent intent) {
        this.a = mainActivity;
        this.b = bundle;
        this.c = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.a;
        Bundle bundle = this.b;
        Intent intent = this.c;
        intent.setExtrasClassLoader(mainActivity.getClassLoader());
        mainActivity.K.a(intent.getData(), mainActivity.u0.a(mainActivity));
        a.b(mainActivity);
        if (bundle == null && "android.intent.action.MAIN".equals(intent.getAction())) {
            mainActivity.U.u(intent);
        }
    }
}
