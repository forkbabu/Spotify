package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.g;

/* renamed from: t6c  reason: default package */
public final /* synthetic */ class t6c implements g {
    public final /* synthetic */ c7c a;

    public /* synthetic */ t6c(c7c c7c) {
        this.a = c7c;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        c7c.e(this.a, (ContextTrack) obj);
    }
}
