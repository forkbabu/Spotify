package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;

/* renamed from: azb  reason: default package */
public final /* synthetic */ class azb implements l {
    public final /* synthetic */ vl2 a;

    public /* synthetic */ azb(vl2 vl2) {
        this.a = vl2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ContextTrack contextTrack = (ContextTrack) obj;
        return Boolean.valueOf(kxd.l(contextTrack) || this.a.a(contextTrack));
    }
}
