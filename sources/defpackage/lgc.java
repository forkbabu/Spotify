package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.playlist.models.Episode;
import com.squareup.picasso.Picasso;
import defpackage.yrc;

@Deprecated
/* renamed from: lgc  reason: default package */
public class lgc implements yrc {
    private final Picasso a;
    private final ngc b;

    /* renamed from: lgc$a */
    public static class a extends dsc {
        private Episode b;
        private Episode[] c;
        private String d = "";
        private boolean e;

        @Override // defpackage.dsc
        public Episode e() {
            return this.b;
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

    /* renamed from: lgc$b */
    public static class b extends yrc.a {
        private final uoc C;

        public b(uoc uoc) {
            super(((voc) uoc).getView());
            this.C = uoc;
        }

        public uoc h0() {
            return this.C;
        }
    }

    public lgc(Picasso picasso, ngc ngc) {
        this.a = picasso;
        this.b = ngc;
        ngc.d(false);
        ngc.c(true);
    }

    @Override // defpackage.yrc
    public void a() {
        this.b.a();
    }

    public void b(boolean z) {
        this.b.d(z);
    }

    @Override // defpackage.yrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
        a aVar = (a) csc;
        this.b.b(((b) b0Var).h0(), aVar.e(), aVar.g(), aVar.h(), aVar.e);
    }

    @Override // defpackage.yrc
    public void d(csc csc, RecyclerView.b0 b0Var) {
        ((a) csc).getClass();
    }

    @Override // defpackage.yrc
    public yrc.a e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(voc.b(viewGroup.getContext(), viewGroup, this.a));
    }
}
