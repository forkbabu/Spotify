package defpackage;

import com.spotify.encore.Component;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

/* renamed from: oh9  reason: default package */
public abstract class oh9<M, E> extends nh9<y.a, M, E> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oh9(Component<M, E> component) {
        super(component, j.b(y.a.class));
        h.e(component, ContextTrack.Metadata.KEY_PROVIDER);
    }
}
