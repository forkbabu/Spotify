package com.spotify.android.glue.patterns.toolbarmenu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.spotify.android.glue.patterns.toolbarmenu.u;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.converter.ConvertProductValueException;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuEvent;
import com.spotify.music.C0707R;
import com.spotify.music.features.followfeed.entrypoint.FollowFeedButtonManagerImpl;
import com.spotify.music.libs.followfeed.entrypoint.FollowFeedButton;
import com.spotify.music.libs.followfeed.entrypoint.b;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.radio.formatlist.RadioFormatListService;
import com.spotify.music.ubi.interactions.InteractionAction;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorTextView;
import com.spotify.playlist.models.offline.a;
import defpackage.t8a;
import java.util.Map;
import kotlin.f;

public class e0 {
    private final jz1 a;
    private final t8a.a b;
    private final ifd c;

    public e0(jz1 jz1, ifd ifd, t8a.a aVar) {
        this.a = jz1;
        this.c = ifd;
        this.b = aVar;
    }

    private void D(c cVar, ContextMenuEvent contextMenuEvent, String str, InteractionAction interactionAction) {
        this.a.a(new fa1(null, this.c.toString(), cVar.toString(), "toolbar-menu", -1, str, "hit", contextMenuEvent.toString(), (double) System.currentTimeMillis()));
    }

    private void c(a0 a0Var, c cVar, int i, Runnable runnable) {
        u uVar = (u) a0Var;
        ((u.a) uVar.j(C0707R.id.options_menu_download, i, l70.i(uVar.getContext(), SpotifyIconV2.DOWNLOAD))).a(new n(this, cVar, runnable));
    }

    public static Button g(a0 a0Var, int i, int i2, SpotifyIconV2 spotifyIconV2, View.OnClickListener onClickListener) {
        u uVar = (u) a0Var;
        String string = uVar.getContext().getString(i);
        b0 d = uVar.d(i2, string);
        Resources resources = uVar.getContext().getResources();
        Button h = l70.h(uVar.getContext(), string, spotifyIconV2, onClickListener);
        FrameLayout frameLayout = new FrameLayout(uVar.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int dimensionPixelSize = resources.getDimensionPixelSize(C0707R.dimen.actionbar_play_button_container_padding);
        layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
        h.setLayoutParams(layoutParams);
        frameLayout.addView(h);
        ((c0) d).setActionView(frameLayout);
        return h;
    }

    private void h(a0 a0Var, c cVar, int i, Runnable runnable) {
        u uVar = (u) a0Var;
        ((u.a) uVar.j(C0707R.id.options_menu_download, i, l70.i(uVar.getContext(), SpotifyIconV2.DOWNLOAD))).a(new i(this, cVar, runnable));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r1.startsWith("666f726d6174f123") == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l(com.spotify.android.glue.patterns.toolbarmenu.a0 r7, com.spotify.music.libs.viewuri.c r8, java.lang.String r9, android.content.Context r10, com.spotify.android.glue.patterns.toolbarmenu.w r11, boolean r12) {
        /*
            r6 = this;
            int r0 = defpackage.agd.b
            r0 = 1
            if (r12 == 0) goto L_0x0006
            goto L_0x0045
        L_0x0006:
            r12 = 0
            if (r9 == 0) goto L_0x0044
            r1 = 2
            com.spotify.mobile.android.util.LinkType[] r1 = new com.spotify.mobile.android.util.LinkType[r1]
            com.spotify.mobile.android.util.LinkType r2 = com.spotify.mobile.android.util.LinkType.PLAYLIST_V2
            r1[r12] = r2
            com.spotify.mobile.android.util.LinkType r2 = com.spotify.mobile.android.util.LinkType.PROFILE_PLAYLIST
            r1[r0] = r2
            boolean r1 = com.spotify.mobile.android.util.l0.c(r9, r1)
            if (r1 != 0) goto L_0x001b
            goto L_0x0044
        L_0x001b:
            com.spotify.mobile.android.util.l0 r1 = com.spotify.mobile.android.util.l0.z(r9)
            java.lang.String r1 = r1.F()
            com.spotify.mobile.android.util.l0 r1 = com.spotify.mobile.android.util.l0.z(r1)
            java.lang.String r1 = r1.k()
            byte[] r1 = com.spotify.mobile.android.util.q.a(r1)
            java.lang.String r1 = defpackage.lg0.a(r1)
            java.lang.String r2 = "666f726d6174f117"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x0045
            java.lang.String r2 = "666f726d6174f123"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            if (r0 == 0) goto L_0x0048
            return
        L_0x0048:
            com.spotify.mobile.android.util.l0 r12 = com.spotify.mobile.android.util.l0.z(r9)
            int r12 = defpackage.agd.g(r12)
            r0 = 2131427439(0x7f0b006f, float:1.8476494E38)
            com.spotify.android.glue.patterns.toolbarmenu.u r7 = (com.spotify.android.glue.patterns.toolbarmenu.u) r7
            android.content.Context r1 = r7.getContext()
            java.lang.String r12 = r1.getString(r12)
            android.content.Context r1 = r7.getContext()
            com.spotify.android.paste.graphics.SpotifyIconV2 r2 = com.spotify.android.paste.graphics.SpotifyIconV2.RADIO
            android.graphics.drawable.Drawable r1 = defpackage.l70.i(r1, r2)
            com.spotify.android.glue.patterns.toolbarmenu.g0 r7 = r7.b(r0, r12, r1)
            com.spotify.android.glue.patterns.toolbarmenu.f r12 = new com.spotify.android.glue.patterns.toolbarmenu.f
            r0 = r12
            r1 = r6
            r2 = r11
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.spotify.android.glue.patterns.toolbarmenu.u$a r7 = (com.spotify.android.glue.patterns.toolbarmenu.u.a) r7
            r7.a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.android.glue.patterns.toolbarmenu.e0.l(com.spotify.android.glue.patterns.toolbarmenu.a0, com.spotify.music.libs.viewuri.c, java.lang.String, android.content.Context, com.spotify.android.glue.patterns.toolbarmenu.w, boolean):void");
    }

    public static View n(a0 a0Var, String str, int i, View.OnClickListener onClickListener) {
        u uVar = (u) a0Var;
        b0 d = uVar.d(i, str);
        StateListAnimatorTextView stateListAnimatorTextView = new StateListAnimatorTextView(uVar.getContext());
        stateListAnimatorTextView.setGravity(17);
        stateListAnimatorTextView.setId(C0707R.id.actionbar_text_post_to);
        stateListAnimatorTextView.setMinHeight(uVar.getContext().getResources().getDimensionPixelSize(C0707R.dimen.actionbar_item_minimum_height));
        stateListAnimatorTextView.setOnClickListener(onClickListener);
        nud.p(uVar.getContext(), stateListAnimatorTextView, C0707R.attr.pasteCustomToolbarButtonStyle);
        stateListAnimatorTextView.setText(str);
        bvd a2 = dvd.a(stateListAnimatorTextView);
        a2.g(stateListAnimatorTextView);
        a2.a();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int dimensionPixelSize = uVar.getContext().getResources().getDimensionPixelSize(C0707R.dimen.actionbar_item_left_right_padding);
        layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
        stateListAnimatorTextView.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(uVar.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        frameLayout.addView(stateListAnimatorTextView);
        ((c0) d).setActionView(frameLayout);
        return stateListAnimatorTextView;
    }

    public /* synthetic */ void A(w wVar, c cVar, String str, a0 a0Var) {
        wVar.a();
        D(cVar, ContextMenuEvent.REPORT_ABUSE, str, null);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ((u) a0Var).getContext().startActivity(intent);
    }

    public /* synthetic */ void B(c cVar, t tVar) {
        D(cVar, ContextMenuEvent.SETTINGS, ViewUris.c0.toString(), null);
        tVar.d("spotify:internal:preferences");
    }

    public /* synthetic */ void C(w wVar, c cVar, String str, Context context) {
        wVar.a();
        D(cVar, ContextMenuEvent.START_RADIO, str, null);
        context.startService(RadioFormatListService.e(context, str));
    }

    public void a(a0 a0Var, String str, String str2, String str3, c cVar, w wVar) {
        u uVar = (u) a0Var;
        ((u.a) uVar.j(C0707R.id.options_menu_add_to_home_screen, C0707R.string.options_menu_add_to_home_screen, l70.i(uVar.getContext(), SpotifyIconV2.DEVICE_MOBILE))).a(new j(uVar, str, str2, str3, cVar, wVar));
    }

    public void b(a0 a0Var, c cVar, a aVar, int i, Runnable runnable, int i2, Runnable runnable2) {
        aVar.b(new b(this, a0Var, cVar, i, runnable), new h(this, a0Var, cVar, i2, runnable2), new o(this, a0Var, cVar, i2, runnable2), new m(this, a0Var, cVar, i2, runnable2), new l(this, a0Var, cVar, i, runnable), new r(this, a0Var, cVar, i, runnable), new p(this, a0Var, cVar, i, runnable), new e(this, a0Var, cVar, i, runnable));
    }

    public b d(c cVar, a0 a0Var, b.a aVar) {
        u uVar = (u) a0Var;
        Context context = uVar.getContext();
        String string = context.getString(C0707R.string.follow_feed_feature_title);
        b0 d = uVar.d(C0707R.id.actionbar_item_followfeed, string);
        FollowFeedButton followFeedButton = new FollowFeedButton(context);
        followFeedButton.setContentDescription(string);
        followFeedButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        followFeedButton.setOnClickListener(new k(this, cVar, aVar));
        ((c0) d).setActionView(followFeedButton);
        return followFeedButton;
    }

    public b0 e(a0 a0Var, t tVar) {
        u uVar = (u) a0Var;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(uVar.getContext(), SpotifyIconV2.CAMERA, (float) uVar.getContext().getResources().getDimensionPixelSize(C0707R.dimen.toolbar_icon_size));
        c0 c0Var = (c0) uVar.d(C0707R.id.actionbar_item_image_recs, uVar.getContext().getString(C0707R.string.image_recs));
        c0Var.setIcon(spotifyIconDrawable);
        c0 c0Var2 = c0Var;
        c0Var2.a(new g(this, tVar));
        return c0Var2;
    }

    public b0 f(a0 a0Var, Runnable runnable) {
        u uVar = (u) a0Var;
        c0 c0Var = (c0) uVar.d(C0707R.id.actionbar_item_listening_history, uVar.getContext().getString(C0707R.string.options_menu_listening_history));
        c0Var.setIcon(C0707R.drawable.ic_listening_history);
        c0Var.a(runnable);
        return c0Var;
    }

    public void i(a0 a0Var, c cVar, String str, w wVar) {
        u uVar = (u) a0Var;
        ((u.a) uVar.j(C0707R.id.options_menu_report_abuse, C0707R.string.options_menu_report_abuse, l70.i(uVar.getContext(), SpotifyIconV2.REPORT_ABUSE))).a(new q(this, wVar, cVar, str, uVar));
    }

    public b0 j(c cVar, a0 a0Var, t tVar) {
        u uVar = (u) a0Var;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(uVar.getContext(), SpotifyIconV2.GEARS, (float) uVar.getContext().getResources().getDimensionPixelSize(C0707R.dimen.toolbar_icon_size));
        c0 c0Var = (c0) uVar.d(C0707R.id.actionbar_item_settings, uVar.getContext().getString(C0707R.string.settings_title));
        c0Var.setIcon(spotifyIconDrawable);
        c0 c0Var2 = c0Var;
        c0Var2.a(new c(this, cVar, tVar));
        return c0Var2;
    }

    public void k(a0 a0Var, c cVar, String str, Context context, w wVar, Map<String, String> map) {
        boolean z;
        int i = agd.b;
        try {
            z = !com.spotify.mobile.android.converter.a.a(map.get("radio"));
        } catch (ConvertProductValueException e) {
            Logger.e(e, "Unable to extract product state", new Object[0]);
            z = false;
        }
        l(a0Var, cVar, str, context, wVar, z);
    }

    public void m(a0 a0Var, c cVar, String str, com.spotify.android.flags.c cVar2, Context context) {
        d dVar = d.a;
        int i = agd.b;
        l(a0Var, cVar, str, context, dVar, !((Boolean) cVar2.M0(vfd.c)).booleanValue());
    }

    public /* synthetic */ f o(a0 a0Var, c cVar, int i, Runnable runnable, a.f fVar) {
        c(a0Var, cVar, i, runnable);
        return f.a;
    }

    public /* synthetic */ f p(a0 a0Var, c cVar, int i, Runnable runnable, a.h hVar) {
        h(a0Var, cVar, i, runnable);
        return f.a;
    }

    public /* synthetic */ f q(a0 a0Var, c cVar, int i, Runnable runnable, a.b bVar) {
        h(a0Var, cVar, i, runnable);
        return f.a;
    }

    public /* synthetic */ f r(a0 a0Var, c cVar, int i, Runnable runnable, a.C0377a aVar) {
        h(a0Var, cVar, i, runnable);
        return f.a;
    }

    public /* synthetic */ f s(a0 a0Var, c cVar, int i, Runnable runnable, a.c cVar2) {
        c(a0Var, cVar, i, runnable);
        return f.a;
    }

    public /* synthetic */ f t(a0 a0Var, c cVar, int i, Runnable runnable, a.e eVar) {
        c(a0Var, cVar, i, runnable);
        return f.a;
    }

    public /* synthetic */ f u(a0 a0Var, c cVar, int i, Runnable runnable, a.d dVar) {
        c(a0Var, cVar, i, runnable);
        return f.a;
    }

    public /* synthetic */ f v(a0 a0Var, c cVar, int i, Runnable runnable, a.g gVar) {
        c(a0Var, cVar, i, runnable);
        return f.a;
    }

    public /* synthetic */ void w(c cVar, Runnable runnable) {
        D(cVar, ContextMenuEvent.DOWNLOAD, cVar.toString(), null);
        runnable.run();
    }

    public /* synthetic */ void x(c cVar, b.a aVar, View view) {
        D(cVar, ContextMenuEvent.FOLLOWFEED, ViewUris.e.toString(), null);
        ((FollowFeedButtonManagerImpl) aVar).c();
    }

    public /* synthetic */ void y(t tVar) {
        c cVar = ViewUris.E2;
        String cVar2 = cVar.toString();
        D(cVar, ContextMenuEvent.IMAGE_RECOMMENDATION, cVar2, null);
        tVar.d(cVar2);
    }

    public /* synthetic */ void z(c cVar, Runnable runnable) {
        D(cVar, ContextMenuEvent.UNDOWNLOAD, cVar.toString(), null);
        runnable.run();
    }
}
