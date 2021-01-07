package com.spotify.googleauth;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.c;
import com.google.android.gms.auth.api.signin.internal.i;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import com.spotify.googleauth.presenter.GoogleLoginPresenter;
import com.spotify.libs.pse.model.e;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.music.C0707R;
import defpackage.ce0;
import defpackage.fe0;
import defpackage.ge0;
import defpackage.he0;
import defpackage.ie0;
import defpackage.om0;
import kotlin.d;
import kotlin.jvm.internal.h;

public final class GoogleLoginFragment extends DialogFragment implements om0 {
    private final d A0 = kotlin.a.b(new GoogleLoginFragment$launchedFrom$2(this));
    public om0.a u0;
    public xd0 v0;
    public com.spotify.loginflow.navigation.d w0;
    public e x0;
    public ae0 y0;
    public View z0;

    /* access modifiers changed from: package-private */
    public static final class a implements DialogInterface.OnClickListener {
        final /* synthetic */ GoogleLoginFragment a;
        final /* synthetic */ GoogleSignInAccount b;

        a(GoogleLoginFragment googleLoginFragment, GoogleSignInAccount googleSignInAccount) {
            this.a = googleLoginFragment;
            this.b = googleSignInAccount;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == -1) {
                GoogleLoginFragment googleLoginFragment = this.a;
                String I1 = this.b.I1();
                if (I1 != null) {
                    com.spotify.loginflow.navigation.d dVar = googleLoginFragment.w0;
                    if (dVar != null) {
                        dVar.b(new Destination.e(I1, null, 2));
                    } else {
                        h.k("mZeroNavigator");
                        throw null;
                    }
                } else {
                    com.spotify.loginflow.navigation.d dVar2 = googleLoginFragment.w0;
                    if (dVar2 != null) {
                        dVar2.b(new Destination.e(null, null, 3));
                    } else {
                        h.k("mZeroNavigator");
                        throw null;
                    }
                }
                this.a.b5().a(new ce0.c(this.a.c5(), fe0.h.b, ge0.k.b));
                return;
            }
            this.a.b5().a(new ce0.c(this.a.c5(), fe0.g.b, ge0.k.b));
            this.a.M4();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements DialogInterface.OnClickListener {
        final /* synthetic */ GoogleLoginFragment a;

        b(GoogleLoginFragment googleLoginFragment) {
            this.a = googleLoginFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == -1) {
                this.a.b5().a(new ce0.c(this.a.c5(), fe0.j.b, ge0.e.b));
                com.spotify.loginflow.navigation.d dVar = this.a.w0;
                if (dVar != null) {
                    dVar.d(45500, Destination.h.a.a);
                } else {
                    h.k("mZeroNavigator");
                    throw null;
                }
            } else {
                this.a.b5().a(new ce0.c(this.a.c5(), fe0.i.b, ge0.e.b));
                this.a.M4();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final je0 c5() {
        return (je0) this.A0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        om0.a aVar = this.u0;
        if (aVar != null) {
            ((GoogleLoginPresenter) aVar).onPause();
            super.H3();
            return;
        }
        h.k("mViewBinderListener");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        View findViewById = view.findViewById(C0707R.id.logging_in);
        h.d(findViewById, "view.findViewById(R.id.logging_in)");
        this.z0 = findViewById;
        if (bundle == null) {
            Context l4 = l4();
            GoogleSignInOptions.a aVar = new GoogleSignInOptions.a(GoogleSignInOptions.z);
            aVar.b();
            aVar.f("1046568431490-ij1gi5shcp2gtorls09frkc56d4mjbe2.apps.googleusercontent.com");
            GoogleSignInOptions a2 = aVar.a();
            h.d(a2, "GoogleSignInOptions.Buil…_ID)\n            .build()");
            c a3 = com.google.android.gms.auth.api.signin.a.a(l4, a2);
            a3.w().j(new a(this, a3));
        }
    }

    public final ae0 b5() {
        ae0 ae0 = this.y0;
        if (ae0 != null) {
            return ae0;
        }
        h.k("authTracker");
        throw null;
    }

    public void d5() {
        View view = this.z0;
        if (view != null) {
            view.setVisibility(8);
        } else {
            h.k("loadingView");
            throw null;
        }
    }

    public void e5(GoogleSignInAccount googleSignInAccount) {
        h.e(googleSignInAccount, "googleAccount");
        M4();
        xd0 xd0 = this.v0;
        if (xd0 != null) {
            xd0.c(new a(this, googleSignInAccount));
        } else {
            h.k("mAuthDialog");
            throw null;
        }
    }

    public void f5() {
        M4();
        xd0 xd0 = this.v0;
        if (xd0 != null) {
            xd0.h();
        } else {
            h.k("mAuthDialog");
            throw null;
        }
    }

    public void g5() {
        ae0 ae0 = this.y0;
        if (ae0 != null) {
            ae0.a(new ce0.e(c5(), ge0.e.b));
            xd0 xd0 = this.v0;
            if (xd0 != null) {
                xd0.i(new b(this));
            } else {
                h.k("mAuthDialog");
                throw null;
            }
        } else {
            h.k("authTracker");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        g<GoogleSignInAccount> gVar;
        if (i == 200) {
            com.google.android.gms.auth.api.signin.d a2 = i.a(intent);
            GoogleSignInAccount a3 = a2.a();
            if (!a2.h().r2() || a3 == null) {
                gVar = j.d(f.c(a2.h()));
            } else {
                gVar = j.e(a3);
            }
            h.d(gVar, "GoogleSignIn.getSignedInAccountFromIntent(data)");
            boolean z = false;
            T4(false);
            if (i2 == 0) {
                ((com.google.android.gms.auth.api.signin.internal.g) oq.h).getClass();
                Status h = i.a(intent).h();
                if (h != null) {
                    z = h.q2();
                }
                if (z) {
                    ae0 ae0 = this.y0;
                    if (ae0 != null) {
                        ae0.a(new ce0.f(c5(), he0.q.b, ie0.e.b, String.valueOf(i2)));
                    } else {
                        h.k("authTracker");
                        throw null;
                    }
                }
                M4();
                return;
            }
            om0.a aVar = this.u0;
            if (aVar != null) {
                ((GoogleLoginPresenter) aVar).c(gVar, c5());
                return;
            }
            h.k("mViewBinderListener");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        super.p3(context);
        dagger.android.support.a.a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        return layoutInflater.inflate(C0707R.layout.fragment_sso_login, viewGroup, false);
    }
}
