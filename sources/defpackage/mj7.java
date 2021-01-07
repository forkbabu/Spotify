package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* renamed from: mj7  reason: default package */
public class mj7 implements qc0, tc0 {
    private View a;
    private final oj7 b;
    private final qj7 c;
    private final sj7 f;

    public mj7(oj7 oj7, qj7 qj7, sj7 sj7) {
        this.b = oj7;
        this.c = qj7;
        this.f = sj7;
    }

    public void b(s81 s81) {
        View view = this.a;
        if (view != null) {
            this.b.a(view, s81);
            this.c.a(this.a, s81);
            this.f.a(this.a, s81);
        }
    }

    public void c(ViewGroup viewGroup) {
        this.a = je.G(viewGroup, C0707R.layout.premium_page_header_view, viewGroup, false);
    }

    @Override // defpackage.tc0
    public void e0(int i, float f2) {
        this.b.e0(i, f2);
        this.c.e0(i, f2);
        this.f.e0(i, f2);
    }

    @Override // defpackage.qc0, com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }
}
