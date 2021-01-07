package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.g;

/* renamed from: w6c  reason: default package */
public final /* synthetic */ class w6c implements g {
    public final /* synthetic */ l7c a;

    public /* synthetic */ w6c(l7c l7c) {
        this.a = l7c;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        l7c.a(this.a, (ContextTrack) obj);
    }
}
