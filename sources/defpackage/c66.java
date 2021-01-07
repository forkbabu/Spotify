package defpackage;

import com.spotify.music.settings.SettingsState;
import io.reactivex.functions.l;

/* renamed from: c66  reason: default package */
public final /* synthetic */ class c66 implements l {
    public static final /* synthetic */ c66 a = new c66();

    private /* synthetic */ c66() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).showUnavailableTracks());
    }
}
