package com.spotify.music.features.connect.cast.discovery;

import android.content.Context;
import com.spotify.music.features.connect.cast.discovery.DiscoveryEvent;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.h;
import io.reactivex.i;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import java.util.HashMap;
import java.util.Map;

public abstract class a implements h, i<DiscoveryEvent> {
    private String a;
    private boolean b;
    private final Map<String, DiscoveredDevice> c = new HashMap();
    private final s<DiscoveryEvent> d = new v(g.p(this, BackpressureStrategy.BUFFER)).v0(1).h1();
    private h<DiscoveryEvent> e;

    public a(Context context, String str) {
        this.a = str;
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public void d() {
        this.b = false;
        for (DiscoveredDevice discoveredDevice : this.c.values()) {
            h<DiscoveryEvent> hVar = this.e;
            if (hVar != null) {
                hVar.onNext(new DiscoveryEvent(DiscoveryEvent.EventType.LOST, discoveredDevice));
            }
        }
        this.c.clear();
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public s<DiscoveryEvent> f() {
        return this.d;
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public void i() {
        this.b = true;
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public boolean j(String str) {
        return this.c.containsKey(str);
    }

    /* access modifiers changed from: protected */
    public void o(DiscoveredDevice discoveredDevice) {
        this.c.put(discoveredDevice.getDeviceId(), discoveredDevice);
        h<DiscoveryEvent> hVar = this.e;
        if (hVar != null) {
            hVar.onNext(new DiscoveryEvent(DiscoveryEvent.EventType.DISCOVER, discoveredDevice));
        }
    }

    /* access modifiers changed from: protected */
    public void p(String str) {
        h<DiscoveryEvent> hVar;
        DiscoveredDevice remove = this.c.remove(str);
        if (remove != null && (hVar = this.e) != null) {
            hVar.onNext(new DiscoveryEvent(DiscoveryEvent.EventType.LOST, remove));
        }
    }

    /* access modifiers changed from: protected */
    public void q(String str, Runnable runnable) {
        if (!this.a.equals(str)) {
            this.a = str;
            if (this.b) {
                d();
                ((com.spotify.music.features.connect.cast.a) runnable).run();
                i();
            }
        }
    }

    @Override // io.reactivex.i
    public void subscribe(h<DiscoveryEvent> hVar) {
        this.e = hVar;
    }
}
