package defpackage;

import com.spotify.music.settings.SettingsState;
import io.reactivex.functions.l;

/* renamed from: ka9  reason: default package */
public final /* synthetic */ class ka9 implements l {
    public static final /* synthetic */ ka9 a = new ka9();

    private /* synthetic */ ka9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).showUnavailableTracks());
    }
}
