package com.spotify.eventsender;

import com.google.common.base.Function;
import com.google.common.hash.Hashing;

public final /* synthetic */ class g implements Function {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return Hashing.murmur3_128().hashUnencodedChars((String) obj).toString();
    }
}
