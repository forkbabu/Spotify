package defpackage;

import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import defpackage.xtc;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: nuc  reason: default package */
final class nuc<T, R> implements l<IdentityV3$UserProfile, xtc.i> {
    public static final nuc a = new nuc();

    nuc() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public xtc.i apply(IdentityV3$UserProfile identityV3$UserProfile) {
        IdentityV3$UserProfile identityV3$UserProfile2 = identityV3$UserProfile;
        h.e(identityV3$UserProfile2, "userProfile");
        return new xtc.i(identityV3$UserProfile2);
    }
}
