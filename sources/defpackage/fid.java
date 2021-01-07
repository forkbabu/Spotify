package defpackage;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.LogLevel;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.spotify.mobile.android.util.d0;
import com.spotify.mobile.android.util.ui.b;
import com.spotify.mobile.android.util.v;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import java.util.Map;
import java.util.Set;

@Deprecated
/* renamed from: fid  reason: default package */
public class fid extends b implements xhd {
    public static final String q = d0.c("c68a50624239086c117357770c69436f163200741266466d0471", "397468627039786c6b7339776969376f753264746566306d7471");
    private int a;
    private AdjustConfig b;
    private final aid c;
    private final hid f;
    private final Set<tw0> n;
    private final v o;
    private final jz1 p;

    public fid(hid hid, Set<tw0> set, aid aid, v vVar, jz1 jz1) {
        this.f = hid;
        this.n = set;
        this.c = aid;
        this.o = vVar;
        this.p = jz1;
    }

    private void s(ErrorTypeIdentifier errorTypeIdentifier, ScreenIdentifier screenIdentifier, InputFieldIdentifier inputFieldIdentifier, String str) {
        iid iid = new iid(iid.k);
        iid.a.put("screen", screenIdentifier.d());
        iid.a.put("error_type", errorTypeIdentifier.d());
        if (!(inputFieldIdentifier == null || InputFieldIdentifier.NONE == inputFieldIdentifier)) {
            iid.a.put("input_field", inputFieldIdentifier.d());
        }
        if (!MoreObjects.isNullOrEmpty(str)) {
            iid.a.put("error_code", str);
        }
        this.f.b(iid);
    }

    private void t(ImmutableMap<String, String> immutableMap) {
        iid iid = new iid(iid.i);
        UnmodifiableIterator<Map.Entry<String, String>> it = immutableMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            iid.a.put(next.getKey(), next.getValue());
        }
        this.f.b(iid);
    }

    @Override // defpackage.xhd
    public void a(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        s(errorTypeIdentifier, screenIdentifier, inputFieldIdentifier, null);
    }

    @Override // defpackage.xhd
    public void b() {
        this.f.b(new iid(iid.c));
    }

    @Override // defpackage.xhd
    public void c() {
        this.f.b(new iid(iid.e));
    }

    @Override // defpackage.xhd
    public void d(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("screen", screenIdentifier.d());
        builder.mo51put("event", eventIdentifier.d());
        t(builder.build());
    }

    @Override // defpackage.xhd
    public void e() {
        this.o.a();
    }

    @Override // defpackage.xhd
    public void f(ScreenIdentifier screenIdentifier, DialogIdentifier dialogIdentifier) {
        iid iid = new iid(iid.g);
        iid.a.put("screen", screenIdentifier.d());
        iid.a.put("dialog", dialogIdentifier.d());
        this.f.b(iid);
    }

    @Override // defpackage.xhd
    public void g(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier) {
        m(screenIdentifier, clickIdentifier, DialogIdentifier.NONE);
    }

    @Override // defpackage.xhd
    public void h(khd khd) {
    }

    @Override // defpackage.xhd
    public void i(EventIdentifier eventIdentifier, ImmutableMap<String, String> immutableMap) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("event", eventIdentifier.d());
        t(builder.putAll(immutableMap).build());
    }

    @Override // defpackage.xhd
    public void j(ScreenIdentifier screenIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        iid iid = new iid(iid.h);
        iid.a.put("screen", screenIdentifier.d());
        iid.a.put("input_field", inputFieldIdentifier.d());
        this.f.b(iid);
    }

    @Override // defpackage.xhd
    public void k(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier, int i) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("screen", screenIdentifier.d());
        builder.mo51put("event", eventIdentifier.d());
        builder.mo51put("value", String.valueOf(i));
        t(builder.build());
    }

    @Override // defpackage.xhd
    public void l(ScreenIdentifier screenIdentifier) {
        iid iid = new iid(iid.f);
        iid.a.put("screen", screenIdentifier.d());
        this.f.b(iid);
    }

    @Override // defpackage.xhd
    public void m(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier, DialogIdentifier dialogIdentifier) {
        iid iid = new iid(iid.j);
        iid.a.put("screen", screenIdentifier.d());
        iid.a.put("clicked", clickIdentifier.d());
        if (!(dialogIdentifier == null || DialogIdentifier.NONE == dialogIdentifier)) {
            iid.a.put("dialog", dialogIdentifier.d());
        }
        this.f.b(iid);
    }

    @Override // defpackage.xhd
    public void n(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier, String str) {
        s(errorTypeIdentifier, screenIdentifier, inputFieldIdentifier, str);
    }

    @Override // defpackage.xhd
    public void o(Application application) {
        application.registerActivityLifecycleCallbacks(this);
        this.c.getClass();
        AdjustConfig adjustConfig = new AdjustConfig(application, q, AdjustConfig.ENVIRONMENT_PRODUCTION, true);
        adjustConfig.setLogLevel(LogLevel.INFO);
        this.b = adjustConfig;
        adjustConfig.setOnDeeplinkResponseListener(new zhd(this));
        hid hid = this.f;
        AdjustConfig adjustConfig2 = this.b;
        hid.getClass();
        Adjust.onCreate(adjustConfig2);
    }

    @Override // com.spotify.mobile.android.util.ui.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            this.f.getClass();
            Adjust.onPause();
        }
    }

    @Override // com.spotify.mobile.android.util.ui.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (this.a == 0) {
            this.f.getClass();
            Adjust.onResume();
        }
        this.a++;
    }

    @Override // defpackage.xhd
    @Deprecated
    public void p(ScreenIdentifier screenIdentifier) {
        iid iid = new iid(iid.d);
        iid.a.put("screen", screenIdentifier.d());
        this.f.b(iid);
        this.p.a(new aa1(this.o.d(), this.o.c()));
    }

    @Override // defpackage.xhd
    public void q(ScreenIdentifier screenIdentifier, String str, String str2) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("screen", screenIdentifier.d());
        builder.mo51put("event", str);
        builder.mo51put("value", str2);
        t(builder.build());
    }

    public /* synthetic */ boolean r(Uri uri) {
        for (tw0 tw0 : this.n) {
            tw0.a(uri);
        }
        return true;
    }
}
