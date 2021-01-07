package defpackage;

import com.spotify.ubi.specification.factories.y;

/* renamed from: ok2  reason: default package */
public class ok2 implements nk2 {
    private final ere a;
    private final y b;

    public ok2(ere ere, y yVar) {
        this.a = ere;
        this.b = yVar;
    }

    private static String d(int i, String str) {
        return String.format("%1$s-%2$s", Integer.valueOf(i), str);
    }

    @Override // defpackage.nk2
    public void a(String str) {
        this.a.a(this.b.b(str).c());
    }

    @Override // defpackage.nk2
    public void b(String str, int i, String str2) {
        this.a.a(this.b.b(str).b(d(i, str2)).b());
    }

    @Override // defpackage.nk2
    public void c(String str, int i, String str2, String str3) {
        this.a.a(this.b.b(str).b(d(i, str2)).a(str3));
    }
}
