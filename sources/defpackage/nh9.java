package defpackage;

import com.spotify.encore.Component;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.player.model.ContextTrack;
import kotlin.f;
import kotlin.jvm.internal.h;
import kotlin.reflect.c;

/* renamed from: nh9  reason: default package */
public abstract class nh9<I extends y, M, E> extends qh9<Component<M, E>> {
    private final c<I> D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nh9(Component<M, E> component, c<I> cVar) {
        super(component);
        h.e(component, ContextTrack.Metadata.KEY_PROVIDER);
        h.e(cVar, "klass");
        this.D = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.spotify.music.features.yourlibraryx.view.y */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qh9
    public void h0(y yVar, nmf<? super YourLibraryXEvent, f> nmf) {
        h.e(yVar, "item");
        h.e(nmf, "output");
        c<I> cVar = this.D;
        h.e(cVar, "$this$cast");
        if (cVar.a(yVar)) {
            ((Component) j0()).render(m0(yVar));
            l0(yVar, nmf);
            return;
        }
        StringBuilder V0 = je.V0("Value cannot be cast to ");
        V0.append(cVar.d());
        throw new ClassCastException(V0.toString());
    }

    public abstract void l0(I i, nmf<? super YourLibraryXEvent, f> nmf);

    public abstract M m0(I i);
}
