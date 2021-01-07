package defpackage;

import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryPinProto$PinRequest;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryPinProto$PinResponse;
import io.reactivex.s;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: gi0  reason: default package */
public final class gi0 implements ei0 {
    private final di0 a;

    public gi0(di0 di0) {
        h.e(di0, "cosmosService");
        this.a = di0;
    }

    @Override // defpackage.ei0
    public s<YourLibraryPinProto$PinResponse> a(fi0 fi0) {
        h.e(fi0, "configuration");
        di0 di0 = this.a;
        String b = fi0.b();
        YourLibraryPinProto$PinRequest a2 = fi0.a();
        h.d(a2, "configuration.request");
        return di0.c(b, a2);
    }

    @Override // defpackage.ei0
    public z<YourLibraryPinProto$PinResponse> b(fi0 fi0) {
        h.e(fi0, "configuration");
        di0 di0 = this.a;
        String b = fi0.b();
        YourLibraryPinProto$PinRequest a2 = fi0.a();
        h.d(a2, "configuration.request");
        return di0.a(b, a2);
    }

    @Override // defpackage.ei0
    public z<YourLibraryPinProto$PinResponse> c(fi0 fi0) {
        h.e(fi0, "configuration");
        di0 di0 = this.a;
        String b = fi0.b();
        YourLibraryPinProto$PinRequest a2 = fi0.a();
        h.d(a2, "configuration.request");
        return di0.b(b, a2);
    }
}
