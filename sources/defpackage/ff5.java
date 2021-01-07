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
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.features.fullscreen.story.r;
import com.spotify.music.features.hiddencontent.HiddenContentFragment;
import com.spotify.music.features.hiddencontent.f;
import com.spotify.music.features.hiddencontent.model.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.preview.q;
import com.spotify.music.preview.t;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.PlayabilityRestriction;
import com.spotify.playlist.models.o;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.List;

/* renamed from: ff5  reason: default package */
public class ff5 extends RecyclerView.e<RecyclerView.b0> {
    private final a c;
    private final b4<d> f;
    private final f n;
    private final c o;
    private final Drawable p;
    private final Picasso q;
    private final q r;
    private List<o> s;

    /* renamed from: ff5$a */
    public interface a {
    }

    public ff5(a aVar, Context context, Picasso picasso, b4<d> b4Var, f fVar, c cVar, q qVar) {
        this.c = aVar;
        this.q = picasso;
        this.r = qVar;
        this.f = b4Var;
        this.n = fVar;
        this.o = cVar;
        this.p = yc0.o(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        o oVar = this.s.get(i);
        boolean isAvailableInMetadataCatalogue = oVar.isAvailableInMetadataCatalogue();
        View view = b0Var.a;
        int i2 = e90.i;
        y90 y90 = (y90) l70.o(view, y90.class);
        y90.setTitle(oVar.getName());
        y90.setSubtitle(x.d(oVar));
        ImageView imageView = y90.getImageView();
        String c2 = com.spotify.playlist.models.q.c(oVar.getAlbum().e(), Covers.Size.NORMAL);
        z l = this.q.l(!TextUtils.isEmpty(c2) ? Uri.parse(c2) : Uri.EMPTY);
        l.t(this.p);
        boolean z = false;
        l.o(t.c(imageView, this.r, isAvailableInMetadataCatalogue ? oVar.getPreviewId() : "", r.a(oVar), false));
        if (isAvailableInMetadataCatalogue) {
            imageView.setContentDescription(imageView.getContext().getString(C0707R.string.preview_play_pause_content_description));
        } else {
            imageView.setContentDescription(imageView.getContext().getString(C0707R.string.generic_content_description_cover_art));
        }
        imageView.setOnClickListener(new cf5(this, oVar, i));
        PlayabilityRestriction playabilityRestriction = oVar.getPlayabilityRestriction();
        if (!(playabilityRestriction == PlayabilityRestriction.NO_RESTRICTION || playabilityRestriction == PlayabilityRestriction.UNKNOWN)) {
            z = true;
        }
        y90.setAppearsDisabled(z);
        y90.getView().setOnClickListener(new df5(this, oVar, i));
        Context context = view.getContext();
        f fVar = this.n;
        Context context2 = view.getContext();
        fVar.getClass();
        Drawable a2 = fVar.a(context2, oVar.isInCollection(), oVar.isBanned());
        b4<d> b4Var = this.f;
        d.a a3 = d.a();
        a3.b(oVar);
        a3.a(i);
        y90.z0(p42.b(context, a2, b4Var, a3.build(), this.o));
        TextLabelUtil.a(view.getContext(), y90.getSubtitleView(), oVar.getIs19plus());
        TextLabelUtil.b(view.getContext(), y90.getSubtitleView(), oVar.isExplicit());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return h90.h0(e90.d().i(viewGroup.getContext(), viewGroup));
    }

    public /* synthetic */ void X(o oVar, int i, View view) {
        ((HiddenContentFragment) this.c).U4(oVar, i);
    }

    public /* synthetic */ void Y(o oVar, int i, View view) {
        ((HiddenContentFragment) this.c).T4(oVar, i);
    }

    public void Z(List<o> list) {
        this.s = list;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        List<o> list = this.s;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return (long) this.s.get(i).getUri().hashCode();
    }
}
