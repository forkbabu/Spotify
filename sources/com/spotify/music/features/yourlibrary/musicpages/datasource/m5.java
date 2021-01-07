package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.m;

public class m5 {
    private final k5 a;
    private final e1 b;
    private final m c;

    public m5(k5 k5Var, e1 e1Var, m mVar) {
        this.a = k5Var;
        this.b = e1Var;
        this.c = mVar;
    }

    public static MusicItem a(m5 m5Var, int i) {
        return m5Var.c.t("spotify:collection:your-episodes", i);
    }

    public w3 b() {
        if (!this.b.m()) {
            return new c4();
        }
        return z3.e(this.a.a().j0(a3.a), new h4(z3.h(this.a.a().j0(new b3(this))), c3.a));
    }
}
