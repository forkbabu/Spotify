package com.spotify.music.features.settings;

import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import io.reactivex.functions.l;

public final /* synthetic */ class u implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ u(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = SettingsFragment.m1;
        return new u3(this.a, (IdentityV3$UserProfile) obj);
    }
}
