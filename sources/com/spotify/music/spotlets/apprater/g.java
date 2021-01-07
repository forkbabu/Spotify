package com.spotify.music.spotlets.apprater;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ AppRaterFragment a;

    public /* synthetic */ g(AppRaterFragment appRaterFragment) {
        this.a = appRaterFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        String str = (String) obj;
        this.a.q0++;
    }
}
