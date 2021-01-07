package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class o extends Lifecycle {
    private b1<m, a> a = new b1<>();
    private Lifecycle.State b;
    private final WeakReference<n> c;
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<Lifecycle.State> g = new ArrayList<>();

    /* access modifiers changed from: package-private */
    public static class a {
        Lifecycle.State a;
        l b;

        a(m mVar, Lifecycle.State state) {
            this.b = r.d(mVar);
            this.a = state;
        }

        /* access modifiers changed from: package-private */
        public void a(n nVar, Lifecycle.Event event) {
            Lifecycle.State e = o.e(event);
            this.a = o.h(this.a, e);
            this.b.p(nVar, event);
            this.a = e;
        }
    }

    public o(n nVar) {
        this.c = new WeakReference<>(nVar);
        this.b = Lifecycle.State.INITIALIZED;
    }

    private Lifecycle.State d(m mVar) {
        Map.Entry<m, a> k = this.a.k(mVar);
        Lifecycle.State state = null;
        Lifecycle.State state2 = k != null ? k.getValue().a : null;
        if (!this.g.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.g;
            state = arrayList.get(arrayList.size() - 1);
        }
        return h(h(this.b, state2), state);
    }

    static Lifecycle.State e(Lifecycle.Event event) {
        int ordinal = event.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return Lifecycle.State.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return Lifecycle.State.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + event);
                    }
                }
            }
            return Lifecycle.State.STARTED;
        }
        return Lifecycle.State.CREATED;
    }

    static Lifecycle.State h(Lifecycle.State state, Lifecycle.State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    private void i(Lifecycle.State state) {
        if (this.b != state) {
            this.b = state;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            l();
            this.e = false;
        }
    }

    private void j() {
        ArrayList<Lifecycle.State> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: b1<androidx.lifecycle.m, androidx.lifecycle.o$a> */
    /* JADX WARN: Multi-variable type inference failed */
    private void l() {
        Lifecycle.Event event;
        Lifecycle.State state;
        n nVar = this.c.get();
        if (nVar != null) {
            while (true) {
                if (!(this.a.size() == 0 || (this.a.c().getValue().a == (state = this.a.f().getValue().a) && this.b == state))) {
                    this.f = false;
                    if (this.b.compareTo(this.a.c().getValue().a) < 0) {
                        Iterator<Map.Entry<m, a>> descendingIterator = this.a.descendingIterator();
                        while (descendingIterator.hasNext() && !this.f) {
                            Map.Entry<m, a> next = descendingIterator.next();
                            a value = next.getValue();
                            while (value.a.compareTo(this.b) > 0 && !this.f && this.a.contains(next.getKey())) {
                                Lifecycle.State state2 = value.a;
                                int ordinal = state2.ordinal();
                                if (ordinal == 0) {
                                    throw new IllegalArgumentException();
                                } else if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        event = Lifecycle.Event.ON_DESTROY;
                                    } else if (ordinal == 3) {
                                        event = Lifecycle.Event.ON_STOP;
                                    } else if (ordinal == 4) {
                                        event = Lifecycle.Event.ON_PAUSE;
                                    } else {
                                        throw new IllegalArgumentException("Unexpected state value " + state2);
                                    }
                                    this.g.add(e(event));
                                    value.a(nVar, event);
                                    j();
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                    Map.Entry<m, a> f2 = this.a.f();
                    if (!this.f && f2 != null && this.b.compareTo(f2.getValue().a) > 0) {
                        c1<K, V>.d e2 = this.a.e();
                        while (e2.hasNext() && !this.f) {
                            Map.Entry entry = (Map.Entry) e2.next();
                            a aVar = (a) entry.getValue();
                            while (aVar.a.compareTo(this.b) < 0 && !this.f && this.a.contains(entry.getKey())) {
                                this.g.add(aVar.a);
                                aVar.a(nVar, m(aVar.a));
                                j();
                            }
                        }
                    }
                } else {
                    this.f = false;
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    private static Lifecycle.Event m(Lifecycle.State state) {
        int ordinal = state.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return Lifecycle.Event.ON_CREATE;
        }
        if (ordinal == 2) {
            return Lifecycle.Event.ON_START;
        }
        if (ordinal == 3) {
            return Lifecycle.Event.ON_RESUME;
        }
        if (ordinal != 4) {
            throw new IllegalArgumentException("Unexpected state value " + state);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.lifecycle.Lifecycle
    public void a(m mVar) {
        n nVar;
        Lifecycle.State state = this.b;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        a aVar = new a(mVar, state2);
        if (this.a.i(mVar, aVar) == null && (nVar = this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            Lifecycle.State d2 = d(mVar);
            this.d++;
            while (aVar.a.compareTo(d2) < 0 && this.a.contains(mVar)) {
                this.g.add(aVar.a);
                aVar.a(nVar, m(aVar.a));
                j();
                d2 = d(mVar);
            }
            if (!z) {
                l();
            }
            this.d--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State b() {
        return this.b;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void c(m mVar) {
        this.a.j(mVar);
    }

    public void f(Lifecycle.Event event) {
        i(e(event));
    }

    @Deprecated
    public void g(Lifecycle.State state) {
        i(state);
    }

    public void k(Lifecycle.State state) {
        i(state);
    }
}
