package defpackage;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.libs.fullscreen.story.prefetcher.v1.proto.GetAllPlaylistsResponse;
import com.spotify.rxjava2.p;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: gga  reason: default package */
public final class gga implements fga {
    public static final SpSharedPreferences.b<Object, Set<String>> e = SpSharedPreferences.b.c("playlists_with_stories_key");
    private final kga a;
    private final p b = new p();
    private final Set<String> c;
    private final SpSharedPreferences<Object> d;

    public gga(kga kga, SpSharedPreferences<Object> spSharedPreferences) {
        kga.getClass();
        this.a = kga;
        spSharedPreferences.getClass();
        this.d = spSharedPreferences;
        SpSharedPreferences.b<Object, Set<String>> bVar = e;
        Set<String> synchronizedSet = Collections.synchronizedSet(new HashSet());
        synchronizedSet.addAll(spSharedPreferences.o(bVar, new HashSet(0)));
        this.c = synchronizedSet;
    }

    @Override // defpackage.fga
    public boolean a(String str) {
        return this.c.contains(str);
    }

    public void b(GetAllPlaylistsResponse getAllPlaylistsResponse) {
        ImmutableSet set = FluentIterable.from(getAllPlaylistsResponse.h()).transform(ega.a).filter(yfa.a).transform(wfa.a).toSet();
        Set<String> set2 = this.c;
        set2.clear();
        set2.addAll(set);
        SpSharedPreferences.b<Object, Set<String>> bVar = e;
        SpSharedPreferences.a<Object> b2 = this.d.b();
        b2.g(bVar, new HashSet(set));
        b2.i();
    }

    @Override // defpackage.fga
    public void clear() {
        Set<String> set = this.c;
        SpSharedPreferences.b<Object, Set<String>> bVar = e;
        SpSharedPreferences<Object> spSharedPreferences = this.d;
        set.clear();
        SpSharedPreferences.a<Object> b2 = spSharedPreferences.b();
        b2.h(bVar);
        b2.i();
    }

    @Override // defpackage.fga
    public void start() {
        this.b.b(this.a.a().subscribe(new aga(this), zfa.a));
    }

    @Override // defpackage.fga
    public void stop() {
        this.b.a();
    }
}
