package com.spotify.android.dac.engine.view.binders.containers.list;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.Any;
import kotlin.jvm.internal.h;

public final class a extends RecyclerView.b0 {
    private final t80 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view, t80 t80) {
        super(view);
        h.e(view, "view");
        h.e(t80, "handler");
        this.C = t80;
    }

    public final void h0(Any any) {
        h.e(any, "data");
        t80 t80 = this.C;
        t80.a();
        t80.d(any);
        t80.c();
    }

    public final void j0() {
        this.C.a();
    }
}
