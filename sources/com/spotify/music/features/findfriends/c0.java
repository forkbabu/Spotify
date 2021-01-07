package com.spotify.music.features.findfriends;

import com.google.common.base.Optional;
import com.spotify.music.features.findfriends.model.FindFriendsModel;
import io.reactivex.functions.l;

public final /* synthetic */ class c0 implements l {
    public static final /* synthetic */ c0 a = new c0();

    private /* synthetic */ c0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (FindFriendsModel) ((Optional) obj).or((Optional) FindFriendsModel.EMPTY);
    }
}
