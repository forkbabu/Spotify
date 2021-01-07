package com.spotify.music.features.yourlibrary.container.utils;

import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ c(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new u3(this.a, (IdentityV3$UserProfile) obj);
    }
}
