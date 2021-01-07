package com.spotify.music.yourlibrary.filterchips;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableListIterator;

public class r {
    private final p a;
    private ImmutableList<l> b = ImmutableList.of();
    private boolean c;

    public r(p pVar) {
        this.a = pVar;
    }

    private static ImmutableSet<String> a(ImmutableList<l> immutableList) {
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        UnmodifiableListIterator<l> listIterator = immutableList.listIterator();
        while (listIterator.hasNext()) {
            builder.mo53add((ImmutableSet.Builder) listIterator.next().b());
        }
        return builder.build();
    }

    public void b(ImmutableList<l> immutableList) {
        l lVar;
        if (!this.b.isEmpty()) {
            ImmutableSet<String> a2 = a(immutableList);
            UnmodifiableListIterator<l> listIterator = this.b.listIterator();
            while (listIterator.hasNext()) {
                l next = listIterator.next();
                if (!a2.contains(next.b())) {
                    ((q) this.a).g(next.b());
                }
            }
        }
        ImmutableSet<String> a3 = a(this.b);
        UnmodifiableListIterator<l> listIterator2 = immutableList.listIterator();
        boolean z = false;
        int i = 0;
        while (listIterator2.hasNext()) {
            l next2 = listIterator2.next();
            if (a3.isEmpty() || !a3.contains(next2.b())) {
                ((q) this.a).a(next2, i);
            }
            i++;
        }
        UnmodifiableListIterator<l> listIterator3 = immutableList.listIterator();
        while (true) {
            if (!listIterator3.hasNext()) {
                lVar = null;
                break;
            }
            lVar = listIterator3.next();
            if (lVar.c().booleanValue()) {
                break;
            }
        }
        if (lVar != null) {
            ((q) this.a).i(lVar, immutableList.indexOf(lVar));
            String b2 = lVar.b();
            if (!((q) this.a).d()) {
                int b3 = ((q) this.a).b(b2);
                if (b3 != 0) {
                    z = true;
                }
                this.c = z;
                ((q) this.a).h(b3);
                ((q) this.a).j(this.c);
            }
        } else if (((q) this.a).d()) {
            ((q) this.a).k(this.c);
        }
        this.b = immutableList;
    }
}
