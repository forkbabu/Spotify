package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.content.a;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.models.HomeMix;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixPlanType;
import com.spotify.music.features.playlistentity.homemix.models.i;
import com.spotify.music.features.playlistentity.homemix.q;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.models.j;

/* renamed from: mf6  reason: default package */
public class mf6 implements gu6 {
    private final Context a;
    private final q b;
    private final HomeMixFormatListAttributesHelper c;

    public mf6(Context context, q qVar, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper) {
        this.a = context;
        this.b = qVar;
        this.c = homeMixFormatListAttributesHelper;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        j l = h76.l();
        HomeMix c2 = this.c.c(l);
        c2.getClass();
        HomeMixPlanType planType = c2.planType();
        i a2 = this.c.a(l);
        a2.getClass();
        String h = planType.h(this.a);
        Resources resources = this.a.getResources();
        CharSequence string = resources.getString(C0707R.string.home_mix_join, h);
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.PLUS_2PX;
        if (a2.d()) {
            string = resources.getString(C0707R.string.home_mix_leave, h);
            spotifyIconV2 = SpotifyIconV2.BAN;
        }
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, spotifyIconV2, (float) resources.getDimensionPixelSize(C0707R.dimen.toolbar_icon_size));
        spotifyIconDrawable.r(a.b(this.a, C0707R.color.context_menu_gray));
        a0Var.b(C0707R.id.actionbar_item_opt_in_toggle, string, spotifyIconDrawable).a(new if6(this, a2, planType));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        i a2 = this.c.a(h76.l());
        return a2 != null && a2.c();
    }

    public /* synthetic */ void c(i iVar, HomeMixPlanType homeMixPlanType) {
        this.b.d(iVar, homeMixPlanType);
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
    public /* synthetic */ void onStop() {
        fu6.d(this);
    }
}
