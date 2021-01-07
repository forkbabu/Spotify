package com.spotify.music.features.yourlibrary.container.utils;

import io.reactivex.functions.l;

public final /* synthetic */ class f implements l {
    public final /* synthetic */ AvatarLoader a;

    public /* synthetic */ f(AvatarLoader avatarLoader) {
        this.a = avatarLoader;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return AvatarLoader.a(this.a, (String) obj);
    }
}
