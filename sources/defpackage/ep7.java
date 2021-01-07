package defpackage;

import com.spotify.mobius.e0;
import com.spotify.music.features.profile.model.LoadingState;
import defpackage.mp7;
import defpackage.np7;

/* renamed from: ep7  reason: default package */
public final /* synthetic */ class ep7 implements nmf {
    public final /* synthetic */ np7 a;

    public /* synthetic */ ep7(np7 np7) {
        this.a = np7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        mp7.b bVar = (mp7.b) obj;
        np7.a n = this.a.n();
        n.i(LoadingState.FAILED);
        return e0.f(n.a());
    }
}
