package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.g;

/* renamed from: nub  reason: default package */
public final /* synthetic */ class nub implements g {
    public final /* synthetic */ wub a;

    public /* synthetic */ nub(wub wub) {
        this.a = wub;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        wub.b(this.a, (ContextTrack) obj);
    }
}
