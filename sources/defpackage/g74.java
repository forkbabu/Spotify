package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.f0;

/* renamed from: g74  reason: default package */
public class g74 implements qc0, tc0 {
    private final j74 a;
    private final urc b;
    private final r74 c;

    public g74(ViewGroup viewGroup, boolean z) {
        int i = trc.a;
        urc urc = new urc(src.b);
        this.b = urc;
        k74 k74 = new k74(viewGroup, z);
        this.a = k74;
        r74 r74 = new r74(k74);
        this.c = r74;
        urc.e(new s74(r74));
    }

    public f0 b() {
        return this.b.f();
    }

    public void c(RecyclerView.e<? extends RecyclerView.b0> eVar) {
        ((k74) this.a).e(eVar);
    }

    public void d(String str, String str2) {
        this.c.a(str, str2);
    }

    @Override // defpackage.tc0
    public void e0(int i, float f) {
        ((k74) this.a).d(i, f);
    }

    @Override // defpackage.qc0, com.spotify.encore.ViewProvider
    public View getView() {
        return ((k74) this.a).c();
    }
}
