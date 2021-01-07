package com.spotify.voice.experiments.experience.view;

import android.os.Handler;
import com.spotify.voice.experiments.experience.view.listening.ListeningView;
import com.spotify.voice.experiments.experience.view.listening.b;

public class e1 {
    private final ListeningView a;

    public e1(ListeningView listeningView) {
        this.a = listeningView;
    }

    public void a(float f) {
        ListeningView listeningView = this.a;
        Handler handler = listeningView.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new b(listeningView, f));
        }
    }
}
