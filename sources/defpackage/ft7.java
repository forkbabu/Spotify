package defpackage;

import com.spotify.mobius.e0;
import com.spotify.music.features.profile.model.ProfileListItem;
import defpackage.kt7;
import defpackage.lt7;
import kotlin.jvm.internal.h;

/* renamed from: ft7  reason: default package */
public final /* synthetic */ class ft7 implements nmf {
    public static final /* synthetic */ ft7 a = new ft7();

    private /* synthetic */ ft7() {
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        ProfileListItem a2 = ((lt7.d) obj).a();
        String i = a2.i();
        h.e(i, "uri");
        return e0.a(z42.l(new kt7.c(i, !a2.b().e())));
    }
}
