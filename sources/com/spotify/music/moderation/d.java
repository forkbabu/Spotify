package com.spotify.music.moderation;

import androidx.fragment.app.c;

public class d {
    private e a;

    public void a(e eVar) {
        this.a = eVar;
    }

    public boolean b() {
        c B2;
        boolean l5 = ((ModerationReportFragment) this.a).l5();
        if (!l5 && (B2 = ((ModerationReportFragment) this.a).B2()) != null) {
            B2.finish();
        }
        return l5;
    }

    public void c() {
        c B2 = ((ModerationReportFragment) this.a).B2();
        if (B2 != null) {
            B2.finish();
        }
    }
}
