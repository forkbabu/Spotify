package com.spotify.music.features.yourlibraryx.effecthandlers;

import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryPinProto$PinResponse;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class i<T, R> implements l<YourLibraryPinProto$PinResponse, YourLibraryXEvent.p> {
    public static final i a = new i();

    i() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public YourLibraryXEvent.p apply(YourLibraryPinProto$PinResponse yourLibraryPinProto$PinResponse) {
        YourLibraryPinProto$PinResponse yourLibraryPinProto$PinResponse2 = yourLibraryPinProto$PinResponse;
        h.e(yourLibraryPinProto$PinResponse2, "it");
        return new YourLibraryXEvent.p(YourLibraryXEvent.PinAction.PIN, yourLibraryPinProto$PinResponse2);
    }
}
