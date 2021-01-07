package defpackage;

import com.spotify.music.spotlets.offline.util.c;
import com.spotify.rxjava2.p;
import io.reactivex.s;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qp4  reason: default package */
public class qp4 {
    private final qo4 a;
    private final c b;
    private final y c;
    private final p d = new p();
    private List<com.spotify.libs.connect.model.a> e;
    private a f;

    /* renamed from: qp4$a */
    public interface a {
    }

    public qp4(qo4 qo4, c cVar, y yVar) {
        this.a = qo4;
        this.b = cVar;
        this.c = yVar;
        this.e = new ArrayList(0);
    }

    public List<com.spotify.libs.connect.model.a> a() {
        return this.e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.util.List r3) {
        /*
            r2 = this;
            r2.e = r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0006:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r3.next()
            com.spotify.libs.connect.model.a r0 = (com.spotify.libs.connect.model.a) r0
            boolean r1 = r0.isActive()
            if (r1 != 0) goto L_0x001e
            boolean r0 = r0.isBeingActivated()
            if (r0 == 0) goto L_0x0006
        L_0x001e:
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            qp4$a r0 = r2.f
            if (r0 == 0) goto L_0x002c
            yo4 r0 = (defpackage.yo4) r0
            fp4 r0 = r0.a
            defpackage.fp4.i(r0, r3)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp4.b(java.util.List):void");
    }

    public void c(a aVar) {
        this.f = aVar;
    }

    public void d() {
        this.d.a();
        this.d.b(s.n(this.b.a(), this.a.d().W(mp4.a, false, Integer.MAX_VALUE).o0(this.c), lp4.a).o0(this.c).subscribe(new np4(this)));
    }

    public void e() {
        this.d.a();
    }
}
