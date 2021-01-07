package com.spotify.music.features.findfriends;

import com.google.common.base.Optional;
import com.spotify.music.features.findfriends.model.FindFriendsModel;
import io.reactivex.functions.l;

public final /* synthetic */ class f0 implements l {
    public static final /* synthetic */ f0 a = new f0();

    private /* synthetic */ f0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (FindFriendsModel) ((Optional) obj).get();
    }
}
