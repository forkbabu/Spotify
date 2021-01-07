package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.features.ads.api.h;
import com.spotify.music.productstate.c;
import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;

/* renamed from: dr3  reason: default package */
public class dr3 implements d {
    private final h a;
    private final c b;
    private final y c;
    private final AndroidLibsAdsCommonProperties f;
    private final q n = new q();

    public dr3(AndroidLibsAdsCommonProperties androidLibsAdsCommonProperties, h hVar, c cVar, y yVar) {
        this.f = androidLibsAdsCommonProperties;
        this.a = hVar;
        this.b = cVar;
        this.c = yVar;
    }

    public v a(String str) {
        return this.a.a("secondary_intent", Boolean.toString(this.f.e() != AndroidLibsAdsCommonProperties.AdsBookmarkableFormatsAndroid.NONE)).I0(this.c);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        q qVar = this.n;
        s<R> J0 = this.b.b().J0(new rq3(this));
        ju3 ju3 = new ju3();
        J0.subscribe(ju3);
        qVar.a(ju3);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.n.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "AdsSecondaryIntentPlugin";
    }
}
