package com.spotify.music.marquee.feedback;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import java.util.List;

public class f extends RecyclerView.e<b> {
    private final List<h> c;
    private final LayoutInflater f;
    private final a n;

    public interface a {
    }

    static class b extends RecyclerView.b0 {
        private final TextView C;
        private final a D;

        b(View view, a aVar) {
            super(view);
            this.C = (TextView) view;
            this.D = aVar;
        }

        /* access modifiers changed from: package-private */
        public void h0(h hVar) {
            this.C.setText(hVar.b());
            this.C.setOnClickListener(new b(this, hVar));
        }

        public /* synthetic */ void j0(h hVar, View view) {
            ((d) this.D).a(hVar);
        }
    }

    public f(List<h> list, LayoutInflater layoutInflater, a aVar) {
        Logger.b("[Feedback] adapter interaction handler reference is null? %s", false);
        this.c = list;
        this.f = layoutInflater;
        this.n = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(b bVar, int i) {
        bVar.h0(this.c.get(i));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public b M(ViewGroup viewGroup, int i) {
        TextView textView;
        if (i == 1) {
            textView = (TextView) this.f.inflate(C0707R.layout.left_aligned_menu_item, viewGroup, false);
        } else if (i == 0) {
            textView = (TextView) this.f.inflate(C0707R.layout.left_aligned_menu_item_bold, viewGroup, false);
        } else {
            throw new IllegalArgumentException("Unknown view type");
        }
        return new b(textView, this.n);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return !"opt_out_confirm".equals(this.c.get(i).a()) ? 1 : 0;
    }
}
