package defpackage;

import com.spotify.mobius.e0;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import defpackage.n19;
import defpackage.o19;

/* renamed from: g19  reason: default package */
public final /* synthetic */ class g19 implements ti0 {
    public final /* synthetic */ q19 a;

    public /* synthetic */ g19(q19 q19) {
        this.a = q19;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        q19 q19 = this.a;
        o19.f fVar = (o19.f) obj;
        if (!q19.a().isPresent()) {
            return e0.h();
        }
        n19.f fVar2 = new n19.f(q19.a().get());
        if (q19.g().c()) {
            return e0.a(z42.l(fVar2));
        }
        return e0.a(z42.l(fVar2, new n19.i(YourLibraryTabsCollapseState.EXPANDED, true)));
    }
}
