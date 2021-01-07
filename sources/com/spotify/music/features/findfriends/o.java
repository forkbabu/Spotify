package com.spotify.music.features.findfriends;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.findfriends.model.FindFriendsModel;
import com.spotify.music.follow.j;
import com.spotify.music.follow.l;
import io.reactivex.t;

public final /* synthetic */ class o implements l {
    public final /* synthetic */ q0 a;
    public final /* synthetic */ FindFriendsModel[] b;
    public final /* synthetic */ t c;

    public /* synthetic */ o(q0 q0Var, FindFriendsModel[] findFriendsModelArr, t tVar) {
        this.a = q0Var;
        this.b = findFriendsModelArr;
        this.c = tVar;
    }

    @Override // com.spotify.music.follow.l
    public final void g(j jVar) {
        q0 q0Var = this.a;
        FindFriendsModel[] findFriendsModelArr = this.b;
        t tVar = this.c;
        q0Var.getClass();
        findFriendsModelArr[0] = FindFriendsModel.create(ImmutableList.copyOf(Collections2.transform((Iterable) findFriendsModelArr[0].results(), (Function) new n(jVar))));
        tVar.onNext(findFriendsModelArr[0]);
    }
}
