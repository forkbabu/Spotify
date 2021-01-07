package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.content.a;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.t;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.rxjava2.p;

/* renamed from: m36  reason: default package */
public class m36 implements gu6 {
    private final Context a;
    private final e36 b;
    private final h36 c;
    private final t d;
    private final p e = new p();

    public m36(Context context, h36 h36, t tVar, e36 e36) {
        this.a = context;
        this.c = h36;
        this.d = tVar;
        this.b = e36;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        Resources resources = this.a.getResources();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, SpotifyIconV2.BAN, (float) resources.getDimensionPixelSize(C0707R.dimen.toolbar_icon_size));
        spotifyIconDrawable.r(a.b(this.a, R.color.gray_50));
        a0Var.b(C0707R.id.actionbar_item_leave_toggle, resources.getString(C0707R.string.blend_leave), spotifyIconDrawable).a(new l36(this, h76));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return true;
    }

    public void c(h76 h76) {
        this.e.b(this.b.a(d36.create(h76.l().getUri())).A(io.reactivex.android.schedulers.a.b()).subscribe(new k36(this), new j36(this)));
    }

    public /* synthetic */ void d() {
        this.d.d(ViewUris.d.toString());
    }

    public void e(Throwable th) {
        Logger.e(th, "Error when trying to leave Blend", new Object[0]);
        this.c.a();
    }

    @Override // defpackage.gu6
    public /* synthetic */ void f() {
        fu6.b(this);
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
        this.e.a();
    }
}
