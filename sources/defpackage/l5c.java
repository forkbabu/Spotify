package defpackage;

import com.spotify.music.nowplaying.common.view.logging.c;
import com.spotify.nowplaying.ui.components.controls.playpause.d;

/* renamed from: l5c  reason: default package */
public final class l5c implements d {
    private final c a;

    public l5c(c cVar) {
        this.a = cVar;
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void b(String str) {
        this.a.o(str);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void v(String str) {
        this.a.p(str);
    }
}
