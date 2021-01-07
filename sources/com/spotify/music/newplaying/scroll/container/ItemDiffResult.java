package com.spotify.music.newplaying.scroll.container;

import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.w;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ItemDiffResult<T> {
    private final ImmutableList<T> a;
    private final ImmutableList<T> b;
    private final m.c c;

    private static final class Operation {
        private final int a;
        private final int b;
        private final Action c;
        private int d;

        /* access modifiers changed from: package-private */
        public enum Action {
            ADDITION,
            REMOVAL
        }

        public Operation(int i, int i2, Action action) {
            this.a = i;
            this.b = i2;
            this.c = action;
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return this.a + this.d;
        }
    }

    class a extends m.b {
        final /* synthetic */ ImmutableList a;
        final /* synthetic */ ImmutableList b;

        a(ItemDiffResult itemDiffResult, ImmutableList immutableList, ImmutableList immutableList2) {
            this.a = immutableList;
            this.b = immutableList2;
        }

        @Override // androidx.recyclerview.widget.m.b
        public boolean a(int i, int i2) {
            return this.a.get(i).equals(this.b.get(i2));
        }

        @Override // androidx.recyclerview.widget.m.b
        public boolean b(int i, int i2) {
            return this.a.get(i) == this.b.get(i2);
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

    class b implements w {
        final /* synthetic */ List a;

        b(ItemDiffResult itemDiffResult, List list) {
            this.a = list;
        }

        @Override // androidx.recyclerview.widget.w
        public void a(int i, int i2) {
            for (Operation operation : this.a) {
                if (operation.a >= i && operation.c != Operation.Action.REMOVAL) {
                    operation.d += i2;
                }
            }
            for (int i3 = 0; i3 < i2; i3++) {
                this.a.add(new Operation(i + i3, 1, Operation.Action.ADDITION));
            }
        }

        @Override // androidx.recyclerview.widget.w
        public void b(int i, int i2) {
            Operation.Action action = Operation.Action.REMOVAL;
            for (Operation operation : this.a) {
                if (operation.a >= i && operation.c != action) {
                    operation.d -= i2;
                }
            }
            this.a.add(new Operation(i, i2, action));
        }

        @Override // androidx.recyclerview.widget.w
        public void c(int i, int i2, Object obj) {
        }

        @Override // androidx.recyclerview.widget.w
        public void d(int i, int i2) {
        }
    }

    interface c<T> {
    }

    ItemDiffResult(ImmutableList<T> immutableList, ImmutableList<T> immutableList2) {
        this.a = immutableList;
        this.b = immutableList2;
        this.c = m.b(new a(this, immutableList2, immutableList), false);
    }

    /* access modifiers changed from: package-private */
    public void a(c<T> cVar) {
        ArrayList arrayList = new ArrayList(1);
        this.c.a(new b(this, arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Operation operation = (Operation) it.next();
            int f = operation.f();
            int i = operation.b + f;
            int ordinal = operation.c.ordinal();
            if (ordinal == 0) {
                while (f < i) {
                    T t = this.a.get(f);
                    int i2 = f - operation.d;
                    c0 c0Var = (c0) cVar;
                    T t2 = t;
                    c0Var.a.g.c(t2, i2);
                    t2.onStart();
                    c0Var.a.e.add(i2, t2);
                    f++;
                }
            } else if (ordinal == 1) {
                for (int i3 = f; i3 < i; i3++) {
                    c0 c0Var2 = (c0) cVar;
                    this.b.get(i3).onStop();
                    c0Var2.a.g.b(f);
                    c0Var2.a.e.remove(f);
                }
            }
        }
    }
}
