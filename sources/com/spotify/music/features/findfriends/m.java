package com.spotify.music.features.findfriends;

import com.google.common.base.Optional;
import com.spotify.music.features.findfriends.p0;
import com.spotify.music.libs.facebook.SocialState;
import io.reactivex.functions.l;

public final /* synthetic */ class m implements l {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        p0.a d = p0.a.d();
        d.d(Optional.of((SocialState) obj));
        return d.a();
    }
}
