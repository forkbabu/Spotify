package com.spotify.music.features.yourlibrary.musicpages.follow;

import com.spotify.music.follow.j;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ FollowCompanion a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ b(FollowCompanion followCompanion, boolean z, String str) {
        this.a = followCompanion;
        this.b = z;
        this.c = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a(this.b, this.c, (j) obj);
    }
}
