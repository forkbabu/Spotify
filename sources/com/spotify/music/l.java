package com.spotify.music;

import android.os.Bundle;

public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ MainActivity a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ o0 c;

    public /* synthetic */ l(MainActivity mainActivity, Bundle bundle, o0 o0Var) {
        this.a = mainActivity;
        this.b = bundle;
        this.c = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j1(this.b, this.c);
    }
}
