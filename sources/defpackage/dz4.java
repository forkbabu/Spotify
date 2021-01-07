package defpackage;

import com.spotify.ubi.specification.factories.w;
import kotlin.jvm.internal.h;

/* renamed from: dz4  reason: default package */
public final class dz4 {
    private final ere a;
    private final w b;

    public dz4(ere ere, w wVar) {
        h.e(ere, "userBehaviourEventLogger");
        h.e(wVar, "mobileAudioplhsAddsongModalEventFactory");
        this.a = ere;
        this.b = wVar;
    }

    public void a(String str) {
        h.e(str, "podcastUri");
        this.a.a(this.b.b().b().b(str, "podcasts page").a("", str));
    }

    public void b(String str, String str2) {
        h.e(str, "trackUri");
        h.e(str2, "location");
        this.a.a(this.b.b().c().b(str, str2).a("", str));
    }

    public void c() {
        this.a.a(this.b.b().d());
    }

    public void d() {
        this.a.a(this.b.b().b().c());
    }

    public void e() {
        this.a.a(this.b.b().b().c());
    }
}
