package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.music.onboarding.freetier.education.a;
import com.spotify.nowplaying.ui.components.controls.next.h;
import com.spotify.player.model.PlayerState;

/* renamed from: cyb  reason: default package */
public class cyb implements h {
    private final pl9 b;
    private final a c;

    public cyb(pl9 pl9, a aVar) {
        this.b = pl9;
        this.c = aVar;
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.h
    public void a(PlayerState playerState) {
        this.b.E2().c();
        if (playerState.restrictions().disallowPeekingNextReasons().contains(DisallowReasons.MFT)) {
            this.c.a();
        }
    }
}
