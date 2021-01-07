package com.spotify.voice.debug;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import dagger.android.support.DaggerFragment;
import java.util.ArrayList;
import java.util.List;

public class VoiceDebugFragment extends DaggerFragment implements View.OnClickListener {
    private b h0;
    private yte i0;

    private static class b extends RecyclerView.e<c> {
        private final List<d> c = new ArrayList(16);
        private final int f;

        b(int i, a aVar) {
            this.f = i;
        }

        static void X(b bVar) {
            bVar.c.clear();
            bVar.z();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.e
        public void K(c cVar, int i) {
            int i2 = c.D;
            cVar.getClass();
            this.c.get(i).getClass();
            throw null;
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.e
        public c M(ViewGroup viewGroup, int i) {
            View G = je.G(viewGroup, C0707R.layout.glue_value_row, viewGroup, false);
            int i2 = this.f;
            G.setPadding(i2, i2, i2, i2);
            return new c(je.G(viewGroup, C0707R.layout.glue_value_row, viewGroup, false), null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public int u() {
            return this.c.size();
        }
    }

    private static class c extends RecyclerView.b0 {
        public static final /* synthetic */ int D = 0;
        private final TextView C;

        c(View view, a aVar) {
            super(view);
            TextView textView = (TextView) view.findViewById(16908308);
            this.C = textView;
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setTextIsSelectable(true);
        }
    }

    /* access modifiers changed from: private */
    public static class d {
        public String toString() {
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b.X(this.h0);
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.h0 = new b(R2().getDimensionPixelSize(C0707R.dimen.std_16dp), null);
        yte b2 = yte.b(layoutInflater, viewGroup, false);
        this.i0 = b2;
        b2.b.setOnClickListener(this);
        this.i0.c.setAdapter(this.h0);
        return this.i0.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        this.i0 = null;
    }
}
