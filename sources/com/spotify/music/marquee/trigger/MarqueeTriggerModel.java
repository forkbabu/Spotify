package com.spotify.music.marquee.trigger;

import com.spotify.music.marquee.trigger.AutoValue_MarqueeTriggerModel;
import java.io.Serializable;

public abstract class MarqueeTriggerModel implements Serializable {
    public static final MarqueeTriggerModel a;
    private static final long serialVersionUID = 1471;

    public interface a {
    }

    static {
        AutoValue_MarqueeTriggerModel.b bVar = new AutoValue_MarqueeTriggerModel.b();
        bVar.b("");
        bVar.c(false);
        a = bVar.a();
    }

    public abstract String a();

    public abstract boolean b();

    public abstract a c();
}
