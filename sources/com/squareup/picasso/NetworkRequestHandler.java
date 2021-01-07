package com.squareup.picasso;

import android.net.NetworkInfo;
import android.os.Handler;
import com.adjust.sdk.Constants;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import java.io.IOException;
import okhttp3.a0;
import okhttp3.d;
import okhttp3.d0;
import okhttp3.e0;

/* access modifiers changed from: package-private */
public class NetworkRequestHandler extends a0 {
    private final l a;
    private final d0 b;

    static class ContentLengthException extends IOException {
        ContentLengthException(String str) {
            super(str);
        }
    }

    static final class ResponseException extends IOException {
        final int code;
        final int networkPolicy;

        ResponseException(int i, int i2) {
            super(je.p0("HTTP ", i));
            this.code = i;
            this.networkPolicy = i2;
        }
    }

    NetworkRequestHandler(l lVar, d0 d0Var) {
        this.a = lVar;
        this.b = d0Var;
    }

    @Override // com.squareup.picasso.a0
    public boolean c(y yVar) {
        String scheme = yVar.c.getScheme();
        return "http".equals(scheme) || Constants.SCHEME.equals(scheme);
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.a0
    public int e() {
        return 2;
    }

    @Override // com.squareup.picasso.a0
    public a0.a f(y yVar, int i) {
        d dVar;
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.NETWORK;
        Picasso.LoadedFrom loadedFrom2 = Picasso.LoadedFrom.DISK;
        if (i == 0) {
            dVar = null;
        } else if (NetworkPolicy.d(i)) {
            dVar = d.n;
        } else {
            d.a aVar = new d.a();
            boolean z = true;
            if (!((NetworkPolicy.NO_CACHE.index & i) == 0)) {
                aVar.c();
            }
            if ((i & NetworkPolicy.NO_STORE.index) != 0) {
                z = false;
            }
            if (!z) {
                aVar.d();
            }
            dVar = aVar.a();
        }
        a0.a aVar2 = new a0.a();
        aVar2.j(yVar.c.toString());
        if (dVar != null) {
            aVar2.c(dVar);
        }
        d0 a2 = this.a.a(aVar2.b());
        e0 a3 = a2.a();
        if (a2.p()) {
            Picasso.LoadedFrom loadedFrom3 = a2.d() == null ? loadedFrom : loadedFrom2;
            if (loadedFrom3 == loadedFrom2 && a3.f() == 0) {
                a3.close();
                throw new ContentLengthException("Received response with 0 content-length header.");
            }
            if (loadedFrom3 == loadedFrom && a3.f() > 0) {
                d0 d0Var = this.b;
                long f = a3.f();
                Handler handler = d0Var.c;
                handler.sendMessage(handler.obtainMessage(4, Long.valueOf(f)));
            }
            return new a0.a(a3.l(), loadedFrom3);
        }
        a3.close();
        throw new ResponseException(a2.f(), 0);
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.a0
    public boolean g(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.a0
    public boolean h() {
        return true;
    }
}
