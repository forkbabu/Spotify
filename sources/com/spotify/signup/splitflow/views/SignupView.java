package com.spotify.signup.splitflow.views;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewAnimator;
import com.spotify.android.glue.components.toolbar.GlueToolbarLayout;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import com.spotify.signup.splitflow.b2;
import com.spotify.termsandconditions.k;
import com.spotify.termsandconditions.l;
import defpackage.ce0;
import defpackage.ge0;
import defpackage.gee;
import defpackage.ie0;
import defpackage.je0;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;

public final class SignupView implements com.spotify.mobius.g<kee, iee>, b2, k {
    private final View a;
    private final rie b;
    private final jle c;
    private final ebe f;
    private final jje n;
    private final wje o;
    private final j p;
    private final StateListAnimatorImageButton q;
    private final ViewAnimator r;
    private gee s;
    private final PublishSubject<iee> t;
    private final l u;
    private final List<wme> v = new ArrayList();
    private boolean w = true;

    /* compiled from: java-style lambda group */
    static final class a<T> implements io.reactivex.functions.g<iee> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public final void accept(iee iee) {
            int i = this.a;
            if (i == 0) {
                iee iee2 = iee;
                kotlin.jvm.internal.h.e(iee2, "value");
                ((da2) this.b).accept(iee2);
            } else if (i == 1) {
                iee iee3 = iee;
                kotlin.jvm.internal.h.e(iee3, "value");
                ((da2) this.b).accept(iee3);
            } else {
                throw null;
            }
        }
    }

    /* compiled from: java-style lambda group */
    static final class b implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public b(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                ((da2) this.b).accept(iee.k());
            } else if (i == 1) {
                ((da2) this.b).accept(iee.c());
            } else {
                throw null;
            }
        }
    }

    public static final class c implements k {
        final /* synthetic */ ae0 a;

        c(ae0 ae0) {
            this.a = ae0;
        }

        @Override // com.spotify.termsandconditions.k
        public void a() {
            this.a.a(new ce0.e(je0.h.b, ge0.h.b));
        }

        @Override // com.spotify.termsandconditions.k
        public void b() {
            this.a.a(new ce0.h(je0.h.b, ie0.h.b));
        }

        @Override // com.spotify.termsandconditions.k
        public void c() {
            this.a.a(new ce0.e(je0.h.b, ge0.i.b));
        }

        @Override // com.spotify.termsandconditions.k
        public void d() {
            this.a.a(new ce0.h(je0.h.b, ie0.i.b));
        }
    }

    static final class d<V> implements da2<ohe> {
        final /* synthetic */ da2 a;

        d(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: da2 */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.da2
        public void accept(ohe ohe) {
            ohe ohe2 = ohe;
            kotlin.jvm.internal.h.e(ohe2, "event");
            this.a.accept(iee.g(ohe2));
        }
    }

    static final class e<V> implements da2<oke> {
        final /* synthetic */ da2 a;

        e(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: da2 */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.da2
        public void accept(oke oke) {
            oke oke2 = oke;
            kotlin.jvm.internal.h.e(oke2, "event");
            this.a.accept(iee.u(oke2));
        }
    }

    public static final class f extends com.spotify.termsandconditions.j {
        final /* synthetic */ da2 a;

        f(da2 da2) {
            this.a = da2;
        }

        @Override // com.spotify.termsandconditions.l.b
        public void a() {
            this.a.accept(iee.h());
        }

        @Override // com.spotify.termsandconditions.l.b
        public void b() {
            this.a.accept(iee.n());
        }
    }

    public static final class g implements com.spotify.mobius.h<kee> {
        final /* synthetic */ SignupView a;
        final /* synthetic */ com.spotify.mobius.h b;
        final /* synthetic */ com.spotify.mobius.h c;
        final /* synthetic */ com.spotify.mobius.h d;
        final /* synthetic */ com.spotify.mobius.h e;
        final /* synthetic */ com.spotify.mobius.h f;
        final /* synthetic */ io.reactivex.disposables.b g;
        final /* synthetic */ io.reactivex.disposables.b h;

        g(SignupView signupView, com.spotify.mobius.h hVar, com.spotify.mobius.h hVar2, com.spotify.mobius.h hVar3, com.spotify.mobius.h hVar4, com.spotify.mobius.h hVar5, io.reactivex.disposables.b bVar, io.reactivex.disposables.b bVar2) {
            this.a = signupView;
            this.b = hVar;
            this.c = hVar2;
            this.d = hVar3;
            this.e = hVar4;
            this.f = hVar5;
            this.g = bVar;
            this.h = bVar2;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            kee kee = (kee) obj;
            kotlin.jvm.internal.h.e(kee, "model");
            com.spotify.mobius.h hVar = this.b;
            if (hVar != null) {
                hVar.accept(kee.c());
            }
            com.spotify.mobius.h hVar2 = this.c;
            if (hVar2 != null) {
                hVar2.accept(kee.l());
            }
            this.d.accept(kee.a());
            this.e.accept(kee.f());
            this.f.accept(kee.j());
            SignupView.c(this.a, kee.k());
            if (this.a.s == null) {
                gee n = kee.n();
                kotlin.jvm.internal.h.d(n, "model.signupConfigurationState()");
                if (n instanceof gee.b) {
                    this.a.s = kee.n();
                }
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.g.dispose();
            com.spotify.mobius.h hVar = this.b;
            if (hVar != null) {
                hVar.dispose();
            }
            com.spotify.mobius.h hVar2 = this.c;
            if (hVar2 != null) {
                hVar2.dispose();
            }
            this.d.dispose();
            this.e.dispose();
            this.f.dispose();
            this.h.dispose();
            this.a.q.setOnClickListener(null);
        }
    }

    static final class h<V> implements da2<sae> {
        final /* synthetic */ da2 a;

        h(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: da2 */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.da2
        public void accept(sae sae) {
            sae sae2 = sae;
            kotlin.jvm.internal.h.e(sae2, "event");
            this.a.accept(iee.d(sae2));
        }
    }

    static final class i<V> implements da2<yie> {
        final /* synthetic */ da2 a;

        i(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: da2 */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.da2
        public void accept(yie yie) {
            yie yie2 = yie;
            kotlin.jvm.internal.h.e(yie2, "event");
            this.a.accept(iee.j(yie2));
        }
    }

    static final class j<V> implements da2<rje> {
        final /* synthetic */ da2 a;

        j(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: da2 */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.da2
        public void accept(rje rje) {
            rje rje2 = rje;
            kotlin.jvm.internal.h.e(rje2, "event");
            this.a.accept(iee.s(rje2));
        }
    }

    public SignupView(final wie wie, LayoutInflater layoutInflater, ViewGroup viewGroup, l lVar, j jVar, final ae0 ae0, boolean z) {
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        kotlin.jvm.internal.h.e(lVar, "termsAndConditionsDialogs");
        kotlin.jvm.internal.h.e(jVar, "dialogView");
        kotlin.jvm.internal.h.e(ae0, "authTracker");
        View inflate = layoutInflater.inflate(C0707R.layout.sthlm_blk_signup, (ViewGroup) null, true);
        kotlin.jvm.internal.h.d(inflate, "inflater.inflate(R.layou…m_blk_signup, root, true)");
        this.a = inflate;
        PublishSubject<iee> h1 = PublishSubject.h1();
        kotlin.jvm.internal.h.d(h1, "PublishSubject.create<SignupEvent>()");
        this.t = h1;
        View findViewById = inflate.findViewById(C0707R.id.view_animator);
        kotlin.jvm.internal.h.d(findViewById, "mRoot.findViewById(R.id.view_animator)");
        this.r = (ViewAnimator) findViewById;
        if (z) {
            this.b = null;
            this.c = null;
        } else {
            this.b = (rie) j(C0707R.layout.sthlm_blk_email, AnonymousClass1.a);
            this.c = (jle) j(C0707R.layout.sthlm_blk_password, AnonymousClass2.a);
        }
        this.f = (ebe) j(C0707R.layout.sthlm_blk_age, AnonymousClass3.a);
        this.n = (jje) j(C0707R.layout.sthlm_blk_gender, new nmf<View, jje>() {
            /* class com.spotify.signup.splitflow.views.SignupView.AnonymousClass4 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.nmf
            public jje invoke(View view) {
                View view2 = view;
                kotlin.jvm.internal.h.e(view2, "it");
                return new jje(wie, view2);
            }
        });
        this.o = (wje) j(C0707R.layout.sthlm_blk_name, new nmf<View, wje>() {
            /* class com.spotify.signup.splitflow.views.SignupView.AnonymousClass5 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.nmf
            public wje invoke(View view) {
                View view2 = view;
                kotlin.jvm.internal.h.e(view2, "it");
                return new wje(view2, ae0);
            }
        });
        this.p = jVar;
        this.u = lVar;
        com.spotify.android.glue.components.toolbar.e eVar = new com.spotify.android.glue.components.toolbar.e((GlueToolbarLayout) inflate.findViewById(C0707R.id.toolbar));
        Context context = inflate.getContext();
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(context);
        this.q = stateListAnimatorImageButton;
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        stateListAnimatorImageButton.setBackground(null);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.ARROW_LEFT, (float) inflate.getResources().getDimensionPixelSize(C0707R.dimen.toolbar_icon_size));
        spotifyIconDrawable.r(androidx.core.content.a.b(context, R.color.white));
        stateListAnimatorImageButton.setImageDrawable(spotifyIconDrawable);
        stateListAnimatorImageButton.setContentDescription(inflate.getContext().getString(C0707R.string.signup_generic_content_description_close));
        eVar.H1(ToolbarSide.START, stateListAnimatorImageButton, C0707R.id.toolbar_up_button);
        lVar.g(new c(ae0));
    }

    public static final void c(SignupView signupView, int i2) {
        synchronized (signupView) {
            if (signupView.r.getDisplayedChild() != i2 || signupView.w) {
                boolean z = true;
                if (q4.o(signupView.a) != 1) {
                    z = false;
                }
                int displayedChild = signupView.r.getDisplayedChild();
                int i3 = C0707R.anim.splitflow_slide_out_right;
                int i4 = C0707R.anim.splitflow_slide_in_left;
                if (i2 < displayedChild) {
                    ViewAnimator viewAnimator = signupView.r;
                    Context context = viewAnimator.getContext();
                    if (z) {
                        i4 = C0707R.anim.splitflow_slide_in_right;
                    }
                    viewAnimator.setInAnimation(context, i4);
                    ViewAnimator viewAnimator2 = signupView.r;
                    Context context2 = viewAnimator2.getContext();
                    if (z) {
                        i3 = C0707R.anim.splitflow_slide_out_left;
                    }
                    viewAnimator2.setOutAnimation(context2, i3);
                } else {
                    ViewAnimator viewAnimator3 = signupView.r;
                    Context context3 = viewAnimator3.getContext();
                    if (!z) {
                        i4 = C0707R.anim.splitflow_slide_in_right;
                    }
                    viewAnimator3.setInAnimation(context3, i4);
                    ViewAnimator viewAnimator4 = signupView.r;
                    Context context4 = viewAnimator4.getContext();
                    if (!z) {
                        i3 = C0707R.anim.splitflow_slide_out_left;
                    }
                    viewAnimator4.setOutAnimation(context4, i3);
                }
                signupView.r.setDisplayedChild(i2);
                signupView.v.get(signupView.r.getDisplayedChild()).c();
                signupView.w = false;
            }
        }
    }

    private final <T extends wme> T j(int i2, nmf<? super View, ? extends T> nmf) {
        View inflate = LayoutInflater.from(this.r.getContext()).inflate(i2, (ViewGroup) this.r, true);
        kotlin.jvm.internal.h.d(inflate, "view");
        T t2 = (T) ((wme) nmf.invoke(inflate));
        this.v.add(t2);
        return t2;
    }

    public fbe e() {
        return this.f;
    }

    public sie f() {
        return this.b;
    }

    public xje g() {
        return this.o;
    }

    public kle h() {
        return this.c;
    }

    public View i() {
        return this.a;
    }

    public void k() {
        this.t.onNext(iee.l());
    }

    public void l(com.spotify.termsandconditions.model.b bVar) {
        kotlin.jvm.internal.h.e(bVar, "termsAndConditionsModel");
        this.u.j(bVar);
    }

    @Override // com.spotify.mobius.g
    public com.spotify.mobius.h<kee> t(da2<iee> da2) {
        kotlin.jvm.internal.h.e(da2, "eventsConsumer");
        rie rie = this.b;
        com.spotify.mobius.h<pke> hVar = null;
        com.spotify.mobius.h<phe> t2 = rie != null ? rie.t(new d(da2)) : null;
        jle jle = this.c;
        if (jle != null) {
            hVar = jle.t(new e(da2));
        }
        com.spotify.mobius.h<tae> t3 = this.f.t(new h(da2));
        kotlin.jvm.internal.h.d(t3, "mAge.connect { event: Ag…          )\n            }");
        com.spotify.mobius.h<zie> t4 = this.n.t(new i(da2));
        kotlin.jvm.internal.h.d(t4, "mGender.connect { event:…          )\n            }");
        com.spotify.mobius.h<sje> t5 = this.o.t(new j(da2));
        kotlin.jvm.internal.h.d(t5, "mName.connect { event: N…          )\n            }");
        io.reactivex.disposables.b subscribe = this.p.a().subscribe(new a(1, da2));
        io.reactivex.disposables.b subscribe2 = this.t.subscribe(new a(0, da2));
        this.q.setOnClickListener(new b(0, da2));
        this.u.f(new f(da2));
        this.o.f(new b(1, da2));
        return new g(this, t2, hVar, t3, t4, t5, subscribe2, subscribe);
    }
}
