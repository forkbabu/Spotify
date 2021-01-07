package com.spotify.music.marquee.optout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

public class c extends RecyclerView.e<a> {
    private final LayoutInflater c;
    private final f f;

    static class a extends RecyclerView.b0 {
        private final View C;
        private final TextView D;
        private final ImageView E;
        private final f F;

        a(View view, f fVar) {
            super(view);
            this.C = view;
            this.D = (TextView) view.findViewById(C0707R.id.optout_artist_text);
            this.E = (ImageView) view.findViewById(C0707R.id.optout_artist_ban);
            this.F = fVar;
        }

        /* access modifiers changed from: package-private */
        public void h0(int i) {
            this.D.setText(this.F.b(i));
            this.E.setImageDrawable(this.F.a());
            this.C.setOnClickListener(new a(this, i));
        }

        public /* synthetic */ void j0(int i, View view) {
            this.F.c(i);
        }
    }

    public c(LayoutInflater layoutInflater, f fVar) {
        this.c = layoutInflater;
        this.f = fVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
        aVar.h0(i);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        return new a((RelativeLayout) this.c.inflate(C0707R.layout.optout_menu_item, viewGroup, false), this.f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return 2;
    }
}
