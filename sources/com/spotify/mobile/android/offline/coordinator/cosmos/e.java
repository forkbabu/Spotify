package com.spotify.mobile.android.offline.coordinator.cosmos;

import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$IdentifyCommand;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$PluginCommand;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$PluginInit;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$RemoveCommand;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePluginResourceType$ResourceType;
import com.spotify.playlist.models.Episode;
import com.spotify.podcast.endpoints.l;
import io.reactivex.y;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class e {
    private final f a;
    private final l b;
    private final y c;
    private io.reactivex.disposables.b d;
    private a e;

    public interface a {
    }

    static class b {
        OfflinePlugin$PluginCommand a;
        Collection<Episode> b;

        b(OfflinePlugin$PluginCommand offlinePlugin$PluginCommand, Collection<Episode> collection) {
            this.a = offlinePlugin$PluginCommand;
            this.b = collection;
        }
    }

    public e(f fVar, l lVar, y yVar) {
        this.a = fVar;
        this.b = lVar;
        this.c = yVar;
    }

    private static List<String> b(OfflinePlugin$PluginCommand offlinePlugin$PluginCommand) {
        ArrayList arrayList = new ArrayList(0);
        if (offlinePlugin$PluginCommand.h() == OfflinePlugin$PluginCommand.CommandCase.IDENTIFY) {
            for (OfflinePlugin$IdentifyCommand.Query query : offlinePlugin$PluginCommand.l().i()) {
                arrayList.add(query.h());
            }
        } else if (offlinePlugin$PluginCommand.h() == OfflinePlugin$PluginCommand.CommandCase.REMOVE) {
            for (OfflinePlugin$RemoveCommand.Query query2 : offlinePlugin$PluginCommand.m().i()) {
                arrayList.add(query2.h());
            }
        }
        return arrayList;
    }

    public static z c(e eVar, OfflinePlugin$PluginCommand offlinePlugin$PluginCommand) {
        eVar.getClass();
        Collection arrayList = new ArrayList(0);
        OfflinePlugin$PluginCommand.CommandCase h = offlinePlugin$PluginCommand.h();
        if (h == OfflinePlugin$PluginCommand.CommandCase.IDENTIFY) {
            arrayList = b(offlinePlugin$PluginCommand);
        } else if (h == OfflinePlugin$PluginCommand.CommandCase.DOWNLOAD) {
            arrayList = Collections.singletonList(offlinePlugin$PluginCommand.i().i());
        } else if (h == OfflinePlugin$PluginCommand.CommandCase.REMOVE) {
            arrayList = b(offlinePlugin$PluginCommand);
        } else if (h == OfflinePlugin$PluginCommand.CommandCase.STOP_DOWNLOAD) {
            arrayList = Collections.singletonList(offlinePlugin$PluginCommand.n().i());
        }
        ImmutableList<String> copyOf = ImmutableList.copyOf(arrayList);
        z<Map<String, Episode>> b2 = eVar.b.b(copyOf, new l.a(null, null, null, 7));
        LinkedHashMap linkedHashMap = new LinkedHashMap(copyOf.size());
        for (String str : copyOf) {
            Episode.a a2 = Episode.a();
            a2.f(str);
            a2.F(Episode.MediaType.UNKNOWN);
            linkedHashMap.put(str, a2.build());
        }
        return b2.F(linkedHashMap).A(a.a).A(new d(offlinePlugin$PluginCommand));
    }

    public void a() {
        io.reactivex.disposables.b bVar = this.d;
        if (bVar != null && !bVar.d()) {
            this.d.dispose();
        }
    }

    public void d(b bVar) {
        OfflinePlugin$PluginCommand offlinePlugin$PluginCommand = bVar.a;
        Collection<Episode> collection = bVar.b;
        Logger.b("onCommandReceived: %s %s", offlinePlugin$PluginCommand, collection);
        int ordinal = offlinePlugin$PluginCommand.h().ordinal();
        if (ordinal == 0) {
            ((ua1) this.e).h(collection);
        } else if (ordinal == 1) {
            ((ua1) this.e).g(collection);
        } else if (ordinal == 2) {
            ((ua1) this.e).f(collection);
        } else if (ordinal == 3) {
            ((ua1) this.e).i(collection);
        }
    }

    public void e(a aVar) {
        io.reactivex.disposables.b bVar = this.d;
        if (!(bVar != null && !bVar.d())) {
            this.e = aVar;
            OfflinePlugin$PluginInit.a m = OfflinePlugin$PluginInit.m();
            m.n("betamax-offline");
            m.m("episodes");
            m.o(OfflinePluginResourceType$ResourceType.VIDEO);
            this.d = this.a.a((OfflinePlugin$PluginInit) m.build()).a0(new c(this)).o0(this.c).subscribe(new b(this));
        }
    }
}
