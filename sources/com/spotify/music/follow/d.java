package com.spotify.music.follow;

import com.spotify.music.follow.FollowManagerImpl;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ FollowManagerImpl.a b;

    public /* synthetic */ d(boolean z, FollowManagerImpl.a aVar) {
        this.a = z;
        this.b = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        FollowManagerImpl.l(this.a, this.b, (Throwable) obj);
    }
}
