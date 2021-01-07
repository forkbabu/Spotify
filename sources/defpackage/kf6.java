package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.content.a;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import com.spotify.music.connection.l;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.p;
import io.reactivex.d0;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;
import retrofit2.v;

/* renamed from: kf6  reason: default package */
public class kf6 implements gu6 {
    private final Context a;
    private final af6 b;
    private final i c;
    private final vb6 d;
    private final HomeMixFormatListAttributesHelper e;
    private final ye6<v<Void>> f;
    private final p g = new p();

    public kf6(Context context, af6 af6, i iVar, l lVar, vb6 vb6, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper) {
        this.a = context;
        this.b = af6;
        this.c = iVar;
        this.d = vb6;
        this.e = homeMixFormatListAttributesHelper;
        this.f = new ye6<>(lVar, ff6.a);
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        CharSequence charSequence;
        Resources resources = this.a.getResources();
        j l = h76.l();
        com.spotify.music.features.playlistentity.homemix.models.i a2 = this.e.a(l);
        boolean z = a2 != null && a2.b();
        if (z) {
            charSequence = resources.getString(C0707R.string.home_mix_explicit_filter_remove);
        } else {
            charSequence = resources.getString(C0707R.string.home_mix_explicit_filter_include);
        }
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, SpotifyIconV2.FILTER, (float) resources.getDimensionPixelSize(C0707R.dimen.toolbar_icon_size));
        spotifyIconDrawable.r(a.b(this.a, C0707R.color.context_menu_gray));
        a0Var.b(C0707R.id.actionbar_item_explicit_filter, charSequence, spotifyIconDrawable).a(new df6(this, z, l));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        com.spotify.music.features.playlistentity.homemix.models.i a2 = this.e.a(h76.l());
        return a2 != null && a2.c();
    }

    public void c(boolean z, j jVar) {
        boolean z2 = !z;
        this.g.b(this.d.a(ImmutableMap.of("publish_explicit", Boolean.valueOf(z2))).f(this.f).s(new ef6(this, jVar.getUri())).P().G0((R) xe6.j()).R0(10, TimeUnit.SECONDS).o0(io.reactivex.android.schedulers.a.b()).subscribe(new cf6(this, z2), new gf6(this)));
    }

    public /* synthetic */ d0 d(String str, xe6 xe6) {
        if (xe6.i()) {
            return this.c.d(str).h(z.z(xe6));
        }
        return z.z(xe6);
    }

    public /* synthetic */ void e(boolean z, xe6 xe6) {
        Logger.b(xe6.toString(), new Object[0]);
        if (xe6.g()) {
            return;
        }
        if (xe6.f()) {
            this.b.b();
        } else if (xe6.h()) {
            this.b.f();
        } else if (z) {
            this.b.c();
        } else {
            this.b.d();
        }
    }

    @Override // defpackage.gu6
    public /* synthetic */ void f() {
        fu6.b(this);
    }

    public /* synthetic */ void g(Throwable th) {
        Logger.d(th.getMessage(), new Object[0]);
        this.b.b();
    }

    @Override // defpackage.gu6
    public /* synthetic */ void h() {
        fu6.a(this);
    }

    @Override // defpackage.gu6
    public /* synthetic */ void onStart() {
        fu6.c(this);
    }

    @Override // defpackage.gu6
    public void onStop() {
        this.g.a();
    }
}
