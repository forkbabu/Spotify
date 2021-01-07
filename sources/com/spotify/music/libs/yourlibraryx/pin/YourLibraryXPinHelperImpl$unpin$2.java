package com.spotify.music.libs.yourlibraryx.pin;

import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryPinProto$PinResponse;
import io.reactivex.z;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class YourLibraryXPinHelperImpl$unpin$2 extends FunctionReferenceImpl implements nmf<fi0, z<YourLibraryPinProto$PinResponse>> {
    YourLibraryXPinHelperImpl$unpin$2(ei0 ei0) {
        super(1, ei0, ei0.class, "unpinItem", "unpinItem(Lcom/spotify/collection/endpoints/yourlibrary/pin/YourLibraryPinEndpointConfiguration;)Lio/reactivex/Single;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public z<YourLibraryPinProto$PinResponse> invoke(fi0 fi0) {
        fi0 fi02 = fi0;
        h.e(fi02, "p1");
        return ((ei0) this.receiver).b(fi02);
    }
}
