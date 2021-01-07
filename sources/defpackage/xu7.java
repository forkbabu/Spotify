package defpackage;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.o;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.emailverify.EmailVerifyDispatcherService;
import com.spotify.music.features.pushnotifications.model.QuickAction;
import com.spotify.music.follow.j;
import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.f;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.playlist.endpoints.v;
import io.reactivex.disposables.a;
import io.reactivex.s;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: xu7  reason: default package */
public class xu7 implements SpotifyServiceIntentProcessor, d {
    private final NotificationManager a;
    private final cw7 b;
    private final dw7 c;
    private final s<String> f;
    private final sv7 n;
    private final f o;
    private final m p;
    private final v q;
    private final Context r;
    private final com.spotify.player.play.f s;
    private final o t;
    private final y u;
    private final y v;
    private final a w = new a();

    public xu7(NotificationManager notificationManager, cw7 cw7, dw7 dw7, sv7 sv7, f fVar, m mVar, v vVar, Application application, com.spotify.player.play.f fVar2, o oVar, s<String> sVar, y yVar, y yVar2) {
        this.a = notificationManager;
        this.b = cw7;
        this.c = dw7;
        this.n = sv7;
        this.o = fVar;
        this.p = mVar;
        this.q = vVar;
        this.r = application;
        this.s = fVar2;
        this.t = oVar;
        this.f = sVar;
        this.u = yVar;
        this.v = yVar2;
    }

    private void c(qv7 qv7, j jVar) {
        if (!jVar.g()) {
            this.p.e(qv7.b(), true);
            this.c.a(qv7.c(), qv7.b());
            Logger.b("Artist/Profile with uri %s was followed", qv7.b());
        } else {
            Logger.b("Artist/Profile with uri %s was already followed", qv7.b());
        }
        l(qv7);
    }

    private Intent e(String str) {
        Intent c2 = this.t.c(this.r, "com.spotify.mobile.android.service.action.URL_OPEN");
        if (!MoreObjects.isNullOrEmpty(str)) {
            c2.setData(Uri.parse(str));
        }
        return c2;
    }

    private void l(qv7 qv7) {
        ((yv7) this.b).a(QuickAction.SAVE_ENTITY, qv7.c(), qv7.a(), qv7.b());
    }

    private void m(qv7 qv7, String str) {
        ((yv7) this.b).b(QuickAction.SAVE_ENTITY, qv7.c(), qv7.a(), qv7.b(), str);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result a(boolean z, Intent intent) {
        pv7 pv7 = (pv7) intent.getParcelableExtra("push_data");
        if (pv7 instanceof qv7) {
            qv7 qv7 = (qv7) pv7;
            Logger.b("Processing acton %s", qv7);
            this.a.cancel(qv7.e());
            if (l0.c(qv7.b(), LinkType.ALBUM, LinkType.TRACK, LinkType.SHOW_SHOW)) {
                try {
                    this.n.a(qv7.b());
                    this.c.b(qv7.c(), qv7.b());
                    l(qv7);
                } catch (Exception e) {
                    String format = String.format("Error, unable to save content: %s", e.getMessage());
                    Logger.b(format, new Object[0]);
                    m(qv7, format);
                }
            } else if (l0.b(qv7.b(), LinkType.ARTIST)) {
                j c2 = this.p.c(qv7.b());
                if (c2 != null) {
                    c(qv7, c2);
                } else {
                    this.w.b(this.o.a(qv7.b()).N0(1).I0(this.u).o0(this.v).subscribe(new su7(this, qv7), new tu7(this, qv7)));
                }
            } else if (l0.c(qv7.b(), LinkType.PLAYLIST_V2, LinkType.PROFILE_PLAYLIST)) {
                this.w.b(this.q.c(qv7.b()).G(this.u).A(this.v).subscribe(new uu7(this, qv7), new vu7(this, qv7)));
            }
        } else if (pv7 instanceof ov7) {
            ov7 ov7 = (ov7) pv7;
            Logger.b("Processing acton %s", ov7);
            this.a.cancel(ov7.e());
            this.w.b(this.s.a(PlayCommand.create(com.spotify.player.model.Context.fromUri(ov7.b()), PlayOrigin.create(kfd.Z0.toString()))).H(this.u).B(this.v).subscribe());
            this.r.startService(e(ov7.b()));
            ((yv7) this.b).a(QuickAction.SAVE_ENTITY, ov7.c(), ov7.a(), ov7.b());
        } else if (pv7 instanceof lv7) {
            lv7 lv7 = (lv7) pv7;
            ((yv7) this.b).a("DISMISS", lv7.b(), lv7.a(), null);
        } else if (pv7 instanceof rv7) {
            rv7 rv7 = (rv7) pv7;
            this.a.cancel(rv7.c());
            this.w.b(this.f.o0(this.v).subscribe(new wu7(this)));
            Logger.b("Processing acton %s, loggedIn: %b", rv7, Boolean.valueOf(z));
        }
        return SpotifyServiceIntentProcessor.Result.IGNORABLE;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public /* synthetic */ SpotifyServiceIntentProcessor.Result b(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        return com.spotify.mobile.android.service.plugininterfaces.a.a(this, z, intent, aVar);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.w.f();
        Logger.b("Session has started", new Object[0]);
    }

    public /* synthetic */ void f(qv7 qv7, j jVar) {
        this.p.g(jVar);
        c(qv7, jVar);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.w.f();
        Logger.b("Session has ended", new Object[0]);
    }

    public /* synthetic */ void h(qv7 qv7, Throwable th) {
        String format = String.format("Error, unable to save content: %s", th);
        Logger.b(format, new Object[0]);
        m(qv7, format);
    }

    public /* synthetic */ void i(qv7 qv7) {
        this.c.a(qv7.c(), qv7.b());
        l(qv7);
    }

    public /* synthetic */ void j(qv7 qv7, Throwable th) {
        String format = String.format("Failed to change playlist follow state %s", th);
        Logger.b(format, new Object[0]);
        m(qv7, format);
    }

    public void k(String str) {
        this.r.startService(e("spotify:home"));
        Context context = this.r;
        int i = EmailVerifyDispatcherService.o;
        h.e(context, "context");
        context.startService(new Intent(context, EmailVerifyDispatcherService.class));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "PushNotificationIntentProcessor";
    }
}
