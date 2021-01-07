package defpackage;

import com.spotify.music.carmode.navigation.domain.p;
import io.reactivex.functions.f;
import io.reactivex.s;
import io.reactivex.t;
import io.reactivex.u;
import kotlin.jvm.internal.h;

/* renamed from: mn2  reason: default package */
public final class mn2 {
    public static final b b = new b(null);
    private final s<p> a;

    /* renamed from: mn2$a */
    static final class a<T> implements u<p> {
        final /* synthetic */ ys2 a;

        /* renamed from: mn2$a$a  reason: collision with other inner class name */
        static final class C0639a implements f {
            final /* synthetic */ a a;
            final /* synthetic */ xs2 b;

            C0639a(a aVar, xs2 xs2) {
                this.a = aVar;
                this.b = xs2;
            }

            @Override // io.reactivex.functions.f
            public final void cancel() {
                this.a.a.x2(this.b);
            }
        }

        a(ys2 ys2) {
            this.a = ys2;
        }

        @Override // io.reactivex.u
        public final void subscribe(t<p> tVar) {
            h.e(tVar, "emitter");
            nn2 nn2 = new nn2(tVar);
            this.a.q1(nn2);
            tVar.e(new C0639a(this, nn2));
        }
    }

    /* renamed from: mn2$b */
    public static final class b {
        public b(kotlin.jvm.internal.f fVar) {
        }
    }

    public mn2(ys2 ys2) {
        h.e(ys2, "container");
        s<p> y = s.y(new a(ys2));
        h.d(y, "Observable.create { emit…ner(listener) }\n        }");
        this.a = y;
    }

    public final s<p> a() {
        return this.a;
    }
}
