package com.spotify.music;

import android.content.Intent;

public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ MainActivity a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ o(MainActivity mainActivity, Intent intent) {
        this.a = mainActivity;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.i1(this.b);
    }
}
