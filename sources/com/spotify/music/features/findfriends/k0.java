package com.spotify.music.features.findfriends;

import com.google.common.base.Function;
import com.spotify.music.features.findfriends.model.UserModel;

public final /* synthetic */ class k0 implements Function {
    public static final /* synthetic */ k0 a = new k0();

    private /* synthetic */ k0() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((UserModel) obj).uri();
    }
}
