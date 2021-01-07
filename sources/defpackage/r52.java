package defpackage;

import android.content.UriMatcher;
import com.spotify.mobile.android.util.l0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: r52  reason: default package */
public class r52 implements p52 {
    private static final Map<String, l0> c = gf0.b();
    UriMatcher a = new UriMatcher(-1);
    Set<a> b;

    /* renamed from: r52$a */
    static class a implements Comparable<a> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            if (equals(aVar)) {
                return 0;
            }
            throw null;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            throw null;
        }

        @Override // java.lang.Object
        public int hashCode() {
            throw null;
        }
    }

    public r52() {
        TreeSet treeSet = new TreeSet();
        this.b = treeSet;
        Iterator it = treeSet.iterator();
        if (it.hasNext()) {
            ((a) it.next()).getClass();
            throw null;
        }
    }

    public l0 a(String str) {
        Map<String, l0> map = c;
        l0 l0Var = map.get(str);
        if (l0Var != null) {
            return l0Var;
        }
        l0 z = l0.z(str);
        map.put(str, z);
        return z;
    }
}
