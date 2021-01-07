package defpackage;

import com.spotify.music.follow.j;
import com.spotify.music.follow.l;
import com.spotify.music.follow.m;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.f;
import io.reactivex.g;
import io.reactivex.h;
import io.reactivex.i;

/* renamed from: gj2  reason: default package */
public final class gj2 {
    private final m a;

    /* access modifiers changed from: package-private */
    /* renamed from: gj2$a */
    public static final class a<T> implements i<j> {
        final /* synthetic */ gj2 a;
        final /* synthetic */ String b;
        final /* synthetic */ j c;

        /* renamed from: gj2$a$a  reason: collision with other inner class name */
        static final class C0593a implements f {
            final /* synthetic */ a a;
            final /* synthetic */ l b;

            C0593a(a aVar, l lVar) {
                this.a = aVar;
                this.b = lVar;
            }

            @Override // io.reactivex.functions.f
            public final void cancel() {
                this.a.a.a.d(this.a.b, this.b);
            }
        }

        /* renamed from: gj2$a$b */
        static final class b implements l {
            final /* synthetic */ h a;

            b(h hVar) {
                this.a = hVar;
            }

            @Override // com.spotify.music.follow.l
            public final void g(j jVar) {
                this.a.onNext(jVar);
            }
        }

        a(gj2 gj2, String str, j jVar) {
            this.a = gj2;
            this.b = str;
            this.c = jVar;
        }

        @Override // io.reactivex.i
        public final void subscribe(h<j> hVar) {
            kotlin.jvm.internal.h.e(hVar, "emitter");
            b bVar = new b(hVar);
            hVar.e(new C0593a(this, bVar));
            this.a.a.b(this.b, bVar);
            j c2 = this.a.a.c(this.b);
            if (c2 == null) {
                c2 = this.c;
            }
            this.a.a.g(c2);
        }
    }

    public gj2(m mVar) {
        kotlin.jvm.internal.h.e(mVar, "followManager");
        this.a = mVar;
    }

    public final g<j> b(String str, j jVar) {
        kotlin.jvm.internal.h.e(str, "artistUri");
        kotlin.jvm.internal.h.e(jVar, "initialFollowData");
        g<j> p = g.p(new a(this, str, jVar), BackpressureStrategy.BUFFER);
        kotlin.jvm.internal.h.d(p, "Flowable.create(\n       …Strategy.BUFFER\n        )");
        return p;
    }

    public final void c(String str, boolean z) {
        kotlin.jvm.internal.h.e(str, "artistUri");
        if (this.a.c(str) != null) {
            this.a.e(str, z);
        }
    }
}
