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

/* renamed from: n85  reason: default package */
public class n85 {
    static final p81 f = z81.a().b("verified", true).d();
    private final b61 a;
    private final e61 b;
    private final ak2 c;
    private final Resources d;
    private Parcelable e;

    /* renamed from: n85$a */
    class a extends m {
        final /* synthetic */ k a;

        a(k kVar) {
            this.a = kVar;
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void c(Bundle bundle) {
            n85.a(n85.this, bundle);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void d(Bundle bundle) {
            n85.b(n85.this, bundle);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onDestroy() {
            this.a.e1(this);
        }
    }

    public n85(e61 e61, b61 b61, Resources resources, ak2 ak2, k kVar) {
        e61.getClass();
        this.b = e61;
        b61.getClass();
        this.a = b61;
        resources.getClass();
        this.d = resources;
        ak2.getClass();
        this.c = ak2;
        kVar.y0(new a(kVar));
    }

    static void a(n85 n85, Bundle bundle) {
        bundle.putParcelable("view_state", n85.a.j());
    }

    static void b(n85 n85, Bundle bundle) {
        n85.getClass();
        n85.e = bundle != null ? bundle.getParcelable("view_state") : null;
    }

    public View c() {
        return this.b.b();
    }

    public void d() {
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.ARTIST;
        String string = this.d.getString(C0707R.string.error_general_title);
        this.a.k(z81.i().l(z81.c().n(HubsGlueComponent.EMPTY_VIEW).t(z81.f().d(spotifyIconV2)).y(z81.h().a(string).c(this.d.getString(C0707R.string.error_general_body))).l()).g());
    }

    public void e(b91 b91) {
        this.a.k(this.c.apply(b91));
        this.a.i(this.e);
        this.e = null;
    }
}
