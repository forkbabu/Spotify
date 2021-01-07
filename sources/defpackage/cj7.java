package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.Locale;

/* renamed from: cj7  reason: default package */
class cj7 extends RecyclerView.e<a> {
    private p81[] c;

    /* renamed from: cj7$a */
    static class a extends RecyclerView.b0 {
        TextView C;
        ImageView D;
        ImageView E;
        TextView F;
        TextView G;

        a(ViewGroup viewGroup) {
            super(viewGroup);
            this.C = (TextView) viewGroup.findViewById(C0707R.id.row_title);
            this.D = (ImageView) viewGroup.findViewById(C0707R.id.image_col_one);
            this.E = (ImageView) viewGroup.findViewById(C0707R.id.image_col_two);
            this.F = (TextView) viewGroup.findViewById(C0707R.id.text_col_one);
            this.G = (TextView) viewGroup.findViewById(C0707R.id.text_col_two);
        }
    }

    cj7() {
    }

    private SpotifyIconDrawable X(Context context, String str) {
        int b = androidx.core.content.a.b(context, R.color.green_light);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.valueOf(str.toUpperCase(Locale.US)), (float) context.getResources().getDimensionPixelSize(C0707R.dimen.premium_benefit_chart_component_icon));
        spotifyIconDrawable.r(b);
        return spotifyIconDrawable;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
        a aVar2 = aVar;
        p81 p81 = this.c[i];
        if (p81.string("title") != null) {
            aVar2.C.setText(p81.string("title"));
        }
        p81[] bundleArray = p81.bundleArray("columns");
        for (p81 p812 : bundleArray) {
            if (p812.string("icon") != null) {
                String string = p812.string("icon");
                if (p812.string("id").equals("column_0")) {
                    aVar2.D.setVisibility(0);
                    ImageView imageView = aVar2.D;
                    imageView.setImageDrawable(X(imageView.getContext(), string));
                    aVar2.F.setVisibility(8);
                } else {
                    aVar2.E.setVisibility(0);
                    ImageView imageView2 = aVar2.E;
                    imageView2.setImageDrawable(X(imageView2.getContext(), string));
                    aVar2.G.setVisibility(8);
                }
            }
            if (p812.string("text") != null) {
                String string2 = p812.string("text");
                if (p812.string("id").equals("column_0")) {
                    aVar2.F.setVisibility(0);
                    aVar2.F.setText(string2);
                    aVar2.D.setVisibility(8);
                } else {
                    aVar2.G.setVisibility(0);
                    aVar2.G.setText(string2);
                    aVar2.E.setVisibility(8);
                }
            }
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.premium_page_benefit_chart_row, viewGroup, false));
    }

    public void Y(p81[] p81Arr) {
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
