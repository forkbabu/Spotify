package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponseItem;
import defpackage.vb9;

/* renamed from: zb9  reason: default package */
public abstract class zb9 {
    public static final zb9 a;

    /* renamed from: zb9$a */
    public static abstract class a {
        public abstract zb9 a();

        public abstract a b(String str);

        public abstract a c(ImmutableMap<String, Boolean> immutableMap);

        public abstract a d(ImmutableList<FilterTagsResponseItem> immutableList);
    }

    static {
        vb9.b bVar = new vb9.b();
        bVar.b("");
        bVar.d(ImmutableList.of());
        bVar.c(ImmutableMap.of());
        a = bVar.a();
    }

    public abstract String a();

    public abstract ImmutableMap<String, Boolean> b();

    public abstract ImmutableList<FilterTagsResponseItem> c();

    public abstract a d();
}
