package defpackage;

import android.view.View;
import com.spotify.music.C0707R;
import com.spotify.music.settings.SettingsState;

/* renamed from: ek8  reason: default package */
public class ek8 extends bk8 {
    private boolean n;

    public ek8(View view, x90 x90) {
        super(view, x90);
        c();
    }

    private void c() {
        this.c.setTitle(b().getString(C0707R.string.settings_button_connect_to_facebook));
        getView().setEnabled(!this.n);
    }

    @Override // defpackage.bk8, defpackage.hk8
    public void B0(CharSequence charSequence) {
    }

    @Override // defpackage.bk8, defpackage.hk8
    public void setTitle(String str) {
    }

    @Override // defpackage.hk8
    public void v0(SettingsState settingsState) {
        this.n = settingsState.offlineMode();
        c();
    }
}
