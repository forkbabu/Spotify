package com.spotify.music.follow;

import com.spotify.music.follow.FollowManagerImpl;

public final /* synthetic */ class c implements FollowManagerImpl.a {
    public final /* synthetic */ FollowManagerImpl a;
    public final /* synthetic */ String b;

    public /* synthetic */ c(FollowManagerImpl followManagerImpl, String str) {
        this.a = followManagerImpl;
        this.b = str;
    }

    @Override // com.spotify.music.follow.FollowManagerImpl.a
    public final void a(boolean z) {
        this.a.a(this.b, z);
    }
}
