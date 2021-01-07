package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.hubframework.defaults.m;

/* renamed from: m27  reason: default package */
public class m27 implements l27 {
    private final i61 a;
    private final j27 b;
    private final m c;
    private RecyclerView d;

    public m27(i61 i61, j27 j27, m mVar) {
        this.a = i61;
        this.b = j27;
        this.c = mVar;
    }

    @Override // defpackage.l27
    public void a(RecyclerView recyclerView) {
        this.d = recyclerView;
        recyclerView.setAdapter(this.a);
        recyclerView.setLayoutManager(this.c.create());
        recyclerView.setHasFixedSize(true);
    }

    @Override // defpackage.l27
    public void b(b91 b91) {
        if (this.d != null) {
            if (b91 == null || b91.body().isEmpty()) {
                this.d.setVisibility(8);
                return;
            }
            this.d.setVisibility(0);
            this.b.g(this.d);
            this.a.c0(b91.body());
            this.a.z();
        }
    }
}
