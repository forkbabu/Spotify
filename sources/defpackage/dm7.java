package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobius.e0;
import com.spotify.music.features.profile.saveprofile.domain.SaveProfileState;
import com.spotify.music.features.profile.saveprofile.domain.r;
import defpackage.km7;
import defpackage.lm7;
import defpackage.mm7;

/* renamed from: dm7  reason: default package */
public final /* synthetic */ class dm7 implements nmf {
    public final /* synthetic */ mm7 a;

    public /* synthetic */ dm7(mm7 mm7) {
        this.a = mm7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        mm7 mm7 = this.a;
        lm7.v vVar = (lm7.v) obj;
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        if (mm7.n() && mm7.m().c() == SaveProfileState.SAVING && vVar.a().c() == SaveProfileState.IDLE) {
            builder.mo53add((ImmutableSet.Builder) km7.d.a);
        }
        r a2 = vVar.a();
        mm7.a o = mm7.o();
        o.k(a2);
        return e0.g(o.a(), builder.build());
    }
}
