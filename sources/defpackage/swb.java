package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: swb  reason: default package */
public final /* synthetic */ class swb implements l {
    public static final /* synthetic */ swb a = new swb();

    private /* synthetic */ swb() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((PlayerState) obj).track();
    }
}
