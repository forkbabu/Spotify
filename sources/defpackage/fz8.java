package defpackage;

import com.spotify.ubi.specification.factories.l4;
import kotlin.jvm.internal.h;

/* renamed from: fz8  reason: default package */
public final class fz8 implements ez8 {
    private final ere a;
    private final l4 b;

    public fz8(ere ere, l4 l4Var) {
        h.e(ere, "userBehaviourEventLogger");
        h.e(l4Var, "mobileWrappedDatastoriesEventFactory");
        this.a = ere;
        this.b = l4Var;
    }

    private final String h(String str) {
        return je.x0("spotify:datastories:wrapped:", str);
    }

    @Override // defpackage.ez8
    public void a(String str) {
        h.e(str, "storyId");
        this.a.a(this.b.b(str, h(str)).f());
    }

    @Override // defpackage.ez8
    public void b(String str) {
        h.e(str, "storyId");
        this.a.a(this.b.b(str, h(str)).g());
    }

    @Override // defpackage.ez8
    public void c(String str, String str2) {
        h.e(str, "storyId");
        h.e(str2, "twitterUrl");
        this.a.a(this.b.b(str, h(str)).d(str2));
    }

    @Override // defpackage.ez8
    public void d(String str) {
        h.e(str, "storyId");
        this.a.a(this.b.b(str, h(str)).h(str, h(str)).a());
    }

    @Override // defpackage.ez8
    public void e(String str, String str2) {
        h.e(str, "storyId");
        h.e(str2, "playlistUri");
        this.a.a(this.b.b(str, h(str)).c(str2));
    }

    @Override // defpackage.ez8
    public void f(String str) {
        h.e(str, "storyId");
        this.a.a(this.b.b(str, h(str)).e());
    }

    @Override // defpackage.ez8
    public void g(String str) {
        h.e(str, "storyId");
        this.a.a(this.b.b(str, h(str)).b(str, h(str)).a());
    }
}
