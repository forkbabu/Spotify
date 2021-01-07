package com.spotify.music.features.yourlibraryx.effecthandlers;

import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryPinProto$PinResponse;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class f {
    private final ei0 a;
    private final String b;

    public f(ei0 ei0, String str) {
        h.e(ei0, "endpoint");
        h.e(str, "username");
        this.a = ei0;
        this.b = str;
    }

    public final z<YourLibraryPinProto$PinResponse> a(String str) {
        h.e(str, "itemUri");
        return this.a.c(new fi0(this.b, str));
    }

    public final z<YourLibraryPinProto$PinResponse> b(String str) {
        h.e(str, "itemUri");
        return this.a.b(new fi0(this.b, str));
    }
}
