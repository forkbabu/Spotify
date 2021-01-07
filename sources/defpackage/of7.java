package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;
import java.util.List;

/* renamed from: of7  reason: default package */
class of7 implements nf7 {
    private final i61 a;
    private final m b;
    private final c c;
    private RecyclerView d;

    public of7(i61 i61, m mVar, c cVar) {
        this.a = i61;
        this.b = mVar;
        this.c = cVar;
    }

    @Override // defpackage.nf7
    public void a(RecyclerView recyclerView) {
        this.d = recyclerView;
        recyclerView.setAdapter(this.a);
        recyclerView.setLayoutManager(this.b.create());
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        this.c.g(recyclerView);
    }

    @Override // defpackage.nf7
    public void b(b91 b91) {
        if (this.d != null) {
            if (b91 == null || b91.body().isEmpty()) {
                this.d.setVisibility(8);
                return;
            }
            List<? extends s81> body = b91.body();
            this.d.setVisibility(0);
            this.a.c0(body);
            this.a.z();
        }
    }
}
