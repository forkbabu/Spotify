package defpackage;

import com.spotify.music.features.podcast.episode.transcript.ui.page.c;
import com.spotify.music.features.podcast.episode.transcript.ui.page.k;
import com.spotify.music.yourlibrary.quickscroll.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.collections.j;
import kotlin.jvm.internal.h;

/* renamed from: mb7  reason: default package */
public final class mb7 implements z {
    private Set<Integer> a = EmptySet.a;

    public final void a(k kVar) {
        h.e(kVar, "viewModel");
        Iterable b0 = d.b0(kVar.a());
        ArrayList arrayList = new ArrayList();
        Iterator it = ((i) b0).iterator();
        while (true) {
            j jVar = (j) it;
            if (!jVar.hasNext()) {
                break;
            }
            Object next = jVar.next();
            if (((c) ((kotlin.collections.h) next).b()) instanceof c.a) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(d.e(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((kotlin.collections.h) it2.next()).a()));
        }
        this.a = d.Z(arrayList2);
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.z
    public boolean h(int i) {
        return this.a.contains(Integer.valueOf(i));
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.z
    public int m() {
        return this.a.size();
    }
}
