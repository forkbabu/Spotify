package com.spotify.music.nowplaying.drivingmode.view.voicesuggestions;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.b;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.Collections;
import java.util.List;

public class d extends b<a> {
    private List<uvb> c = Collections.emptyList();
    private final e.a<uvb> f;
    private Picasso n;

    public static class a extends e<uvb> {
        private final TextView C;
        private final TextView D = ((TextView) this.a.findViewById(C0707R.id.driving_voice_suggested_item_subtitle));
        private final ImageView E = ((ImageView) this.a.findViewById(C0707R.id.driving_voice_suggested_item_coverart));
        private final ViewGroup F;
        private final Picasso G;
        private final e.a<uvb> H;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.view.ViewGroup r2, com.spotify.mobile.android.spotlets.common.recyclerview.e.a<defpackage.uvb> r3, com.squareup.picasso.Picasso r4) {
            /*
                r1 = this;
                r0 = 2131624199(0x7f0e0107, float:1.887557E38)
                android.view.View r0 = com.spotify.mobile.android.spotlets.common.recyclerview.e.j0(r0, r2)
                r1.<init>(r0)
                r1.H = r3
                r1.G = r4
                r3 = 2131428309(0x7f0b03d5, float:1.8478259E38)
                android.view.View r3 = r0.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r1.C = r3
                android.view.View r3 = r1.a
                r4 = 2131428308(0x7f0b03d4, float:1.8478257E38)
                android.view.View r3 = r3.findViewById(r4)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r1.D = r3
                android.view.View r3 = r1.a
                r4 = 2131428307(0x7f0b03d3, float:1.8478255E38)
                android.view.View r3 = r3.findViewById(r4)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                r1.E = r3
                r1.F = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.nowplaying.drivingmode.view.voicesuggestions.d.a.<init>(android.view.ViewGroup, com.spotify.mobile.android.spotlets.common.recyclerview.e$a, com.squareup.picasso.Picasso):void");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
        public /* bridge */ /* synthetic */ void h0(uvb uvb, int i) {
            u0(uvb);
        }

        public void u0(uvb uvb) {
            this.C.setText(uvb.e());
            this.D.setText(uvb.d());
            Picasso picasso = this.G;
            if (picasso != null) {
                z m = picasso.m(uvb.c());
                m.s(C0707R.drawable.cover_art_placeholder);
                m.m(this.E);
            }
            this.a.setOnClickListener(new a(this, uvb));
        }

        public /* synthetic */ void v0(uvb uvb, View view) {
            int w = w();
            e.a<uvb> aVar = this.H;
            if (aVar != null && w != -1) {
                aVar.c(w, this.F, uvb);
            }
        }
    }

    public d(e.a<uvb> aVar) {
        this.f = aVar;
        U(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        ((a) b0Var).u0(this.c.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return new a(viewGroup, this.f, this.n);
    }

    public void Z(List<uvb> list) {
        this.c = list;
        z();
    }

    public void b0(Picasso picasso) {
        this.n = picasso;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        if (this.c.size() > 3) {
            return 3;
        }
        return this.c.size();
    }
}
