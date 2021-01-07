package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.podcastentityrow.h;
import com.spotify.playlist.models.Episode;
import defpackage.yrc;

/* renamed from: rfc  reason: default package */
public class rfc implements yrc {
    private final h a;

    /* renamed from: rfc$a */
    public static class a extends dsc {
        private Episode b;

        @Override // defpackage.dsc
        public Episode e() {
            return this.b;
        }

        public void f(Episode episode) {
            this.b = episode;
        }
    }

    /* renamed from: rfc$b */
    public static class b extends yrc.a {
        private final ia0 C;

        public b(ia0 ia0) {
            super(ia0.getView());
            this.C = ia0;
        }

        public ia0 h0() {
            return this.C;
        }
    }

    public rfc(h hVar) {
        this.a = hVar;
    }

    @Override // defpackage.yrc
    public /* synthetic */ void a() {
        xrc.b(this);
    }

    @Override // defpackage.yrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
        ((b) b0Var).h0().setTitle(this.a.a(((a) csc).e().getHeader()));
    }

    @Override // defpackage.yrc
    public /* synthetic */ void d(csc csc, RecyclerView.b0 b0Var) {
        xrc.a(this, csc, b0Var);
    }

    @Override // defpackage.yrc
    public yrc.a e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        ia0 b2 = e90.e().g().b(context, viewGroup);
        ((ViewGroup.MarginLayoutParams) b2.getView().getLayoutParams()).topMargin = context.getResources().getDimensionPixelSize(C0707R.dimen.quickactions_episode_entity_row_margin);
        return new b(b2);
    }
}
