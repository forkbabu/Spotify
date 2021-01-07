package com.spotify.music.pageloader.skeleton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class SkeletonLayout extends RecyclerView {
    private final b O0 = new b();

    /* access modifiers changed from: package-private */
    public class a extends LinearLayoutManager {
        a(SkeletonLayout skeletonLayout, Context context, int i, boolean z) {
            super(i, z);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public boolean C() {
            return false;
        }
    }

    public interface b {
        View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup);
    }

    public SkeletonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        T0();
    }

    private void T0() {
        setLayoutManager(new a(this, getContext(), 1, false));
        super.setAdapter(this.O0);
        if (isInEditMode()) {
            SkeletonComponents skeletonComponents = SkeletonComponents.ROW_IMAGE;
            setComponents(SkeletonComponents.TOOLBAR_SPACE, SkeletonComponents.HEADER_ARTWORK, SkeletonComponents.PILL_BUTTON_LARGE, SkeletonComponents.SECTION_HEADER, skeletonComponents, skeletonComponents, skeletonComponents, skeletonComponents, skeletonComponents, skeletonComponents, skeletonComponents, skeletonComponents, skeletonComponents);
        }
    }

    public void setComponents(List<b> list) {
        this.O0.X(list);
    }

    public void setComponents(b... bVarArr) {
        setComponents(Arrays.asList(bVarArr));
    }

    public SkeletonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0();
    }

    public SkeletonLayout(Context context) {
        super(context, null);
        T0();
    }
}
