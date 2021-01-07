package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;

/* renamed from: zsb  reason: default package */
public final /* synthetic */ class zsb implements l {
    public final /* synthetic */ vl2 a;

    public /* synthetic */ zsb(vl2 vl2) {
        this.a = vl2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(this.a.a((ContextTrack) obj));
    }
}
