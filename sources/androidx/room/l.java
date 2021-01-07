package androidx.room;

import androidx.room.g;
import io.reactivex.disposables.c;
import io.reactivex.t;
import io.reactivex.u;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class l implements u<Object> {
    final /* synthetic */ String[] a;
    final /* synthetic */ RoomDatabase b;

    class a extends g.c {
        final /* synthetic */ t b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar, String[] strArr, t tVar) {
            super(strArr);
            this.b = tVar;
        }

        @Override // androidx.room.g.c
        public void a(Set<String> set) {
            this.b.onNext(m.a);
        }
    }

    class b implements io.reactivex.functions.a {
        final /* synthetic */ g.c a;

        b(g.c cVar) {
            this.a = cVar;
        }

        @Override // io.reactivex.functions.a
        public void run() {
            l.this.b.j().e(this.a);
        }
    }

    l(String[] strArr, RoomDatabase roomDatabase) {
        this.a = strArr;
        this.b = roomDatabase;
    }

    @Override // io.reactivex.u
    public void subscribe(t<Object> tVar) {
        a aVar = new a(this, this.a, tVar);
        this.b.j().a(aVar);
        tVar.a(c.b(new b(aVar)));
        tVar.onNext(m.a);
    }
}
