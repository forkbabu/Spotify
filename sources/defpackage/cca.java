package defpackage;

import com.spotify.music.settings.SettingsState;
import io.reactivex.functions.l;

/* renamed from: cca  reason: default package */
public final /* synthetic */ class cca implements l {
    public static final /* synthetic */ cca a = new cca();

    private /* synthetic */ cca() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).localDevicesOnly());
    }
}
