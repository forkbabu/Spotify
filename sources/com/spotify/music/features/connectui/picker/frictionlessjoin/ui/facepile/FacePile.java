package com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;

public class FacePile extends RecyclerView {

    static class a extends RecyclerView.l {
        private final int a;

        a(Context context) {
            this.a = nud.g(18.0f, context.getResources());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
            if (recyclerView.X(view) != 0) {
                rect.set(-this.a, 0, 0, 0);
            }
        }
    }

    public FacePile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context);
        flexboxLayoutManager.m2(0);
        flexboxLayoutManager.n2(1);
        flexboxLayoutManager.o2(2);
        setLayoutManager(flexboxLayoutManager);
        k(new a(context), -1);
    }
}
