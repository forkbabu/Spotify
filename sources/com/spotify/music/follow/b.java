package com.spotify.music.follow;

import io.reactivex.functions.g;
import retrofit2.v;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;

    public /* synthetic */ b(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        FollowManagerImpl.h(this.a, this.b, (v) obj);
    }
}
