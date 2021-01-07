package com.spotify.music.features.notificationsettings.channels;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.notificationsettings.common.Channel;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class ChannelsAdapter extends RecyclerView.e<h90<t90>> {
    private List<a> c = EmptyList.a;
    private final Activity f;
    private final w n;

    public ChannelsAdapter(Activity activity, w wVar) {
        h.e(activity, "activity");
        h.e(wVar, "viewInteractionDelegate");
        this.f = activity;
        this.n = wVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(h90<t90> h90, int i) {
        h90<t90> h902 = h90;
        h.e(h902, "holder");
        Activity activity = this.f;
        t90 j0 = h902.j0();
        h.d(j0, "holder.viewBinder");
        this.c.get(i).a(activity, j0);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public h90<t90> M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        h90<t90> h0 = h90.h0(e90.d().c(this.f, viewGroup));
        h.d(h0, "this");
        ga0.a(h0.j0());
        h.d(h0, "GlueViewHolder\n         …viewBinder)\n            }");
        return h0;
    }

    public final void Y(List<? extends Channel> list) {
        h.e(list, "channels");
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new a(t, new ChannelsAdapter$setItems$$inlined$mapIndexed$lambda$1(i, this)));
                i = i2;
            } else {
                d.L();
                throw null;
            }
        }
        this.c = arrayList;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
