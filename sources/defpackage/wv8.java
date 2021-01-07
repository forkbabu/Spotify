package defpackage;

import com.spotify.mobile.android.video.endvideo.o;
import com.spotify.music.settings.SettingsState;
import com.spotify.music.settings.a;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;

/* renamed from: wv8  reason: default package */
public class wv8 implements o {
    private final a a;
    private boolean b;
    private b c = EmptyDisposable.INSTANCE;

    public wv8(a aVar) {
        this.a = aVar;
    }

    public static void b(wv8 wv8, SettingsState settingsState) {
        wv8.getClass();
        wv8.b = settingsState.privateSession();
    }

    public boolean a() {
        return this.b;
    }

    public void c() {
        b bVar = this.c;
        if (bVar != null && !bVar.d()) {
            this.c.dispose();
        }
        this.b = false;
        this.c = this.a.a().subscribe(new sv8(this));
    }

    public void d() {
        b bVar = this.c;
        if (bVar != null && !bVar.d()) {
            this.c.dispose();
        }
    }
}
