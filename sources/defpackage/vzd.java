package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.profile.entity.ProfileEntityFragment;
import com.spotify.music.features.profile.entity.t;
import com.spotify.music.features.profile.entity.u;
import com.spotify.music.navigation.v;
import com.spotify.remoteconfig.s6;
import kotlin.jvm.internal.h;

/* renamed from: vzd  reason: default package */
public final class vzd implements blb {
    private final s6 a;

    /* renamed from: vzd$a */
    static final class a<P extends Parcelable> implements v<t> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'android.os.Parcelable' to match base method */
        @Override // com.spotify.music.navigation.v
        public t a(Intent intent, l0 l0Var, SessionState sessionState) {
            String B = l0Var.B();
            h.c(B);
            String currentUser = sessionState.currentUser();
            h.d(currentUser, "sessionState.currentUser()");
            return new t(B, currentUser);
        }
    }

    /* renamed from: vzd$b */
    static final class b implements flb {
        public static final b a = new b();

        b() {
        }

        @Override // defpackage.flb
        public final elb a(Intent intent, c cVar, SessionState sessionState) {
            h.d(intent, "intent");
            String B = l0.z(intent.getDataString()).B();
            h.c(B);
            String currentUser = sessionState.currentUser();
            int i = ProfileEntityFragment.o0;
            Bundle F = je.F("key_profile_uri", B, "key_current_username", currentUser);
            ProfileEntityFragment profileEntityFragment = new ProfileEntityFragment();
            profileEntityFragment.r4(F);
            return elb.d(profileEntityFragment);
        }
    }

    public vzd(s6 s6Var) {
        h.e(s6Var, "properties");
        this.a = s6Var;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        if (this.a.e()) {
            ((xkb) glb).j(LinkType.PROFILE, "Profiles of Spotify users", u.class, a.a);
            return;
        }
        ((xkb) glb).k(mlb.b(LinkType.PROFILE), "Profiles of Spotify users", new fkb(b.a));
    }
}
