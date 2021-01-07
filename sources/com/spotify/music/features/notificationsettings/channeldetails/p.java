package com.spotify.music.features.notificationsettings.channeldetails;

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
import kotlin.Pair;

public final class p implements s0, g<o, h> {
    private MobiusLoop.g<o, h> a;
    private ss5 b;
    private final ChannelDetailsInjector c;
    private final ChannelDetailsAdapter f;
    private final Pair<List<com.spotify.music.features.notificationsettings.common.a>, Channel> n;

    public static final class a implements h<o> {
        final /* synthetic */ p a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(p pVar) {
            this.a = pVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            o oVar = (o) obj;
            kotlin.jvm.internal.h.e(oVar, "value");
            this.a.f.Y(oVar.a(), (Channel) this.a.n.d());
            this.a.f.z();
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.Pair<? extends java.util.List<com.spotify.music.features.notificationsettings.common.a>, ? extends com.spotify.music.features.notificationsettings.common.Channel> */
    /* JADX WARN: Multi-variable type inference failed */
    public p(ChannelDetailsInjector channelDetailsInjector, ChannelDetailsAdapter channelDetailsAdapter, Pair<? extends List<com.spotify.music.features.notificationsettings.common.a>, ? extends Channel> pair) {
        kotlin.jvm.internal.h.e(channelDetailsInjector, "injector");
        kotlin.jvm.internal.h.e(channelDetailsAdapter, "adapter");
        kotlin.jvm.internal.h.e(pair, "data");
        this.c = channelDetailsInjector;
        this.f = channelDetailsAdapter;
        this.n = pair;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        ss5 ss5 = this.b;
        if (ss5 != null) {
            return ss5.a();
        }
        return null;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(viewGroup, "parent");
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        ss5 b2 = ss5.b(layoutInflater, viewGroup, false);
        RecyclerView recyclerView = b2.b;
        kotlin.jvm.internal.h.d(recyclerView, "this.recyclerView");
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = b2.b;
        kotlin.jvm.internal.h.d(recyclerView2, "this.recyclerView");
        recyclerView2.setAdapter(this.f);
        this.b = b2;
        this.a = this.c.a(new o(this.n.c(), this.n.d()));
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        MobiusLoop.g<o, h> gVar = this.a;
        if (gVar != null) {
            gVar.c(this);
            MobiusLoop.g<o, h> gVar2 = this.a;
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
        MobiusLoop.g<o, h> gVar = this.a;
        if (gVar != null) {
            gVar.stop();
            MobiusLoop.g<o, h> gVar2 = this.a;
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
    public h<o> t(da2<h> da2) {
        kotlin.jvm.internal.h.e(da2, "output");
        return new a(this);
    }
}
