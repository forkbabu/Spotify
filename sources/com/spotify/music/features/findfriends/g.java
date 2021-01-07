package com.spotify.music.features.findfriends;

import com.google.common.base.Optional;
import com.spotify.music.features.findfriends.model.FindFriendsModel;
import com.spotify.music.features.findfriends.p0;
import io.reactivex.functions.l;

public final /* synthetic */ class g implements l {
    public final /* synthetic */ p0 a;

    public /* synthetic */ g(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        p0.a d = this.a.d();
        d.b(Optional.of((FindFriendsModel) obj));
        return d.a();
    }
}
