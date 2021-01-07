package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.C0707R;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import com.spotify.music.navigation.t;
import com.spotify.ubi.specification.factories.m4;
import defpackage.yrc;

/* renamed from: bgc  reason: default package */
public final class bgc implements yrc {
    private static final String d = t52.a(LinkType.COLLECTION_YOUR_EPISODES).b().get(0);
    private final t a;
    private final ere b;
    private final m4 c;

    /* renamed from: bgc$a */
    public static final class a extends csc {
        private final int b;

        public a(int i) {
            this.b = i;
        }
    }

    /* renamed from: bgc$b */
    public final class b extends yrc.a {
        private final Rows.f C;

        public b(Rows.f fVar) {
            super(fVar.getView());
            this.C = fVar;
        }

        /* access modifiers changed from: package-private */
        public void h0(int i) {
            Resources resources = this.C.getView().getResources();
            this.C.setTitle(resources.getString(C0707R.string.your_episodes_title));
            this.C.getView().setContentDescription(resources.getString(C0707R.string.your_episodes_content_description));
            this.C.setSubtitle(resources.getQuantityString(C0707R.plurals.your_episodes_subtitle, i, Integer.valueOf(i)));
            this.C.getImageView().setImageDrawable(oi0.g(this.C.getView().getContext()));
            this.C.getView().setOnClickListener(new ofc(this));
        }
    }

    public bgc(t tVar, ere ere, com.spotify.instrumentation.a aVar) {
        this.a = tVar;
        this.b = ere;
        this.c = new m4(aVar.path());
    }

    @Override // defpackage.yrc
    public /* synthetic */ void a() {
        xrc.b(this);
    }

    @Override // defpackage.yrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
        ((b) b0Var).h0(((a) csc).b);
    }

    @Override // defpackage.yrc
    public /* synthetic */ void d(csc csc, RecyclerView.b0 b0Var) {
        xrc.a(this, csc, b0Var);
    }

    @Override // defpackage.yrc
    public yrc.a e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b(Rows.d(viewGroup.getContext(), viewGroup, 64, 8));
    }
}
