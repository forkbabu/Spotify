package defpackage;

import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.hubframework.defaults.m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gd7  reason: default package */
public class gd7 implements fd7 {
    private final m a;
    private final i61 b;
    private final ad7 c;
    private Group d;
    private RecyclerView e;

    public gd7(i61 i61, m mVar, ad7 ad7) {
        this.b = i61;
        this.a = mVar;
        this.c = ad7;
    }

    @Override // defpackage.fd7
    public void a(RecyclerView recyclerView, Group group) {
        this.d = group;
        this.e = recyclerView;
        recyclerView.setAdapter(this.b);
        recyclerView.setLayoutManager(this.a.create());
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setFocusable(false);
    }

    @Override // defpackage.fd7
    public void b(List<? extends s81> list) {
        if (list.isEmpty()) {
            Group group = this.d;
            if (group != null) {
                group.setVisibility(8);
                return;
            }
            return;
        }
        Group group2 = this.d;
        if (group2 != null) {
            group2.setVisibility(0);
        }
        this.c.g(this.e);
        i61 i61 = this.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            s81 s81 = (s81) list.get(i);
            o81 o81 = (o81) s81.events().get("click");
            if ((o81 == null || !o81.name().equals("navigate") || o81.data().string("uri") == null) ? false : true) {
                String string = (o81 == null || !o81.name().equals("navigate") || o81.data().string("uri") == null) ? null : o81.data().string("uri");
                int i2 = dd7.n;
                arrayList.add(s81.toBuilder().f("click", z81.b().e("episode:navigate-recommended-episodes").b("uri", string).b("position", Integer.valueOf(i)).c()).l());
            } else {
                arrayList.add(s81);
            }
        }
        i61.c0(arrayList);
        this.b.z();
    }
}
