package com.spotify.music.features.profile.entity.toolbar;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.navigation.t;
import com.spotify.share.sharedata.r;
import kotlin.jvm.internal.h;

public final class ProfileToolbarMenuExtensions {

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {
        final /* synthetic */ t a;

        a(t tVar) {
            this.a = tVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.d("spotify:findfriends");
        }
    }

    public static final void a(a0 a0Var, t tVar) {
        h.e(a0Var, "$this$addFindFriends");
        h.e(tVar, "navigator");
        a0Var.j(C0707R.id.options_menu_find_friends, C0707R.string.options_menu_find_friends, l70.i(a0Var.getContext(), SpotifyIconV2.FOLLOW)).a(new a(tVar));
    }

    public static final void b(a0 a0Var, hs7 hs7, r rVar, jzc jzc) {
        h.e(a0Var, "$this$addShare");
        h.e(hs7, "model");
        h.e(rVar, "shareData");
        h.e(jzc, "shareFlow");
        qmd.a(a0Var, new ProfileToolbarMenuExtensions$addShare$1(a0Var, hs7, rVar, jzc));
    }
}
