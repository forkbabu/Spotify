package com.spotify.music.share.loadingview;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.spotify.music.C0707R;

public class ShareLoadingDialogFragment extends DialogFragment implements a {
    private DialogInterface.OnCancelListener u0;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        Dialog R4 = super.R4(bundle);
        R4.getWindow().requestFeature(1);
        R4.getWindow().setFlags(1024, 1024);
        R4.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        return R4;
    }

    public void a5(DialogInterface.OnCancelListener onCancelListener) {
        this.u0 = onCancelListener;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.u0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C0707R.layout.story_share_loader_layout, viewGroup, false);
    }
}
