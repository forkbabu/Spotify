package com.spotify.debugdialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.spotify.music.C0707R;

public class ParametersFragment extends DialogFragment {
    private int u0;
    private LinearLayout.LayoutParams v0;

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        M4();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        Dialog R4 = super.R4(bundle);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(R4.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        R4.show();
        R4.getWindow().setAttributes(layoutParams);
        return R4;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.u0 = nud.g(8.0f, R2());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.u0 * 6);
        this.v0 = layoutParams;
        int i = this.u0;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i;
        layoutParams.rightMargin = i;
        layoutParams.bottomMargin = i;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.parameters_dialog, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C0707R.id.title);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0707R.id.content);
        throw null;
    }
}
