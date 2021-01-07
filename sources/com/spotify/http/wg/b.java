package com.spotify.http.wg;

import com.google.common.base.Optional;
import okhttp3.a0;

public class b {
    private Optional<String> a = Optional.absent();

    public boolean a(a0 a0Var) {
        if (!a0Var.f()) {
            return false;
        }
        String k = a0Var.k().k();
        if ("spclient.wg.spotify.com".equals(k) || "exp.wg.spotify.com".equals(k) || "wgint.spotify.net".equals(k) || "image-upload.spotify.com".equals(k) || "share-destination-admin.spotify.com".equals(k)) {
            return true;
        }
        if (!this.a.isPresent() || !this.a.or((Optional<String>) "").equalsIgnoreCase(k)) {
            return false;
        }
        return true;
    }

    public void b(String str) {
        this.a = Optional.of(str);
    }
}
