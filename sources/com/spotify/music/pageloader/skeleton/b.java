package com.spotify.music.pageloader.skeleton;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.spotify.music.pageloader.skeleton.SkeletonLayout;
import java.util.List;

/* access modifiers changed from: package-private */
public class b extends RecyclerView.e<a> {
    private List<SkeletonLayout.b> c = ImmutableList.of();

    static class a extends RecyclerView.b0 {
        a(View view) {
            super(view);
        }
    }

    b() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        return new a(this.c.get(i).d(context, LayoutInflater.from(context), viewGroup));
    }

    /* access modifiers changed from: package-private */
    public void X(List<SkeletonLayout.b> list) {
        this.c = list;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return i;
    }
}
