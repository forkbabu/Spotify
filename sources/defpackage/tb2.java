package defpackage;

import com.spotify.mobile.android.waze.model.WazeBannerModel;
import com.spotify.mobile.android.waze.model.b;

/* access modifiers changed from: package-private */
/* renamed from: tb2  reason: default package */
public class tb2 implements ib2 {
    private final vla a;
    private final b b;

    tb2(b bVar, vla vla) {
        this.b = bVar;
        this.a = vla;
    }

    @Override // defpackage.ib2
    public void a() {
        this.b.a(WazeBannerModel.b(WazeBannerModel.Type.NO_BANNER).b());
        this.a.h("waze");
    }
}
