package defpackage;

import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$PackageState;
import com.spotify.superbird.ota.model.f;
import io.reactivex.functions.l;

/* renamed from: kg2  reason: default package */
public final /* synthetic */ class kg2 implements l {
    public static final /* synthetic */ kg2 a = new kg2();

    private /* synthetic */ kg2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        f fVar = (f) obj;
        int i = lg2.h;
        return OtaAppProtocol$PackageState.create(fVar.e(), fVar.c(), fVar.f(), fVar.b(), fVar.d());
    }
}
