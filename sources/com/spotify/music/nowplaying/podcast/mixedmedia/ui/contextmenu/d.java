package com.spotify.music.nowplaying.podcast.mixedmedia.ui.contextmenu;

import androidx.fragment.app.c;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.music.libs.viewuri.ViewUris;
import defpackage.d42;
import kotlin.jvm.internal.h;

public final class d implements c {
    private final b42 a;
    private final c b;

    public d(b42 b42, c cVar) {
        h.e(b42, "trackContextMenuBuilder");
        h.e(cVar, "contextMenuClient");
        this.a = b42;
        this.b = cVar;
        if (!(cVar instanceof aj9)) {
            throw new IllegalArgumentException("The FragmentActivity needs to be a ContextMenuClient");
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.contextmenu.c
    public void a(String str, String str2, String str3, com.spotify.music.libs.viewuri.c cVar) {
        h.e(str, "trackUri");
        h.e(str2, "trackName");
        h.e(str3, "contextUri");
        h.e(cVar, "viewUri");
        d42.f w = this.a.a(str, str2, str3).a(cVar).t(true).g(true).r(true).w(false);
        w.c(false);
        w.p(true);
        w.k(false);
        ContextMenuFragment.f5(w.b(), this.b, ViewUris.h0);
    }
}
