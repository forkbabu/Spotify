package com.spotify.music.features.notificationsettings.channels;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.pageloader.s0;
import java.util.List;

public final class n implements s0, g<m, f> {
    private MobiusLoop.g<m, f> a;
    private ts5 b;
    private final ChannelsInjector c;
    private final ChannelsAdapter f;
    private final List<Channel> n;

    public static final class a implements h<m> {
        final /* synthetic */ n a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(n nVar) {
            this.a = nVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            m mVar = (m) obj;
            kotlin.jvm.internal.h.e(mVar, "value");
            this.a.f.Y(mVar.a());
            this.a.f.z();
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.spotify.music.features.notificationsettings.common.Channel> */
    /* JADX WARN: Multi-variable type inference failed */
    public n(ChannelsInjector channelsInjector, ChannelsAdapter channelsAdapter, List<? extends Channel> list) {
        kotlin.jvm.internal.h.e(channelsInjector, "injector");
        kotlin.jvm.internal.h.e(channelsAdapter, "adapter");
        kotlin.jvm.internal.h.e(list, "channels");
        this.c = channelsInjector;
        this.f = channelsAdapter;
        this.n = list;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        ts5 ts5 = this.b;
        if (ts5 != null) {
            return ts5.a();
        }
        return null;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(viewGroup, "parent");
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        ts5 b2 = ts5.b(layoutInflater, viewGroup, false);
        RecyclerView recyclerView = b2.b;
        kotlin.jvm.internal.h.d(recyclerView, "this.recyclerView");
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = b2.b;
        kotlin.jvm.internal.h.d(recyclerView2, "this.recyclerView");
        recyclerView2.setAdapter(this.f);
        this.b = b2;
        this.a = this.c.a(new m(this.n));
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        MobiusLoop.g<m, f> gVar = this.a;
        if (gVar != null) {
            gVar.c(this);
            MobiusLoop.g<m, f> gVar2 = this.a;
            if (gVar2 != null) {
                gVar2.start();
            } else {
                kotlin.jvm.internal.h.k("controller");
                throw null;
            }
        } else {
            kotlin.jvm.internal.h.k("controller");
            throw null;
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        MobiusLoop.g<m, f> gVar = this.a;
        if (gVar != null) {
            gVar.stop();
            MobiusLoop.g<m, f> gVar2 = this.a;
            if (gVar2 != null) {
                gVar2.d();
            } else {
                kotlin.jvm.internal.h.k("controller");
                throw null;
            }
        } else {
            kotlin.jvm.internal.h.k("controller");
            throw null;
        }
    }

    @Override // com.spotify.mobius.g
    public h<m> t(da2<f> da2) {
        kotlin.jvm.internal.h.e(da2, "output");
        return new a(this);
    }
}
