package defpackage;

import com.spotify.player.model.ContextTrack;
import defpackage.ifd;
import kotlin.jvm.internal.h;

/* renamed from: us5  reason: default package */
public final class us5 implements fjf<String> {
    private final wlf<ifd.b> a;

    public us5(wlf<ifd.b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ifd.b bVar = this.a.get();
        h.e(bVar, ContextTrack.Metadata.KEY_PROVIDER);
        ifd z1 = bVar.z1();
        h.d(z1, "provider.featureIdentifier");
        String name = z1.getName();
        yif.g(name, "Cannot return null from a non-@Nullable @Provides method");
        return name;
    }
}
