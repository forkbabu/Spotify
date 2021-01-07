package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: vpb  reason: default package */
public final /* synthetic */ class vpb implements l {
    public static final /* synthetic */ vpb a = new vpb();

    private /* synthetic */ vpb() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((PlayerState) obj).contextUri();
    }
}
