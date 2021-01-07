package com.spotify.music.features.eventshub.concertentity;

import com.spotify.music.features.eventshub.eventshub.EventsHubFragment;
import com.spotify.ubi.specification.factories.i0;

public class g {
    private final jz1 a;
    private final String b;
    private String c;
    private final ere d;
    private final i0 e;
    private final cqe f;

    public g(jz1 jz1, String str, String str2, ere ere, i0 i0Var, cqe cqe) {
        this.a = jz1;
        this.b = str;
        this.c = str2;
        this.d = ere;
        this.e = i0Var;
        this.f = cqe;
    }

    private void c(String str, int i, String str2) {
        this.a.a(new fa1(null, this.b, this.c, str, (long) i, str2, "hit", null, (double) this.f.d()));
    }

    public void a() {
        c("share-concert", -1, "");
        this.d.a(this.e.e().a());
    }

    public void b() {
        this.a.a(new da1(null, this.b, this.c, null, -1, null, "page", null, (double) this.f.d()));
    }

    public void d() {
        String str = EventsHubFragment.x0;
        c("goto-eventhub", -1, str);
        this.d.a(this.e.d().a(str));
    }

    public void e(String str) {
        c("findtickets", -1, str);
        this.d.a(this.e.b().a(str));
    }

    public void f(String str, Integer num, String str2) {
        String x0 = je.x0("spotify:concert:", str2);
        c("related-shows-" + str, num.intValue(), x0);
        this.d.a(this.e.c().b().a(x0));
    }

    public void g(String str) {
        this.c = str;
    }
}
