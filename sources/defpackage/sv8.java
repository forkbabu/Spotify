package defpackage;

import com.spotify.music.settings.SettingsState;
import io.reactivex.functions.g;

/* renamed from: sv8  reason: default package */
public final /* synthetic */ class sv8 implements g {
    public final /* synthetic */ wv8 a;

    public /* synthetic */ sv8(wv8 wv8) {
        this.a = wv8;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        wv8.b(this.a, (SettingsState) obj);
    }
}
