package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.pageloader.l0;
import com.spotify.pageloader.p0;
import io.reactivex.s;

/* access modifiers changed from: package-private */
/* renamed from: yh5  reason: default package */
public final class yh5 implements p0.a<s<b91>> {
    private final ImpressionLogger a;

    public yh5(ImpressionLogger impressionLogger) {
        this.a = impressionLogger;
    }

    private void i(String str) {
        this.a.a(null, str, 0, ImpressionLogger.ImpressionType.PAGE, ImpressionLogger.RenderType.PAGE);
    }

    @Override // com.spotify.pageloader.p0.a
    public void a() {
    }

    @Override // com.spotify.pageloader.p0.a
    public void b(l0<s<b91>> l0Var) {
        l0Var.e(new qh5(this), new nh5(this), new sh5(this), new rh5(this), new ph5(this), new oh5(this));
    }

    public /* synthetic */ void c(l0.c cVar) {
        i("home-pageloader-loading");
    }

    public /* synthetic */ void d(l0.b bVar) {
        i("home-pageloader-loaded");
    }

    public /* synthetic */ void e(l0.e eVar) {
        i("home-pageloader-entity-not-found");
    }

    public /* synthetic */ void f(l0.a aVar) {
        i("home-pageloader-custom-error");
    }

    public /* synthetic */ void g(l0.d dVar) {
        i("home-pageloader-network-error");
    }

    public /* synthetic */ void h(l0.f fVar) {
        i("home-pageloader-something-wrong");
    }

    @Override // com.spotify.pageloader.p0.a
    public void onStart() {
    }

    @Override // com.spotify.pageloader.p0.a
    public void onStop() {
    }
}
