package defpackage;

import com.spotify.superbird.pitstop.room.PitstopDatabase;
import com.spotify.superbird.pitstop.room.b;
import defpackage.hpe;
import kotlin.jvm.internal.h;

/* renamed from: ipe  reason: default package */
public final class ipe implements fjf<b> {
    private final wlf<PitstopDatabase> a;

    public ipe(wlf<PitstopDatabase> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        PitstopDatabase pitstopDatabase = this.a.get();
        hpe.a aVar = hpe.a;
        h.e(pitstopDatabase, "database");
        b t = pitstopDatabase.t();
        yif.g(t, "Cannot return null from a non-@Nullable @Provides method");
        return t;
    }
}
