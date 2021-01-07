package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableCommandModel;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: pe3  reason: default package */
public class pe3 implements w<b91, b91> {
    private static final k91 c = new k91(me3.a);
    private final g<PlayerState> a;
    private final String b;

    public pe3(g<PlayerState> gVar, String str) {
        this.a = gVar;
        this.b = str;
    }

    private static s81 a(s81 s81, boolean z) {
        if (z) {
            Map<String, ? extends o81> events = s81.events();
            o81 c2 = HubsImmutableCommandModel.builder().e(ContextTrack.TrackAction.PAUSE).c();
            HashMap hashMap = new HashMap(events.size());
            hashMap.put("click", c2);
            hashMap.put("shuffleClickOriginal", (o81) events.get("click"));
            b(hashMap, events);
            return s81.toBuilder().q(hashMap).l();
        }
        Map<String, ? extends o81> events2 = s81.events();
        o81 o81 = (o81) events2.get("shuffleClickOriginal");
        if (o81 == null) {
            return s81;
        }
        HashMap hashMap2 = new HashMap(events2.size());
        hashMap2.put("click", o81);
        b(hashMap2, events2);
        return s81.toBuilder().q(hashMap2).l();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, o81> */
    /* JADX WARN: Multi-variable type inference failed */
    private static void b(Map<String, o81> map, Map<String, ? extends o81> map2) {
        for (Map.Entry<String, ? extends o81> entry : map2.entrySet()) {
            String key = entry.getKey();
            if (!key.equals("click")) {
                map.put(key, entry.getValue());
            }
        }
    }

    private static b91 c(b91 b91, String str) {
        s81 header = b91.header();
        if (header == null) {
            return c.b(b91);
        }
        List<? extends s81> children = header.children();
        ArrayList arrayList = new ArrayList(children.size());
        for (s81 s81 : children) {
            if (d(s81)) {
                arrayList.add(a(s81.toBuilder().z(z81.h().a(str).build()).l(), str.equals("PAUSE")));
            } else {
                arrayList.add(s81);
            }
        }
        return b91.toBuilder().j(header.toBuilder().m(arrayList).l()).g();
    }

    private static boolean d(s81 s81) {
        String id = s81.componentId().id();
        return id.equals(HubsGlueComponent.SHUFFLE_BUTTON.id()) || id.equals("button:fixedSizeShuffleButton");
    }

    static /* synthetic */ s81 f(s81 s81) {
        if (!d(s81)) {
            return s81;
        }
        String str = s81.text().title().equals("PAUSE") ? "SHUFFLE PLAY" : "PAUSE";
        return a(s81.toBuilder().z(z81.h().a(str).build()).l(), str.equals("PAUSE"));
    }

    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        s<b91> E = sVar.E();
        g<PlayerState> gVar = this.a;
        gVar.getClass();
        return s.n(E, new io.reactivex.internal.operators.observable.v(gVar).E(), new le3(this)).E();
    }

    public /* synthetic */ b91 e(b91 b91, PlayerState playerState) {
        if (!this.b.equals(playerState.contextUri())) {
            return b91;
        }
        boolean isPlaying = playerState.isPlaying();
        boolean isPaused = playerState.isPaused();
        if (!isPlaying || isPaused) {
            return isPaused ? c(b91, "SHUFFLE PLAY") : b91;
        }
        return c(b91, "PAUSE");
    }
}
