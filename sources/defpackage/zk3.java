package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.api.e;
import com.spotify.music.features.ads.model.AdSettingsModel;
import io.reactivex.s;
import io.reactivex.v;

/* renamed from: zk3  reason: default package */
public class zk3 implements e {
    private final al3 a;

    public zk3(al3 al3) {
        this.a = al3;
    }

    @Override // com.spotify.music.features.ads.api.e
    public s<Response> a(String str, boolean z) {
        return s.B(new jk3(this, str, z));
    }

    @Override // com.spotify.music.features.ads.api.e
    public s<AdSettingsModel> b(String str) {
        return this.a.b(str).P();
    }

    @Override // com.spotify.music.features.ads.api.e
    public s<Response> c(String str, String str2, boolean z) {
        if (z) {
            return s.B(new kk3(this, str, str2));
        }
        return s.B(new lk3(this, str, str2));
    }

    @Override // com.spotify.music.features.ads.api.e
    public s<Response> d(String str, String str2, String str3) {
        return s.B(new ik3(this, str, str2, str3));
    }

    public /* synthetic */ v e(String str, boolean z) {
        return this.a.e(str, z).P();
    }

    public /* synthetic */ v f(String str, String str2) {
        return this.a.c(str, str2, true).P();
    }

    public /* synthetic */ v g(String str, String str2) {
        return this.a.d(str, str2).P();
    }

    public /* synthetic */ v h(String str, String str2, String str3) {
        return this.a.a(str, str2, str3).P();
    }
}
