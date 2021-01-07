package com.spotify.music.features.notificationsettings.channeldetails;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.music.features.notificationsettings.common.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class ChannelDetailsAdapter extends RecyclerView.e<h90<x90>> {
    private List<CategoryItem> c = EmptyList.a;
    private final Activity f;
    private final x n;

    public ChannelDetailsAdapter(Activity activity, x xVar) {
        h.e(activity, "activity");
        h.e(xVar, "viewInteractionDelegate");
        this.f = activity;
        this.n = xVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(h90<x90> h90, int i) {
        h90<x90> h902 = h90;
        h.e(h902, "holder");
        Activity activity = this.f;
        x90 j0 = h902.j0();
        h.d(j0, "holder.viewBinder");
        this.c.get(i).a(activity, j0);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public h90<x90> M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        x90 g = e90.d().g(this.f, viewGroup);
        g.z0(new SwitchCompat(this.f, null));
        TextView subtitleView = g.getSubtitleView();
        h.d(subtitleView, "subtitleView");
        subtitleView.setMaxLines(2);
        h90<x90> h0 = h90.h0(g);
        h.d(h0, "GlueViewHolder.forViewBi…          }\n            )");
        return h0;
    }

    public final void Y(List<a> list, Channel channel) {
        h.e(list, "categories");
        h.e(channel, "showingCategoriesForChannel");
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new CategoryItem(t, channel, new ChannelDetailsAdapter$setItems$$inlined$mapIndexed$lambda$1(i, this, channel)));
                i = i2;
            } else {
                d.L();
                throw null;
            }
        }
        this.c = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
