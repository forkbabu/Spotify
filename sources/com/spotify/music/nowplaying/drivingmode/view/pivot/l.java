package com.spotify.music.nowplaying.drivingmode.view.pivot;

import com.spotify.music.nowplaying.drivingmode.presenter.pivot.PivotSubtitleIcon;
import com.spotify.music.nowplaying.drivingmode.view.pivot.h;
import com.spotify.player.model.ContextIndex;

public abstract class l {

    public interface a {
        a a(String str);

        a b(String str);

        l build();

        a c(String str);

        a d(long j);

        a e(boolean z);

        a f(PivotSubtitleIcon pivotSubtitleIcon);

        a g(ContextIndex contextIndex);

        a h(String str);

        a i(cfc cfc);

        a j(String str);
    }

    public static a a() {
        return new h.b();
    }

    public abstract cfc b();

    public abstract String c();

    public abstract String d();

    public abstract boolean e();

    public abstract ContextIndex f();

    public abstract long g();

    public abstract String h();

    public abstract PivotSubtitleIcon i();

    public abstract String j();

    public abstract String k();
}
