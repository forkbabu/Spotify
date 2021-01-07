package com.spotify.music.superbird.setup.steps.welcome;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.v;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobius.android.g;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.superbird.setup.domain.d;
import com.spotify.music.superbird.setup.domain.f;
import com.spotify.music.superbird.setup.domain.p;
import com.spotify.music.superbird.setup.domain.q;
import com.spotify.music.superbird.setup.j;
import com.spotify.music.superbird.setup.m;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class WelcomeFragment extends DaggerFragment implements s {
    public static final /* synthetic */ int k0 = 0;
    public j h0;
    public m i0;
    private g<p, f, d, q> j0;

    /* compiled from: java-style lambda group */
    static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                m mVar = ((WelcomeFragment) this.b).i0;
                if (mVar != null) {
                    mVar.e();
                } else {
                    h.k("delegate");
                    throw null;
                }
            } else if (i == 1) {
                m mVar2 = ((WelcomeFragment) this.b).i0;
                if (mVar2 != null) {
                    mVar2.g();
                } else {
                    h.k("delegate");
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    static final class b<T> implements v<q> {
        final /* synthetic */ WelcomeFragment a;

        b(WelcomeFragment welcomeFragment) {
            this.a = welcomeFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.v
        public void a(q qVar) {
            q qVar2 = qVar;
            if (qVar2 instanceof q.b) {
                WelcomeFragment welcomeFragment = this.a;
                int i = WelcomeFragment.k0;
                welcomeFragment.getClass();
                welcomeFragment.H4(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 13366, null);
            } else if (qVar2 instanceof q.a) {
                WelcomeFragment welcomeFragment2 = this.a;
                int i2 = WelcomeFragment.k0;
                com.spotify.glue.dialogs.f c = com.spotify.glue.dialogs.m.c(welcomeFragment2.l4(), welcomeFragment2.R2().getString(C0707R.string.no_connection_dialog_title), welcomeFragment2.R2().getString(C0707R.string.no_connection_dialog_body));
                c.f(welcomeFragment2.R2().getString(17039370), null);
                c.a(true);
                c.b().a();
            }
        }
    }

    public WelcomeFragment() {
        super(C0707R.layout.fragment_welcome);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        c j4 = j4();
        h.d(j4, "requireActivity()");
        j jVar = this.h0;
        if (jVar != null) {
            e0 a2 = new g0(j4.Z(), jVar).a(g.class);
            h.d(a2, "ViewModelProvider(owner,…ctory).get(T::class.java)");
            this.j0 = (g) a2;
            ((Button) view.findViewById(C0707R.id.button)).setOnClickListener(new a(0, this));
            ((ImageButton) view.findViewById(C0707R.id.button_close)).setOnClickListener(new a(1, this));
            g<p, f, d, q> gVar = this.j0;
            if (gVar != null) {
                gVar.j().b(this, new b(this));
            } else {
                h.k("mobiusLoopViewModel");
                throw null;
            }
        } else {
            h.k("viewModelFactory");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.SUPERBIRD_SETUP_WELCOME.name();
    }

    @Override // androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        if (i == 13366 && i2 == -1) {
            m mVar = this.i0;
            if (mVar != null) {
                mVar.e();
            } else {
                h.k("delegate");
                throw null;
            }
        }
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b2 = ij9.b(PageIdentifiers.SUPERBIRD_SETUP_WELCOME, ViewUris.q2.toString());
        h.d(b2, "PageViewObservable.creat…_WELCOME.toString()\n    )");
        return b2;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.r1;
        h.d(ifd, "FeatureIdentifiers.SUPERBIRD");
        return ifd;
    }
}
