package defpackage;

import android.graphics.drawable.Drawable;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import kotlin.jvm.internal.h;

/* renamed from: as2  reason: default package */
public final class as2 implements cs2 {
    private final m71 a;

    public as2(m71 m71) {
        h.e(m71, "iconCache");
        this.a = m71;
    }

    @Override // defpackage.cs2
    public Drawable a(String str) {
        Drawable b = this.a.b(str, HubsGlueImageConfig.CARD);
        h.d(b, "iconCache.getPlaceholder…HubsGlueImageConfig.CARD)");
        return b;
    }
}
