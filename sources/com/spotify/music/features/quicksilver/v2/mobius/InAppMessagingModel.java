package com.spotify.music.features.quicksilver.v2.mobius;

import com.google.common.collect.ImmutableMap;
import com.spotify.inappmessaging.TriggerType;
import com.spotify.music.features.quicksilver.v2.mobius.AutoValue_InAppMessagingModel;
import com.spotify.music.features.quicksilver.v2.mobius.i;
import java.io.Serializable;

public abstract class InAppMessagingModel implements Serializable {
    public static final InAppMessagingModel a;
    private static final long serialVersionUID = 123459875;

    public interface a {
    }

    static {
        AutoValue_InAppMessagingModel.b bVar = new AutoValue_InAppMessagingModel.b();
        bVar.e(false);
        bVar.a(false);
        bVar.c(false);
        bVar.b(ImmutableMap.of());
        bVar.f(new i.a());
        a = bVar.d();
    }

    public abstract boolean a();

    public abstract ImmutableMap<TriggerType, String> b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract i e();

    public boolean f() {
        if (!d() && !a() && !c()) {
            i e = e();
            e.getClass();
            if (!(e instanceof i.b)) {
                return true;
            }
        }
        return false;
    }

    public abstract a g();
}
