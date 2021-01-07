package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.c;
import defpackage.xya;
import io.reactivex.functions.g;

/* renamed from: s0b  reason: default package */
public class s0b implements g<xya.h> {
    private final Context a;
    private final c.a b;
    private final Player c;

    public s0b(Context context, c.a aVar, Player player) {
        this.a = context;
        this.b = aVar;
        this.c = player;
    }

    /* renamed from: a */
    public void accept(xya.h hVar) {
        if (hVar.a()) {
            String b2 = hVar.b();
            if (MoreObjects.isNullOrEmpty(b2)) {
                Assertion.g("URI cannot be empty to play it!");
            }
            c viewUri = this.b.getViewUri();
            viewUri.getClass();
            String cVar = viewUri.toString();
            this.c.playWithViewUri(PlayerContext.create(cVar, new PlayerTrack[]{PlayerTrack.create(b2)}), null, cVar);
            return;
        }
        e6.b(this.a).d(new Intent("on-demand-restricted"));
    }
}
