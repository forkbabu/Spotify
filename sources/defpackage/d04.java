package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.C0707R;

/* renamed from: d04  reason: default package */
public class d04 implements g04 {
    private final b61 a;
    private final e61 b;
    private final Resources c;
    private Parcelable d;

    /* renamed from: d04$a */
    class a extends m {
        final /* synthetic */ k a;

        a(k kVar) {
            this.a = kVar;
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void c(Bundle bundle) {
            d04.a(d04.this, bundle);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void d(Bundle bundle) {
            d04.b(d04.this, bundle);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onDestroy() {
            this.a.e1(this);
        }
    }

    public d04(e61 e61, b61 b61, Resources resources, k kVar) {
        e61.getClass();
        this.b = e61;
        b61.getClass();
        this.a = b61;
        resources.getClass();
        this.c = resources;
        kVar.y0(new a(kVar));
    }

    static void a(d04 d04, Bundle bundle) {
        bundle.putParcelable("view_state", d04.a.j());
    }

    static void b(d04 d04, Bundle bundle) {
        d04.getClass();
        d04.d = bundle != null ? bundle.getParcelable("view_state") : null;
    }

    public View c() {
        return this.b.b();
    }

    public void d() {
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.ALBUM;
        String string = this.c.getString(C0707R.string.error_general_title);
        this.a.k(z81.i().l(z81.c().n(HubsGlueComponent.EMPTY_VIEW).t(z81.f().d(spotifyIconV2)).y(z81.h().a(string).c(this.c.getString(C0707R.string.error_general_body))).l()).g());
    }

    public void e(int i) {
        this.b.n(i);
    }

    public void f(b91 b91) {
        this.a.k(b91);
        this.a.i(this.d);
        this.d = null;
    }
}
