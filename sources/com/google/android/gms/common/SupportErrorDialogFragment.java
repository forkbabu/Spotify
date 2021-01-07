package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.o;
import com.google.android.exoplayer2.util.g;

public class SupportErrorDialogFragment extends DialogFragment {
    private Dialog u0;
    private DialogInterface.OnCancelListener v0;
    private Dialog w0;

    public static SupportErrorDialogFragment a5(@RecentlyNonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        g.k(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.u0 = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.v0 = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        Dialog dialog = this.u0;
        if (dialog != null) {
            return dialog;
        }
        U4(false);
        if (this.w0 == null) {
            this.w0 = new AlertDialog.Builder(B2()).create();
        }
        return this.w0;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void Y4(@RecentlyNonNull o oVar, String str) {
        super.Y4(oVar, str);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.v0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
