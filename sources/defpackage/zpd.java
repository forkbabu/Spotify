package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.android.flags.c;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.podcast.download.f0;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.g;
import com.spotify.music.yourlibrary.interfaces.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: zpd  reason: default package */
public class zpd {
    private final ImmutableSet<h> a;
    private final ImmutableMap<YourLibraryPageId, g> b;
    private final c c;
    private ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> d;

    public zpd(Set<h> set, c cVar) {
        ImmutableSet<h> copyOf = ImmutableSet.copyOf((Collection) set);
        this.a = copyOf;
        this.c = cVar;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        UnmodifiableIterator<h> it = copyOf.iterator();
        while (it.hasNext()) {
            UnmodifiableListIterator<g> listIterator = it.next().a().listIterator();
            while (listIterator.hasNext()) {
                g next = listIterator.next();
                builder.mo51put(next.b(), next);
            }
        }
        this.b = builder.build();
    }

    public ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> a() {
        if (this.d == null) {
            ImmutableSortedMap.Builder naturalOrder = ImmutableSortedMap.naturalOrder();
            YourLibraryPageGroup yourLibraryPageGroup = YourLibraryPageGroup.MUSIC;
            int i = ImmutableList.a;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.mo53add((ImmutableList.Builder) YourLibraryPageId.MUSIC_PLAYLISTS);
            builder.mo53add((ImmutableList.Builder) YourLibraryPageId.MUSIC_ARTISTS);
            builder.mo53add((ImmutableList.Builder) YourLibraryPageId.MUSIC_ALBUMS);
            naturalOrder.mo51put((ImmutableSortedMap.Builder) yourLibraryPageGroup, (YourLibraryPageGroup) builder.build());
            if (f0.b(this.c)) {
                YourLibraryPageGroup yourLibraryPageGroup2 = YourLibraryPageGroup.PODCAST;
                ImmutableList.Builder builder2 = new ImmutableList.Builder();
                builder2.mo53add((ImmutableList.Builder) YourLibraryPageId.PODCAST_EPISODES);
                builder2.mo53add((ImmutableList.Builder) YourLibraryPageId.PODCAST_DOWNLOADS);
                builder2.mo53add((ImmutableList.Builder) YourLibraryPageId.PODCAST_FOLLOWED);
                naturalOrder.mo51put((ImmutableSortedMap.Builder) yourLibraryPageGroup2, (YourLibraryPageGroup) builder2.build());
            }
            ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> build = naturalOrder.build();
            ArrayList arrayList = new ArrayList();
            UnmodifiableIterator<h> it = this.a.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().a());
            }
            UnmodifiableIterator<Map.Entry<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>>> it2 = build.mo54entrySet().iterator();
            while (it2.hasNext()) {
                UnmodifiableListIterator<YourLibraryPageId> listIterator = it2.next().getValue().listIterator();
                while (listIterator.hasNext()) {
                    YourLibraryPageId next = listIterator.next();
                    if (!Collections2.removeIf(arrayList, new ypd(next))) {
                        StringBuilder V0 = je.V0("No provider for page id ");
                        V0.append(next.g());
                        V0.append(" add it in YourLibraryPageSetup.getConfiguration()");
                        Assertion.p(V0.toString());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Logger.b("The following page provider IDs %s does not have a mapping.", Collections2.transform((Iterable) arrayList, (Function) wpd.a));
            }
            this.d = build;
        }
        return this.d;
    }

    public YourLibraryPageGroup b(YourLibraryPageId yourLibraryPageId) {
        ImmutableSet<Map.Entry<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>>> entrySet = this.d.mo54entrySet();
        return (YourLibraryPageGroup) ((Map.Entry) Collections2.find(entrySet.iterator(), new xpd(yourLibraryPageId))).getKey();
    }

    public g c(YourLibraryPageId yourLibraryPageId) {
        g gVar = this.b.get(yourLibraryPageId);
        if (gVar == null) {
            StringBuilder V0 = je.V0("No page provider with page id ");
            V0.append(yourLibraryPageId.g());
            Assertion.p(V0.toString());
        }
        return gVar;
    }
}
