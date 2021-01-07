package defpackage;

import com.spotify.pageloader.PageLoaderView;
import com.spotify.ubi.specification.factories.h2;

/* access modifiers changed from: package-private */
/* renamed from: xac  reason: default package */
public class xac implements PageLoaderView.f {
    private final ere a;
    private final h2 b = new h2();

    xac(ere ere) {
        this.a = ere;
    }

    @Override // com.spotify.pageloader.PageLoaderView.f
    public void a() {
        this.a.a(this.b.b().b());
    }

    @Override // com.spotify.pageloader.PageLoaderView.f
    public void b() {
        this.a.a(this.b.b().c("spotify:internal:preferences"));
    }

    @Override // com.spotify.pageloader.PageLoaderView.f
    public void c() {
        this.a.a(this.b.b().a());
    }
}
