package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import com.facebook.FacebookException;
import com.facebook.internal.i0;
import com.facebook.k;

public class FacebookDialogFragment extends DialogFragment {
    public static final /* synthetic */ int v0 = 0;
    private Dialog u0;

    class a implements i0.f {
        a() {
        }

        @Override // com.facebook.internal.i0.f
        public void a(Bundle bundle, FacebookException facebookException) {
            FacebookDialogFragment.this.b5(bundle, facebookException);
        }
    }

    class b implements i0.f {
        b() {
        }

        @Override // com.facebook.internal.i0.f
        public void a(Bundle bundle, FacebookException facebookException) {
            FacebookDialogFragment facebookDialogFragment = FacebookDialogFragment.this;
            int i = FacebookDialogFragment.v0;
            c B2 = facebookDialogFragment.B2();
            Intent intent = new Intent();
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtras(bundle);
            B2.setResult(-1, intent);
            B2.finish();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b5(Bundle bundle, FacebookException facebookException) {
        c B2 = B2();
        B2.setResult(facebookException == null ? -1 : 0, a0.h(B2.getIntent(), bundle, facebookException));
        B2.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        Dialog dialog = this.u0;
        if (dialog instanceof i0) {
            ((i0) dialog).q();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        if (this.u0 == null) {
            b5(null, null);
            U4(false);
        }
        return this.u0;
    }

    public void c5(Dialog dialog) {
        this.u0 = dialog;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.u0 instanceof i0) && k3()) {
            ((i0) this.u0).q();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        i0 i0Var;
        super.s3(bundle);
        if (this.u0 == null) {
            c B2 = B2();
            Bundle q = a0.q(B2.getIntent());
            if (!q.getBoolean("is_fallback", false)) {
                String string = q.getString("action");
                Bundle bundle2 = q.getBundle("params");
                if (f0.C(string)) {
                    boolean z = k.n;
                    B2.finish();
                    return;
                }
                i0.d dVar = new i0.d(B2, string, bundle2);
                dVar.f(new a());
                i0Var = dVar.a();
            } else {
                String string2 = q.getString("url");
                if (f0.C(string2)) {
                    boolean z2 = k.n;
                    B2.finish();
                    return;
                }
                i0Var = l.x(B2, string2, String.format("fb%s://bridge/", k.e()));
                i0Var.u(new b());
            }
            this.u0 = i0Var;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void y3() {
        if (P4() != null && S2()) {
            P4().setDismissMessage(null);
        }
        super.y3();
    }
}
