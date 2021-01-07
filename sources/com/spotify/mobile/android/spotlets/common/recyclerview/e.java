package com.spotify.mobile.android.spotlets.common.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public abstract class e<D> extends RecyclerView.b0 {

    public interface a<D> {
        void c(int i, View view, D d);
    }

    public e(View view) {
        super(view);
    }

    public static View j0(int i, ViewGroup viewGroup) {
        return je.G(viewGroup, i, viewGroup, false);
    }

    public abstract void h0(D d, int i);

    public void l0() {
    }

    public void m0() {
    }

    public void s0() {
    }
}
