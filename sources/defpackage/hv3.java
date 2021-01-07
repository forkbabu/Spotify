package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.rxjava2.q;
import io.reactivex.w;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: hv3  reason: default package */
public class hv3 {
    private final w<Response, Response> a;
    private final mv3 b;
    private final kv3 c;
    private final List<yda> d = new CopyOnWriteArrayList();
    private final q e = new q();
    private boolean f;

    public hv3(kv3 kv3, w<Response, Response> wVar, mv3 mv3) {
        this.c = kv3;
        this.a = wVar;
        this.b = mv3;
    }

    private void c(yda yda, boolean z) {
        this.e.a((z ? this.c.a(yda) : this.c.b(yda)).q(this.a).subscribe(wu3.a, xu3.a));
        this.b.a("active_connected_device", this.c.d());
    }

    public void a(yda yda) {
        if (this.f) {
            c(yda, true);
        } else if (!this.d.contains(yda)) {
            this.d.add(yda);
        }
    }

    public void b(yda yda) {
        if (this.f) {
            c(yda, false);
        } else {
            this.d.remove(yda);
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.f = false;
        this.e.c();
        this.b.b();
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.f = true;
        for (yda yda : this.d) {
            try {
                c(yda, true);
            } catch (JsonProcessingException e2) {
                Logger.e(e2, "Failed to connect an accessory %s", yda);
            }
        }
        this.d.clear();
    }
}
