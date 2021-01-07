package defpackage;

import com.spotify.music.settings.SettingsState;
import io.reactivex.functions.l;

/* renamed from: bf9  reason: default package */
public final /* synthetic */ class bf9 implements l {
    public static final /* synthetic */ bf9 a = new bf9();

    private /* synthetic */ bf9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).showUnavailableTracks());
    }
}
