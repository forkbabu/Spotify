package defpackage;

import android.os.Build;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.features.ads.api.h;
import com.spotify.music.productstate.c;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;

/* renamed from: cr3  reason: default package */
public class cr3 implements d {
    private final h a;
    private final c b;
    private final y c;
    private final q f = new q();

    public cr3(h hVar, c cVar, y yVar) {
        this.a = hVar;
        this.b = cVar;
        this.c = yVar;
    }

    public v a(String str) {
        return s.l0(this.a.a("submodel", Build.MODEL).I0(this.c), this.a.a("make", Build.MANUFACTURER).I0(this.c), this.a.a("os_version", Integer.toString(Build.VERSION.SDK_INT)).I0(this.c));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        q qVar = this.f;
        s<R> J0 = this.b.b().J0(new qq3(this));
        ju3 ju3 = new ju3();
        J0.subscribe(ju3);
        qVar.a(ju3);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.f.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "AdsDeviceTargetingUpdaterPlugin";
    }
}
