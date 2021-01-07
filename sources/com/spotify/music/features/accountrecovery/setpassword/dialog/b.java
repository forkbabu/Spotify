package com.spotify.music.features.accountrecovery.setpassword.dialog;

import com.spotify.magiclink.MagiclinkBottomSheetDialog;
import com.spotify.magiclink.s;

public class b {
    private final s a;

    public b(s sVar) {
        this.a = sVar;
    }

    public void a(a aVar) {
        if (this.a.d()) {
            String a2 = this.a.a();
            this.a.b();
            SetPasswordHeadlessFragment setPasswordHeadlessFragment = (SetPasswordHeadlessFragment) aVar;
            MagiclinkBottomSheetDialog.c5(setPasswordHeadlessFragment.E2(), a2, setPasswordHeadlessFragment);
        }
    }
}
