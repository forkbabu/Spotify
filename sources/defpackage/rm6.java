package defpackage;

import com.spotify.music.playlist.ui.l0;
import com.spotify.playlist.models.l;

/* renamed from: rm6  reason: default package */
class rm6 implements l0.b {
    final /* synthetic */ l a;
    final /* synthetic */ sm6 b;

    rm6(sm6 sm6, l lVar) {
        this.b = sm6;
        this.a = lVar;
    }

    @Override // com.spotify.music.playlist.ui.l0.b
    public boolean a() {
        return this.b.o.a(this.a);
    }

    @Override // com.spotify.music.playlist.ui.l0.b
    public boolean isActive() {
        return this.b.o.b(this.a);
    }
}
