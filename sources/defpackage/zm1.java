package defpackage;

import com.spotify.music.features.connect.discovery.DiscoveredDeviceConnectionStatus;
import io.reactivex.functions.g;

/* renamed from: zm1  reason: default package */
public final /* synthetic */ class zm1 implements g {
    public final /* synthetic */ pn1 a;

    public /* synthetic */ zm1(pn1 pn1) {
        this.a = pn1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        pn1.l(this.a, (DiscoveredDeviceConnectionStatus) obj);
    }
}
