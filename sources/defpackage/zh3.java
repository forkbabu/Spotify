package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.playlist.ui.row.Rows;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.p;
import com.spotify.playlist.models.q;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zh3  reason: default package */
public class zh3 extends RecyclerView.e<e> {
    static final int r = zh3.class.hashCode();
    static final int s = (zh3.class.hashCode() + 1);
    private List<j> c = new ArrayList();
    private final c f;
    private final Picasso n;
    private final Drawable o;
    private final Drawable p;
    private final com.spotify.music.playlist.synchronizer.d q;

    /* renamed from: zh3$a */
    public interface a {
        zh3 a(c cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: zh3$b */
    public class b extends e {
        public b(ViewGroup viewGroup) {
            super(Rows.e(viewGroup.getContext(), viewGroup).getView());
        }

        @Override // defpackage.zh3.e
        public void h0(j jVar, int i) {
            u90 u90 = (u90) l70.o(this.a, u90.class);
            u90.setText(jVar.j());
            u90.getImageView().setImageDrawable(zh3.this.o);
            this.a.setOnClickListener(new xh3(this, jVar, i));
        }
    }

    /* renamed from: zh3$c */
    public interface c {
        void a(j jVar, int i);
    }

    /* access modifiers changed from: private */
    /* renamed from: zh3$d */
    public class d extends e {
        private String C;

        public d(ViewGroup viewGroup) {
            super(Rows.f(viewGroup.getContext(), viewGroup).getView());
        }

        @Override // defpackage.zh3.e
        public void h0(j jVar, int i) {
            this.C = jVar.getUri();
            y90 y90 = (y90) l70.o(this.a, y90.class);
            y90.setTitle(jVar.j());
            p m = jVar.m();
            if (m != null) {
                y90.setSubtitle(this.a.getContext().getString(C0707R.string.playlist_by_owner, m.a()));
            }
            ImageView imageView = y90.getImageView();
            String c = q.c(jVar.c(), Covers.Size.SMALL);
            if (!MoreObjects.isNullOrEmpty(c)) {
                z l = zh3.this.n.l(!TextUtils.isEmpty(c) ? Uri.parse(c) : Uri.EMPTY);
                Drawable drawable = imageView.getDrawable();
                if (drawable == null) {
                    drawable = zh3.this.p;
                }
                l.t(drawable);
                l.g(drawable);
                l.m(imageView);
            } else {
                imageView.setImageDrawable(zh3.this.p);
            }
            this.a.setOnClickListener(new yh3(this, jVar, i));
        }

        public String j0() {
            return this.C;
        }
    }

    /* renamed from: zh3$e */
    public static abstract class e extends RecyclerView.b0 {
        public e(View view) {
            super(view);
        }

        /* access modifiers changed from: package-private */
        public abstract void h0(j jVar, int i);
    }

    public zh3(Context context, Picasso picasso, com.spotify.music.playlist.synchronizer.d dVar, c cVar) {
        this.f = cVar;
        this.q = dVar;
        this.n = picasso;
        this.o = yc0.l(context, SpotifyIconV2.PLAYLIST_FOLDER);
        this.p = yc0.n(context);
        U(true);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(e eVar, int i) {
        j jVar = this.c.get(i);
        eVar.h0(jVar, i);
        if (!jVar.s()) {
            this.q.a(jVar.getUri());
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public e M(ViewGroup viewGroup, int i) {
        if (i == r) {
            return new d(viewGroup);
        }
        if (i == s) {
            return new b(viewGroup);
        }
        throw new IllegalArgumentException("Unsupported view type");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void R(e eVar) {
        e eVar2 = eVar;
        if (eVar2 instanceof d) {
            d dVar = (d) eVar2;
            ((y90) l70.o(dVar.a, y90.class)).getImageView().setImageDrawable(null);
            this.q.b(dVar.j0());
        }
    }

    public void c0(List<j> list) {
        this.c = list;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        String n2 = this.c.get(i).n();
        if (n2 != null) {
            return (long) n2.hashCode();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return this.c.get(i).s() ? s : r;
    }
}
