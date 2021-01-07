package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.MoreObjects;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.music.MainActivity;
import com.spotify.music.features.freetiertrack.FreeTierTrackFragment;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

/* renamed from: q95  reason: default package */
public class q95 implements blb {
    private final fm9 a;
    private final l31 b;
    private final y c;
    private final shd d;

    public q95(fm9 fm9, l31 l31, y yVar, shd shd) {
        this.a = fm9;
        this.b = l31;
        this.c = yVar;
        this.d = shd;
    }

    private z<elb> d(l0 l0Var) {
        LinkType q = l0Var.q();
        MoreObjects.checkArgument(q == LinkType.TRACK || q == LinkType.TRACK_AUTOPLAY);
        return this.b.c(l0Var.F()).A(p95.a).J(10, TimeUnit.SECONDS, this.c).D(n95.a).A(l95.a);
    }

    private z<elb> e(l0 l0Var, c cVar) {
        String F = l0Var.F();
        if (F == null) {
            return z.z(elb.c(l0.z("spotify:home")));
        }
        boolean s = l0Var.s();
        String queryParameter = l0Var.a.getQueryParameter("si");
        Uri c1 = ((MainActivity) this.d).c1();
        int i = FreeTierTrackFragment.q0;
        com.spotify.music.libs.viewuri.c b2 = ViewUris.y.b(F);
        FreeTierTrackFragment freeTierTrackFragment = new FreeTierTrackFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("track_view_uri", b2);
        bundle.putBoolean("is_autoplay", s);
        bundle.putString(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY, F);
        if (c1 != null && !TextUtils.isEmpty(c1.toString())) {
            bundle.putString("external_referrer", c1.toString());
        }
        if (!TextUtils.isEmpty(queryParameter)) {
            bundle.putString("share_id", queryParameter);
        }
        freeTierTrackFragment.r4(bundle);
        d.a(freeTierTrackFragment, cVar);
        return z.z(elb.d(freeTierTrackFragment));
    }

    public z a(Intent intent, c cVar, SessionState sessionState) {
        l0 z = l0.z(intent.getDataString());
        if (this.a.a(cVar) && !z42.C(cVar)) {
            return e(z, cVar);
        }
        if (!(!MoreObjects.isNullOrEmpty(z.a.getQueryParameter("context")))) {
            return d(z);
        }
        l0 h = z.h();
        if (h == null) {
            return z.z(elb.c(z));
        }
        return z.z(elb.c(h));
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        xkb xkb = (xkb) glb;
        xkb.k(mlb.b(LinkType.TRACK), "Handle track links", new o95(this));
        xkb.k(mlb.b(LinkType.TRACK_AUTOPLAY), "Handle track autoplay links", new m95(this));
    }

    public /* synthetic */ z c(Intent intent, c cVar, SessionState sessionState) {
        l0 z = l0.z(intent.getDataString());
        if (!this.a.a(cVar) || z42.C(cVar)) {
            return d(z);
        }
        return e(z, cVar);
    }
}
