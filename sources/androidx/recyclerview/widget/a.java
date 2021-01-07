package androidx.recyclerview.widget;

import androidx.recyclerview.widget.x;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class a implements x.a {
    private w3<b> a = new w3<>(30);
    final ArrayList<b> b = new ArrayList<>();
    final ArrayList<b> c = new ArrayList<>();
    final AbstractC0044a d;
    final x e;
    private int f = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    public interface AbstractC0044a {
    }

    /* access modifiers changed from: package-private */
    public static class b {
        int a;
        int b;
        Object c;
        int d;

        b(int i, int i2, int i3, Object obj) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.a;
            if (i != bVar.a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == bVar.b && this.b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.b != bVar.b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.c)) {
                    return false;
                }
            } else if (bVar.c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : PlayerTrack.TRACK_THUMB_STATE_UP : "rm" : "add");
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            return je.G0(sb, this.c, "]");
        }
    }

    a(AbstractC0044a aVar) {
        this.d = aVar;
        this.e = new x(this);
    }

    private boolean a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                if (f(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.b;
                int i5 = bVar.d + i4;
                while (i4 < i5) {
                    if (f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void d(b bVar) {
        int i;
        int i2 = bVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int s = s(bVar.b, i2);
        int i3 = bVar.b;
        int i4 = bVar.a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.d; i6++) {
            int s2 = s((i * i6) + bVar.b, bVar.a);
            int i7 = bVar.a;
            if (i7 == 2 ? s2 == s : i7 == 4 && s2 == s + 1) {
                i5++;
            } else {
                b i8 = i(i7, s, i5, bVar.c);
                e(i8, i3);
                p(i8);
                if (bVar.a == 4) {
                    i3 += i5;
                }
                s = s2;
                i5 = 1;
            }
        }
        Object obj = bVar.c;
        p(bVar);
        if (i5 > 0) {
            b i9 = i(bVar.a, s, i5, obj);
            e(i9, i3);
            p(i9);
        }
    }

    private void n(b bVar) {
        this.c.add(bVar);
        int i = bVar.a;
        if (i == 1) {
            ((b0) this.d).d(bVar.b, bVar.d);
        } else if (i == 2) {
            AbstractC0044a aVar = this.d;
            b0 b0Var = (b0) aVar;
            b0Var.a.n0(bVar.b, bVar.d, false);
            b0Var.a.t0 = true;
        } else if (i == 4) {
            ((b0) this.d).c(bVar.b, bVar.d, bVar.c);
        } else if (i == 8) {
            ((b0) this.d).e(bVar.b, bVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int s(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b bVar = this.c.get(size);
            int i5 = bVar.a;
            if (i5 == 8) {
                int i6 = bVar.b;
                int i7 = bVar.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.b = i6 + 1;
                            bVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.b = i6 - 1;
                            bVar.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.d;
                    } else if (i5 == 2) {
                        i += bVar.d;
                    }
                } else if (i2 == 1) {
                    bVar.b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.b = i8 - 1;
                }
            }
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.c.get(size2);
            if (bVar2.a == 8) {
                int i9 = bVar2.d;
                if (i9 == bVar2.b || i9 < 0) {
                    this.c.remove(size2);
                    p(bVar2);
                }
            } else if (bVar2.d <= 0) {
                this.c.remove(size2);
                p(bVar2);
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ((b0) this.d).a(this.c.get(i));
        }
        q(this.c);
        this.f = 0;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        b();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.b.get(i);
            int i2 = bVar.a;
            if (i2 == 1) {
                ((b0) this.d).a(bVar);
                ((b0) this.d).d(bVar.b, bVar.d);
            } else if (i2 == 2) {
                ((b0) this.d).a(bVar);
                AbstractC0044a aVar = this.d;
                int i3 = bVar.b;
                int i4 = bVar.d;
                b0 b0Var = (b0) aVar;
                b0Var.a.n0(i3, i4, true);
                RecyclerView recyclerView = b0Var.a;
                recyclerView.t0 = true;
                recyclerView.q0.c += i4;
            } else if (i2 == 4) {
                ((b0) this.d).a(bVar);
                ((b0) this.d).c(bVar.b, bVar.d, bVar.c);
            } else if (i2 == 8) {
                ((b0) this.d).a(bVar);
                ((b0) this.d).e(bVar.b, bVar.d);
            }
        }
        q(this.b);
        this.f = 0;
    }

    /* access modifiers changed from: package-private */
    public void e(b bVar, int i) {
        ((b0) this.d).a(bVar);
        int i2 = bVar.a;
        if (i2 == 2) {
            AbstractC0044a aVar = this.d;
            int i3 = bVar.d;
            b0 b0Var = (b0) aVar;
            b0Var.a.n0(i, i3, true);
            RecyclerView recyclerView = b0Var.a;
            recyclerView.t0 = true;
            recyclerView.q0.c += i3;
        } else if (i2 == 4) {
            ((b0) this.d).c(i, bVar.d, bVar.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public int f(int i, int i2) {
        int size = this.c.size();
        while (i2 < size) {
            b bVar = this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                int i4 = bVar.b;
                if (i4 == i) {
                    i = bVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public boolean g(int i) {
        return (i & this.f) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.b.size() > 0;
    }

    public b i(int i, int i2, int i3, Object obj) {
        b a2 = this.a.a();
        if (a2 == null) {
            return new b(i, i2, i3, obj);
        }
        a2.a = i;
        a2.b = i2;
        a2.d = i3;
        a2.c = obj;
        return a2;
    }

    /* access modifiers changed from: package-private */
    public boolean j(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.b.add(i(4, i, i2, obj));
        this.f |= 4;
        if (this.b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean k(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.b.add(i(1, i, i2, null));
        this.f |= 1;
        if (this.b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean l(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.b.add(i(8, i, i2, null));
            this.f |= 8;
            if (this.b.size() == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* access modifiers changed from: package-private */
    public boolean m(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.b.add(i(2, i, i2, null));
        this.f |= 2;
        if (this.b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o() {
        /*
        // Method dump skipped, instructions count: 671
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.o():void");
    }

    public void p(b bVar) {
        bVar.c = null;
        this.a.b(bVar);
    }

    /* access modifiers changed from: package-private */
    public void q(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            p(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    public void r() {
        q(this.b);
        q(this.c);
        this.f = 0;
    }
}
