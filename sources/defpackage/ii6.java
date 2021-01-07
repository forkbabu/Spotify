package defpackage;

import com.spotify.music.playlist.ui.l0;
import com.spotify.playlist.models.l;

/* renamed from: ii6  reason: default package */
class ii6 implements l0.b {
    final /* synthetic */ l a;
    final /* synthetic */ ki6 b;

    ii6(ki6 ki6, l lVar) {
        this.b = ki6;
        this.a = lVar;
    }

    @Override // com.spotify.music.playlist.ui.l0.b
    public boolean a() {
        return this.b.n.a(this.a);
    }

    @Override // com.spotify.music.playlist.ui.l0.b
    public boolean isActive() {
        return this.b.n.b(this.a);
    }
}
