package defpackage;

import com.spotify.mobius.g;
import com.spotify.mobius.h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ih9  reason: default package */
public final class ih9<M, E> implements g<M, E> {
    private final g<M, E>[] a;

    /* renamed from: ih9$a */
    public static final class a implements h<M> {
        final /* synthetic */ List a;

        a(List list) {
            this.a = list;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(M m) {
            for (h hVar : this.a) {
                hVar.accept(m);
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            for (h hVar : this.a) {
                hVar.dispose();
            }
        }
    }

    public ih9(g<M, E>... gVarArr) {
        kotlin.jvm.internal.h.e(gVarArr, "connectables");
        this.a = gVarArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.mobius.g
    public h<M> t(da2<E> da2) {
        kotlin.jvm.internal.h.e(da2, "output");
        g<M, E>[] gVarArr = this.a;
        ArrayList arrayList = new ArrayList(gVarArr.length);
        for (g<M, E> gVar : gVarArr) {
            arrayList.add(gVar.t(da2));
        }
        return new a(arrayList);
    }
}
