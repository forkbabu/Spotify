package defpackage;

import com.spotify.music.features.podcast.entity.loadedpage.data.b;
import com.spotify.music.features.podcast.entity.loadedpage.data.h;
import defpackage.o27;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: e37  reason: default package */
public final class e37 implements f37 {
    private final h a;
    private final int b;

    /* renamed from: e37$a */
    static final class a<T, R> implements l<b, o37> {
        final /* synthetic */ e37 a;

        a(e37 e37) {
            this.a = e37;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public o37 apply(b bVar) {
            b bVar2 = bVar;
            kotlin.jvm.internal.h.e(bVar2, "dataModel");
            this.a.getClass();
            return new o37(bVar2.b(), bVar2.a(), bVar2.c());
        }
    }

    public e37(h hVar, int i) {
        kotlin.jvm.internal.h.e(hVar, "dataLoader");
        this.a = hVar;
        this.b = i;
    }

    public s<o37> a() {
        s<R> j0 = this.a.a(new o27.a(o27.a.AbstractC0653a.b.a, o27.a.c.b.a, new o27.a.b(0, this.b))).j0(new a(this));
        kotlin.jvm.internal.h.d(j0, "dataLoader.loadData(\n   …toFindInShowDataModel() }");
        return j0;
    }
}
