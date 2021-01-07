package com.spotify.music;

import com.spotify.android.flags.c;

public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ MainActivity a;
    public final /* synthetic */ c b;

    public /* synthetic */ m(MainActivity mainActivity, c cVar) {
        this.a = mainActivity;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.a;
        mainActivity.g0.c(this.b);
    }
}
