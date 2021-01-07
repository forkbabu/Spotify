package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.music.C0707R;

/* renamed from: p34  reason: default package */
public class p34 {
    private final b61 a;
    private final e61 b;
    private final Resources c;

    public p34(e61 e61, b61 b61, Resources resources) {
        e61.getClass();
        this.b = e61;
        b61.getClass();
        this.a = b61;
        resources.getClass();
        this.c = resources;
    }

    public View a() {
        return this.b.b();
    }

    public void b() {
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.SEARCH;
        String string = this.c.getString(C0707R.string.error_general_title);
        this.a.k(z81.i().l(z81.c().n(HubsGlueComponent.EMPTY_VIEW).t(z81.f().d(spotifyIconV2)).y(z81.h().a(string).c(this.c.getString(C0707R.string.error_general_body))).l()).g());
    }

    public void c(b91 b91) {
        this.a.k(b91);
    }
}
