package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobius.e0;
import com.spotify.music.libs.assistedcuration.model.RecsTrack;
import defpackage.fe9;
import defpackage.ge9;
import defpackage.ie9;

/* renamed from: be9  reason: default package */
public final /* synthetic */ class be9 implements ti0 {
    public final /* synthetic */ ie9 a;

    public /* synthetic */ be9(ie9 ie9) {
        this.a = ie9;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        ie9 ie9 = this.a;
        ImmutableList<RecsTrack> f = ((ge9.c) obj).f();
        ie9.a i = ie9.i();
        i.f(f);
        ie9 j = i.a().j(false);
        return e0.g(j, ImmutableSet.of(new fe9.a(j.e(), j.b())));
    }
}
