package com.spotify.music.features.profile.profilelist;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import kotlin.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class ProfileListMetadataResolver {
    public static final a g = new a(null);
    private final d a = kotlin.a.b(new ProfileListMetadataResolver$spotifyLink$2(this));
    private final d b = kotlin.a.b(new ProfileListMetadataResolver$viewUri$2(this));
    private final d c = kotlin.a.b(new ProfileListMetadataResolver$pageIdentifier$2(this));
    private final d d = kotlin.a.b(new ProfileListMetadataResolver$pageViewObservable$2(this));
    private final d e = kotlin.a.b(new ProfileListMetadataResolver$titleRes$2(this));
    private final dt7 f;

    public static final class a {
        public a(f fVar) {
        }

        /* access modifiers changed from: private */
        public final PageIdentifiers d(l0 l0Var) {
            LinkType q = l0Var.q();
            if (q != null) {
                int ordinal = q.ordinal();
                if (ordinal == 211) {
                    return PageIdentifiers.PROFILE_PLAYLISTS;
                }
                switch (ordinal) {
                    case 206:
                        return PageIdentifiers.PROFILE_ARTISTS;
                    case 207:
                        return PageIdentifiers.PROFILE_FOLLOWERS;
                    case 208:
                        return PageIdentifiers.PROFILE_FOLLOWING;
                }
            }
            return PageIdentifiers.UNKNOWN;
        }

        /* access modifiers changed from: private */
        public final l0 g(String str) {
            l0 z = l0.z(str);
            h.d(z, "SpotifyLink.of(pageUri)");
            return z;
        }

        /* access modifiers changed from: private */
        public final int h(l0 l0Var) {
            LinkType q = l0Var.q();
            if (q != null) {
                int ordinal = q.ordinal();
                if (ordinal == 211) {
                    return C0707R.string.profile_list_public_playlists_title;
                }
                switch (ordinal) {
                    case 206:
                        return C0707R.string.profile_list_recently_played_artists_title;
                    case 207:
                        return C0707R.string.profile_list_followers_title;
                    case 208:
                        return C0707R.string.profile_list_following_title;
                }
            }
            return 0;
        }

        public final PageIdentifiers e(String str) {
            h.e(str, "pageUri");
            return d(g(str));
        }

        public final ij9 f(String str) {
            h.e(str, "pageUri");
            return ij9.b(d(g(str)), null);
        }

        public final int i(String str) {
            h.e(str, "pageUri");
            return h(g(str));
        }
    }

    public ProfileListMetadataResolver(dt7 dt7) {
        h.e(dt7, "profileListPageUriProvider");
        this.f = dt7;
    }

    public static final l0 b(ProfileListMetadataResolver profileListMetadataResolver) {
        return (l0) profileListMetadataResolver.a.getValue();
    }

    public final com.spotify.instrumentation.a c() {
        return (com.spotify.instrumentation.a) this.c.getValue();
    }

    public final int d() {
        return ((Number) this.e.getValue()).intValue();
    }

    public final c e() {
        return (c) this.b.getValue();
    }
}
