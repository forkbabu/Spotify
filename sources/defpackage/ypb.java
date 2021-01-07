package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import defpackage.xp3;
import io.reactivex.disposables.a;
import io.reactivex.g;

/* renamed from: ypb  reason: default package */
public class ypb {
    private final g<ContextTrack> a;
    private final g<Long> b;
    private final g<Ad> c;
    private final tp3 d;
    private final xp3 e;
    private final Picasso f;
    private final a g = new a();
    private Long h;
    private xp3.a i;
    private ImageView j;

    public ypb(g<ContextTrack> gVar, g<Long> gVar2, g<Ad> gVar3, tp3 tp3, xp3 xp3, Picasso picasso) {
        this.a = gVar;
        this.b = gVar2;
        this.c = gVar3;
        this.d = tp3;
        this.e = xp3;
        this.f = picasso;
    }

    public static void a(ypb ypb, ContextTrack contextTrack) {
        ypb.f.m(kxd.c(contextTrack)).n(ypb.j, null);
    }

    public static void b(ypb ypb, Ad ad) {
        ypb.j.setOnClickListener(new hpb(ypb, ad));
    }

    public /* synthetic */ void c(Long l) {
        this.h = l;
    }

    public void d(Ad ad, View view) {
        if (ad.getAdType() != Ad.AdType.OFFER_AD) {
            if (ad.isVoiceAd()) {
                this.e.c(this.i);
            }
            this.e.a(ad, this.h);
        } else if (ad.getFeaturedActionType() == Ad.FeaturedActionType.OPT_IN) {
            this.d.a(ad, this.h);
        }
    }

    public void e(ImageView imageView) {
        this.j = imageView;
        this.g.b(this.a.subscribe(new fpb(this)));
        this.g.b(this.b.subscribe(new gpb(this)));
        this.g.b(this.c.subscribe(new ipb(this)));
    }

    public void f() {
        this.g.f();
        this.j.setOnClickListener(null);
    }

    public void g(xp3.a aVar) {
        this.i = aVar;
    }
}
