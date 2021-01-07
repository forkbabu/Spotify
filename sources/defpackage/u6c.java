package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.g;

/* renamed from: u6c  reason: default package */
public final /* synthetic */ class u6c implements g {
    public final /* synthetic */ e7c a;

    public /* synthetic */ u6c(e7c e7c) {
        this.a = e7c;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        e7c.a(this.a, (ContextTrack) obj);
    }
}
