package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.ViewProvider;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.player.model.ContextTrack;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: qh9  reason: default package */
public abstract class qh9<T extends ViewProvider> extends RecyclerView.b0 {
    private final T C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qh9(T t) {
        super(t.getView());
        h.e(t, ContextTrack.Metadata.KEY_PROVIDER);
        this.C = t;
    }

    public abstract void h0(y yVar, nmf<? super YourLibraryXEvent, f> nmf);

    /* access modifiers changed from: protected */
    public final T j0() {
        return this.C;
    }
}
