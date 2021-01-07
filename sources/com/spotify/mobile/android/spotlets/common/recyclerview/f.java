package com.spotify.mobile.android.spotlets.common.recyclerview;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public abstract class f<D> {
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(RecyclerView.b0 b0Var, Object obj, int i) {
        b(b0Var, obj, i);
    }

    /* access modifiers changed from: protected */
    public abstract void b(RecyclerView.b0 b0Var, D d, int i);

    public abstract RecyclerView.b0 c(ViewGroup viewGroup);
}
