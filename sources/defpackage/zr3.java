package defpackage;

import com.spotify.music.features.ads.model.AdSlotEvent;
import com.spotify.music.features.ads.model.Format;
import io.reactivex.functions.a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.s;

/* renamed from: zr3  reason: default package */
public class zr3 {
    private final s<AdSlotEvent> a;
    private final s<AdSlotEvent> b;
    private final s<AdSlotEvent> c;
    private final s<AdSlotEvent> d;
    private final s<AdSlotEvent> e;
    private final s<AdSlotEvent> f;

    public zr3(rs3 rs3, ql3 ql3) {
        qr3 qr3 = qr3.a;
        Format format = Format.AUDIO;
        s<AdSlotEvent> a2 = ql3.a(format.getName());
        pr3 pr3 = new pr3(format);
        a aVar = Functions.c;
        s<AdSlotEvent> z0 = a2.M(pr3, aVar).N(qr3).z0();
        this.a = z0;
        Format format2 = Format.VIDEO;
        s<AdSlotEvent> z02 = ql3.a(format2.getName()).M(new pr3(format2), aVar).N(qr3).z0();
        this.b = z02;
        this.c = s.k0(z0, z02).z0();
        this.e = rs3.a().N(qr3).z0();
        this.d = rs3.c().N(qr3).z0();
        this.f = rs3.b().N(qr3).z0();
    }

    public s<AdSlotEvent> a() {
        return this.c;
    }

    public s<AdSlotEvent> b() {
        return this.e;
    }

    public s<AdSlotEvent> c() {
        return this.d;
    }

    public s<AdSlotEvent> d() {
        return this.f;
    }
}
