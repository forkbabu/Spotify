package com.spotify.music.libs.facebook;

import io.reactivex.functions.n;

public final /* synthetic */ class i implements n {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        int i = FacebookPlaceholderActivity.P;
        return ((SocialEvent) obj).socialError() == SocialError.SERVICE_CONNECT_NOT_PERMITTED;
    }
}
