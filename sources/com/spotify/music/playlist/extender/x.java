package com.spotify.music.playlist.extender;

import android.app.Activity;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.Events;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.TrackRowPlaylistExtender;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.extender.v;
import com.spotify.remoteconfig.z9;

/* access modifiers changed from: package-private */
public class x {
    private final wlf<Activity> a;
    private final wlf<c> b;
    private final wlf<Integer> c;
    private final wlf<b42> d;
    private final wlf<ComponentFactory<Component<TrackRowPlaylistExtender.Model, Events>, ComponentConfiguration>> e;
    private final wlf<z9> f;

    x(wlf<Activity> wlf, wlf<c> wlf2, wlf<Integer> wlf3, wlf<b42> wlf4, wlf<ComponentFactory<Component<TrackRowPlaylistExtender.Model, Events>, ComponentConfiguration>> wlf5, wlf<z9> wlf6) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    /* access modifiers changed from: package-private */
    public w b(boolean z, v.b bVar) {
        Activity activity = this.a.get();
        a(activity, 1);
        Activity activity2 = activity;
        c cVar = this.b.get();
        a(cVar, 2);
        c cVar2 = cVar;
        Integer num = this.c.get();
        a(num, 3);
        int intValue = num.intValue();
        b42 b42 = this.d.get();
        a(b42, 4);
        b42 b422 = b42;
        ComponentFactory<Component<TrackRowPlaylistExtender.Model, Events>, ComponentConfiguration> componentFactory = this.e.get();
        a(componentFactory, 5);
        ComponentFactory<Component<TrackRowPlaylistExtender.Model, Events>, ComponentConfiguration> componentFactory2 = componentFactory;
        z9 z9Var = this.f.get();
        a(z9Var, 6);
        a(bVar, 8);
        return new w(activity2, cVar2, intValue, b422, componentFactory2, z9Var, z, bVar);
    }
}
