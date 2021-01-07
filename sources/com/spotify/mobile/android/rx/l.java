package com.spotify.mobile.android.rx;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.Map;

class l implements w<Optional<Map<String, String>>, Map<String, String>> {
    l() {
    }

    @Override // io.reactivex.w
    public v<Map<String, String>> apply(s<Optional<Map<String, String>>> sVar) {
        return sVar.y0(ImmutableMap.of(), b.a).C0(1);
    }
}
