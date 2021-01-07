package defpackage;

import android.app.Activity;
import android.view.View;
import com.spotify.music.libs.voice.VoiceSourceElement;
import com.spotify.music.libs.voice.b;

/* renamed from: vab  reason: default package */
public class vab {
    private final b a;

    public vab(b bVar) {
        this.a = bVar;
    }

    public /* synthetic */ void a(Runnable runnable, Activity activity, View view) {
        view.setEnabled(false);
        runnable.run();
        this.a.b(activity, VoiceSourceElement.SEARCH_MIC_BUTTON, kfd.f1);
        view.setEnabled(true);
    }
}
