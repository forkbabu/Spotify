package com.spotify.libs.connect.providers;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.rxjava2.p;
import defpackage.ru0;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

public final class RemoteActiveDeviceLoggingIdProviderImpl implements v, ru0.a {
    private final io.reactivex.subjects.a<Optional<String>> a;
    private final p b = new p();
    private final h c;

    static final class a<T, R> implements l<Optional<GaiaDevice>, Optional<String>> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Optional<String> apply(Optional<GaiaDevice> optional) {
            Optional<GaiaDevice> optional2 = optional;
            h.e(optional2, "it");
            if (optional2.isPresent()) {
                GaiaDevice gaiaDevice = optional2.get();
                h.d(gaiaDevice, "it.get()");
                if (!gaiaDevice.isSelf()) {
                    GaiaDevice gaiaDevice2 = optional2.get();
                    h.d(gaiaDevice2, "it.get()");
                    return Optional.of(gaiaDevice2.getLoggingIdentifier());
                }
            }
            return Optional.absent();
        }
    }

    public RemoteActiveDeviceLoggingIdProviderImpl(h hVar) {
        h.e(hVar, "activeDeviceProvider");
        this.c = hVar;
        io.reactivex.subjects.a<Optional<String>> h1 = io.reactivex.subjects.a.h1();
        h.d(h1, "BehaviorSubject.create()");
        this.a = h1;
    }

    @Override // com.spotify.libs.connect.providers.v
    public String b() {
        Optional<String> j1 = this.a.j1();
        if (j1 != null) {
            return j1.orNull();
        }
        return null;
    }

    @Override // defpackage.ru0.a
    public void onStart() {
        this.b.b(this.c.a().j0(a.a).subscribe(new w(new RemoteActiveDeviceLoggingIdProviderImpl$onStart$2(this.a))));
    }

    @Override // defpackage.ru0.a
    public void onStop() {
        this.b.a();
    }
}
