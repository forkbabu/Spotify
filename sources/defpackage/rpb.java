package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: rpb  reason: default package */
public final /* synthetic */ class rpb implements l {
    public static final /* synthetic */ rpb a = new rpb();

    private /* synthetic */ rpb() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((PlayerState) obj).track().get().uri();
    }
}
