package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.BackNavigationInteractionType;

/* renamed from: ja8  reason: default package */
public class ja8 implements fb8 {
    private final ere a;
    private final jz1 b;
    private final ifd c;
    private final c.a d;
    private final cqe e;
    private final nqe f;

    public ja8(ere ere, jz1 jz1, ifd ifd, c.a aVar, cqe cqe, nqe nqe) {
        this.a = ere;
        this.b = jz1;
        this.c = ifd;
        this.d = aVar;
        this.e = cqe;
        this.f = nqe;
    }

    @Override // defpackage.fb8
    public void log(String str) {
        this.a.a(this.f);
        jz1 jz1 = this.b;
        ifd ifd = this.c;
        ifd.getClass();
        String name = ifd.getName();
        c.a aVar = this.d;
        aVar.getClass();
        jz1.a(new fa1(null, name, aVar.getViewUri().toString(), "search-field", -1, str, "hit", BackNavigationInteractionType.UP_BUTTON_PRESSED.toString(), (double) this.e.d()));
    }
}
