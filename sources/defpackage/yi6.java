package defpackage;

import com.spotify.music.playlist.ui.l0;
import com.spotify.playlist.models.l;

/* renamed from: yi6  reason: default package */
class yi6 implements l0.b {
    final /* synthetic */ l a;
    final /* synthetic */ zi6 b;

    yi6(zi6 zi6, l lVar) {
        this.b = zi6;
        this.a = lVar;
    }

    @Override // com.spotify.music.playlist.ui.l0.b
    public boolean a() {
        return this.b.f.a(this.a);
    }

    @Override // com.spotify.music.playlist.ui.l0.b
    public boolean isActive() {
        return this.b.f.b(this.a);
    }
}
