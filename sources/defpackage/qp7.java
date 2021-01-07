package defpackage;

import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import defpackage.mp7;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: qp7  reason: default package */
public final /* synthetic */ class qp7 implements l {
    public static final /* synthetic */ qp7 a = new qp7();

    private /* synthetic */ qp7() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        IdentityV3$UserProfile identityV3$UserProfile = (IdentityV3$UserProfile) obj;
        String d = dqa.d(identityV3$UserProfile);
        String i = identityV3$UserProfile.n().i();
        if (d == null) {
            d = "";
        }
        boolean i2 = identityV3$UserProfile.i().i();
        h.e(i, "displayName");
        h.e(d, "imageUrl");
        return new mp7.c(i, d, i2);
    }
}
