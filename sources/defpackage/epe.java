package defpackage;

import com.spotify.base.java.logging.Logger;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: epe  reason: default package */
public final class epe implements dpe {
    private final npe a;
    private final ekd b;

    public epe(npe npe, ekd ekd) {
        h.e(npe, "logUploader");
        h.e(ekd, "sharedPrefs");
        this.a = npe;
        this.b = ekd;
    }

    @Override // defpackage.dpe
    public void a(String str, lpe lpe) {
        h.e(str, "serial");
        h.e(lpe, "event");
        h.e(str, "serial");
        h.e(lpe, "event");
        d(str, d.t(lpe));
    }

    @Override // defpackage.dpe
    public void b(List<? extends lpe> list) {
        h.e(list, "events");
        String h = this.b.h();
        if (h != null) {
            this.a.c(h, list);
        } else {
            Logger.d("Failed to send a log due to a missing serial.", new Object[0]);
        }
    }

    @Override // defpackage.dpe
    public void c(lpe lpe) {
        h.e(lpe, "event");
        h.e(lpe, "event");
        b(d.t(lpe));
    }

    public void d(String str, List<? extends lpe> list) {
        h.e(str, "serial");
        h.e(list, "events");
        this.a.c(str, list);
    }
}
