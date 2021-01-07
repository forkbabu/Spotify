package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: gq4  reason: default package */
public class gq4 {
    private final InteractionLogger a;
    private boolean b;

    gq4(InteractionLogger interactionLogger) {
        this.a = interactionLogger;
    }

    public void a(float f) {
        if (!this.b) {
            this.b = true;
            InteractionLogger interactionLogger = this.a;
            interactionLogger.e("", ViewUris.z1 + ":volume:" + f, "com.spotify.feature.gaia", "device-picker", -1, InteractionLogger.InteractionType.DRAG_SLIDER, "change-volume");
        }
    }
}
