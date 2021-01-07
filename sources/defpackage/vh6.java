package defpackage;

import com.spotify.encore.ViewProvider;
import kotlin.jvm.internal.h;

/* renamed from: vh6  reason: default package */
public class vh6 extends jh6 {
    private final ViewProvider E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vh6(ViewProvider viewProvider) {
        super(viewProvider.getView());
        h.e(viewProvider, "viewProvider");
        this.E = viewProvider;
    }

    public final ViewProvider m0() {
        return this.E;
    }
}
