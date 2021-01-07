package com.spotify.superbird.pitstop.accessoryconnectivity;

import com.spotify.superbird.pitstop.accessoryconnectivity.AccessoryConnectivityEvent;
import io.reactivex.l;
import kotlin.f;
import kotlin.jvm.internal.h;

public class a {
    private final io.reactivex.disposables.a a = new io.reactivex.disposables.a();
    private String b;
    private final String c;
    private final dpe d;
    private final cqe e;
    private final l<String> f;

    /* renamed from: com.spotify.superbird.pitstop.accessoryconnectivity.a$a  reason: collision with other inner class name */
    static final class C0389a<T, R> implements io.reactivex.functions.l<String, f> {
        final /* synthetic */ a a;

        C0389a(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public f apply(String str) {
            String str2 = str;
            h.e(str2, "it");
            this.a.b = str2;
            this.a.d.a(str2, new AccessoryConnectivityEvent(AccessoryConnectivityEvent.Event.CONNECTED, this.a.c, this.a.e.d()));
            return f.a;
        }
    }

    public a(String str, dpe dpe, cqe cqe, l<String> lVar) {
        h.e(str, "userAgent");
        h.e(dpe, "pitstopLogger");
        h.e(cqe, "clock");
        h.e(lVar, "superbirdSerial");
        this.c = str;
        this.d = dpe;
        this.e = cqe;
        this.f = lVar;
    }

    public void e() {
        this.a.b(this.f.l(new C0389a(this)).subscribe());
    }

    public void f() {
        String str = this.b;
        if (str != null) {
            this.d.a(str, new AccessoryConnectivityEvent(AccessoryConnectivityEvent.Event.DISCONNECTED, this.c, this.e.d()));
        }
        this.b = null;
        this.a.f();
    }
}
