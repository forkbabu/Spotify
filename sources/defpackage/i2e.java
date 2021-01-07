package defpackage;

import com.spotify.remoteconfig.qa;
import kotlin.jvm.internal.h;

/* renamed from: i2e  reason: default package */
public final class i2e {
    private Boolean a;
    private final qa b;

    public i2e(qa qaVar) {
        h.e(qaVar, "mProperties");
        this.b = qaVar;
    }

    public final synchronized boolean a() {
        Boolean bool;
        if (this.a == null) {
            this.a = Boolean.valueOf(this.b.a());
        }
        bool = this.a;
        h.c(bool);
        return bool.booleanValue();
    }
}
