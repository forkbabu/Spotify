package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.spotify.music.yourlibrary.interfaces.LoadingState;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.i;
import defpackage.m19;

/* renamed from: q19  reason: default package */
public abstract class q19 {
    public static final q19 a;

    /* renamed from: q19$a */
    public static abstract class a {
        public abstract q19 a();

        public abstract a b(Optional<YourLibraryPageId> optional);

        public abstract a c(boolean z);

        public abstract a d(ImmutableMap<YourLibraryPageId, LoadingState> immutableMap);

        public abstract a e(ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> immutableSortedMap);

        public abstract a f(i iVar);
    }

    static {
        m19.b bVar = new m19.b();
        bVar.e(ImmutableSortedMap.of());
        bVar.b(Optional.absent());
        bVar.f(i.a);
        bVar.c(false);
        bVar.d(ImmutableMap.of());
        a = bVar.a();
    }

    public abstract Optional<YourLibraryPageId> a();

    public abstract boolean b();

    public abstract ImmutableMap<YourLibraryPageId, LoadingState> c();

    public abstract ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> d();

    public abstract a e();

    public q19 f(i iVar) {
        a e = e();
        e.f(iVar);
        return e.a();
    }

    public abstract i g();
}
