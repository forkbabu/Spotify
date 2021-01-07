package defpackage;

import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesResponse;
import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesResponseItem;
import com.spotify.superbird.ota.model.g;
import com.spotify.superbird.ota.model.h;
import io.reactivex.functions.l;
import java.util.ArrayList;

/* renamed from: bg2  reason: default package */
public final /* synthetic */ class bg2 implements l {
    public static final /* synthetic */ bg2 a = new bg2();

    private /* synthetic */ bg2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        h hVar = (h) obj;
        ArrayList arrayList = new ArrayList(hVar.d().size());
        for (g gVar : hVar.d()) {
            arrayList.add(OtaAppProtocol$CheckForUpdatesResponseItem.create(gVar.version(), gVar.packageName(), gVar.hash(), gVar.url(), gVar.critical(), gVar.sizeBytes(), hVar.b()));
        }
        return OtaAppProtocol$CheckForUpdatesResponse.create(arrayList);
    }
}
