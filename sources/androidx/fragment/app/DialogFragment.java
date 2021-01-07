package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.o;

public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler g0;
    private Runnable h0 = new a();
    private DialogInterface.OnCancelListener i0 = new b();
    private DialogInterface.OnDismissListener j0 = new c();
    private int k0 = 0;
    private int l0 = 0;
    private boolean m0 = true;
    private boolean n0 = true;
    private int o0 = -1;
    private boolean p0;
    private Dialog q0;
    private boolean r0;
    private boolean s0;
    private boolean t0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogFragment.this.j0.onDismiss(DialogFragment.this.q0);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogFragment.this.q0 != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onCancel(dialogFragment.q0);
            }
        }
    }

    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogFragment.this.q0 != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onDismiss(dialogFragment.q0);
            }
        }
    }

    private void O4(boolean z, boolean z2) {
        if (!this.s0) {
            this.s0 = true;
            this.t0 = false;
            Dialog dialog = this.q0;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.q0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.g0.getLooper()) {
                        onDismiss(this.q0);
                    } else {
                        this.g0.post(this.h0);
                    }
                }
            }
            this.r0 = true;
            if (this.o0 >= 0) {
                o Q2 = Q2();
                int i = this.o0;
                if (i >= 0) {
                    Q2.L(new o.h(null, i, 1), false);
                    this.o0 = -1;
                    return;
                }
                throw new IllegalArgumentException(je.p0("Bad id: ", i));
            }
            a aVar = new a(Q2());
            aVar.p(this);
            if (z) {
                aVar.j();
            } else {
                aVar.i();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // androidx.fragment.app.Fragment
    public LayoutInflater A3(Bundle bundle) {
        LayoutInflater N2 = N2();
        if (!this.n0 || this.p0) {
            return N2;
        }
        try {
            this.p0 = true;
            Dialog R4 = R4(bundle);
            this.q0 = R4;
            W4(R4, this.k0);
            this.p0 = false;
            return N2.cloneInContext(S4().getContext());
        } catch (Throwable th) {
            this.p0 = false;
            throw th;
        }
    }

    public void M4() {
        O4(false, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        Dialog dialog = this.q0;
        if (dialog != null) {
            bundle.putBundle("android:savedDialogState", dialog.onSaveInstanceState());
        }
        int i = this.k0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.l0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.m0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.n0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.o0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void N4() {
        O4(true, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        Dialog dialog = this.q0;
        if (dialog != null) {
            this.r0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        Dialog dialog = this.q0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public Dialog P4() {
        return this.q0;
    }

    public int Q4() {
        return this.l0;
    }

    public Dialog R4(Bundle bundle) {
        return new Dialog(l4(), Q4());
    }

    public final Dialog S4() {
        Dialog dialog = this.q0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void T4(boolean z) {
        this.m0 = z;
        Dialog dialog = this.q0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void U4(boolean z) {
        this.n0 = z;
    }

    public void V4(int i, int i2) {
        this.k0 = i;
        if (i == 2 || i == 3) {
            this.l0 = 16973913;
        }
        if (i2 != 0) {
            this.l0 = i2;
        }
    }

    public void W4(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int X4(x xVar, String str) {
        this.s0 = false;
        this.t0 = true;
        xVar.n(0, this, str, 1);
        this.r0 = false;
        int i = xVar.i();
        this.o0 = i;
        return i;
    }

    public void Y4(o oVar, String str) {
        this.s0 = false;
        this.t0 = true;
        a aVar = new a(oVar);
        aVar.n(0, this, str, 1);
        aVar.i();
    }

    public void Z4(o oVar, String str) {
        this.s0 = false;
        this.t0 = true;
        a aVar = new a(oVar);
        aVar.n(0, this, null, 1);
        aVar.k();
    }

    @Override // androidx.fragment.app.Fragment
    public void m3(Bundle bundle) {
        Bundle bundle2;
        super.m3(bundle);
        if (this.n0) {
            View view = this.P;
            if (this.q0 != null) {
                if (view != null) {
                    if (view.getParent() == null) {
                        this.q0.setContentView(view);
                    } else {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                }
                c B2 = B2();
                if (B2 != null) {
                    this.q0.setOwnerActivity(B2);
                }
                this.q0.setCancelable(this.m0);
                this.q0.setOnCancelListener(this.i0);
                this.q0.setOnDismissListener(this.j0);
                if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                    this.q0.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.r0) {
            O4(true, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        super.p3(context);
        if (!this.t0) {
            this.s0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.g0 = new Handler();
        this.n0 = this.F == 0;
        if (bundle != null) {
            this.k0 = bundle.getInt("android:style", 0);
            this.l0 = bundle.getInt("android:theme", 0);
            this.m0 = bundle.getBoolean("android:cancelable", true);
            this.n0 = bundle.getBoolean("android:showsDialog", this.n0);
            this.o0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        Dialog dialog = this.q0;
        if (dialog != null) {
            this.r0 = true;
            dialog.setOnDismissListener(null);
            this.q0.dismiss();
            if (!this.s0) {
                onDismiss(this.q0);
            }
            this.q0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void z3() {
        super.z3();
        if (!this.t0 && !this.s0) {
            this.s0 = true;
        }
    }
}
