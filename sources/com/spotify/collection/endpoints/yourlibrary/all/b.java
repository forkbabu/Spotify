package com.spotify.collection.endpoints.yourlibrary.all;

import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponse;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class b {
    private final a a;

    public b(a aVar) {
        h.e(aVar, "cosmosService");
        this.a = aVar;
    }

    public s<YourLibraryResponseProto$YourLibraryResponse> a(YourLibraryEndpointConfiguration yourLibraryEndpointConfiguration) {
        h.e(yourLibraryEndpointConfiguration, "configuration");
        return this.a.a(yourLibraryEndpointConfiguration.c(), yourLibraryEndpointConfiguration.a(), yourLibraryEndpointConfiguration.b());
    }
}
