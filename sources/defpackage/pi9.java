package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.filterandsort.bottomsheet.FilterAndSortBottomSheetFragment;
import com.spotify.music.filterandsort.bottomsheet.e;
import defpackage.di9;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pi9  reason: default package */
public class pi9 {
    private final e a;
    private ane b;
    private List<di9.d> c;

    public pi9(e eVar) {
        this.a = eVar;
    }

    static SpotifyIconV2 a(pi9 pi9, di9.d dVar) {
        ane ane = pi9.b;
        if (ane == null || !ane.c().equals(dVar.c().c())) {
            return null;
        }
        if (!dVar.b()) {
            return SpotifyIconV2.CHECK;
        }
        if (pi9.b.e()) {
            return SpotifyIconV2.ARROW_UP;
        }
        return SpotifyIconV2.ARROW_DOWN;
    }

    public void b(di9.b bVar, int i) {
        ((FilterAndSortBottomSheetFragment) this.a).b5(bVar, i);
    }

    public void c(int i) {
        di9.d dVar;
        List<di9.d> list = this.c;
        if (list != null && list.get(i) != null) {
            ane c2 = this.c.get(i).c();
            if (this.b != null) {
                List<di9.d> list2 = this.c;
                boolean z = false;
                if (list2 != null && (dVar = list2.get(i)) != null && dVar.b() && c2.equals(this.b)) {
                    z = true;
                }
                if (z) {
                    ane ane = this.b;
                    this.b = ane.a(!ane.e());
                    ((FilterAndSortBottomSheetFragment) this.a).c5(this.b, i);
                }
            }
            this.b = c2;
            ((FilterAndSortBottomSheetFragment) this.a).c5(this.b, i);
        }
    }

    public void d(di9 di9, ane ane) {
        ImmutableList<di9.d> h = di9.h();
        this.c = h;
        this.b = ane;
        if (!h.isEmpty()) {
            e eVar = this.a;
            List<di9.d> list = this.c;
            ArrayList arrayList = new ArrayList(list.size());
            for (di9.d dVar : list) {
                arrayList.add(new oi9(this, dVar));
            }
            ((FilterAndSortBottomSheetFragment) eVar).f5(arrayList);
        }
        ImmutableList<di9.b> b2 = di9.b();
        if (!b2.isEmpty()) {
            ((FilterAndSortBottomSheetFragment) this.a).e5(b2);
        }
    }
}
