package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.io6;
import defpackage.uo6;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: ln6  reason: default package */
public final /* synthetic */ class ln6 implements l {
    public final /* synthetic */ io6.a a;

    public /* synthetic */ ln6(io6.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        cfc a2 = io6.a(io6.this);
        h.e(playerState, "playerState");
        h.e(a2, "playlistUri");
        cfc cfc = new cfc(playerState.contextUri());
        V orNull = playerState.track().transform(vo6.a).orNull();
        if (!cfc.equals(a2)) {
            orNull = null;
        }
        boolean z = playerState.isPlaying() && !playerState.isPaused();
        uo6.a aVar = new uo6.a(null, null, false, 7);
        aVar.d(orNull);
        aVar.b(cfc);
        aVar.c(z);
        return aVar.a();
    }
}
