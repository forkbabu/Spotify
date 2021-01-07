package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarManager;
import com.spotify.android.paste.app.d;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.z;
import com.spotify.music.navigation.r;
import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.scannables.c;
import com.spotify.rxjava2.q;
import io.reactivex.a;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.y;

/* access modifiers changed from: package-private */
/* renamed from: tt6  reason: default package */
public final class tt6 implements zt6 {
    private final q a = new q();
    private final Activity b;
    private final t c;
    private final wt6 f;
    private final c n;
    private final ToolbarConfiguration o;
    private final y p;
    private final z q;
    private final r r;
    private final CompletableSubject s = CompletableSubject.R();
    private final ImmutableList<gu6> t;
    private final ImmutableList<eu6> u;
    private ToolbarManager v;
    private h76 w;
    private ar6 x = ar6.j;

    tt6(Activity activity, y yVar, t tVar, wt6 wt6, c cVar, z zVar, r rVar, ImmutableList<gu6> immutableList, ImmutableList<eu6> immutableList2, ToolbarConfiguration toolbarConfiguration) {
        this.b = activity;
        this.c = tVar;
        this.f = wt6;
        this.n = cVar;
        this.o = toolbarConfiguration;
        this.p = yVar;
        this.q = zVar;
        this.r = rVar;
        this.t = immutableList;
        this.u = immutableList2;
    }

    @Override // com.spotify.android.glue.components.toolbar.d
    public void P() {
        ToolbarManager toolbarManager = this.v;
        if (toolbarManager != null) {
            toolbarManager.f();
        }
    }

    @Override // com.spotify.android.glue.components.toolbar.d
    public u R() {
        return this.v;
    }

    public /* synthetic */ void b(View view) {
        this.f.c();
        this.c.a();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        UnmodifiableListIterator<gu6> listIterator = this.t.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next().f();
        }
        UnmodifiableListIterator<eu6> listIterator2 = this.u.listIterator();
        while (listIterator2.hasNext()) {
            listIterator2.next().f();
        }
    }

    @Override // com.spotify.music.features.playlistentity.t
    public a g() {
        return this.s;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        P();
        UnmodifiableListIterator<gu6> listIterator = this.t.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next().h();
        }
        st6 st6 = new st6(this);
        UnmodifiableListIterator<eu6> listIterator2 = this.u.listIterator();
        while (listIterator2.hasNext()) {
            listIterator2.next().c(st6);
        }
    }

    public /* synthetic */ void i(View view) {
        this.f.o();
    }

    public /* synthetic */ void j(h76 h76) {
        this.w = h76;
        P();
        this.s.onComplete();
    }

    @Override // defpackage.zt6
    public void j0(ViewGroup viewGroup) {
        com.spotify.android.glue.components.toolbar.c c2 = l70.c(this.b, viewGroup);
        e eVar = (e) c2;
        d.d(eVar.getView(), this.b);
        viewGroup.addView(eVar.getView(), 0);
        ToolbarManager toolbarManager = new ToolbarManager(this.b, c2, new mt6(this));
        this.v = toolbarManager;
        toolbarManager.b(false);
        this.v.h(this.x.i());
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.a.c();
        q qVar = this.a;
        s<h76> o0 = bVar.a().b().E().o0(this.p);
        qt6 qt6 = new qt6(this);
        CompletableSubject completableSubject = this.s;
        completableSubject.getClass();
        qVar.a(o0.subscribe(qt6, new rt6(completableSubject)));
        this.a.a(this.q.b().o0(this.p).subscribe(new pt6(this), ot6.a));
        UnmodifiableListIterator<gu6> listIterator = this.t.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next().onStart();
        }
        UnmodifiableListIterator<eu6> listIterator2 = this.u.listIterator();
        while (listIterator2.hasNext()) {
            listIterator2.next().l(bVar);
        }
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.a.c();
        UnmodifiableListIterator<gu6> listIterator = this.t.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next().onStop();
        }
        UnmodifiableListIterator<eu6> listIterator2 = this.u.listIterator();
        while (listIterator2.hasNext()) {
            listIterator2.next().onStop();
        }
    }

    @Override // defpackage.zt6
    public void r(ar6 ar6) {
        ar6 ar62 = (ar6) MoreObjects.firstNonNull(ar6, ar6.j);
        this.x = ar62;
        ToolbarManager toolbarManager = this.v;
        if (toolbarManager != null) {
            toolbarManager.h(ar62.i());
        }
        P();
    }

    public /* synthetic */ void w(Boolean bool) {
        boolean z = !bool.booleanValue();
        ToolbarManager toolbarManager = this.v;
        if (toolbarManager != null) {
            toolbarManager.b(z);
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.zt6
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x(com.spotify.android.glue.patterns.toolbarmenu.a0 r7, defpackage.zt6.c r8) {
        /*
            r6 = this;
            nt6 r0 = new nt6
            r0.<init>(r6)
            r7.g(r0)
            h76 r0 = r6.w
            if (r0 == 0) goto L_0x00c8
            com.spotify.android.glue.patterns.toolbarmenu.ToolbarManager r1 = r6.v
            if (r1 != 0) goto L_0x0012
            goto L_0x00c8
        L_0x0012:
            r1.getClass()
            com.spotify.music.navigation.r r2 = r6.r
            boolean r2 = r2.e()
            r1.g(r2)
            com.spotify.playlist.models.j r1 = r0.l()
            zt6$c$a r8 = r8.a(r0)
            java.lang.String r2 = r1.j()
            com.google.common.base.Optional r3 = r8.c()
            java.lang.Object r2 = r3.or(r2)
            java.lang.String r2 = (java.lang.String) r2
            r7.h(r2)
            com.spotify.music.spotlets.scannables.c r2 = r6.n
            com.spotify.playlist.models.Covers r3 = r1.c()
            com.spotify.playlist.models.Covers$Size r4 = com.spotify.playlist.models.Covers.Size.SMALL
            java.lang.String r3 = com.spotify.playlist.models.q.c(r3, r4)
            java.lang.String r4 = r1.getUri()
            r5 = 1
            java.lang.String r2 = r2.a(r3, r4, r5)
            com.google.common.base.Optional r3 = r8.a()
            java.lang.String r4 = ""
            java.lang.Object r2 = com.google.common.base.MoreObjects.firstNonNull(r2, r4)
            java.lang.Object r2 = r3.or(r2)
            java.lang.String r2 = (java.lang.String) r2
            com.spotify.android.paste.graphics.SpotifyIconV2 r3 = com.spotify.android.paste.graphics.SpotifyIconV2.PLAYLIST
            r4 = 0
            r7.a(r2, r3, r4, r5)
            com.spotify.playlist.models.p r1 = r1.m()
            if (r1 == 0) goto L_0x0088
            java.lang.String r1 = r1.a()
            com.google.common.base.Optional r8 = r8.b()
            android.content.Context r2 = r7.getContext()
            r3 = 2132019200(0x7f140800, float:1.9676728E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r1
            java.lang.String r1 = r2.getString(r3, r5)
            java.lang.Object r8 = r8.or(r1)
            java.lang.String r8 = (java.lang.String) r8
            r7.i(r8)
        L_0x0088:
            com.google.common.collect.ImmutableList<eu6> r8 = r6.u
            com.google.common.collect.UnmodifiableListIterator r8 = r8.listIterator()
        L_0x008e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00aa
            java.lang.Object r1 = r8.next()
            eu6 r1 = (defpackage.eu6) r1
            ar6 r2 = r6.x
            com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration r3 = r6.o
            boolean r2 = r1.b(r2, r3, r0)
            if (r2 == 0) goto L_0x008e
            ar6 r2 = r6.x
            r1.d(r7, r2, r0)
            goto L_0x008e
        L_0x00aa:
            com.google.common.collect.ImmutableList<gu6> r8 = r6.t
            com.google.common.collect.UnmodifiableListIterator r8 = r8.listIterator()
        L_0x00b0:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00c8
            java.lang.Object r1 = r8.next()
            gu6 r1 = (defpackage.gu6) r1
            com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration r2 = r6.o
            boolean r2 = r1.b(r2, r0)
            if (r2 == 0) goto L_0x00b0
            r1.a(r7, r0)
            goto L_0x00b0
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt6.x(com.spotify.android.glue.patterns.toolbarmenu.a0, zt6$c):void");
    }
}
