package com.spotify.music.features.profile.saveprofile.effecthandlers;

import com.spotify.music.features.profile.saveprofile.domain.o;
import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

public final /* synthetic */ class w implements l {
    public static final /* synthetic */ w a = new w();

    private /* synthetic */ w() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        IdentityV3$UserProfile identityV3$UserProfile = (IdentityV3$UserProfile) obj;
        String d = dqa.d(identityV3$UserProfile);
        String i = identityV3$UserProfile.n().i();
        if (d == null) {
            d = "";
        }
        h.e(i, "displayName");
        h.e(d, "imageUrl");
        return new o.c(true, i, d);
    }
}
