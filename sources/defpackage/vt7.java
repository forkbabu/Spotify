package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.profile.model.ProfileListItem;
import com.spotify.music.features.profile.profilelist.w;
import defpackage.lt7;

/* renamed from: vt7  reason: default package */
public class vt7 implements g<mt7, lt7> {
    private final ViewGroup a;
    private final RecyclerView b;
    private final ek7 c;
    private final gk7 f;
    private final w n;

    /* renamed from: vt7$a */
    class a implements h<mt7> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            mt7 mt7 = (mt7) obj;
            vt7.this.c.l0(mt7.b().b());
            vt7.this.c.i0(l0.J(mt7.a()).B());
            if (vt7.this.b.getAdapter() == null) {
                vt7.this.b.setAdapter(vt7.this.c);
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            vt7.this.f.p2(null);
        }
    }

    public vt7(LayoutInflater layoutInflater, ViewGroup viewGroup, ek7 ek7, gk7 gk7, w wVar) {
        this.c = ek7;
        this.f = gk7;
        this.n = wVar;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.fragment_profilelist, viewGroup, false);
        this.a = viewGroup2;
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(C0707R.id.recycler_view);
        this.b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(layoutInflater.getContext()));
    }

    public View d() {
        return this.a;
    }

    public void e(da2 da2, ProfileListItem profileListItem, int i) {
        kotlin.jvm.internal.h.e(profileListItem, "profileListItem");
        da2.accept(new lt7.c(profileListItem));
        this.n.a(profileListItem, i);
    }

    @Override // com.spotify.mobius.g
    public h<mt7> t(da2<lt7> da2) {
        this.c.k0(new ut7(this, da2));
        this.f.p2(new tt7(da2));
        return new a();
    }
}
