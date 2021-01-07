package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.Locale;

/* renamed from: fj7  reason: default package */
public class fj7 extends RecyclerView.e<a> {
    private p81[] c;

    /* renamed from: fj7$a */
    static class a extends RecyclerView.b0 {
        TextView C;
        ImageView D;

        a(ViewGroup viewGroup) {
            super(viewGroup);
            this.C = (TextView) viewGroup.findViewById(C0707R.id.row_title);
            this.D = (ImageView) viewGroup.findViewById(C0707R.id.image);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
        a aVar2 = aVar;
        if (this.c[i].string("title") != null) {
            aVar2.C.setText(this.c[i].string("title"));
        }
        String string = this.c[i].string("icon");
        if (!MoreObjects.isNullOrEmpty(string)) {
            Context context = aVar2.D.getContext();
            int b = androidx.core.content.a.b(context, R.color.green_light);
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.valueOf(string.toUpperCase(Locale.US)), (float) context.getResources().getDimensionPixelSize(C0707R.dimen.premium_benefit_list_component_icon));
            spotifyIconDrawable.r(b);
            aVar2.D.setImageDrawable(spotifyIconDrawable);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.premium_page_benefit_list_row, viewGroup, false));
    }

    public void X(p81[] p81Arr) {
        this.c = p81Arr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        p81[] p81Arr = this.c;
        if (p81Arr != null) {
            return p81Arr.length;
        }
        return 0;
    }
}
