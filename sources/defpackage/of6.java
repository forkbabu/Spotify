package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.content.a;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.g0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.l;
import com.spotify.music.features.playlistentity.homemix.models.HomeMix;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixPlanType;
import com.spotify.music.features.playlistentity.homemix.models.i;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.models.j;

/* renamed from: of6  reason: default package */
public class of6 implements gu6 {
    private final Context a;
    private final l b;
    private final HomeMixFormatListAttributesHelper c;

    public of6(Context context, l lVar, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper) {
        this.a = context;
        this.b = lVar;
        this.c = homeMixFormatListAttributesHelper;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        Resources resources = this.a.getResources();
        CharSequence string = resources.getString(C0707R.string.home_mix_user_toggle);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, SpotifyIconV2.GEARS, (float) resources.getDimensionPixelSize(C0707R.dimen.toolbar_icon_size));
        spotifyIconDrawable.r(a.b(this.a, C0707R.color.context_menu_gray));
        g0 b2 = a0Var.b(C0707R.id.actionbar_item_view_user_toggle, string, spotifyIconDrawable);
        l lVar = this.b;
        lVar.getClass();
        b2.a(new jf6(lVar));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        j l = h76.l();
        HomeMix c2 = this.c.c(l);
        i a2 = this.c.a(l);
        return (a2 == null || !a2.c() || c2 == null || c2.planType() == HomeMixPlanType.DUO) ? false : true;
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
