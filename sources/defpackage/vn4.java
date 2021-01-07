package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.libs.connect.instrumentation.e;
import com.spotify.music.C0707R;

/* renamed from: vn4  reason: default package */
public class vn4 implements qu0 {
    private final qp4 a;
    private final bq4 b;
    private final dq4 c;
    private final e d;
    private b e;
    private boolean f;

    /* renamed from: vn4$a */
    static class a extends RecyclerView.b0 {
        final y90 C;

        public a(y90 y90) {
            super(y90.getView());
            this.C = y90;
        }
    }

    /* renamed from: vn4$b */
    public interface b {
    }

    /* renamed from: vn4$c */
    static class c extends RecyclerView.b0 {
        final u90 C;

        public c(u90 u90) {
            super(u90.getView());
            this.C = u90;
        }
    }

    public vn4(qp4 qp4, bq4 bq4, dq4 dq4, e eVar) {
        this.a = qp4;
        this.b = bq4;
        this.c = dq4;
        this.d = eVar;
    }

    @Override // defpackage.qu0
    public RecyclerView.b0 b(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        if (22 == i) {
            return new a(e90.d().i(context, viewGroup));
        }
        return new c(e90.d().d(context, viewGroup));
    }

    @Override // defpackage.qu0
    public int c() {
        return !this.a.a().isEmpty() ? 1 : 0;
    }

    @Override // defpackage.qu0
    public int[] e() {
        return new int[]{22, 21};
    }

    @Override // defpackage.qu0
    public void f(RecyclerView.b0 b0Var, int i) {
        if (b0Var instanceof a) {
            a aVar = (a) b0Var;
            Context context = aVar.a.getContext();
            aVar.C.setActive(true);
            aVar.C.setTitle(this.c.a(false));
            aVar.C.setSubtitle(this.c.c());
            aVar.C.getSubtitleView().setTextColor(androidx.core.content.a.c(context, C0707R.color.txt_connect_picker_subtitle));
            int f2 = this.b.f();
            aVar.C.getImageView().setPadding(f2, f2, f2, f2);
            aVar.C.getImageView().setImageDrawable(this.b.b());
            return;
        }
        c cVar = (c) b0Var;
        String c2 = this.c.c();
        cVar.C.setText(c2);
        int f3 = this.b.f();
        cVar.C.getImageView().setPadding(f3, f3, f3, f3);
        cVar.C.getImageView().setImageDrawable(this.b.b());
        ((vt0) this.d.b()).k();
        cVar.a.setOnClickListener(new kn4(this, c2));
    }

    public void g(String str, View view) {
        b bVar = this.e;
        if (bVar != null) {
            ((xo4) bVar).a.n(str);
        }
    }

    @Override // defpackage.qu0
    public long getItemId(int i) {
        return (long) -1723195990;
    }

    @Override // defpackage.qu0
    public int getItemViewType(int i) {
        return this.f ? 22 : 21;
    }

    public void h(b bVar) {
        this.e = bVar;
    }

    public void i(boolean z) {
        this.f = z;
    }
}
