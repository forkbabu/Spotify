package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.connection.l;
import com.spotify.rxjava2.p;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: jga  reason: default package */
public final class jga implements d {
    private final fga a;
    private final lga b;
    private final l c;
    private final y f;
    private final p n = new p();

    /* access modifiers changed from: private */
    /* renamed from: jga$a */
    public static class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    public jga(lga lga, l lVar, fga fga, y yVar) {
        fga.getClass();
        this.a = fga;
        this.b = lga;
        this.c = lVar;
        this.f = yVar;
    }

    public /* synthetic */ void a(a aVar) {
        if (!aVar.a) {
            this.a.stop();
            this.a.clear();
        } else if (aVar.b) {
            this.a.start();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        p pVar = this.n;
        lga lga = this.b;
        lga.getClass();
        pVar.b(s.n(s.c0(new dga(lga)).o0(this.f), this.c.b().o0(this.f), xfa.a).subscribe(new cga(this), bga.a));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.n.a();
        this.a.stop();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "PlaylistStoryPrefetcher";
    }
}
