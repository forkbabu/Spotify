package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;
import com.spotify.rxjava2.q;
import io.reactivex.s;

/* renamed from: er3  reason: default package */
public class er3 implements d {
    private final zo3 a;
    private final AndroidLibsAdsCommonProperties b;
    private final s<Boolean> c;
    private final q f = new q();

    public er3(zo3 zo3, AndroidLibsAdsCommonProperties androidLibsAdsCommonProperties, s<Boolean> sVar) {
        this.a = zo3;
        this.b = androidLibsAdsCommonProperties;
        this.c = sVar;
    }

    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.a.a();
        } else {
            this.a.b();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        if (this.b.a()) {
            q qVar = this.f;
            s<Boolean> sVar = this.c;
            zo3 zo3 = this.a;
            zo3.getClass();
            qVar.a(sVar.subscribe(new zq3(zo3)));
        }
        this.f.a(this.c.subscribe(new sq3(this)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.f.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "ComscorePlugin";
    }
}
