package defpackage;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.ads.i0;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.libs.thestage.config.TheStageUri;
import com.spotify.music.libs.thestage.d;
import com.spotify.music.navigation.t;
import io.reactivex.functions.b;
import java.lang.ref.WeakReference;

/* renamed from: xp3  reason: default package */
public class xp3 implements b {
    private final WeakReference<Fragment> a;
    private final i0 b;
    private final d c;
    private final bv3 d;
    private final dv3 e;
    private final i80 f;
    private final t g;
    private a h;

    /* renamed from: xp3$a */
    public interface a {
    }

    public xp3(Fragment fragment, i0 i0Var, d dVar, bv3 bv3, dv3 dv3, i80 i80, t tVar) {
        this.a = new WeakReference<>(fragment);
        this.b = i0Var;
        this.c = dVar;
        this.d = bv3;
        this.e = dv3;
        this.f = i80;
        this.g = tVar;
    }

    /* renamed from: b */
    public void a(Ad ad, Long l) {
        Fragment fragment = this.a.get();
        if (fragment != null && !MoreObjects.isNullOrEmpty(ad.clickUrl()) && fragment.B2() != null) {
            this.e.c("clicked", ad.id(), null, l != null ? l.longValue() : -1, null);
            String clickUrl = ad.clickUrl();
            if (l0.z(clickUrl).q() == LinkType.ADS_MIC_PERMISSIONS) {
                this.d.c(fragment);
                return;
            }
            this.d.getClass();
            if (l0.x(clickUrl)) {
                a aVar = this.h;
                if (aVar != null) {
                    ((gqb) aVar).h();
                }
                this.g.d(clickUrl);
                return;
            }
            c j4 = fragment.j4();
            Uri parse = Uri.parse(ad.clickUrl());
            Optional<TheStageUri> a2 = this.c.a(parse);
            if (a2.isPresent()) {
                this.c.b(j4, a2.get());
            } else {
                this.b.c(j4, this.f, ad.advertiser(), parse, ad.isInAppBrowser());
            }
        }
    }

    public void c(a aVar) {
        this.h = aVar;
    }
}
