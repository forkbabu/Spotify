package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.playlist.models.Episode;
import com.squareup.picasso.Picasso;
import defpackage.yrc;

/* renamed from: wgc  reason: default package */
public class wgc implements yrc {
    private final Picasso a;
    private final ygc b;

    /* renamed from: wgc$a */
    public static class a extends dsc {
        private Episode b;
        private Episode[] c;
        private String d = "";
        private boolean e;

        public a() {
            c(true);
        }

        @Override // defpackage.dsc
        public Episode e() {
            return this.b;
        }

        public boolean f() {
            return this.e;
        }

        public Episode[] g() {
            return this.c;
        }

        public String h() {
            return this.d;
        }

        public void i(boolean z) {
            this.e = z;
        }

        public void j(Episode episode) {
            this.b = episode;
        }

        public void k(Episode[] episodeArr) {
            this.c = episodeArr;
        }

        public void l(String str) {
            this.d = str;
        }
    }

    /* renamed from: wgc$b */
    public static class b extends yrc.a {
        private final roc C;

        public b(roc roc) {
            super(((toc) roc).getView());
            this.C = roc;
        }

        public roc h0() {
            return this.C;
        }
    }

    public wgc(Picasso picasso, ygc ygc) {
        this.a = picasso;
        this.b = ygc;
    }

    @Override // defpackage.yrc
    public /* synthetic */ void a() {
        xrc.b(this);
    }

    @Override // defpackage.yrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
        a aVar = (a) csc;
        this.b.a(((b) b0Var).h0(), aVar.e(), aVar.g(), aVar.h(), aVar.f());
    }

    @Override // defpackage.yrc
    public void d(csc csc, RecyclerView.b0 b0Var) {
        ((a) csc).getClass();
    }

    @Override // defpackage.yrc
    public yrc.a e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(toc.b(viewGroup.getContext(), viewGroup, this.a));
    }
}
