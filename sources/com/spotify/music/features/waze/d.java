package com.spotify.music.features.waze;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.waze.model.WazeBannerModel;
import com.spotify.mobile.android.waze.model.b;
import io.reactivex.disposables.a;
import io.reactivex.s;

public class d implements w82 {
    private final g92 a;
    private final b b;
    private final e92 c;
    private final a d = new a();
    private final r92 e;
    private final vla f;
    private final s<Boolean> g;
    private v82 h;

    public d(b bVar, g92 g92, e92 e92, r92 r92, vla vla, s<Boolean> sVar) {
        this.b = bVar;
        this.a = g92;
        this.c = e92;
        this.e = r92;
        this.f = vla;
        this.g = sVar;
    }

    @Override // defpackage.w82
    public void a(v82 v82) {
        this.h = v82;
        v82.h(this);
        a aVar = this.d;
        s<Boolean> sVar = this.g;
        v82 v822 = this.h;
        v822.getClass();
        aVar.e(sVar.subscribe(new c(v822)), this.b.b().subscribe(new a(this), b.a));
    }

    @Override // defpackage.w82
    public void b() {
        if (!this.e.b()) {
            this.f.j();
            this.c.a("com.spotify.music.internal.waze.LAUNCH");
        }
    }

    public /* synthetic */ void c(WazeBannerModel wazeBannerModel) {
        Logger.b("Applying Waze banner model", new Object[0]);
        this.h.e(wazeBannerModel);
    }

    @Override // defpackage.w82
    public void close() {
        if (this.a.g()) {
            this.f.j();
            this.c.a("com.spotify.music.internal.waze.LAUNCH");
            return;
        }
        this.a.k(null);
        this.b.a(WazeBannerModel.b(WazeBannerModel.Type.NO_BANNER).b());
        this.f.h("waze");
        this.e.c(true);
    }

    @Override // defpackage.w82
    public void onStop() {
        this.d.f();
        this.h.h(null);
    }
}
