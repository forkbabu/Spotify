package com.spotify.music.features.accountrecovery.setpassword.dialog;

import android.content.Context;
import android.os.Bundle;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.magiclink.MagiclinkBottomSheetDialog;
import com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import dagger.android.support.a;

public class SetPasswordHeadlessFragment extends PresentableDialogFragment implements a, MagiclinkBottomSheetDialog.a {
    b j0;
    o0 k0;

    public void M4(int i) {
        if (i == 1) {
            this.k0.a(SpotifyIconV2.CHECK, C0707R.string.set_password_success_toast, 0);
        } else if (i == 2) {
            this.k0.a(SpotifyIconV2.WARNING, C0707R.string.set_password_error_toast, 0);
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.j0.a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (bundle != null) {
            MagiclinkBottomSheetDialog.b5(E2(), this);
        }
    }
}
