package defpackage;

import com.spotify.mobius.e0;
import com.spotify.music.features.profile.model.LoadingState;
import defpackage.mp7;
import defpackage.np7;

/* renamed from: jp7  reason: default package */
public final /* synthetic */ class jp7 implements nmf {
    public final /* synthetic */ np7 a;

    public /* synthetic */ jp7(np7 np7) {
        this.a = np7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        np7.a n = this.a.n();
        n.i(LoadingState.LOADED);
        n.f(((mp7.e) obj).a());
        return e0.f(n.a());
    }
}
