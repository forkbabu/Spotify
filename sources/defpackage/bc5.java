package defpackage;

import android.media.AudioManager;
import com.spotify.music.libs.fullscreen.story.domain.a;

/* access modifiers changed from: package-private */
/* renamed from: bc5  reason: default package */
public class bc5 {
    private final AudioManager a;

    public bc5(AudioManager audioManager) {
        this.a = audioManager;
    }

    public void a(a aVar) {
        if (aVar instanceof a.b) {
            this.a.requestAudioFocus(null, 3, 2);
        } else if (aVar instanceof a.C0287a) {
            this.a.abandonAudioFocus(null);
        } else {
            throw new IllegalStateException("Unknown AudioFocus state: " + aVar);
        }
    }
}
