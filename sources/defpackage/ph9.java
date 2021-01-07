package defpackage;

import com.spotify.encore.Component;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.player.model.ContextTrack;
import kotlin.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

/* renamed from: ph9  reason: default package */
public final class ph9 extends nh9 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ph9(Component component) {
        super(component, j.b(y.b.class));
        h.e(component, ContextTrack.Metadata.KEY_PROVIDER);
    }

    @Override // defpackage.nh9
    public void l0(y yVar, nmf nmf) {
        h.e((y.b) yVar, "item");
        h.e(nmf, "output");
    }

    @Override // defpackage.nh9
    public Object m0(y yVar) {
        h.e((y.b) yVar, "item");
        return f.a;
    }
}
