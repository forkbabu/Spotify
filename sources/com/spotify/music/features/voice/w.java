package com.spotify.music.features.voice;

import androidx.fragment.app.c;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.carmodeengine.util.y;
import com.spotify.music.libs.voice.a;
import com.spotify.music.libs.voice.b;
import com.spotify.music.navigation.i;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* access modifiers changed from: package-private */
public final class w implements blb {
    private final i a;
    private final c b;
    private final y c;
    private final b d;
    private final a e;
    private final g<PlayerState> f;

    w(c cVar, i iVar, y yVar, b bVar, a aVar, g<PlayerState> gVar) {
        this.a = iVar;
        this.b = cVar;
        this.c = yVar;
        this.d = bVar;
        this.e = aVar;
        this.f = gVar;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ifd a2 = kfd.a(this.a.u());
        xkb xkb = (xkb) glb;
        xkb.k(mlb.b(LinkType.VOICE), "voice", new t(this.d, this.b, this.c, this.f, a2));
        xkb.k(mlb.b(LinkType.VOICE_EXPERIMENTS), "voice-experiments", new fkb(new o(this.e, this.b, a2)));
    }
}
