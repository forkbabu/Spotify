package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.podcast.ui.trailer.h;
import defpackage.yrc;
import java.util.Locale;

/* renamed from: yfc  reason: default package */
public class yfc implements yrc {
    private final h a;
    private final pfc b;

    /* renamed from: yfc$a */
    public static class a extends csc {
        View.OnClickListener b;
        String c = "";
        String d = "";
        String e = "";
        boolean f;
        String g = "";
        boolean h = true;
        private Runnable i;
        msc j;

        public a() {
            c(false);
        }

        public void f(String str) {
            this.g = str;
        }

        public void g(boolean z) {
            this.h = z;
        }

        public void h(msc msc) {
            this.j = msc;
        }

        public void i(Runnable runnable) {
            this.i = runnable;
        }

        public void j(boolean z) {
            this.f = z;
        }

        public void k(String str) {
            this.d = str;
        }

        public void l(String str) {
            this.e = str;
        }

        public void m(String str) {
            this.c = str;
        }

        public void n(View.OnClickListener onClickListener) {
            this.b = onClickListener;
        }
    }

    /* renamed from: yfc$b */
    public static class b extends yrc.a {
        public b(View view) {
            super(view);
        }
    }

    public yfc(h hVar, pfc pfc) {
        this.a = hVar;
        this.b = pfc;
    }

    @Override // defpackage.yrc
    public /* synthetic */ void a() {
        xrc.b(this);
    }

    @Override // defpackage.yrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
        a aVar = (a) csc;
        this.a.setTitle(aVar.c);
        this.a.setSubtitle(aVar.d.toUpperCase(Locale.getDefault()));
        this.a.g(aVar.e.toUpperCase(Locale.getDefault()));
        this.a.d(aVar.f);
        this.a.c(aVar.g);
        this.a.Z1(aVar.b);
        this.a.setEnabled(aVar.h);
        this.a.z0(this.b.a(b0Var.a.getContext(), aVar.j));
    }

    @Override // defpackage.yrc
    public void d(csc csc, RecyclerView.b0 b0Var) {
        Runnable runnable = ((a) csc).i;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.yrc
    public yrc.a e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(this.a.b(viewGroup, layoutInflater));
    }
}
