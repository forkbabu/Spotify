package defpackage;

import android.content.res.Resources;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.music.C0707R;

/* renamed from: qf5  reason: default package */
public class qf5 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public qf5(Resources resources) {
        this.a = resources.getString(C0707R.string.error_general_title);
        this.b = resources.getString(C0707R.string.error_general_body);
        this.c = resources.getString(C0707R.string.error_no_connection_title);
        resources.getString(C0707R.string.error_no_connection_body);
        resources.getString(C0707R.string.error_spotify_service_unavailable_title);
        resources.getString(C0707R.string.error_spotify_service_unavailable_body);
        this.d = resources.getString(C0707R.string.home_download_music_podcasts);
        this.e = resources.getString(C0707R.string.home_download_podcasts);
        this.f = resources.getString(C0707R.string.home_download_music);
    }

    private String d(boolean z, boolean z2) {
        if (z2) {
            if (!z) {
                return this.e;
            }
            return this.d;
        } else if (!z) {
            return "";
        } else {
            return this.f;
        }
    }

    public static boolean e(b91 b91) {
        return h(b91, "home-error-empty-view");
    }

    public static boolean f(b91 b91) {
        return h(b91, "home-loading-empty-view");
    }

    public static boolean g(b91 b91) {
        return h(b91, "home-no-network-empty-view") || h(b91, "home-no-spotify-service-empty-view");
    }

    private static boolean h(b91 b91, String str) {
        int i = t71.c;
        if (!"hubs/placeholder".equals(b91.id()) || b91.overlays().isEmpty() || !str.equals(((s81) b91.overlays().get(0)).custom().string("tag"))) {
            return false;
        }
        return true;
    }

    public b91 a() {
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.WARNING;
        String str = this.a;
        return t71.d().l(z81.c().n(HubsGlueComponent.EMPTY_VIEW).t(z81.f().d(spotifyIconV2)).y(z81.h().a(str).c(this.b)).p(z81.a().p("tag", "home-error-empty-view").d()).v(z81.a().p("ui:group", "home-error-empty-view").d()).l()).g();
    }

    public b91 b(boolean z, boolean z2) {
        return z81.i().f(z81.c().o("home:encoreSectionHeading2", HubsComponentCategory.ROW.d()).z(z81.h().a(this.c).d(d(z, z2)).build()).v(z81.a().p("ui:group", "home-offline-download-prompt").d()).l()).g();
    }

    public b91 c(boolean z, boolean z2) {
        return t71.d().l(z81.c().o("home:encoreSectionHeading2", HubsComponentCategory.ROW.d()).y(z81.h().a(this.c).d(d(z, z2))).p(z81.a().p("tag", "home-no-network-empty-view").p("style", "noResults").d()).v(z81.a().p("ui:group", "home-no-network-empty-view").d()).l()).g();
    }
}
