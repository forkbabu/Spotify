package com.spotify.music.features.pushnotifications;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import androidx.core.app.q;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Collections2;
import com.spotify.mobile.android.service.plugininterfaces.c;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.C0707R;
import com.spotify.music.notification.NotificationCategoryEnum;
import com.spotify.remoteconfig.ak;
import io.reactivex.d0;
import io.reactivex.disposables.a;
import io.reactivex.e;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.s;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class r0 implements d, c {
    private final t0 a;
    private final o0 b;
    private final q c;
    private final a f = new a();
    private final y n;
    private final y o;
    private final ak p;
    private final Context q;
    private final bw7 r;
    private final s<Boolean> s;
    private final io.reactivex.subjects.a<Boolean> t = io.reactivex.subjects.a.i1(Boolean.FALSE);

    public r0(Context context, t0 t0Var, o0 o0Var, q qVar, y yVar, y yVar2, ak akVar, bw7 bw7, s<Boolean> sVar) {
        this.q = context;
        this.a = t0Var;
        this.b = o0Var;
        this.c = qVar;
        this.p = akVar;
        this.n = yVar;
        this.o = yVar2;
        this.r = bw7;
        this.s = sVar;
    }

    public static void a(r0 r0Var, List list) {
        r0Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n0 n0Var = (n0) it.next();
            NotificationCategoryEnum a2 = n0Var.a();
            NotificationChannel notificationChannel = new NotificationChannel(a2.getOSId(), n0Var.c(), n0Var.d() ? 3 : 0);
            notificationChannel.setDescription(n0Var.b());
            r0Var.c.c(notificationChannel);
            arrayList.add(a2.getId());
            if (r0Var.p.a()) {
                String string = r0Var.q.getString(C0707R.string.default_notification_channel_id);
                if (r0Var.c.g(string) != null) {
                    r0Var.c.d(string);
                }
                String oSId = NotificationCategoryEnum.DEFAULT.getOSId();
                if (r0Var.c.g(oSId) != null) {
                    r0Var.c.d(oSId);
                }
            }
        }
        r0Var.t.onNext(Boolean.TRUE);
        r0Var.r.c(arrayList, "LOGGED_IN");
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.c
    public void b() {
        if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList = new ArrayList();
            for (NotificationCategoryEnum notificationCategoryEnum : this.a.d()) {
                this.c.d(notificationCategoryEnum.getOSId());
                arrayList.add(notificationCategoryEnum.getId());
            }
            this.r.a(arrayList, "LOGGED_OUT");
            this.t.onNext(Boolean.FALSE);
            this.f.f();
        }
    }

    public /* synthetic */ e c(String str) {
        return this.b.a(NotificationCategoryEnum.fromCacheId(str), true, true);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f.e(this.s.o0(this.n).subscribe(new o(this)), this.a.c().H(this.o).x(p.a).a0(new u(this)).i(d0.a, i.a).B(this.n).subscribe(new w(this), y.a));
        }
    }

    public /* synthetic */ e e(String str) {
        return this.b.a(NotificationCategoryEnum.fromCacheId(str), false, true).d(this.a.a(NotificationCategoryEnum.fromCacheId(str), false));
    }

    public /* synthetic */ Iterable f(Boolean bool) {
        return this.a.d();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f.f();
        }
    }

    public /* synthetic */ void h(ArrayListMultimap arrayListMultimap, p0 p0Var) {
        NotificationChannel g = this.c.g(NotificationCategoryEnum.fromCacheId(p0Var.getChannelId()).getOSId());
        boolean z = (g == null || g.getImportance() == 0) ? false : true;
        boolean isSubscribed = p0Var.isSubscribed();
        if (z && !isSubscribed) {
            arrayListMultimap.put("OS_CHANNEL_ENABLED", p0Var.getChannelId());
        } else if (z || !isSubscribed) {
            arrayListMultimap.put("OS_CHANNEL_UNMODIFIED", p0Var.getChannelId());
        } else {
            arrayListMultimap.put("OS_CHANNEL_DISABLED", p0Var.getChannelId());
        }
    }

    public /* synthetic */ e i(ArrayListMultimap arrayListMultimap) {
        io.reactivex.a aVar;
        List<String> list = arrayListMultimap.mo44get("OS_CHANNEL_ENABLED");
        List<String> list2 = arrayListMultimap.mo44get("OS_CHANNEL_DISABLED");
        io.reactivex.a aVar2 = b.a;
        if (list == null || Collections2.isEmpty(list)) {
            aVar = aVar2;
        } else {
            this.r.b(list, "MODIFIED_OS_SETTING");
            aVar = s.d0(list).Y(new r(this));
        }
        if (list2 != null && !Collections2.isEmpty(list2)) {
            this.r.d(list2, "MODIFIED_OS_SETTING");
            aVar2 = s.d0(list2).Y(new z(this));
        }
        return aVar.d(aVar2);
    }

    public void j(Boolean bool) {
        if (bool.booleanValue() && Build.VERSION.SDK_INT >= 26 && this.p.a()) {
            a aVar = this.f;
            s<U> I0 = this.t.R(Boolean.FALSE).P().D0(t.a).Z(new q(this)).I0(this.o);
            o0 o0Var = this.b;
            o0Var.getClass();
            aVar.b(I0.W(new f0(o0Var), false, Integer.MAX_VALUE).i(g0.a, new v(this)).t(new x(this)).A(this.n).q(s.a).B().subscribe());
        }
    }

    public /* synthetic */ d0 k(n0 n0Var) {
        return this.b.a(n0Var.a(), n0Var.d(), false).P(n0Var);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "NotificationChannels";
    }
}
