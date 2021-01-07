package defpackage;

import android.text.SpannableString;
import com.spotify.android.flags.c;
import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import defpackage.qy5;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: tz5  reason: default package */
public final class tz5 implements uy5 {
    private final qy5 a;
    private final bz5 b;

    public tz5(bz5 bz5, qy5.a aVar) {
        h.e(bz5, "defaultNotificationGenerator");
        h.e(aVar, "playerIntentsFactory");
        this.b = bz5;
        this.a = aVar.a("podcast");
    }

    @Override // defpackage.uy5
    public SpannableString a(PlayerState playerState) {
        h.e(playerState, "state");
        return this.b.a(playerState);
    }

    @Override // defpackage.uy5
    public SpannableString b(PlayerState playerState) {
        h.e(playerState, "state");
        return this.b.b(playerState);
    }

    @Override // defpackage.uy5
    public boolean c(PlayerState playerState, c cVar) {
        h.e(playerState, "state");
        ContextTrack contextTrack = playerState.track().get();
        h.d(contextTrack, "state.track().get()");
        if (!kxd.i(contextTrack)) {
            ContextTrack contextTrack2 = playerState.track().get();
            h.d(contextTrack2, "state.track().get()");
            if (!kxd.j(contextTrack2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.uy5
    public SpannableString d(PlayerState playerState) {
        h.e(playerState, "state");
        return this.b.d(playerState);
    }

    @Override // defpackage.uy5
    public List<cy5> e(PlayerState playerState) {
        h.e(playerState, "state");
        return d.u(cy5.a(dy5.a(C0707R.drawable.icn_notification_new_skip_back_15, C0707R.string.notification_skip_back_15), ((ry5) this.a).f(), true), oz5.c(playerState, this.a, false), oz5.b(playerState, this.a, true), oz5.a(playerState, this.a, false), cy5.a(dy5.a(C0707R.drawable.icn_notification_new_skip_forward_15, C0707R.string.notification_skip_forward_15), ((ry5) this.a).g(), true));
    }
}
