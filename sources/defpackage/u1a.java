package defpackage;

import com.spotify.music.libs.assistedcuration.presenter.q;
import com.spotify.music.libs.viewuri.c;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.i;
import com.spotify.rxjava2.p;
import io.reactivex.a;
import io.reactivex.internal.operators.completable.b;
import java.util.List;

/* renamed from: u1a  reason: default package */
public class u1a implements x1a {
    private final c a;
    private final String b;
    private final d c;
    private final i d;
    private final q e;
    private final p f = new p();

    public u1a(c cVar, String str, d dVar, i iVar, q qVar) {
        this.a = cVar;
        this.b = str;
        this.c = dVar;
        this.d = iVar;
        this.e = qVar;
    }

    public static a b(u1a u1a, d.c cVar) {
        u1a.getClass();
        if (cVar.b()) {
            return b.a;
        }
        return u1a.d.e(u1a.b, cVar.d(), u1a.a.toString(), "spotify:assisted-curation");
    }

    @Override // defpackage.x1a
    public void a(List<String> list) {
        this.e.a((String[]) list.toArray(new String[0]), this.b);
        this.f.b(this.c.b(this.b, list).P().K0(new r1a(this)).subscribe());
    }

    @Override // defpackage.x1a
    public void stop() {
        this.f.a();
    }
}
