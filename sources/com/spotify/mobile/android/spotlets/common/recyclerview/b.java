package com.spotify.mobile.android.spotlets.common.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;

public abstract class b<VH extends e<?>> extends RecyclerView.e<VH> {
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void R(RecyclerView.b0 b0Var) {
        ((e) b0Var).s0();
    }

    /* renamed from: X */
    public void P(VH vh) {
        vh.l0();
    }

    /* renamed from: Y */
    public void Q(VH vh) {
        vh.m0();
    }
}
