package defpackage;

import com.spotify.music.settings.SettingsState;
import io.reactivex.functions.l;

/* renamed from: a16  reason: default package */
public final /* synthetic */ class a16 implements l {
    public static final /* synthetic */ a16 a = new a16();

    private /* synthetic */ a16() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).showUnavailableTracks());
    }
}
