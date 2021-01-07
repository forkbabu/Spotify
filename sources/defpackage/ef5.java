package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.hiddencontent.HiddenContentFragment;
import com.spotify.music.features.hiddencontent.f;
import com.spotify.music.features.hiddencontent.model.c;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.q;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.List;

/* renamed from: ef5  reason: default package */
public class ef5 extends RecyclerView.e<RecyclerView.b0> {
    private final b c;
    private final b4<c> f;
    private final f n;
    private final com.spotify.music.libs.viewuri.c o;
    private final Picasso p;
    private final Drawable q;
    private List<com.spotify.playlist.models.b> r;

    /* renamed from: ef5$a */
    class a implements View.OnClickListener {
        final /* synthetic */ com.spotify.playlist.models.b a;
        final /* synthetic */ int b;

        a(com.spotify.playlist.models.b bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((HiddenContentFragment) ef5.this.c).R4(this.a.getUri(), this.b);
        }
    }

    /* renamed from: ef5$b */
    public interface b {
    }

    public ef5(b bVar, b4<c> b4Var, f fVar, Context context, Picasso picasso, com.spotify.music.libs.viewuri.c cVar) {
        this.c = bVar;
        this.f = b4Var;
        this.n = fVar;
        this.p = picasso;
        this.o = cVar;
        this.q = yc0.h(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        com.spotify.playlist.models.b bVar = this.r.get(i);
        View view = b0Var.a;
        int i2 = e90.i;
        u90 u90 = (u90) l70.o(view, u90.class);
        u90.setText(bVar.f());
        String c2 = q.c(bVar.d(), Covers.Size.NORMAL);
        Uri parse = !TextUtils.isEmpty(c2) ? Uri.parse(c2) : Uri.EMPTY;
        ImageView imageView = u90.getImageView();
        z l = this.p.l(parse);
        l.t(this.q);
        l.o(rwd.f(imageView, com.spotify.paste.graphics.drawable.b.a()));
        u90.getView().setOnClickListener(new a(bVar, i));
        Context context = view.getContext();
        Drawable a2 = this.n.a(view.getContext(), bVar.j(), bVar.i());
        b4<c> b4Var = this.f;
        c.a a3 = c.a();
        a3.b(bVar);
        a3.a(i);
        u90.z0(p42.b(context, a2, b4Var, a3.build(), this.o));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return h90.h0(e90.d().d(viewGroup.getContext(), viewGroup));
    }

    public void Y(List<com.spotify.playlist.models.b> list) {
        this.r = list;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        List<com.spotify.playlist.models.b> list = this.r;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return (long) this.r.get(i).getUri().hashCode();
    }
}
