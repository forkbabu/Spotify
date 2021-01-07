package com.spotify.music.spotlets.apprater;

import io.reactivex.functions.n;

public final /* synthetic */ class d implements n {
    public final /* synthetic */ AppRaterFragment a;
    public final /* synthetic */ long b;

    public /* synthetic */ d(AppRaterFragment appRaterFragment, long j) {
        this.a = appRaterFragment;
        this.b = j;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        AppRaterFragment appRaterFragment = this.a;
        String str = (String) obj;
        return appRaterFragment.q0 > 20 && appRaterFragment.l0.d() > this.b;
    }
}
