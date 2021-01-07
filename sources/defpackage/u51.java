package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: u51  reason: default package */
public interface u51 {

    /* renamed from: u51$b */
    public static final class b {
        public static final /* synthetic */ int a = 0;

        /* access modifiers changed from: private */
        /* renamed from: u51$b$a */
        public static final class a implements u51 {
            private final List<u51> a;

            a(List list, a aVar) {
                this.a = list;
            }

            @Override // defpackage.u51
            public s51<?> a(int i) {
                for (u51 u51 : this.a) {
                    s51<?> a2 = u51.a(i);
                    if (a2 != null) {
                        return a2;
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: u51$b$b  reason: collision with other inner class name */
        public static class C0687b implements u51 {
            private final s51<?> a;
            private final int b;

            C0687b(int i, s51 s51, a aVar) {
                this.b = i;
                s51.getClass();
                this.a = s51;
            }

            @Override // defpackage.u51
            public s51<?> a(int i) {
                if (i == this.b) {
                    return this.a;
                }
                return null;
            }
        }

        public static u51 a(u51... u51Arr) {
            i51 i51 = i51.a;
            int length = u51Arr.length;
            if (length == 0) {
                return i51;
            }
            if (length == 1) {
                return u51Arr[0];
            }
            ArrayList arrayList = new ArrayList(u51Arr.length);
            for (u51 u51 : u51Arr) {
                u51.getClass();
                if (u51 instanceof a) {
                    List list = ((a) u51).a;
                    arrayList.ensureCapacity((list.size() + arrayList.size()) - 1);
                    arrayList.addAll(list);
                } else if (u51 != i51) {
                    arrayList.add(u51);
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                return i51;
            }
            if (size != 1) {
                return new a(arrayList, null);
            }
            return (u51) arrayList.get(0);
        }
    }

    s51<?> a(int i);
}
