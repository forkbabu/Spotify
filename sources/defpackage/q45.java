package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Joiner;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.C0707R;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import com.spotify.music.preview.q;
import com.spotify.music.preview.t;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.o45;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: q45  reason: default package */
public class q45 extends RecyclerView.e<c> {
    private List<com.spotify.music.freetiercommon.models.a> c = new ArrayList();
    private final b f;
    private final Picasso n;
    private final q o;
    private final com.spotify.music.features.freetierallsongsdialog.b<p45> p;
    private boolean q;

    /* access modifiers changed from: private */
    /* renamed from: q45$a */
    public class a extends c {
        public a(ViewGroup viewGroup) {
            super(Rows.a(viewGroup.getContext(), viewGroup).getView());
        }
    }

    /* renamed from: q45$b */
    public interface b {
    }

    /* renamed from: q45$c */
    public static class c extends RecyclerView.b0 {
        public c(View view) {
            super(view);
        }
    }

    public q45(b bVar, Picasso picasso, q qVar, com.spotify.music.features.freetierallsongsdialog.b<p45> bVar2) {
        this.f = bVar;
        this.n = picasso;
        this.o = qVar;
        this.p = bVar2;
        U(true);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(c cVar, int i) {
        a aVar = (a) cVar;
        com.spotify.music.freetiercommon.models.a aVar2 = this.c.get(i);
        y90 y90 = (y90) l70.o(aVar.a, y90.class);
        y90.setTitle(aVar2.getName());
        y90.setSubtitle(Joiner.on(", ").join(aVar2.x1()));
        Boolean k0 = aVar2.k0();
        boolean z = false;
        boolean z2 = k0 == null || k0.booleanValue();
        boolean isExplicit = aVar2.isExplicit();
        if (!z2 || aVar2.m1() || (q45.this.q && isExplicit)) {
            z = true;
        }
        TextLabelUtil.b(y90.getSubtitleView().getContext(), y90.getSubtitleView(), isExplicit);
        Uri parse = !TextUtils.isEmpty(aVar2.getImageUri()) ? Uri.parse(aVar2.getImageUri()) : Uri.EMPTY;
        ImageView imageView = y90.getImageView();
        if (z2) {
            imageView.setContentDescription(imageView.getContext().getString(C0707R.string.preview_play_pause_content_description));
        } else {
            imageView.setContentDescription(imageView.getContext().getString(C0707R.string.generic_content_description_cover_art));
        }
        z l = q45.this.n.l(parse);
        l.t(yc0.o(aVar.a.getContext()));
        l.o(t.c(imageView, q45.this.o, z2 ? aVar2.getPreviewId() : "", com.spotify.music.features.followfeed.c.a(aVar2), z));
        aVar.a.setOnClickListener(new n45(aVar, aVar2, i));
        y90.getImageView().setOnClickListener(new k45(aVar, aVar2, i));
        y90.setAppearsDisabled(z);
        com.spotify.music.features.freetierallsongsdialog.b bVar = q45.this.p;
        boolean N1 = aVar2.N1();
        boolean m1 = aVar2.m1();
        o45.b bVar2 = new o45.b();
        bVar2.a(Collections.emptyMap());
        bVar2.f(aVar2.getUri());
        bVar2.d(aVar2.getName());
        bVar2.e(aVar2.i2());
        bVar2.c(i);
        ((Rows.d) y90).z(bVar.b(N1, m1, bVar2.b(), new m45(aVar, aVar2, i), new l45(aVar, aVar2, i)));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public c M(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }

    public void f0(boolean z) {
        if (this.q != z) {
            this.q = z;
            if (u() > 0) {
                z();
            }
        }
    }

    public void g0(List<com.spotify.music.freetiercommon.models.a> list) {
        this.c = list;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        com.spotify.music.freetiercommon.models.a aVar = this.c.get(i);
        long hashCode = (long) (hashCode() ^ aVar.getUri().hashCode());
        String i2 = aVar.i2();
        return i2 != null ? hashCode ^ ((long) i2.hashCode()) : hashCode;
    }
}
