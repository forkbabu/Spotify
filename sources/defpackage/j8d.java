package defpackage;

import com.spotify.music.sociallistening.models.b;
import io.reactivex.functions.g;
import io.reactivex.subjects.a;
import kotlin.jvm.internal.h;

/* renamed from: j8d  reason: default package */
final class j8d<T> implements g<r8d> {
    final /* synthetic */ g8d a;

    j8d(g8d g8d) {
        this.a = g8d;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: io.reactivex.subjects.a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.functions.g
    public void accept(r8d r8d) {
        String str;
        r8d r8d2 = r8d;
        h.e(r8d2, "socialListeningImplModel");
        a aVar = this.a.b;
        this.a.getClass();
        boolean o = r8d2.o();
        String j = r8d2.j();
        boolean z = true ^ (j == null || j.length() == 0);
        boolean n = r8d2.n();
        boolean q = r8d2.q();
        boolean p = r8d2.p();
        boolean r = r8d2.r();
        boolean i = r8d2.i();
        boolean g = r8d2.g();
        boolean k = r8d2.k();
        String e = r8d2.e();
        String str2 = e != null ? e : "";
        String f = r8d2.f();
        if (f != null) {
            str = f;
        } else {
            str = "";
        }
        aVar.onNext(new b(o, z, n, q, p, r, i, g, k, str2, str, r8d2.h(), r8d2.d()));
    }
}
