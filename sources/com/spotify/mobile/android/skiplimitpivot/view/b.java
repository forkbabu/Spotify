package com.spotify.mobile.android.skiplimitpivot.view;

import android.content.res.Resources;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class b implements g {
    private final b61 a;
    private final e61 b;
    private final Resources c;

    public b(b61 b61, e61 e61, Resources resources) {
        h.e(b61, "hubsPresenter");
        h.e(e61, "hubsViewBinder");
        h.e(resources, "resources");
        this.a = b61;
        this.b = e61;
        this.c = resources;
    }

    @Override // com.spotify.mobile.android.skiplimitpivot.view.g
    public void a(b91 b91) {
        h.e(b91, "viewModel");
        this.a.k(b91);
    }

    @Override // com.spotify.mobile.android.skiplimitpivot.view.g
    public void b() {
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.PLAYLIST;
        String string = this.c.getString(C0707R.string.error_general_title);
        h.d(string, "resources.getString(R.string.error_general_title)");
        String string2 = this.c.getString(C0707R.string.error_general_body);
        h.d(string2, "resources.getString(R.string.error_general_body)");
        this.a.k(z81.i().l(z81.c().n(HubsGlueComponent.EMPTY_VIEW).t(z81.f().d(spotifyIconV2)).y(z81.h().a(string).c(string2)).l()).g());
    }

    @Override // com.spotify.mobile.android.skiplimitpivot.view.g
    public void c() {
        this.a.k(t71.d().l(z81.c().n(HubsCommonComponent.LOADING_SPINNER).l()).g());
    }

    public final View d() {
        View b2 = this.b.b();
        h.d(b2, "hubsViewBinder.rootView");
        return b2;
    }
}
