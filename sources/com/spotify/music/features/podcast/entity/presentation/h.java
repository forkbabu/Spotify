package com.spotify.music.features.podcast.entity.presentation;

import com.spotify.mobile.android.ui.contextmenu.ContextMenuEvent;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.navigation.t;

public final class h implements s3 {
    private final t b;
    private final String c;

    public h(t tVar, String str) {
        kotlin.jvm.internal.h.e(tVar, "navigator");
        kotlin.jvm.internal.h.e(str, "showUri");
        this.b = tVar;
        this.c = str;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.s3
    public void a(ContextMenuEvent contextMenuEvent) {
        kotlin.jvm.internal.h.e(contextMenuEvent, "event");
        if (contextMenuEvent == ContextMenuEvent.FIND_IN_SHOW) {
            StringBuilder sb = new StringBuilder();
            s52 a = t52.a(LinkType.SHOW_FIND);
            if (a != null) {
                String str = a.b().get(0);
                kotlin.jvm.internal.h.d(str, "spotifyUri.patterns[0]");
                sb.append(str);
                sb.append(':');
                String str2 = s52.k.split(this.c)[2];
                kotlin.jvm.internal.h.d(str2, "SpotifyUri.URI_SPLITTER_PATTERN.split(this)[2]");
                sb.append(str2);
                this.b.d(sb.toString());
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }
}
