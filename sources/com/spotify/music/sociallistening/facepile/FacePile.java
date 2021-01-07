package com.spotify.music.sociallistening.facepile;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.h;

public final class FacePile extends RecyclerView {

    public static final class a extends RecyclerView.l {
        private final int a;

        public a(Context context) {
            h.e(context, "context");
            this.a = nud.g(13.0f, context.getResources());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
            h.e(rect, "outRect");
            h.e(view, "view");
            h.e(recyclerView, "parent");
            h.e(yVar, "state");
            if (recyclerView.X(view) != 0) {
                rect.set(-this.a, 0, 0, 0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacePile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        setLayoutManager(new LinearLayoutManager(0, false));
        k(new a(context), -1);
    }
}
