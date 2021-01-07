package defpackage;

import com.spotify.music.features.profile.saveprofile.domain.r;
import defpackage.lm7;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: dn7  reason: default package */
public final /* synthetic */ class dn7 implements l {
    public static final /* synthetic */ dn7 a = new dn7();

    private /* synthetic */ dn7() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        r rVar = (r) obj;
        h.e(rVar, "saveProfileStatus");
        return new lm7.v(rVar);
    }
}
