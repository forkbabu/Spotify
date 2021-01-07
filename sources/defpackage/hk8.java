package defpackage;

import android.view.View;
import com.spotify.music.settings.SettingsState;

/* renamed from: hk8  reason: default package */
public interface hk8 extends g90 {
    void B0(CharSequence charSequence);

    void Y1();

    @Override // com.spotify.encore.ViewProvider
    View getView();

    void setEnabled(boolean z);

    void setId(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setTitle(String str);

    void v0(SettingsState settingsState);
}
