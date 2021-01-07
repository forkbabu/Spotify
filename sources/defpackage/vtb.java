package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: vtb  reason: default package */
public final /* synthetic */ class vtb implements n {
    public static final /* synthetic */ vtb a = new vtb();

    private /* synthetic */ vtb() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((PlayerState) obj).track().isPresent();
    }
}
