package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class MediaRouteControllerDialogFragment extends DialogFragment {
    private boolean u0 = false;
    private Dialog v0;
    private m6 w0;

    public MediaRouteControllerDialogFragment() {
        T4(true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        Dialog dialog = this.v0;
        if (dialog != null && !this.u0) {
            ((b) dialog).i(false);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        if (this.u0) {
            k kVar = new k(F2());
            this.v0 = kVar;
            kVar.i(this.w0);
        } else {
            this.v0 = a5(F2());
        }
        return this.v0;
    }

    public b a5(Context context) {
        return new b(context, 0);
    }

    public void b5(m6 m6Var) {
        if (m6Var != null) {
            if (this.w0 == null) {
                Bundle D2 = D2();
                if (D2 != null) {
                    this.w0 = m6.c(D2.getBundle("selector"));
                }
                if (this.w0 == null) {
                    this.w0 = m6.c;
                }
            }
            if (!this.w0.equals(m6Var)) {
                this.w0 = m6Var;
                Bundle D22 = D2();
                if (D22 == null) {
                    D22 = new Bundle();
                }
                D22.putBundle("selector", m6Var.a());
                r4(D22);
                Dialog dialog = this.v0;
                if (dialog != null && this.u0) {
                    ((k) dialog).i(m6Var);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    /* access modifiers changed from: package-private */
    public void c5(boolean z) {
        if (this.v0 == null) {
            this.u0 = z;
            return;
        }
        throw new IllegalStateException("This must be called before creating dialog");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.v0;
        if (dialog == null) {
            return;
        }
        if (this.u0) {
            ((k) dialog).k();
        } else {
            ((b) dialog).y();
        }
    }
}
