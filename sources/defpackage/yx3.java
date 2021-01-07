package defpackage;

import com.spotify.mobile.android.ui.view.v;
import com.spotify.mobile.android.util.l0;
import com.spotify.playlist.models.offline.a;
import com.spotify.rxjava2.p;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: yx3  reason: default package */
public class yx3 {
    private final String a;
    private final y b;
    private final ly3 c;
    private final p d = new p();

    public yx3(y yVar, String str, ly3 ly3) {
        this.a = str;
        this.b = yVar;
        this.c = ly3;
    }

    public void a(v vVar) {
        p pVar = this.d;
        s<R> o0 = this.c.b(l0.z(this.a).i()).j0(vw3.a).E().G0((R) a.f.a).o0(this.b);
        vVar.getClass();
        pVar.b(o0.subscribe(new mx3(vVar)));
    }

    public void b() {
        this.d.a();
    }
}
