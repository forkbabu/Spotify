package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.podcast.entity.PodcastEntityFragment;
import com.spotify.music.features.podcast.entity.n;
import com.spotify.music.libs.podcast.download.f0;
import kotlin.jvm.internal.h;

/* renamed from: v67  reason: default package */
public final class v67 implements blb {
    private final n a;

    /* renamed from: v67$a */
    static final class a implements flb {
        final /* synthetic */ v67 a;

        a(v67 v67) {
            this.a = v67;
        }

        @Override // defpackage.flb
        public final elb a(Intent intent, c cVar, SessionState sessionState) {
            h.e(intent, "intent");
            if (!f0.c(cVar)) {
                return elb.a();
            }
            String B = l0.z(intent.getDataString()).B();
            if (B != null) {
                String b = this.a.a.b(B);
                String a2 = this.a.a.a(B);
                int i = PodcastEntityFragment.j0;
                Bundle F = je.F("uri", b, "episodeUri", a2);
                PodcastEntityFragment podcastEntityFragment = new PodcastEntityFragment();
                podcastEntityFragment.r4(F);
                d.a(podcastEntityFragment, cVar);
                return elb.d(podcastEntityFragment);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public v67(n nVar) {
        h.e(nVar, "podcastUriExtractor");
        this.a = nVar;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        ((xkb) glb).k(mlb.b(LinkType.SHOW_EPISODE_SCROLL), "Handle routing to podcast specific entity page", new fkb(new a(this)));
    }
}
