package defpackage;

import com.spotify.music.features.partneraccountlinking.clientprovider.samsung.SamsungLinkingRequest;
import com.spotify.music.features.partneraccountlinking.clientprovider.samsung.h;
import io.reactivex.functions.l;

/* renamed from: mv5  reason: default package */
public final /* synthetic */ class mv5 implements l {
    public final /* synthetic */ h a;

    public /* synthetic */ mv5(h hVar) {
        this.a = hVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b((SamsungLinkingRequest) obj);
    }
}
