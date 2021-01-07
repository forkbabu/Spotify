package defpackage;

import com.spotify.mobius.h;
import com.spotify.voice.external.experience.domain.model.b;
import com.spotify.voice.external.experience.domain.model.c;

/* access modifiers changed from: package-private */
/* renamed from: ydf  reason: default package */
public class ydf implements h<b> {
    final /* synthetic */ zdf a;

    ydf(zdf zdf) {
        this.a = zdf;
    }

    @Override // com.spotify.mobius.h, defpackage.da2
    public void accept(Object obj) {
        b bVar = (b) obj;
        synchronized (this.a.a) {
            c h = bVar.h();
            h.getClass();
            if (!(h instanceof c.e)) {
                zdf zdf = this.a;
                c h2 = bVar.h();
                h2.getClass();
                zdf.h = h2 instanceof c.f;
            }
            zdf zdf2 = this.a;
            if (zdf2.h) {
                zdf2.i();
            }
        }
    }

    @Override // com.spotify.mobius.h, defpackage.w92
    public void dispose() {
        this.a.e();
    }
}
