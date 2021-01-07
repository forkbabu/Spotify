package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.sociallistening.participantlist.impl.m;

/* renamed from: kfd  reason: default package */
public final class kfd {
    public static final ifd A = new ifd("collection-radio");
    public static final ifd A0 = new ifd("made-for-you-hub");
    public static final ifd A1 = new ifd("user-profiles");
    public static final ifd B = new ifd("collection-songs");
    public static final ifd B0 = new ifd("media-browser-service");
    public static final ifd B1 = new ifd("voice");
    public static final ifd C = new ifd("collection-podcasts");
    public static final ifd C0 = new ifd("media-resumption");
    public static final ifd C1 = new ifd("voice-results");
    public static final ifd D = new ifd("collection-podcasts-downloads");
    public static final ifd D0 = new ifd("mini-player");
    public static final ifd D1 = new ifd("voice-assistant");
    public static final ifd E = new ifd("collection-podcasts-episodes");
    public static final ifd E0 = new ifd("new-player");
    public static final ifd E1 = new ifd("voice-assistants-settings");
    public static final ifd F = new ifd("collection-podcasts-following");
    public static final ifd F0 = new ifd("native-marketing-formats");
    public static final ifd F1 = new ifd("waze");
    public static final ifd G = new ifd("concat");
    public static final ifd G0 = new ifd("notification");
    public static final ifd G1 = new ifd("wear-os");
    public static final ifd H = new ifd("concerts-location_search");
    public static final ifd H0 = new ifd("notification-settings");
    public static final ifd H1 = new ifd("widget");
    public static final ifd I = new ifd("creator-artist-biography");
    public static final ifd I0 = new ifd("nowplaying");
    public static final ifd I1 = new ifd("your-episodes");
    public static final ifd J = new ifd("cyoa");
    public static final ifd J0 = new ifd("nowplayingmini");
    public static final ifd J1 = new ifd("skip-limit-pivot");
    public static final ifd K = new ifd("language-picker");
    public static final ifd K0 = new ifd("player-v2");
    public static final ifd L = new ifd("com.spotify.feature.navigation");
    public static final ifd L0 = new ifd("playlist");
    public static final ifd M = new ifd("dac-artist");
    public static final ifd M0 = new ifd("playlist-folder");
    public static final ifd N = new ifd("data-saver-mode");
    public static final ifd N0 = new ifd("playlist-recommended");
    public static final ifd O = new a("debug");
    public static final ifd O0 = new ifd("playlist-all-songs");
    public static final ifd P = new ifd("device");
    public static final ifd P0 = new ifd("playlist-participants");
    public static final ifd Q = new ifd("driving-jumpstart");
    public static final ifd Q0 = new ifd("playlist-web-view");
    public static final ifd R = new ifd("driving-npv");
    public static final ifd R0 = new ifd("play-queue");
    public static final ifd S = new ifd("driving-mode");
    public static final ifd S0 = new ifd("podcast-charts-uris");
    public static final ifd T = new ifd("driving-voice");
    public static final ifd T0 = new ifd("podcast-charts-root");
    public static final ifd U = new ifd("eventsender");
    public static final ifd U0 = new ifd("podcast-episode");
    public static final ifd V = new ifd("employee-podcasts");
    public static final ifd V0 = new ifd("android-feature-podcast-inspector-tracklist");
    public static final ifd W = new ifd("episode-transcript");
    public static final ifd W0 = new ifd("premium-hub");
    public static final ifd X = new ifd("external-integration-service");
    public static final ifd X0 = new ifd("premium-destination");
    public static final ifd Y = new ifd("facebook-connect");
    public static final ifd Y0 = new ifd("promo-disclosure");
    public static final ifd Z = new ifd("facebook-media-browser-service");
    public static final ifd Z0 = new ifd("quicksilver");
    public static final ifd a = new ifd("ads");
    public static final ifd a0 = new ifd("find");
    public static final ifd a1 = new ifd("radio");
    public static final ifd b = new ifd("android-auto");
    public static final ifd b0 = new ifd("find-friends");
    public static final ifd b1 = new ifd("remoteconfiguration");
    public static final ifd c = new ifd("apps-settings");
    public static final ifd c0 = new ifd("find-in-show");
    public static final ifd c1 = new b("only-for-robolectric");
    public static final ifd d = new ifd("artist");
    public static final ifd d0 = new ifd("follow-feed");
    public static final ifd d1 = new ifd("root");
    public static final ifd e = new ifd("artist-convert");
    public static final ifd e0 = new ifd("forever-favorites");
    public static final ifd e1 = new ifd("scannables");
    public static final ifd f = new ifd("concerts-artistpage");
    public static final ifd f0 = new ifd("free-tier-album");
    public static final ifd f1 = new ifd("search");
    public static final ifd g = new ifd("artist-relases");
    public static final ifd g0 = new ifd("free-tier-artist");
    public static final ifd g1 = new ifd("spotify:internal:service");
    public static final ifd h = new ifd("assisted-curation");
    public static final ifd h0 = new ifd("free-tier-collection");
    public static final ifd h1 = new ifd("settings");
    public static final ifd i = new ifd("assisted-curation/search");
    public static final ifd i0 = new ifd("free-tier-add-to-playlist");
    public static final ifd i1 = new ifd("share");
    public static final ifd j = new ifd("assisted-curation/search-entity");
    public static final ifd j0 = new ifd("free-tier-playlist-all-songs-dialog");
    public static final ifd j1 = new ifd("show");
    public static final ifd k = new ifd("auto");
    public static final ifd k0 = new ifd("free-tier-taste-onboarding");
    public static final ifd k1 = new ifd("show-format");
    public static final ifd l = new ifd("avrcp");
    public static final ifd l0 = new ifd("free-tier-track");
    public static final ifd l1 = new ifd("speaker-companion");
    public static final ifd m = new ifd("bixby-home-cards");
    public static final ifd m0 = new ifd("fullscreen-story");
    public static final ifd m1 = new ifd("sponsored-context");
    public static final ifd n = new ifd("blend");
    public static final ifd n0 = new ifd("golden-path");
    public static final ifd n1 = new ifd("spotify-go");
    public static final ifd o = new ifd("browse");
    public static final ifd o0 = new ifd("google-clock");
    public static final ifd o1 = new ifd("spoton");
    public static final ifd p = new ifd("cache-migration-settings");
    public static final ifd p0 = new ifd("hidden-content");
    public static final ifd p1 = new ifd("stations-promo");
    public static final ifd q = new ifd("car-mode/home");
    public static final ifd q0 = new ifd("home");
    public static final ifd q1 = new ifd("station");
    public static final ifd r = new ifd("charts-block");
    public static final ifd r0 = new ifd("homething");
    public static final ifd r1 = new ifd("superbird");
    public static final ifd s = new ifd("charts-album");
    public static final ifd s0 = new ifd("hub-events");
    public static final ifd s1 = new ifd("ta");
    public static final ifd t = new ifd("charts-overview");
    public static final ifd t0 = new ifd("concerts-entity");
    public static final ifd t1 = new ifd("topic");
    public static final ifd u = new ifd("collection");
    public static final ifd u0 = new ifd("hub-events-concert-group");
    public static final ifd u1 = new ifd(AppProtocol.TrackData.TYPE_TRACK);
    public static final ifd v = new ifd("collection-album");
    public static final ifd v0 = new ifd("image-recs");
    public static final ifd v1 = new ifd("your-library");
    public static final ifd w = new ifd("collection-albums");
    public static final ifd w0 = new ifd("infinite-playback");
    public static final ifd w1 = new ifd("unknown");
    public static final ifd x = new ifd("collection-artist");
    public static final ifd x0 = new ifd("inter-app-protocol");
    public static final ifd x1 = new ifd("update-email");
    public static final ifd y = new ifd("collection-artists");
    public static final ifd y0 = new ifd("licenses");
    public static final ifd y1 = new ifd("upsell");
    public static final ifd z = new ifd("collection-playlists");
    public static final ifd z0 = new ifd("listening-history");
    public static final ifd z1 = new ifd("user-profile");

    /* renamed from: kfd$a */
    static class a extends ifd {
        a(String str) {
            super(str);
        }

        @Override // defpackage.ifd
        public String getName() {
            Assertion.j("This can only be used from debug views", false);
            return super.getName();
        }
    }

    /* renamed from: kfd$b */
    static class b extends ifd {
        b(String str) {
            super(str);
        }

        @Override // defpackage.ifd
        public String getName() {
            Assertion.j("This can only be used from Robolectric", ig0.b());
            return super.getName();
        }
    }

    public static ifd a(Fragment fragment) {
        ifd ifd = d1;
        if (!(fragment instanceof s)) {
            return ifd;
        }
        s sVar = (s) fragment;
        yn0 b2 = m.b(sVar);
        if (!bu9.w.equals(b2)) {
            return b2.b();
        }
        return sVar.z1();
    }
}
