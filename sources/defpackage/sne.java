package defpackage;

import com.spotify.music.settings.SettingsState;
import io.reactivex.functions.l;

/* renamed from: sne  reason: default package */
public final /* synthetic */ class sne implements l {
    public static final /* synthetic */ sne a = new sne();

    private /* synthetic */ sne() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).downloadOver3g());
    }
}
