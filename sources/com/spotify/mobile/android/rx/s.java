package com.spotify.mobile.android.rx;

import com.google.common.base.Optional;
import io.reactivex.w;
import java.util.Map;

/* access modifiers changed from: package-private */
public class s {
    private final w<Optional<Map<String, String>>, Map<String, String>> a;
    private final u b;

    public s(u uVar, w<Optional<Map<String, String>>, Map<String, String>> wVar) {
        this.a = wVar;
        this.b = uVar;
    }

    public io.reactivex.s<Map<String, String>> a() {
        return this.b.b().j0(c.a).s0((R) Optional.absent()).q(this.a);
    }
}
