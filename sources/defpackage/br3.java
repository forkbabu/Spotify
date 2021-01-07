package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.productstate.c;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;

/* renamed from: br3  reason: default package */
public class br3 implements d {
    private final c a;
    private final xr3 b;
    private b c = EmptyDisposable.INSTANCE;

    public br3(c cVar, xr3 xr3) {
        this.a = cVar;
        this.b = xr3;
    }

    public /* synthetic */ void a(String str) {
        this.b.b();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.c = this.a.b().subscribe(new oq3(this), pq3.a);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.b.c();
        this.c.dispose();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "AdBreakPlugin";
    }
}
