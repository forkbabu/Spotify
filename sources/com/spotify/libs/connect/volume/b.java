package com.spotify.libs.connect.volume;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import com.spotify.libs.connect.volume.c;
import io.reactivex.functions.a;

/* compiled from: java-style lambda group */
public final class b implements a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        int i = this.a;
        if (i == 0) {
            Logger.b("Connect volume set to %f", Float.valueOf(((c.a.C0163a) this.c).b()));
            ((d) this.b).i.b(ConnectVolumeControlInstrumentation.SendVolumeCommand.a, ((c.a.C0163a) this.c).b(), ((d) this.b).c);
            ((d) this.b).c = Float.valueOf(((c.a.C0163a) this.c).b());
        } else if (i != 1) {
            throw null;
        } else if (((c.a.C0163a) this.c).a() == null) {
            ((nu0) ((d) this.b).h.a()).b((double) ((c.a.C0163a) this.c).b(), d.a((d) this.b));
        } else {
            ((c.a.C0163a) this.c).a().invoke();
        }
    }
}
