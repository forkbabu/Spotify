package com.spotify.music.features.yourlibraryx.dataloading;

import com.google.protobuf.StringValue;
import com.spotify.music.features.yourlibraryx.domain.g;
import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class b<T, R> implements l<IdentityV3$UserProfile, g> {
    public static final b a = new b();

    b() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public g apply(IdentityV3$UserProfile identityV3$UserProfile) {
        IdentityV3$UserProfile identityV3$UserProfile2 = identityV3$UserProfile;
        h.e(identityV3$UserProfile2, "userProfile");
        StringValue o = identityV3$UserProfile2.o();
        h.d(o, "userProfile.username");
        String i = o.i();
        h.c(i);
        StringValue n = identityV3$UserProfile2.n();
        h.d(n, "userProfile.name");
        String i2 = n.i();
        h.c(i2);
        return new g(i, i2, dqa.d(identityV3$UserProfile2), true);
    }
}
