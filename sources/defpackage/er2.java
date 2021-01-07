package defpackage;

import com.spotify.ubi.specification.factories.c0;
import kotlin.jvm.internal.h;

/* renamed from: er2  reason: default package */
public final class er2 implements dr2 {
    private final c0 a = new c0();
    private final ere b;

    public er2(ere ere) {
        h.e(ere, "userBehaviourEventLogger");
        this.b = ere;
    }

    @Override // defpackage.dr2
    public void a(String str, int i, String str2, int i2, String str3) {
        je.x(str, "shelfId", str2, "itemTitle", str3, "uri");
        this.b.a(this.a.c(str, Integer.valueOf(i)).c(str2, Integer.valueOf(i2), str3).a(str3));
    }

    @Override // defpackage.dr2
    public void b(String str, int i, String str2, int i2, String str3) {
        je.x(str, "shelfId", str2, "itemTitle", str3, "uri");
        this.b.a(this.a.b(str, Integer.valueOf(i)).c(str2, Integer.valueOf(i2), str3).a(str3));
    }

    @Override // defpackage.dr2
    public void c(String str, int i) {
        h.e(str, "shelfId");
        this.b.a(this.a.b(str, Integer.valueOf(i)).b());
    }

    @Override // defpackage.dr2
    public void d(String str, int i) {
        h.e(str, "shelfId");
        this.b.a(this.a.c(str, Integer.valueOf(i)).b());
    }
}
