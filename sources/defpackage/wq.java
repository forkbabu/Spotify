package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.cast.framework.a;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.i;
import com.google.android.gms.cast.framework.j;
import com.google.android.gms.cast.framework.media.TracksChooserDialogFragment;
import com.google.android.gms.cast.framework.media.h;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.internal.cast.b0;
import com.google.android.gms.internal.cast.d0;
import com.google.android.gms.internal.cast.e0;
import com.google.android.gms.internal.cast.f0;
import com.google.android.gms.internal.cast.h0;
import com.google.android.gms.internal.cast.i0;
import com.google.android.gms.internal.cast.j0;
import com.google.android.gms.internal.cast.k0;
import com.google.android.gms.internal.cast.k7;
import com.google.android.gms.internal.cast.l0;
import com.google.android.gms.internal.cast.m0;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.internal.cast.zzkj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: wq  reason: default package */
public class wq implements j<c>, h.b {
    private static final b f = new b("UIMediaController");
    private final Activity a;
    private final i b;
    private final Map<View, List<vq>> c = new HashMap();
    xq d;
    private h e;

    public wq(Activity activity) {
        new HashSet();
        this.d = xq.c();
        this.a = activity;
        a f2 = a.f(activity);
        k7.b(zzkj.UI_MEDIA_CONTROLLER);
        i c2 = f2 != null ? f2.c() : null;
        this.b = c2;
        if (c2 != null) {
            i c3 = a.e(activity).c();
            c3.b(this, c.class);
            J(c3.d());
        }
    }

    private final void I(View view, vq vqVar) {
        if (this.b != null) {
            List<vq> list = this.c.get(view);
            if (list == null) {
                list = new ArrayList<>();
                this.c.put(view, list);
            }
            list.add(vqVar);
            if (E()) {
                vqVar.e(this.b.d());
                L();
            }
        }
    }

    private final void J(com.google.android.gms.cast.framework.h hVar) {
        if (!E() && (hVar instanceof c) && hVar.c()) {
            c cVar = (c) hVar;
            h p = cVar.p();
            this.e = p;
            if (p != null) {
                p.b(this);
                this.d.a = cVar.p();
                for (List<vq> list : this.c.values()) {
                    for (vq vqVar : list) {
                        vqVar.e(cVar);
                    }
                }
                L();
            }
        }
    }

    private final void K() {
        if (E()) {
            this.d.a = null;
            for (List<vq> list : this.c.values()) {
                for (vq vqVar : list) {
                    vqVar.f();
                }
            }
            this.e.w(this);
            this.e = null;
        }
    }

    private final void L() {
        for (List<vq> list : this.c.values()) {
            for (vq vqVar : list) {
                vqVar.c();
            }
        }
    }

    public void A(View view, int i) {
        g.g("Must be called from the main thread.");
        view.setOnClickListener(new ar(this));
        I(view, new j0(view, i));
    }

    public void B(View view, int i) {
        g.g("Must be called from the main thread.");
        I(view, new m0(view, i));
    }

    public void C() {
        g.g("Must be called from the main thread.");
        K();
        this.c.clear();
        i iVar = this.b;
        if (iVar != null) {
            iVar.f(this, c.class);
        }
    }

    public h D() {
        g.g("Must be called from the main thread.");
        return this.e;
    }

    public boolean E() {
        g.g("Must be called from the main thread.");
        return this.e != null;
    }

    /* access modifiers changed from: protected */
    public void F() {
        h D = D();
        if (D != null && D.m() && (this.a instanceof androidx.fragment.app.c)) {
            TracksChooserDialogFragment tracksChooserDialogFragment = new TracksChooserDialogFragment();
            androidx.fragment.app.c cVar = (androidx.fragment.app.c) this.a;
            x i = cVar.v0().i();
            Fragment U = cVar.v0().U("TRACKS_CHOOSER_DIALOG_TAG");
            if (U != null) {
                i.p(U);
            }
            tracksChooserDialogFragment.X4(i, "TRACKS_CHOOSER_DIALOG_TAG");
        }
    }

    /* access modifiers changed from: protected */
    public void G() {
        com.google.android.gms.cast.framework.media.a I1 = a.e(this.a).b().I1();
        if (I1 != null && !TextUtils.isEmpty(I1.I1())) {
            ComponentName componentName = new ComponentName(this.a.getApplicationContext(), I1.I1());
            Intent intent = new Intent();
            intent.setComponent(componentName);
            this.a.startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void H() {
        c d2 = a.e(this.a.getApplicationContext()).c().d();
        if (d2 != null && d2.c()) {
            try {
                d2.v(!d2.q());
            } catch (IOException | IllegalArgumentException e2) {
                f.c("Unable to call CastSession.setMute(boolean).", e2);
            }
        }
    }

    @Override // com.google.android.gms.cast.framework.media.h.b
    public void a() {
        L();
    }

    @Override // com.google.android.gms.cast.framework.media.h.b
    public void b() {
        L();
    }

    @Override // com.google.android.gms.cast.framework.media.h.b
    public void c() {
        L();
    }

    @Override // com.google.android.gms.cast.framework.media.h.b
    public void d() {
        L();
    }

    @Override // com.google.android.gms.cast.framework.media.h.b
    public void e() {
        L();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, int] */
    @Override // com.google.android.gms.cast.framework.j
    public void f(c cVar, int i) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, java.lang.String] */
    @Override // com.google.android.gms.cast.framework.j
    public void g(c cVar, String str) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, int] */
    @Override // com.google.android.gms.cast.framework.j
    public void h(c cVar, int i) {
        K();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, int] */
    @Override // com.google.android.gms.cast.framework.j
    public void i(c cVar, int i) {
        K();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h] */
    @Override // com.google.android.gms.cast.framework.j
    public void j(c cVar) {
    }

    @Override // com.google.android.gms.cast.framework.media.h.b
    public void k() {
        for (List<vq> list : this.c.values()) {
            for (vq vqVar : list) {
                vqVar.d();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, java.lang.String] */
    @Override // com.google.android.gms.cast.framework.j
    public void l(c cVar, String str) {
        J(cVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, boolean] */
    @Override // com.google.android.gms.cast.framework.j
    public void m(c cVar, boolean z) {
        J(cVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, int] */
    @Override // com.google.android.gms.cast.framework.j
    public void n(c cVar, int i) {
        K();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h] */
    @Override // com.google.android.gms.cast.framework.j
    public void o(c cVar) {
    }

    public void p(ImageView imageView, com.google.android.gms.cast.framework.media.b bVar, int i) {
        g.g("Must be called from the main thread.");
        I(imageView, new a0(imageView, this.a, bVar, i, null));
    }

    public void q(ImageView imageView) {
        g.g("Must be called from the main thread.");
        imageView.setOnClickListener(new yq(this));
        I(imageView, new d0(imageView, this.a));
    }

    public void r(ImageView imageView, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z) {
        g.g("Must be called from the main thread.");
        k7.b(zzkj.PAUSE_CONTROLLER);
        imageView.setOnClickListener(new zq(this));
        I(imageView, new f0(imageView, this.a, drawable, drawable2, drawable3, view, z));
    }

    public void s(ProgressBar progressBar) {
        g.g("Must be called from the main thread.");
        I(progressBar, new i0(progressBar, 1000));
    }

    public void t(TextView textView, String str) {
        g.g("Must be called from the main thread.");
        List singletonList = Collections.singletonList(str);
        g.g("Must be called from the main thread.");
        I(textView, new e0(textView, singletonList));
    }

    public void u(TextView textView) {
        g.g("Must be called from the main thread.");
        I(textView, new l0(textView));
    }

    public void v(View view) {
        g.g("Must be called from the main thread.");
        view.setOnClickListener(new er(this));
        I(view, new y(view, this.a));
    }

    public void w(View view, long j) {
        g.g("Must be called from the main thread.");
        view.setOnClickListener(new dr(this, j));
        I(view, new z(view, this.d));
    }

    public void x(View view) {
        g.g("Must be called from the main thread.");
        view.setOnClickListener(new fr(this));
        I(view, new b0(view));
    }

    public void y(View view, long j) {
        g.g("Must be called from the main thread.");
        view.setOnClickListener(new cr(this, j));
        I(view, new h0(view, this.d));
    }

    public void z(View view, int i) {
        g.g("Must be called from the main thread.");
        view.setOnClickListener(new br(this));
        I(view, new k0(view, i));
    }
}
