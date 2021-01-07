package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;

/* renamed from: hnb  reason: default package */
public final /* synthetic */ class hnb implements l {
    public static final /* synthetic */ hnb a = new hnb();

    private /* synthetic */ hnb() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((ContextTrack) obj).uri();
    }
}
