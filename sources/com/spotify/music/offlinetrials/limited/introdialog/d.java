package com.spotify.music.offlinetrials.limited.introdialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.slate.model.u;

public final /* synthetic */ class d implements b3d {
    public final /* synthetic */ LimitedOfflineSlateDialogActivity a;

    public /* synthetic */ d(LimitedOfflineSlateDialogActivity limitedOfflineSlateDialogActivity) {
        this.a = limitedOfflineSlateDialogActivity;
    }

    @Override // defpackage.b3d
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LimitedOfflineSlateDialogActivity limitedOfflineSlateDialogActivity = this.a;
        limitedOfflineSlateDialogActivity.getClass();
        View inflate = layoutInflater.inflate(C0707R.layout.slate_modal_dismiss, viewGroup, false);
        u.b(C0707R.string.user_mix_intro_dialog_button_cancel).a((TextView) inflate.findViewById(C0707R.id.negative_action));
        inflate.setOnClickListener(new e(limitedOfflineSlateDialogActivity));
        return inflate;
    }
}
