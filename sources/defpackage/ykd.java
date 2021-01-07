package defpackage;

import com.spotify.music.settings.SettingsState;
import io.reactivex.functions.l;

/* renamed from: ykd  reason: default package */
public final /* synthetic */ class ykd implements l {
    public static final /* synthetic */ ykd a = new ykd();

    private /* synthetic */ ykd() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).downloadOver3g());
    }
}
