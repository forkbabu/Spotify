package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.h;

/* renamed from: x41  reason: default package */
public final /* synthetic */ class x41 implements h {
    public static final /* synthetic */ x41 a = new x41();

    private /* synthetic */ x41() {
    }

    @Override // io.reactivex.functions.h
    public final Object a(Object obj, Object obj2, Object obj3) {
        PlayerState playerState = (PlayerState) obj;
        return Boolean.valueOf(((Boolean) obj3).booleanValue() && ((Boolean) obj2).booleanValue());
    }
}
