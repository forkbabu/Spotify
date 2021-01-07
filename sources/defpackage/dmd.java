package defpackage;

import com.spotify.remoteconfig.hb;
import kotlin.jvm.internal.h;

/* renamed from: dmd  reason: default package */
public final class dmd implements cmd {
    private final hb a;

    public dmd(hb hbVar) {
        h.e(hbVar, "properties");
        this.a = hbVar;
    }

    @Override // defpackage.cmd
    public boolean a() {
        return this.a.a();
    }
}
