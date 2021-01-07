package com.spotify.music.features.findfriends;

import com.spotify.music.features.findfriends.model.FindFriendsModel;
import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((FindFriendsModel) obj).results();
    }
}
