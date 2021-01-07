package com.spotify.music.features.podcast.notifications;

import com.spotify.ubi.specification.factories.t2;
import kotlin.jvm.internal.h;

public final class f {
    private final ere a;
    private final t2 b;

    public f(ere ere, t2 t2Var) {
        h.e(ere, "logger");
        h.e(t2Var, "eventFactory");
        this.a = ere;
        this.b = t2Var;
    }

    public void a(ag7 ag7) {
        h.e(ag7, "event");
        if (ag7 instanceof jg7) {
            jg7 jg7 = (jg7) ag7;
            this.a.a(this.b.c(jg7.a()).b(jg7.a()));
        } else if (ag7 instanceof ng7) {
            ng7 ng7 = (ng7) ag7;
            this.a.a(this.b.c(ng7.a()).a(ng7.a()));
        } else if (ag7 instanceof ug7) {
            ug7 ug7 = (ug7) ag7;
            this.a.a(this.b.b(ug7.a()).a(ug7.a()));
        }
    }
}
