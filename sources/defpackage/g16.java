package defpackage;

import com.spotify.playlist.models.o;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: g16  reason: default package */
public final /* synthetic */ class g16 implements l {
    public static final /* synthetic */ g16 a = new g16();

    private /* synthetic */ g16() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        k16 k16 = (k16) obj;
        int i = o16.k;
        ArrayList arrayList = new ArrayList(k16.a());
        arrayList.addAll(k16.c());
        Iterator it = arrayList.iterator();
        long j = 17;
        while (it.hasNext()) {
            com.spotify.playlist.models.l lVar = (com.spotify.playlist.models.l) it.next();
            j ^= (long) lVar.getUri().hashCode();
            o g = lVar.g();
            if (g != null) {
                j ^= (long) Arrays.hashCode(new Object[]{Boolean.valueOf(g.isInCollection()), Boolean.valueOf(g.isBanned())});
            }
        }
        return Long.valueOf(j);
    }
}
