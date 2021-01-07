package defpackage;

import com.spotify.music.settings.SettingsState;
import io.reactivex.functions.l;

/* renamed from: ld9  reason: default package */
public final /* synthetic */ class ld9 implements l {
    public static final /* synthetic */ ld9 a = new ld9();

    private /* synthetic */ ld9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).offlineMode());
    }
}
