package defpackage;

import android.content.res.Resources;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.util.connectivity.c0;
import com.spotify.music.C0707R;

/* renamed from: to5  reason: default package */
public class to5 {
    private final c0 a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;

    public to5(Resources resources, c0 c0Var) {
        c0Var.getClass();
        this.a = c0Var;
        this.b = resources.getString(C0707R.string.error_general_title);
        this.c = resources.getString(C0707R.string.error_general_body);
        this.d = resources.getString(C0707R.string.error_no_connection_title);
        this.e = resources.getString(C0707R.string.error_no_connection_body);
        this.f = resources.getString(C0707R.string.error_spotify_service_unavailable_title);
        this.g = resources.getString(C0707R.string.error_spotify_service_unavailable_body);
        this.h = resources.getString(C0707R.string.error_no_made_for_you_results_title);
        this.i = resources.getString(C0707R.string.error_no_made_for_you_results_body);
    }

    private static p81 e(String str) {
        return z81.a().p("tag", str).d();
    }

    public b91 a() {
        return t71.b(SpotifyIconV2.WARNING, this.b, this.c, e("made-for-you-hub-error-empty-view"));
    }

    public b91 b() {
        return t71.d().l(z81.c().n(HubsCommonComponent.LOADING_SPINNER).p(e("made-for-you-hub-loading-empty-view")).l()).g();
    }

    public b91 c() {
        return t71.b(SpotifyIconV2.MIX, this.h, this.i, e("made-for-you-hub-no-results-empty-view"));
    }

    public b91 d() {
        if (this.a.a()) {
            return t71.b(SpotifyIconV2.OFFLINE, this.f, this.g, e("made-for-you-hub-no-spotify-service-empty-view"));
        }
        return t71.b(SpotifyIconV2.OFFLINE, this.d, this.e, e("made-for-you-hub-no-network-empty-view"));
    }
}
