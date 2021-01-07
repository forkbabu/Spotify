package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.a;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.b0;
import com.spotify.android.glue.patterns.toolbarmenu.h0;
import com.spotify.android.glue.patterns.toolbarmenu.w;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: nmd  reason: default package */
public class nmd implements h0 {
    private final lmd a;

    public nmd(lmd lmd) {
        this.a = lmd;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void a(a0 a0Var, boolean z, w wVar) {
        Context context = a0Var.getContext();
        Resources resources = context.getResources();
        String string = resources.getString(z ? C0707R.string.action_menu_item_unlike_content_description : C0707R.string.action_menu_item_like_content_description);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, (float) resources.getDimensionPixelSize(C0707R.dimen.toolbar_icon_size));
        spotifyIconDrawable.r(a.b(context, z ? R.color.green : R.color.white));
        b0 d = a0Var.d(C0707R.id.actionbar_item_save, string);
        d.setIcon(spotifyIconDrawable);
        d.a(new imd(wVar));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void b(a0 a0Var, boolean z, w wVar) {
        Context context = a0Var.getContext();
        a0Var.j(C0707R.id.actionbar_item_follow, z ? C0707R.string.options_menu_following : C0707R.string.options_menu_follow, l70.j(a0Var.getContext(), z ? SpotifyIconV2.FOLLOW : SpotifyIconV2.ADDFOLLOW, a.b(context, z ? R.color.green : R.color.gray_50))).a(new imd(wVar));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void c(a0 a0Var, boolean z, w wVar) {
        Context context = a0Var.getContext();
        a0Var.b(C0707R.id.options_menu_save_all_tracks, context.getResources().getString(z ? C0707R.string.options_menu_remove_all_tracks_from_collection : C0707R.string.options_menu_add_all_tracks_to_collection), l70.j(a0Var.getContext(), z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, a.b(context, z ? R.color.green : R.color.gray_50))).a(new imd(wVar));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void d(a0 a0Var, w wVar) {
        a0Var.j(C0707R.id.options_menu_go_to_artist, C0707R.string.context_menu_browse_artist, l70.i(a0Var.getContext(), SpotifyIconV2.ARTIST)).a(new imd(wVar));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void e(a0 a0Var, w wVar) {
        a0Var.j(C0707R.id.options_menu_add_to_home_screen, C0707R.string.options_menu_add_to_home_screen, l70.i(a0Var.getContext(), SpotifyIconV2.DEVICE_MOBILE)).a(new imd(wVar));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void f(a0 a0Var, boolean z, boolean z2, w wVar) {
        SpotifyIconV2 spotifyIconV2;
        Context context = a0Var.getContext();
        String string = context.getResources().getString(z ? C0707R.string.free_tier_toolbar_menu_allow_play : C0707R.string.free_tier_toolbar_menu_dont_play);
        if (z2) {
            spotifyIconV2 = SpotifyIconV2.BLOCK;
        } else {
            spotifyIconV2 = z ? SpotifyIconV2.BAN_ACTIVE : SpotifyIconV2.BAN;
        }
        a0Var.b(C0707R.id.actionbar_item_ban, string, l70.j(a0Var.getContext(), spotifyIconV2, a.b(context, z ? R.color.red : R.color.gray_50))).a(new imd(wVar));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void g(a0 a0Var, w wVar) {
        a0Var.j(C0707R.id.options_menu_go_to_artist, C0707R.string.context_menu_browse_artists, l70.i(a0Var.getContext(), SpotifyIconV2.ARTIST)).a(new imd(wVar));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void h(a0 a0Var, boolean z, w wVar) {
        Context context = a0Var.getContext();
        Resources resources = context.getResources();
        String string = resources.getString(z ? C0707R.string.options_menu_following : C0707R.string.options_menu_follow);
        b0 d = a0Var.d(C0707R.id.actionbar_item_follow, string);
        SwitchCompat switchCompat = new SwitchCompat(context, null);
        switchCompat.setChecked(z);
        switchCompat.setBackground(resources.getDrawable(C0707R.drawable.toolbar_follow_btn));
        int dimension = (int) resources.getDimension(C0707R.dimen.toolbar_follow_btn_padding);
        switchCompat.setPadding(dimension, dimension, dimension, dimension);
        switchCompat.setGravity(17);
        switchCompat.setThumbDrawable(null);
        switchCompat.setTextColor(a.b(context, R.color.white));
        nud.p(context, switchCompat, C0707R.attr.pasteTextAppearanceMetadata);
        switchCompat.setText(string);
        switchCompat.setOnClickListener(new gmd(wVar));
        d.setActionView(switchCompat);
        d.a(new imd(wVar));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void i(a0 a0Var, w wVar) {
        a0Var.j(C0707R.id.options_menu_add_to_playlist, C0707R.string.context_menu_add_to_playlist, l70.i(a0Var.getContext(), SpotifyIconV2.ADD_TO_PLAYLIST)).a(new imd(wVar));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void j(a0 a0Var, boolean z, w wVar) {
        Context context = a0Var.getContext();
        a0Var.b(C0707R.id.options_menu_save, context.getResources().getString(z ? C0707R.string.free_tier_toolbar_menu_unlike : C0707R.string.free_tier_toolbar_menu_like), l70.j(a0Var.getContext(), z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, a.b(context, z ? R.color.green : R.color.gray_50))).a(new imd(wVar));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void k(a0 a0Var, c cVar, String str, boolean z) {
        lmd lmd = this.a;
        lmd.getClass();
        a0Var.j(C0707R.id.options_menu_published, z ? C0707R.string.options_menu_stop_following : C0707R.string.options_menu_follow, l70.i(a0Var.getContext(), SpotifyIconV2.FOLLOW)).a(new fmd(lmd, z, cVar, str));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void l(a0 a0Var, String str, w wVar) {
        a0Var.j(C0707R.id.options_menu_promo_disclosure, C0707R.string.options_menu_promo_disclosure, l70.i(a0Var.getContext(), SpotifyIconV2.INFO)).a(new imd(wVar));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void m(a0 a0Var, String str, w wVar) {
        a0Var.b(C0707R.id.actionbar_item_radio, a0Var.getContext().getString(agd.g(l0.z(str))), l70.i(a0Var.getContext(), SpotifyIconV2.RADIO)).a(new imd(wVar));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void n(a0 a0Var, w wVar) {
        a0Var.j(C0707R.id.options_menu_queue_item, C0707R.string.context_menu_add_to_queue, l70.i(a0Var.getContext(), SpotifyIconV2.ADD_TO_QUEUE)).a(new imd(wVar));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void o(a0 a0Var, w wVar) {
        a0Var.j(C0707R.id.options_menu_report, C0707R.string.context_menu_report, l70.i(a0Var.getContext(), SpotifyIconV2.FLAG)).a(new imd(wVar));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.h0
    public void p(a0 a0Var, w wVar) {
        qmd.a(a0Var, new hmd(wVar));
    }
}
