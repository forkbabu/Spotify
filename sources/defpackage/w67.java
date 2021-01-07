package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.podcast.entity.PodcastEntityFragment;
import com.spotify.music.libs.podcast.download.f0;
import kotlin.jvm.internal.h;

/* renamed from: w67  reason: default package */
public final class w67 implements blb {

    /* renamed from: w67$a */
    static final class a implements flb {
        public static final a a = new a();

        a() {
        }

        @Override // defpackage.flb
        public final elb a(Intent intent, c cVar, SessionState sessionState) {
            h.e(intent, "intent");
            if (!f0.c(cVar)) {
                return elb.a();
            }
            String B = l0.z(intent.getDataString()).B();
            if (B != null) {
                int i = PodcastEntityFragment.j0;
                boolean booleanExtra = intent.getBooleanExtra("auto_play", false);
                Bundle bundle = new Bundle();
                bundle.putString("uri", B);
                bundle.putBoolean("auto_play", booleanExtra);
                PodcastEntityFragment podcastEntityFragment = new PodcastEntityFragment();
                podcastEntityFragment.r4(bundle);
                d.a(podcastEntityFragment, cVar);
                return elb.d(podcastEntityFragment);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        ((xkb) glb).k(mlb.b(LinkType.SHOW_SHOW), "Handle routing to podcast specific entity page", new fkb(a.a));
    }
}
