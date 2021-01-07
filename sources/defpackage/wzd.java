package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.profile.profilelist.ProfileListFragment;
import com.spotify.music.features.profile.profilelist.u;
import com.spotify.music.navigation.v;
import com.spotify.remoteconfig.s6;
import kotlin.jvm.internal.h;

/* renamed from: wzd  reason: default package */
public final class wzd implements blb {
    private final s6 a;

    /* access modifiers changed from: package-private */
    /* renamed from: wzd$a */
    public static final class a implements flb {
        public static final a a = new a();

        a() {
        }

        @Override // defpackage.flb
        public final elb a(Intent intent, c cVar, SessionState sessionState) {
            h.d(intent, "intent");
            String B = l0.z(intent.getDataString()).B();
            h.c(B);
            String currentUser = sessionState.currentUser();
            ProfileListFragment profileListFragment = new ProfileListFragment();
            Bundle D2 = profileListFragment.D2();
            if (D2 == null) {
                D2 = new Bundle();
                profileListFragment.r4(D2);
            }
            D2.putString("uri", B);
            Bundle D22 = profileListFragment.D2();
            if (D22 == null) {
                D22 = new Bundle();
                profileListFragment.r4(D22);
            }
            D22.putString("current-user", currentUser);
            return elb.d(profileListFragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: wzd$b */
    public static final class b<P extends Parcelable> implements v<u> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'android.os.Parcelable' to match base method */
        @Override // com.spotify.music.navigation.v
        public u a(Intent intent, l0 l0Var, SessionState sessionState) {
            String B = l0Var.B();
            h.c(B);
            String currentUser = sessionState.currentUser();
            h.d(currentUser, "sessionState.currentUser()");
            return new u(B, currentUser);
        }
    }

    public wzd(s6 s6Var) {
        h.e(s6Var, "properties");
        this.a = s6Var;
    }

    private final void a(glb glb, LinkType linkType, String str) {
        ((xkb) glb).k(mlb.b(linkType), str, new fkb(a.a));
    }

    private final void c(glb glb, LinkType linkType, String str) {
        ((xkb) glb).j(linkType, str, com.spotify.music.features.profile.profilelist.v.class, b.a);
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        if (this.a.e()) {
            c(glb, LinkType.PROFILE_ARTISTS, "Artist list in the profile feature");
            c(glb, LinkType.PROFILE_FOLLOWERS, "Followers list in the profile feature");
            c(glb, LinkType.PROFILE_FOLLOWING, "Following list in the profile feature");
            c(glb, LinkType.PROFILE_PLAYLIST_OVERVIEW, "Public playlist list in the profile feature");
            return;
        }
        a(glb, LinkType.PROFILE_ARTISTS, "Artist list in the profile feature");
        a(glb, LinkType.PROFILE_FOLLOWERS, "Followers list in the profile feature");
        a(glb, LinkType.PROFILE_FOLLOWING, "Following list in the profile feature");
        a(glb, LinkType.PROFILE_PLAYLIST_OVERVIEW, "Public playlist list in the profile feature");
    }
}
