package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.f;
import com.spotify.rxjava2.q;
import io.reactivex.d0;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.v;
import io.reactivex.z;

/* renamed from: qo6  reason: default package */
final class qo6 implements po6 {
    private final q a = new q();
    private final io6 b;
    private final lo6 c;
    private final CompletableSubject d = CompletableSubject.R();

    /* renamed from: qo6$a */
    public static abstract class a {

        /* renamed from: qo6$a$a  reason: collision with other inner class name */
        public interface AbstractC0672a {
        }

        public abstract g76 a();

        public abstract h76 b();
    }

    public qo6(jo6 jo6, mo6 mo6, bre bre, a76 a76, f fVar) {
        this.b = jo6.b(bre);
        this.c = mo6.b(a76, fVar, bre);
    }

    @Override // defpackage.oo6
    public z<Boolean> a(boolean z, String str) {
        return this.b.o(str).s(new xn6(this, z, str));
    }

    @Override // defpackage.oo6
    public s<Boolean> b() {
        return this.b.e();
    }

    @Override // defpackage.oo6
    public s<Boolean> c() {
        return this.b.c();
    }

    @Override // defpackage.oo6
    public z<Boolean> d(String str) {
        return a(false, str);
    }

    @Override // defpackage.oo6
    public io.reactivex.a e(String str, String str2) {
        return this.b.n(str, str2);
    }

    @Override // defpackage.oo6
    public s<Boolean> f(String str) {
        return this.b.b(str);
    }

    @Override // defpackage.po6
    public io.reactivex.a g() {
        return this.d;
    }

    @Override // defpackage.oo6
    public io.reactivex.a h(String str) {
        return this.c.b("item_shuffle_play", str);
    }

    @Override // defpackage.po6
    public void i(c76 c76) {
        this.a.c();
        q qVar = this.a;
        s J0 = s.n(c76.b(), c76.h(), vn6.a).J0(new wn6(this));
        yn6 yn6 = new yn6(this);
        CompletableSubject completableSubject = this.d;
        completableSubject.getClass();
        qVar.a(J0.subscribe(yn6, new zn6(completableSubject)));
    }

    @Override // defpackage.oo6
    public io.reactivex.a j(String str) {
        return this.c.b("item_not_set", str);
    }

    @Override // defpackage.oo6
    public s<uo6> k() {
        return this.b.m();
    }

    @Override // defpackage.oo6
    public io.reactivex.a l(String str, String str2) {
        return this.c.b(str, str2);
    }

    public /* synthetic */ v m(a aVar) {
        return this.c.a(aVar.b().l(), !aVar.a().b().isEmpty()).g(s.i0(aVar));
    }

    public /* synthetic */ void n(a aVar) {
        this.d.onComplete();
    }

    public d0 o(boolean z, String str, Optional optional) {
        io.reactivex.a aVar;
        if (optional.isPresent()) {
            return z.z(optional.get());
        }
        if (z) {
            aVar = this.c.b("item_shuffle_play", str);
        } else {
            aVar = this.c.b("item_not_set", str);
        }
        return aVar.h(z.z(Boolean.TRUE));
    }

    @Override // defpackage.po6
    public void onStop() {
        this.a.c();
    }
}
