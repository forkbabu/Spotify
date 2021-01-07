package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.search.transition.l;
import com.spotify.remoteconfig.AndroidFeatureSearchProperties;

/* renamed from: xd8  reason: default package */
public class xd8 implements blb {
    private final fm9 a;
    private final AndroidFeatureSearchProperties b;

    public xd8(fm9 fm9, AndroidFeatureSearchProperties androidFeatureSearchProperties) {
        this.a = fm9;
        this.b = androidFeatureSearchProperties;
    }

    public static elb a(xd8 xd8, Intent intent, c cVar, SessionState sessionState) {
        xd8.getClass();
        String stringExtra = intent.getStringExtra("query");
        intent.putExtra("tag", "SearchFragment");
        intent.setData(Uri.parse("spotify:search"));
        return elb.d(vd8.b(stringExtra, true, false, sessionState.currentUserName(), null, sessionState.connected(), xd8.a.a(cVar), xd8.b.b()));
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        id8 id8 = new id8(this);
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.SEARCH_ROOT, "Page presenting the main search without a query", id8);
        xkb.i(LinkType.SEARCH_QUERY, "Page presenting the main search with a given query", id8);
        xkb.i(LinkType.SEARCH_DRILL_DOWN, "Page presenting the drilldown search with a given query", id8);
        xkb.f(new ilb("android.media.action.MEDIA_PLAY_FROM_SEARCH"), "Page presenting the main search in autoplay", new jd8(this));
    }

    public s c(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        intent.putExtra("tag", pqa.d(l0Var.B()) ? "SearchDrillDownFragment" : "SearchFragment");
        return vd8.a(l0Var, false, false, sessionState.connected(), sessionState.currentUserName(), (l) intent.getParcelableExtra("EXTRA_TRANSITION_PARAMS"), this.a.a(cVar), this.b.b(), this.b.e());
    }
}
