package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.yourepisodes.domain.a;
import kotlin.jvm.internal.h;

/* renamed from: n09  reason: default package */
public abstract class n09 extends RecyclerView.b0 {
    private final uoc C;
    private final ngc D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n09(uoc uoc, ngc ngc) {
        super(uoc.getView());
        h.e(uoc, "cardView");
        h.e(ngc, "cardBinder");
        this.C = uoc;
        this.D = ngc;
    }

    public abstract void h0(a aVar, a[] aVarArr);

    /* access modifiers changed from: protected */
    public final ngc j0() {
        return this.D;
    }

    /* access modifiers changed from: protected */
    public final uoc l0() {
        return this.C;
    }

    public abstract void m0();
}
