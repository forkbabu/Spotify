package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.Collections;
import java.util.List;

/* renamed from: n28  reason: default package */
public class n28 extends RecyclerView.e<h90<p90>> {
    private final Context c;
    private final Picasso f;
    private final Drawable n;
    private final int o;
    private final t p;
    private List<RadioStationModel> q = Collections.emptyList();
    private String r = "";
    private final b4<RadioStationModel> s;
    private final View.OnClickListener t = new a();
    private final View.OnLongClickListener u = new b();

    /* renamed from: n28$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RadioStationModel radioStationModel = (RadioStationModel) view.getTag();
            String str = radioStationModel.title;
            if (str == null) {
                str = "";
            }
            n.a a2 = n.a(radioStationModel.resolvedStationURI());
            a2.h(str);
            n28.this.p.e(a2.a());
        }
    }

    /* renamed from: n28$b */
    class b implements View.OnLongClickListener {
        b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            RadioStationModel radioStationModel = (RadioStationModel) view.getTag();
            ContextMenuFragment.b5(n28.this.c, n28.this.s, radioStationModel, c.a(radioStationModel.uri));
            return true;
        }
    }

    public n28(Context context, List<RadioStationModel> list, b4<RadioStationModel> b4Var, t tVar, Picasso picasso) {
        this.c = context;
        this.n = yc0.i(context, SpotifyIcon.RADIO_16);
        this.o = nud.g(54.0f, context.getResources());
        b4Var.getClass();
        this.s = b4Var;
        this.p = tVar;
        picasso.getClass();
        this.f = picasso;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(h90<p90> h90, int i) {
        y90 y90 = (y90) h90.j0();
        RadioStationModel radioStationModel = this.q.get(i);
        l0 z = l0.z(agd.d(radioStationModel.uri));
        boolean z2 = z.q() == LinkType.ARTIST;
        ImageView imageView = y90.getImageView();
        z l = this.f.l(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY);
        l.w(radioStationModel);
        l.d(Bitmap.Config.ARGB_4444);
        l.t(this.n);
        l.g(this.n);
        int i2 = this.o;
        l.u(i2, i2);
        l.r();
        l.b();
        l.x(new y42(this.c, z2));
        l.m(imageView);
        y90.getView().setTag(radioStationModel);
        y90.setTitle(radioStationModel.title);
        y90.setSubtitle(agd.e(this.c, z));
        y90.getSubtitleView().setVisibility(0);
        y90.getView().setOnClickListener(this.t);
        y90.z0(p42.c(this.c, this.s, radioStationModel, c.a(radioStationModel.uri)));
        y90.W1().setVisibility(0);
        y90.getView().setOnLongClickListener(this.u);
        if (this.r.equals(radioStationModel.uri)) {
            y90.setActive(true);
        } else {
            y90.setActive(false);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public h90<p90> M(ViewGroup viewGroup, int i) {
        return h90.h0(e90.d().i(this.c, viewGroup));
    }

    public final void b0(List<RadioStationModel> list) {
        this.q = list;
        z();
    }

    public void c0(String str) {
        String c2 = agd.c(str);
        if (!(c2 == null || c2.equals(this.r))) {
            String str2 = this.r;
            this.r = c2;
            for (int i = 0; i < this.q.size(); i++) {
                if (str2.equals(this.q.get(i).uri) || c2.equals(this.q.get(i).uri)) {
                    A(i + 1);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.q.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return 1;
    }
}
