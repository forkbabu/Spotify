package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* renamed from: a61  reason: default package */
public interface a61 {

    /* renamed from: a61$a */
    public static final class a {
        public static final /* synthetic */ int a = 0;

        /* access modifiers changed from: package-private */
        /* renamed from: a61$a$a  reason: collision with other inner class name */
        public static class C0000a extends AbstractList<s81> {
            final /* synthetic */ a61 a;
            final /* synthetic */ List b;

            C0000a(a61 a61, List list) {
                this.a = a61;
                this.b = list;
            }

            @Override // java.util.AbstractList, java.util.List
            public Object get(int i) {
                return this.a.a((s81) this.b.get(i));
            }

            @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
            public int size() {
                return this.b.size();
            }
        }

        /* renamed from: a61$a$b */
        class b implements a61 {
            final /* synthetic */ a61 a;

            /* renamed from: a61$a$b$a  reason: collision with other inner class name */
            class C0001a extends c91 {
                C0001a(s81 s81) {
                    super(s81);
                }

                @Override // defpackage.c91, defpackage.s81
                public List<s81> children() {
                    return a.a(b.this, ((s81) a()).children());
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            b(a61 a61) {
                this.a = a61;
            }

            @Override // defpackage.a61
            public s81 a(s81 s81) {
                s81 a2 = this.a.a(s81);
                List<? extends s81> children = s81.children();
                boolean z = true;
                if (!(children == Collections.emptyList())) {
                    if (children != ImmutableList.of()) {
                        z = false;
                    }
                    if (!z) {
                        return new C0001a(a2);
                    }
                }
                return a2;
            }
        }

        public static List<s81> a(a61 a61, List<? extends s81> list) {
            boolean z = false;
            if (list == Collections.emptyList()) {
                return Collections.emptyList();
            }
            if (list == ImmutableList.of()) {
                z = true;
            }
            if (z) {
                return ImmutableList.of();
            }
            return new C0000a(a61, list);
        }

        public static a61 b(a61 a61) {
            o51 o51 = o51.a;
            if (a61 == o51) {
                return o51;
            }
            return a61 instanceof b ? a61 : new b(a61);
        }
    }

    s81 a(s81 s81);
}
