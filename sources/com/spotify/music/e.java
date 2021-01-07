package com.spotify.music;

import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ MainActivity a;
    public final /* synthetic */ c b;
    public final /* synthetic */ SessionState c;

    public /* synthetic */ e(MainActivity mainActivity, c cVar, SessionState sessionState) {
        this.a = mainActivity;
        this.b = cVar;
        this.c = sessionState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.s1(this.b, this.c);
    }
}
