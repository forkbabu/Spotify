package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.a;
import com.spotify.android.glue.gradients.factory.GlueGradients;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.e;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.List;

/* renamed from: vvb  reason: default package */
public class vvb extends a {
    private Picasso c;
    private List<uvb> d;

    @Override // androidx.viewpager.widget.a
    public void b(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public int d() {
        List<uvb> list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.viewpager.widget.a
    public int e(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    public Object h(ViewGroup viewGroup, int i) {
        View G = je.G(viewGroup, C0707R.layout.driving_voice_result_carousel_item, viewGroup, false);
        ImageView imageView = (ImageView) G.findViewById(C0707R.id.driving_voice_result_carousel_item_coverart);
        String c2 = this.d.get(i).c();
        if (l0.z(this.d.get(i).b()).q() == LinkType.COLLECTION_TRACKS) {
            Context context = imageView.getContext();
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.HEART_ACTIVE, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.driving_default_scalable_icon_size));
            TypedValue typedValue = new TypedValue();
            context.getResources().getValue(C0707R.dimen.driving_your_library_heart_icon_scale, typedValue, true);
            imageView.setImageDrawable(new LayerDrawable(new Drawable[]{GlueGradients.a(context, GlueGradients.Style.AQUATIC, false), new e(spotifyIconDrawable, typedValue.getFloat(), 0)}));
        } else if (this.c != null && !c2.isEmpty()) {
            z m = this.c.m(c2);
            m.s(C0707R.drawable.cover_art_placeholder);
            m.m(imageView);
        }
        viewGroup.addView(G);
        return G;
    }

    @Override // androidx.viewpager.widget.a
    public boolean i(View view, Object obj) {
        return view == obj;
    }

    public uvb r(int i) {
        return this.d.get(i);
    }

    public void s(Picasso picasso) {
        this.c = picasso;
    }

    public void t(List<uvb> list) {
        this.d = list;
        j();
    }
}
