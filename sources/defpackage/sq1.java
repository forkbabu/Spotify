package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.nowplaying.core.navcontext.j;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.c;

/* renamed from: sq1  reason: default package */
public final /* synthetic */ class sq1 implements c {
    public static final /* synthetic */ sq1 a = new sq1();

    private /* synthetic */ sq1() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        if (!((SessionState) obj2).loggedIn()) {
            return new u3(null, null);
        }
        return new u3(playerState, new j().a(playerState));
    }
}
