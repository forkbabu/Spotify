package defpackage;

import androidx.recyclerview.widget.m;
import defpackage.q51;
import java.util.ArrayList;
import java.util.List;

/* renamed from: y51  reason: default package */
public class y51 implements q51 {

    /* renamed from: y51$a */
    class a extends m.b {
        final /* synthetic */ List a;
        final /* synthetic */ List b;

        a(List list, List list2) {
            this.a = list;
            this.b = list2;
        }

        @Override // androidx.recyclerview.widget.m.b
        public boolean a(int i, int i2) {
            return ((s81) this.a.get(i)).equals((s81) this.b.get(i2));
        }

        @Override // androidx.recyclerview.widget.m.b
        public boolean b(int i, int i2) {
            s81 s81 = (s81) this.a.get(i);
            s81 s812 = (s81) this.b.get(i2);
            String id = s81.id();
            String id2 = s812.id();
            if (id == null || id2 == null) {
                return s81 == s812;
            }
            return id.equals(id2);
        }

        @Override // androidx.recyclerview.widget.m.b
        public Object c(int i, int i2) {
            y51.b(y51.this, (s81) this.a.get(i), (s81) this.b.get(i2));
            return null;
        }

        @Override // androidx.recyclerview.widget.m.b
        public int d() {
            return this.b.size();
        }

        @Override // androidx.recyclerview.widget.m.b
        public int e() {
            return this.a.size();
        }
    }

    static Object b(y51 y51, s81 s81, s81 s812) {
        y51.getClass();
        return null;
    }

    @Override // defpackage.q51
    public q51.a a(i61 i61, List<? extends s81> list) {
        ArrayList arrayList = new ArrayList(i61.Y().b());
        i61.c0(list);
        return new m51(m.b(new a(arrayList, list), true), i61);
    }
}
