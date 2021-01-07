package defpackage;

import android.text.SpannableString;
import com.spotify.android.flags.c;
import com.spotify.music.feedback.b;
import com.spotify.player.model.PlayerState;
import defpackage.qy5;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: fz5  reason: default package */
public final class fz5 implements uy5 {
    private final qy5 a;
    private final bz5 b;
    private final xz5 c;
    private final b d;

    public fz5(bz5 bz5, qy5.a aVar, xz5 xz5, b bVar) {
        h.e(bz5, "defaultNotificationGenerator");
        h.e(aVar, "playerIntentsFactory");
        h.e(xz5, "feedbackActions");
        h.e(bVar, "feedbackHelper");
        this.b = bz5;
        this.c = xz5;
        this.d = bVar;
        this.a = aVar.a("feedback");
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
        return this.d.a(playerState) || agd.i(playerState.contextUri());
    }

    @Override // defpackage.uy5
    public SpannableString d(PlayerState playerState) {
        h.e(playerState, "state");
        return this.b.d(playerState);
    }

    @Override // defpackage.uy5
    public List<cy5> e(PlayerState playerState) {
        h.e(playerState, "state");
        return d.u(this.c.b(playerState), oz5.c(playerState, this.a, true), oz5.b(playerState, this.a, true), oz5.a(playerState, this.a, true), this.c.a(playerState));
    }
}
