package com.spotify.music.features.findfriends;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.findfriends.model.FindFriendsModel;
import io.reactivex.t;
import io.reactivex.u;

public final /* synthetic */ class f implements u {
    public final /* synthetic */ q0 a;
    public final /* synthetic */ FindFriendsModel[] b;
    public final /* synthetic */ ImmutableList c;

    public /* synthetic */ f(q0 q0Var, FindFriendsModel[] findFriendsModelArr, ImmutableList immutableList) {
        this.a = q0Var;
        this.b = findFriendsModelArr;
        this.c = immutableList;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        this.a.e(this.b, this.c, tVar);
    }
}
