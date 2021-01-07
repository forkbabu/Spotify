package com.spotify.music.carmode.nowplaying.podcast.view.speedmenu;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;
import com.spotify.music.carmode.nowplaying.podcast.view.speedmenu.d;
import java.util.List;

public final class k {
    private static final ImmutableList<j> a;

    static {
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        d.b bVar = new d.b();
        bVar.c(80);
        d.b bVar2 = bVar;
        bVar2.b(C0707R.string.context_menu_speed_control_80);
        builder.mo53add((ImmutableList.Builder) bVar2.a());
        d.b bVar3 = new d.b();
        bVar3.c(100);
        d.b bVar4 = bVar3;
        bVar4.b(C0707R.string.context_menu_speed_control_100);
        builder.mo53add((ImmutableList.Builder) bVar4.a());
        d.b bVar5 = new d.b();
        bVar5.c(120);
        d.b bVar6 = bVar5;
        bVar6.b(C0707R.string.context_menu_speed_control_120);
        builder.mo53add((ImmutableList.Builder) bVar6.a());
        d.b bVar7 = new d.b();
        bVar7.c(AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150);
        d.b bVar8 = bVar7;
        bVar8.b(C0707R.string.context_menu_speed_control_150);
        builder.mo53add((ImmutableList.Builder) bVar8.a());
        d.b bVar9 = new d.b();
        bVar9.c(200);
        d.b bVar10 = bVar9;
        bVar10.b(C0707R.string.context_menu_speed_control_200);
        builder.mo53add((ImmutableList.Builder) bVar10.a());
        a = builder.build();
    }

    public static List<j> a() {
        return a;
    }
}
