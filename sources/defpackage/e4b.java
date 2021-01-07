package defpackage;

import com.spotify.music.libs.search.view.l;
import com.spotify.music.libs.search.view.m;
import io.reactivex.h;

/* renamed from: e4b  reason: default package */
final class e4b implements l.b {
    final /* synthetic */ h a;
    final /* synthetic */ f4b b;

    e4b(h hVar, f4b f4b) {
        this.a = hVar;
        this.b = f4b;
    }

    @Override // com.spotify.music.libs.search.view.l.b
    public /* synthetic */ void L(boolean z) {
        m.b(this, z);
    }

    @Override // com.spotify.music.libs.search.view.l.b
    public void f(String str) {
        f4b f4b = this.b;
        if (f4b != null) {
            f4b.f(str);
        }
    }

    @Override // com.spotify.music.libs.search.view.l.b
    public /* synthetic */ void n() {
        m.a(this);
    }

    @Override // com.spotify.music.libs.search.view.l.b
    public void r(String str) {
        this.a.onNext(str);
    }
}
