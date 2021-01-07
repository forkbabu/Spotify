package defpackage;

import com.spotify.music.settings.SettingsState;
import io.reactivex.functions.l;

/* renamed from: xv4  reason: default package */
public final /* synthetic */ class xv4 implements l {
    public static final /* synthetic */ xv4 a = new xv4();

    private /* synthetic */ xv4() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Integer.valueOf(((SettingsState) obj).streamQuality());
    }
}
