package defpackage;

import com.spotify.music.features.ads.model.Ad;
import com.spotify.nowplaying.core.orientation.Orientation;
import defpackage.nqb;
import defpackage.xp3;
import io.reactivex.disposables.a;
import io.reactivex.g;

/* renamed from: wpb  reason: default package */
public class wpb implements nqb.a {
    private final g<Ad> a;
    private final g<Long> b;
    private final tp3 c;
    private final zp3 d;
    private final xp3 e;
    private final Orientation f;
    private final a g = new a();
    private Ad h;
    private xp3.a i;
    private nqb j;
    private Long k;

    public wpb(g<Ad> gVar, g<Long> gVar2, tp3 tp3, zp3 zp3, xp3 xp3, Orientation orientation) {
        this.a = gVar;
        this.b = gVar2;
        this.c = tp3;
        this.d = zp3;
        this.e = xp3;
        this.f = orientation;
    }

    public static void b(wpb wpb, Ad ad) {
        wpb.h = ad;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        Ad.FeaturedActionType featuredActionType = ad.getFeaturedActionType();
        if (ad.getAdType() == Ad.AdType.OFFER_AD) {
            if (featuredActionType == Ad.FeaturedActionType.OPT_OUT) {
                wpb.j.setRejectOfferText(ad.getButtonText());
                wpb.j.setRejectOfferTextVisible(bool2);
                wpb.j.setAcceptOfferButtonVisible(bool);
                wpb.j.setCallToActionButtonVisible(bool);
            } else if (featuredActionType == Ad.FeaturedActionType.OPT_IN) {
                wpb.j.setRejectOfferTextVisible(bool);
                wpb.j.setRejectOfferText(null);
                wpb.j.setAcceptOfferButtonVisible(bool2);
                wpb.j.setAcceptOfferButtonText(ad.getButtonText());
            }
        } else if (ad.getAdType() == Ad.AdType.END_CARD_AD) {
            wpb.j.setCallToActionButtonText(ad.getButtonText());
            wpb.j.setCallToActionButtonVisible(bool2);
            wpb.j.setRejectOfferTextVisible(bool);
            wpb.j.setAcceptOfferButtonVisible(bool);
        } else {
            if (wpb.f == Orientation.LANDSCAPE) {
                wpb.j.setTitleText(ad.advertiser());
                wpb.j.setTitleTextVisible(bool2);
            }
            if (wpb.h.isVoiceAd()) {
                wpb.e.c(wpb.i);
            }
            wpb.j.setCallToActionButtonText(ad.getButtonText());
            wpb.j.setAcceptOfferButtonVisible(bool);
            wpb.j.setRejectOfferTextVisible(bool);
            wpb.j.setCallToActionButtonVisible(bool2);
        }
    }

    public /* synthetic */ void a(Long l) {
        this.k = l;
    }

    public void c() {
        this.c.a(this.h, this.k);
    }

    public void d() {
        this.e.a(this.h, this.k);
    }

    public void e() {
        this.d.a(this.h, this.k);
    }

    public void f(nqb nqb) {
        this.j = nqb;
        nqb.setListener(this);
        this.g.b(this.b.subscribe(new dpb(this)));
        this.g.b(this.a.subscribe(new epb(this)));
    }

    public void g() {
        this.g.f();
    }

    public void h(xp3.a aVar) {
        this.i = aVar;
    }
}
