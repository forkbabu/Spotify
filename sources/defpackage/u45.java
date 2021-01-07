package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.freetiercommon.models.a;
import defpackage.t45;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: u45  reason: default package */
public final /* synthetic */ class u45 implements l {
    public static final /* synthetic */ u45 a = new u45();

    private /* synthetic */ u45() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        t45 t45 = (t45) obj;
        int i = a55.o;
        t45.a f = t45.f();
        Map<String, CollectionStateProvider.a> b = t45.b();
        List<a> d = t45.d();
        ArrayList arrayList = new ArrayList(d.size());
        for (a aVar : d) {
            CollectionStateProvider.a aVar2 = b.get(aVar.getUri());
            if (aVar2 != null) {
                a.AbstractC0274a<?, ?> J = aVar.J();
                J.i(aVar2.b());
                J.h(aVar2.a());
                arrayList.add(J.build());
            } else {
                arrayList.add(aVar);
            }
        }
        f.c(arrayList);
        return f.build();
    }
}
