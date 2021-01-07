package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import java.util.TreeSet;

/* renamed from: wy8  reason: default package */
public class wy8 {
    private final ImmutableMap<a, vy8> a;

    /* renamed from: wy8$a */
    public static abstract class a {
        public static a a(String str) {
            return new qy8(str, RootHintsParams.Mode.NONE);
        }

        public static a b(String str, RootHintsParams.Mode mode) {
            return new qy8(str, mode);
        }

        public abstract RootHintsParams.Mode c();

        public abstract String d();
    }

    wy8(ImmutableMap<a, vy8> immutableMap) {
        this.a = immutableMap;
    }

    public vy8 a(a aVar) {
        vy8 vy8 = this.a.get(aVar);
        if (vy8 != null) {
            return vy8;
        }
        throw new IllegalArgumentException(String.format("Can not handle assistant %s with mode %s", aVar.d(), aVar.c()));
    }

    public ImmutableSet<String> b() {
        TreeSet treeSet = new TreeSet();
        UnmodifiableIterator<a> it = this.a.keySet().iterator();
        while (it.hasNext()) {
            treeSet.add(it.next().d());
        }
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.addAll((Iterable) treeSet);
        return builder.build();
    }
}
