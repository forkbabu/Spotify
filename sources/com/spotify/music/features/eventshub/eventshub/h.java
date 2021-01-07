package com.spotify.music.features.eventshub.eventshub;

import com.spotify.music.features.eventshub.model.SourceType;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.j0;

public class h {
    private final jz1 a;
    private final ere b;
    private final j0 c;
    private final cqe d;
    private final String e = String.valueOf(ViewUris.j0);

    public h(jz1 jz1, ere ere, j0 j0Var, cqe cqe) {
        this.a = jz1;
        this.b = ere;
        this.c = j0Var;
        this.d = cqe;
    }

    private void f(String str, long j, String str2) {
        this.a.a(new fa1(null, "concerts-browse", this.e, str, j, str2, "hit", null, (double) this.d.d()));
    }

    public void a() {
        f("changelocation", -1, null);
        this.b.a(this.c.b("changelocation").b(null).a(ViewUris.m0.toString()));
    }

    public void b(Integer num) {
        f("changelocation-select", (long) num.intValue(), null);
        this.b.a(this.c.b("changelocation-select").b(ViewUris.m0.toString()).a(String.valueOf(num)));
    }

    public void c(Long l, SourceType sourceType, String str) {
        int ordinal = sourceType.ordinal();
        if (ordinal == 0) {
            f("nearyou-listing", l.longValue(), je.x0("spotify:concert:", str));
            ere ere = this.b;
            j0.c.a b2 = this.c.c("nearyou-listing").b(Integer.valueOf(l.intValue()), EventsHubFragment.x0);
            ere.a(b2.a("spotify:concert:" + str));
        } else if (ordinal == 1) {
            f("rec-listing", l.longValue(), je.x0("spotify:concert:", str));
            ere ere2 = this.b;
            j0.c.a b3 = this.c.c("rec-listing").b(Integer.valueOf(l.intValue()), EventsHubFragment.x0);
            ere2.a(b3.a("spotify:concert:" + str));
        } else if (ordinal == 2) {
            f("virtual-listing", l.longValue(), je.x0("spotify:concert:", str));
            ere ere3 = this.b;
            j0.d.a b4 = this.c.d("virtual-listing").b(Integer.valueOf(l.intValue()), EventsHubFragment.x0);
            ere3.a(b4.a("spotify:concert:" + str));
        } else if (ordinal == 3) {
            f("allconcerts-listing", l.longValue(), je.x0("spotify:concert:", str));
            ere ere4 = this.b;
            j0.c.a b5 = this.c.c("allconcerts-listing").b(Integer.valueOf(l.intValue()), EventsHubFragment.x0);
            ere4.a(b5.a("spotify:concert:" + str));
        }
    }

    public void d(Long l, SourceType sourceType, String str) {
        if (sourceType == SourceType.RECOMMENDATIONS) {
            f("discovery-listing", l.longValue(), je.x0("spotify:concert:", str));
            ere ere = this.b;
            j0.c.a b2 = this.c.c("discovery-listing").b(Integer.valueOf(l.intValue()), EventsHubFragment.x0);
            ere.a(b2.a("spotify:concert:" + str));
        }
    }

    public void e() {
        this.a.a(new da1(null, "concerts-browse", this.e, null, -1, null, "page", null, (double) this.d.d()));
    }
}
