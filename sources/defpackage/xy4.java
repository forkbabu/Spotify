package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

/* renamed from: xy4  reason: default package */
public final class xy4 {
    private final List<ty4> a;
    private final String b;
    private final List<String> c;

    public xy4() {
        this(null, null, null, 7);
    }

    public xy4(List list, String str, List list2, int i) {
        EmptyList emptyList = EmptyList.a;
        EmptyList emptyList2 = (i & 1) != 0 ? emptyList : null;
        str = (i & 2) != 0 ? null : str;
        list2 = (i & 4) != 0 ? emptyList : list2;
        h.e(emptyList2, "userSelectionList");
        h.e(list2, "playlistItems");
        this.a = emptyList2;
        this.b = str;
        this.c = list2;
    }

    public static xy4 a(xy4 xy4, List list, String str, List list2, int i) {
        if ((i & 1) != 0) {
            list = xy4.a;
        }
        List<String> list3 = null;
        String str2 = (i & 2) != 0 ? xy4.b : null;
        if ((i & 4) != 0) {
            list3 = xy4.c;
        }
        h.e(list, "userSelectionList");
        h.e(list3, "playlistItems");
        return new xy4(list, str2, list3);
    }

    public final String b() {
        return this.b;
    }

    public final List<String> c() {
        return this.c;
    }

    public final List<ty4> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy4)) {
            return false;
        }
        xy4 xy4 = (xy4) obj;
        return h.a(this.a, xy4.a) && h.a(this.b, xy4.b) && h.a(this.c, xy4.c);
    }

    public int hashCode() {
        List<ty4> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list2 = this.c;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("EntitySelectorModel(userSelectionList=");
        V0.append(this.a);
        V0.append(", listName=");
        V0.append(this.b);
        V0.append(", playlistItems=");
        return je.L0(V0, this.c, ")");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends ty4> */
    /* JADX WARN: Multi-variable type inference failed */
    public xy4(List<? extends ty4> list, String str, List<String> list2) {
        h.e(list, "userSelectionList");
        h.e(list2, "playlistItems");
        this.a = list;
        this.b = str;
        this.c = list2;
    }
}
