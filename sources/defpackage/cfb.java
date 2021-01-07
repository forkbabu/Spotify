package defpackage;

import com.spotify.music.settings.SettingsState;
import io.reactivex.functions.g;

/* renamed from: cfb  reason: default package */
public final /* synthetic */ class cfb implements g {
    public final /* synthetic */ qfb a;

    public /* synthetic */ cfb(qfb qfb) {
        this.a = qfb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        qfb.b(this.a, (SettingsState) obj);
    }
}
