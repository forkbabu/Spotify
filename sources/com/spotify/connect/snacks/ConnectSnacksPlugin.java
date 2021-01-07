package com.spotify.connect.snacks;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.C0707R;
import com.spotify.rxjava2.q;
import com.spotify.ubi.specification.factories.q0;
import io.reactivex.functions.g;
import io.reactivex.s;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class ConnectSnacksPlugin implements ahb {
    private final q a = new q();
    private final boolean b;
    private final s<List<a>> c;
    private final s<List<a>> f;
    private final c n;
    private final l o;
    private final SpSharedPreferences<Object> p;
    private final q0 q;
    private final ere r;
    private final Context s;

    static final class a<T> implements g<List<? extends a>> {
        final /* synthetic */ ConnectSnacksPlugin a;

        a(ConnectSnacksPlugin connectSnacksPlugin) {
            this.a = connectSnacksPlugin;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(List<? extends a> list) {
            List<? extends a> list2 = list;
            l lVar = this.a.o;
            ConnectSnacksPlugin connectSnacksPlugin = this.a;
            h.d(list2, "devices");
            lVar.a(ConnectSnacksPlugin.b(connectSnacksPlugin, list2));
        }
    }

    static final class b<T> implements g<List<? extends a>> {
        final /* synthetic */ ConnectSnacksPlugin a;

        b(ConnectSnacksPlugin connectSnacksPlugin) {
            this.a = connectSnacksPlugin;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(List<? extends a> list) {
            ConnectSnacksPlugin.d(this.a);
        }
    }

    public ConnectSnacksPlugin(boolean z, s<List<a>> sVar, s<List<a>> sVar2, c cVar, l lVar, SpSharedPreferences<Object> spSharedPreferences, q0 q0Var, ere ere, Context context) {
        h.e(sVar, "newDevicesObservable");
        h.e(sVar2, "availableDevicesObservable");
        h.e(cVar, "connectFacade");
        h.e(lVar, "snackbarFacade");
        h.e(spSharedPreferences, "preferences");
        h.e(q0Var, "eventFactory");
        h.e(ere, "eventLogger");
        h.e(context, "context");
        this.b = z;
        this.c = sVar;
        this.f = sVar2;
        this.n = cVar;
        this.o = lVar;
        this.p = spSharedPreferences;
        this.q = q0Var;
        this.r = ere;
        this.s = context;
    }

    public static final SnackbarConfiguration b(ConnectSnacksPlugin connectSnacksPlugin, List list) {
        connectSnacksPlugin.r.a(connectSnacksPlugin.q.b().b());
        if (list.size() > 1) {
            SnackbarConfiguration build = SnackbarConfiguration.builder(connectSnacksPlugin.s.getString(C0707R.string.multiple_devices)).actionText(connectSnacksPlugin.s.getString(C0707R.string.connect_to_device)).onClickListener(new f(connectSnacksPlugin)).build();
            h.d(build, "SnackbarConfiguration.bu…                }.build()");
            return build;
        }
        SnackbarConfiguration build2 = SnackbarConfiguration.builder(connectSnacksPlugin.s.getString(C0707R.string.single_device, ((a) d.j(list)).b())).actionText(connectSnacksPlugin.s.getString(C0707R.string.connect_to_device)).onClickListener(new g(connectSnacksPlugin, ((a) d.j(list)).a())).build();
        h.d(build2, "SnackbarConfiguration.bu…                }.build()");
        return build2;
    }

    public static final void d(ConnectSnacksPlugin connectSnacksPlugin) {
        SpSharedPreferences.a<Object> b2 = connectSnacksPlugin.p.b();
        b2.a(i.a(), false);
        b2.i();
        connectSnacksPlugin.a.c();
    }

    @Override // defpackage.ahb
    public void a() {
        if (this.p.d(i.a(), true)) {
            if (this.b) {
                this.a.a(this.c.subscribe(new a(this)));
                this.n.a();
            }
            this.a.a(this.f.Q(new h(new ConnectSnacksPlugin$onUiVisible$2(this))).subscribe(new b(this)));
        }
    }

    @Override // defpackage.ahb
    public void c() {
    }

    @Override // defpackage.ahb
    public void e() {
        this.a.c();
    }

    @Override // defpackage.ahb
    public void f(ViewGroup viewGroup) {
        h.e(viewGroup, "activityLayout");
    }
}
