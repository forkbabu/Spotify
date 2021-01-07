package com.spotify.music.nowplaying.common.view.logging;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.music.libs.viewuri.c;

public class a {
    private final jz1 a;
    private final wlf<LegacyPlayerState> b;
    private final c c;
    private final String d;
    private final String e;
    private final cqe f;

    public a(jz1 jz1, wlf<LegacyPlayerState> wlf, c cVar, com.spotify.instrumentation.a aVar, String str, cqe cqe) {
        this.a = jz1;
        this.b = wlf;
        this.c = cVar;
        this.d = aVar.path();
        this.e = str;
        this.f = cqe;
    }

    private void a(int i, String str, String str2, NowPlayingLogConstants$SectionId nowPlayingLogConstants$SectionId) {
        String str3;
        jz1 jz1 = this.a;
        LegacyPlayerState legacyPlayerState = this.b.get();
        if (legacyPlayerState == null) {
            str3 = null;
        } else {
            str3 = legacyPlayerState.playbackId();
        }
        String str4 = this.d;
        String cVar = this.c.toString();
        jz1.a(new da1(str3, str4, cVar, this.e + nowPlayingLogConstants$SectionId, (long) i, null, str, str2, (double) this.f.d()));
    }

    public void b(int i, String str) {
        a(i, NowPlayingLogConstants$ImpressionType.WIDGET.toString(), str, NowPlayingLogConstants$SectionId.SCROLL);
    }

    public void c() {
        a(0, NowPlayingLogConstants$ImpressionType.PAGE.toString(), "", NowPlayingLogConstants$SectionId.SCROLL);
    }
}
