package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.g;

/* renamed from: r6c  reason: default package */
public final /* synthetic */ class r6c implements g {
    public final /* synthetic */ z6c a;

    public /* synthetic */ r6c(z6c z6c) {
        this.a = z6c;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        z6c.b(this.a, (ContextTrack) obj);
    }
}
