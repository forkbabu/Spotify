package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.player.model.ContextTrack;
import defpackage.b7c;
import io.reactivex.disposables.a;
import io.reactivex.g;

/* renamed from: z6c  reason: default package */
public class z6c implements b7c.a {
    private final g<Ad> a;
    private final g<ContextTrack> b;
    private final g<Long> c;
    private final xp3 d;
    private final j7c e;
    private final a f = new a();
    private Ad g;
    private Long h;
    private boolean i;
    private b7c j;

    public z6c(g<Ad> gVar, g<ContextTrack> gVar2, g<Long> gVar3, xp3 xp3, j7c j7c) {
        this.a = gVar;
        this.b = gVar2;
        this.c = gVar3;
        this.d = xp3;
        this.e = j7c;
    }

    public static void a(z6c z6c, Ad ad) {
        z6c.g = ad;
        if (z6c.i) {
            z6c.j.setCallToActionButtonVisibility(false);
        } else if (MoreObjects.isNullOrEmpty(ad.clickUrl())) {
            z6c.j.setCallToActionButtonVisibility(false);
        } else {
            z6c.j.setCallToActionButtonVisibility(true);
            if (ad.hasAction()) {
                z6c.j.setCallToActionButtonText(ad.getButtonText());
            } else {
                z6c.j.setCallToActionButtonText(z6c.e.d());
            }
        }
    }

    public static void b(z6c z6c, ContextTrack contextTrack) {
        z6c.getClass();
        z6c.i = InterruptionUtil.isInterruptionUri(contextTrack.uri());
    }

    public /* synthetic */ void c(Long l) {
        this.h = l;
    }

    public void d() {
        this.d.a(this.g, this.h);
    }

    public void e(b7c b7c) {
        this.j = b7c;
        b7c.setListener(this);
        this.f.b(this.a.subscribe(new p6c(this)));
        this.f.b(this.b.subscribe(new r6c(this)));
        this.f.b(this.c.subscribe(new q6c(this)));
    }

    public void f() {
        this.f.f();
    }
}
