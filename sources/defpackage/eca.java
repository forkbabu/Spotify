package defpackage;

import com.spotify.libs.connect.instrumentation.d;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.disposables.a;

/* renamed from: eca  reason: default package */
public class eca implements dca {
    static final SpSharedPreferences.b<Object, Boolean> g = SpSharedPreferences.b.c("local_devices_only");
    private final SpSharedPreferences<Object> a;
    private final a b = new a();
    private final com.spotify.music.settings.a c;
    private final d d;
    private boolean e;
    private boolean f;

    public eca(SpSharedPreferences<Object> spSharedPreferences, com.spotify.music.settings.a aVar, d dVar) {
        spSharedPreferences.getClass();
        this.a = spSharedPreferences;
        aVar.getClass();
        this.c = aVar;
        this.d = dVar;
    }

    private void e() {
        if (this.e) {
            this.e = false;
            this.b.f();
        }
    }

    @Override // defpackage.dca
    public void a(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        SpSharedPreferences.b<Object, Boolean> bVar = g;
        b2.a(bVar, z);
        b2.j();
        this.f = this.a.c(bVar);
        ((rt0) this.d.a()).b(Boolean.valueOf(z));
    }

    @Override // defpackage.dca
    public boolean b() {
        return this.f;
    }

    public /* synthetic */ void c(Boolean bool) {
        a(bool.booleanValue());
        e();
    }

    public /* synthetic */ void d(Throwable th) {
        a(false);
        e();
    }

    @Override // defpackage.dca
    public void start() {
        SpSharedPreferences<Object> spSharedPreferences = this.a;
        SpSharedPreferences.b<Object, Boolean> bVar = g;
        if (spSharedPreferences.a(bVar)) {
            this.f = this.a.c(bVar);
            return;
        }
        this.e = true;
        this.b.f();
        this.b.b(this.c.a().j0(cca.a).subscribe(new bca(this), new aca(this)));
    }

    @Override // defpackage.dca
    public void stop() {
        e();
    }
}
