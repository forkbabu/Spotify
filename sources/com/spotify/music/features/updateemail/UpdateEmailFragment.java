package com.spotify.music.features.updateemail;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.mobius.t;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import dagger.android.support.DaggerFragment;
import defpackage.fv8;
import defpackage.zu8;
import io.reactivex.y;
import kotlin.collections.d;

public final class UpdateEmailFragment extends DaggerFragment implements s, d0, mfd, ws2 {
    public ys2 h0;
    public MobiusLoop.h<yu8, ev8, zu8> i0;
    public lv8 j0;
    public jv8 k0;
    public y l0;
    public y m0;
    public e n0;
    public jod o0;
    public h<yu8> p0;
    private MobiusLoop.g<yu8, ev8> q0;

    static final class a<M, F> implements t<yu8, zu8> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'com.spotify.mobius.s' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.spotify.mobius.t
        public com.spotify.mobius.s<yu8, zu8> a(yu8 yu8) {
            com.spotify.mobius.s<yu8, zu8> sVar;
            yu8 yu82 = yu8;
            kotlin.jvm.internal.h.d(yu82, "it");
            kotlin.jvm.internal.h.e(yu82, "model");
            String e = yu82.e();
            if (e == null || e.length() == 0) {
                Optional of = Optional.of(fv8.b.a);
                kotlin.jvm.internal.h.d(of, "Optional.of(UpdateEmailFetchState.InProgress)");
                sVar = com.spotify.mobius.s.c(yu8.a(yu82, null, null, null, of, null, null, 55), d.G(zu8.a.a));
            } else {
                Optional of2 = Optional.of(new fv8.c(e));
                kotlin.jvm.internal.h.d(of2, "Optional.of(UpdateEmailFetchState.Success(this))");
                sVar = com.spotify.mobius.s.b(yu8.a(yu82, null, null, null, of2, null, null, 55));
            }
            kotlin.jvm.internal.h.d(sVar, "with(model.previousEmail…        )\n        }\n    }");
            return sVar;
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ UpdateEmailFragment a;

        b(UpdateEmailFragment updateEmailFragment) {
            this.a = updateEmailFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e eVar = this.a.n0;
            if (eVar != null) {
                eVar.b();
            } else {
                kotlin.jvm.internal.h.k("viewBinder");
                throw null;
            }
        }
    }

    static final class c<I, O> implements g<yu8, ev8> {
        final /* synthetic */ UpdateEmailFragment a;

        c(UpdateEmailFragment updateEmailFragment) {
            this.a = updateEmailFragment;
        }

        @Override // com.spotify.mobius.g
        public final h<yu8> t(da2<ev8> da2) {
            UpdateEmailFragment updateEmailFragment = this.a;
            e eVar = updateEmailFragment.n0;
            if (eVar != null) {
                kotlin.jvm.internal.h.d(da2, "it");
                h<yu8> t = eVar.t(da2);
                kotlin.jvm.internal.h.e(t, "<set-?>");
                updateEmailFragment.p0 = t;
                h<yu8> hVar = this.a.p0;
                if (hVar != null) {
                    return hVar;
                }
                kotlin.jvm.internal.h.k("renderer");
                throw null;
            }
            kotlin.jvm.internal.h.k("viewBinder");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        String string = context.getString(C0707R.string.email_fragment_title);
        kotlin.jvm.internal.h.d(string, "context.getString(R.string.email_fragment_title)");
        return string;
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        MobiusLoop.g<yu8, ev8> gVar = this.q0;
        if (gVar != null) {
            gVar.stop();
            ys2 ys2 = this.h0;
            if (ys2 != null) {
                ys2.I1(null);
            } else {
                kotlin.jvm.internal.h.k("spotifyFragmentContainer");
                throw null;
            }
        } else {
            kotlin.jvm.internal.h.k("loopController");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        MobiusLoop.g<yu8, ev8> gVar = this.q0;
        if (gVar != null) {
            gVar.start();
            ys2 ys2 = this.h0;
            if (ys2 != null) {
                ys2.I1(this);
            } else {
                kotlin.jvm.internal.h.k("spotifyFragmentContainer");
                throw null;
            }
        } else {
            kotlin.jvm.internal.h.k("loopController");
            throw null;
        }
    }

    @Override // defpackage.ws2
    public boolean b() {
        return false;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        kotlin.jvm.internal.h.e(a0Var, "toolbarMenu");
        e eVar = this.n0;
        if (eVar != null) {
            View n = e0.n(a0Var, l4().getString(C0707R.string.actionbar_menu_item_save), C0707R.id.actionbar_item_save, new b(this));
            kotlin.jvm.internal.h.d(n, "ToolbarMenuHelper.addTex…iewBinder.saveClicked() }");
            eVar.c(n);
            return;
        }
        kotlin.jvm.internal.h.k("viewBinder");
        throw null;
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.SETTINGS_UPDATE_EMAIL_ADDRESS;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        com.spotify.music.libs.viewuri.c cVar = ViewUris.H2;
        kotlin.jvm.internal.h.d(cVar, "ViewUris.UPDATE_EMAIL_ADDRESS");
        return cVar;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "internal:update_email_address";
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        u4(true);
        androidx.fragment.app.c B2 = B2();
        if (B2 != null) {
            B2.invalidateOptionsMenu();
        }
        MobiusLoop.h<yu8, ev8, zu8> hVar = this.i0;
        String str = null;
        if (hVar != null) {
            Bundle D2 = D2();
            if (D2 != null) {
                str = D2.getString("EXTRA_EMAIL");
            }
            Optional absent = Optional.absent();
            kotlin.jvm.internal.h.d(absent, "Optional.absent()");
            Optional absent2 = Optional.absent();
            kotlin.jvm.internal.h.d(absent2, "Optional.absent()");
            Optional absent3 = Optional.absent();
            kotlin.jvm.internal.h.d(absent3, "Optional.absent()");
            Optional absent4 = Optional.absent();
            kotlin.jvm.internal.h.d(absent4, "Optional.absent()");
            MobiusLoop.g<yu8, ev8> c2 = z42.c(hVar, new yu8("", str, absent, absent2, absent3, absent4), a.a);
            kotlin.jvm.internal.h.d(c2, "MobiusAndroid.controller… )\n        ) { init(it) }");
            this.q0 = c2;
            return;
        }
        kotlin.jvm.internal.h.k("loopFactory");
        throw null;
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b2 = ij9.b(PageIdentifiers.SETTINGS_UPDATE_EMAIL_ADDRESS, null);
        kotlin.jvm.internal.h.d(b2, "PageViewObservable.creat…NGS_UPDATE_EMAIL_ADDRESS)");
        return b2;
    }

    @Override // androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        kotlin.jvm.internal.h.e(menu, "menu");
        kotlin.jvm.internal.h.e(menuInflater, "inflater");
        ToolbarConfig.c(this, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        jod b2 = jod.b(layoutInflater, viewGroup, false);
        kotlin.jvm.internal.h.d(b2, "UpdateEmailFragmentBindi…flater, container, false)");
        this.o0 = b2;
        androidx.fragment.app.c j4 = j4();
        kotlin.jvm.internal.h.d(j4, "requireActivity()");
        jod jod = this.o0;
        if (jod != null) {
            lv8 lv8 = this.j0;
            if (lv8 != null) {
                jv8 jv8 = this.k0;
                if (jv8 != null) {
                    y yVar = this.l0;
                    if (yVar != null) {
                        y yVar2 = this.m0;
                        if (yVar2 != null) {
                            this.n0 = new d(j4, jod, lv8, jv8, yVar, yVar2);
                            ys2 ys2 = this.h0;
                            if (ys2 != null) {
                                Context l4 = l4();
                                kotlin.jvm.internal.h.d(l4, "requireContext()");
                                kotlin.jvm.internal.h.e(l4, "context");
                                String string = l4.getString(C0707R.string.email_fragment_title);
                                kotlin.jvm.internal.h.d(string, "context.getString(R.string.email_fragment_title)");
                                ys2.k(this, string);
                                MobiusLoop.g<yu8, ev8> gVar = this.q0;
                                if (gVar != null) {
                                    gVar.c(new c(this));
                                    jod jod2 = this.o0;
                                    if (jod2 != null) {
                                        return jod2.a();
                                    }
                                    kotlin.jvm.internal.h.k("binding");
                                    throw null;
                                }
                                kotlin.jvm.internal.h.k("loopController");
                                throw null;
                            }
                            kotlin.jvm.internal.h.k("spotifyFragmentContainer");
                            throw null;
                        }
                        kotlin.jvm.internal.h.k("uiScheduler");
                        throw null;
                    }
                    kotlin.jvm.internal.h.k("computationScheduler");
                    throw null;
                }
                kotlin.jvm.internal.h.k("delayedProgressTimer");
                throw null;
            }
            kotlin.jvm.internal.h.k("uiEventDelegate");
            throw null;
        }
        kotlin.jvm.internal.h.k("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        MobiusLoop.g<yu8, ev8> gVar = this.q0;
        if (gVar != null) {
            gVar.d();
            e eVar = this.n0;
            if (eVar != null) {
                eVar.d();
            } else {
                kotlin.jvm.internal.h.k("viewBinder");
                throw null;
            }
        } else {
            kotlin.jvm.internal.h.k("loopController");
            throw null;
        }
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.x1;
        kotlin.jvm.internal.h.d(ifd, "FeatureIdentifiers.UPDATE_EMAIL");
        return ifd;
    }
}
