package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: ry3  reason: default package */
public class ry3 implements a71 {
    private final iy3 a;
    private final p71 b;
    private final String c;
    private final ere f;
    private final j81 n;

    public ry3(iy3 iy3, p71 p71, ere ere, j81 j81, String str) {
        this.a = iy3;
        this.b = p71;
        this.f = ere;
        this.c = str;
        this.n = j81;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        Boolean bool = (Boolean) n61.a().get("download");
        if (bool == null) {
            Logger.d("Missing event data!", new Object[0]);
        } else if (bool.booleanValue()) {
            this.b.a(this.c, n61.d(), "download", null);
            this.f.a(this.n.a(n61).b(this.c));
            this.a.a();
        } else {
            this.b.a(this.c, n61.d(), "remove_download", null);
            this.f.a(this.n.a(n61).e(this.c));
            this.a.e();
        }
    }
}
