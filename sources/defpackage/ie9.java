package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.libs.assistedcuration.model.RecsTrack;
import defpackage.ee9;

/* renamed from: ie9  reason: default package */
public abstract class ie9 {
    public static final ie9 a;

    /* renamed from: ie9$a */
    public static abstract class a {
        public abstract ie9 a();

        public abstract a b(Optional<Boolean> optional);

        public abstract a c(String str);

        public abstract a d(ImmutableList<MusicItem> immutableList);

        public abstract a e(int i);

        public abstract a f(ImmutableList<RecsTrack> immutableList);

        public abstract a g(ImmutableList<MusicItem> immutableList);

        public abstract a h(boolean z);

        public abstract a i(ImmutableList<String> immutableList);
    }

    static {
        ee9.b bVar = new ee9.b();
        bVar.c("");
        bVar.e(15);
        bVar.h(false);
        bVar.i(ImmutableList.of());
        bVar.f(ImmutableList.of());
        bVar.d(ImmutableList.of());
        bVar.g(ImmutableList.of());
        bVar.b(Optional.absent());
        a = bVar.a();
    }

    public abstract Optional<Boolean> a();

    public abstract String b();

    public abstract ImmutableList<MusicItem> c();

    public abstract int d();

    public abstract ImmutableList<RecsTrack> e();

    public abstract ImmutableList<MusicItem> f();

    public abstract boolean g();

    public abstract ImmutableList<String> h();

    public abstract a i();

    public ie9 j(boolean z) {
        a i = i();
        i.h(z);
        return i.a();
    }
}
