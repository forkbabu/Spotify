package defpackage;

import android.content.Context;
import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.quotesharing.c;
import com.spotify.mobile.android.quotesharing.e;
import com.spotify.paste.widgets.layouts.PasteLinearLayout;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.m;
import com.squareup.picasso.Picasso;
import defpackage.yrc;

/* renamed from: fic  reason: default package */
public class fic implements yrc, hic {
    private final Picasso a;
    private final jic b;
    private final e c;
    private final cic d;
    private final cb1 e;
    private RecyclerView f;

    /* renamed from: fic$a */
    class a implements c.a {
        a(fic fic) {
        }
    }

    /* renamed from: fic$b */
    public static class b extends dsc {
        private Episode b;
        private Episode[] c;
        private boolean d;

        @Override // defpackage.dsc
        public Episode e() {
            return this.b;
        }

        public boolean f() {
            return this.d;
        }

        public Episode[] g() {
            return this.c;
        }

        public void h(boolean z) {
            this.d = z;
        }

        public void i(Episode episode) {
            this.b = episode;
        }

        public void j(Episode[] episodeArr) {
            this.c = episodeArr;
        }
    }

    /* renamed from: fic$c */
    static class c extends yrc.a {
        private final iic C;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        c(defpackage.iic r2) {
            /*
                r1 = this;
                nic r2 = (defpackage.nic) r2
                android.view.View r0 = r2.getView()
                r1.<init>(r0)
                r1.C = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fic.c.<init>(iic):void");
        }
    }

    public fic(Picasso picasso, jic jic, e eVar, cic cic, cb1 cb1) {
        this.a = picasso;
        this.b = jic;
        this.c = eVar;
        this.d = cic;
        this.e = cb1;
    }

    @Override // defpackage.yrc
    public /* synthetic */ void a() {
        xrc.b(this);
    }

    public void b() {
        if (this.f != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(125);
                TransitionManager.beginDelayedTransition(this.f, changeBounds);
            }
            RecyclerView.e adapter = this.f.getAdapter();
            if (adapter != null && !this.f.k0() && this.f.getScrollState() == 0) {
                adapter.z();
            }
        }
    }

    @Override // defpackage.yrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
        if ((csc instanceof b) && (b0Var instanceof c)) {
            b bVar = (b) csc;
            a aVar = new a(this);
            Episode e2 = bVar.e();
            ImmutableList<m> v = e2.v();
            jic jic = this.b;
            iic iic = ((c) b0Var).C;
            Episode[] g = bVar.g();
            if (v == null) {
                v = ImmutableList.of();
            }
            jic.a(iic, e2, g, "", tpa.a(v), aVar, bVar.f());
        }
    }

    @Override // defpackage.yrc
    public /* synthetic */ void d(csc csc, RecyclerView.b0 b0Var) {
        xrc.a(this, csc, b0Var);
    }

    @Override // defpackage.yrc
    public yrc.a e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        PasteLinearLayout pasteLinearLayout = new PasteLinearLayout(context, null);
        pasteLinearLayout.setOrientation(1);
        pasteLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        uoc b2 = voc.b(context, pasteLinearLayout, this.a);
        if (viewGroup instanceof RecyclerView) {
            this.f = (RecyclerView) viewGroup;
        }
        pasteLinearLayout.addView(((voc) b2).getView());
        return new c(nic.c(context, pasteLinearLayout, this.a, b2, this.d, this.c, this.e, this));
    }
}
