package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.nowplaying.ads.view.AudioAdsHeaderView;
import com.spotify.nowplaying.core.orientation.Orientation;
import io.reactivex.disposables.a;
import io.reactivex.g;

/* renamed from: aqb  reason: default package */
public class aqb {
    private final g<Ad> a;
    private final Orientation b;
    private final hr3 c;
    private final a d = new a();
    private oqb e;

    public aqb(g<Ad> gVar, hr3 hr3, Orientation orientation) {
        this.a = gVar;
        this.c = hr3;
        this.b = orientation;
    }

    public static void a(aqb aqb, Ad ad) {
        String str;
        if (aqb.b == Orientation.PORTRAIT) {
            oqb oqb = aqb.e;
            if (aqb.c.a()) {
                str = MoreObjects.nullToEmpty(ad.title());
            } else {
                str = MoreObjects.nullToEmpty(ad.advertiser());
            }
            ((AudioAdsHeaderView) oqb).a(str, aqb.c.a());
        }
        aqb.e.setTitle(ad.isVoiceAd() ? C0707R.string.voice_ads_header_title : C0707R.string.advertisement_title);
    }

    public void b(oqb oqb) {
        this.e = oqb;
        this.d.b(this.a.subscribe(new jpb(this)));
    }

    public void c() {
        this.d.f();
    }
}
