package androidx.recyclerview.widget;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class g0<T> {
    T[] a;
    private T[] b;
    private int c;
    private int d;
    private int e;
    private b f;
    private a g;
    private int h = 0;
    private final Class<T> i;

    public static class a<T2> extends b<T2> {
        final b<T2> a;
        private final e b;

        public a(b<T2> bVar) {
            this.a = bVar;
            this.b = new e(bVar);
        }

        @Override // androidx.recyclerview.widget.w
        public void a(int i, int i2) {
            this.b.a(i, i2);
        }

        @Override // androidx.recyclerview.widget.w
        public void b(int i, int i2) {
            this.b.b(i, i2);
        }

        @Override // androidx.recyclerview.widget.g0.b, androidx.recyclerview.widget.w
        public void c(int i, int i2, Object obj) {
            this.b.c(i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.g0.b, java.util.Comparator
        public int compare(T2 t2, T2 t22) {
            return this.a.compare(t2, t22);
        }

        @Override // androidx.recyclerview.widget.w
        public void d(int i, int i2) {
            this.b.d(i, i2);
        }

        @Override // androidx.recyclerview.widget.g0.b
        public boolean e(T2 t2, T2 t22) {
            return this.a.e(t2, t22);
        }

        @Override // androidx.recyclerview.widget.g0.b
        public boolean f(T2 t2, T2 t22) {
            return this.a.f(t2, t22);
        }

        @Override // androidx.recyclerview.widget.g0.b
        public Object g(T2 t2, T2 t22) {
            return this.a.g(t2, t22);
        }

        public void h() {
            this.b.e();
        }
    }

    public static abstract class b<T2> implements Comparator<T2>, w {
        @Override // androidx.recyclerview.widget.w
        public abstract void c(int i, int i2, Object obj);

        @Override // java.util.Comparator
        public abstract int compare(T2 t2, T2 t22);

        public abstract boolean e(T2 t2, T2 t22);

        public abstract boolean f(T2 t2, T2 t22);

        public Object g(T2 t2, T2 t22) {
            return null;
        }
    }

    public g0(Class<T> cls, b<T> bVar) {
        this.i = cls;
        this.a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 10));
        this.f = bVar;
    }

    private void b(T[] tArr) {
        int i2;
        if (tArr.length >= 1) {
            int i3 = 0;
            if (tArr.length == 0) {
                i2 = 0;
            } else {
                Arrays.sort(tArr, this.f);
                i2 = 1;
                int i4 = 0;
                for (int i5 = 1; i5 < tArr.length; i5++) {
                    T t = tArr[i5];
                    if (this.f.compare(tArr[i4], t) == 0) {
                        int i6 = i4;
                        while (true) {
                            if (i6 >= i2) {
                                i6 = -1;
                                break;
                            } else if (this.f.f(tArr[i6], t)) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        if (i6 != -1) {
                            tArr[i6] = t;
                        } else {
                            if (i2 != i5) {
                                tArr[i2] = t;
                            }
                            i2++;
                        }
                    } else {
                        if (i2 != i5) {
                            tArr[i2] = t;
                        }
                        i4 = i2;
                        i2++;
                    }
                }
            }
            if (this.h == 0) {
                this.a = tArr;
                this.h = i2;
                this.f.a(0, i2);
                return;
            }
            boolean z = !(this.f instanceof a);
            if (z) {
                c();
            }
            this.b = this.a;
            this.c = 0;
            int i7 = this.h;
            this.d = i7;
            this.a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.i, i7 + i2 + 10));
            this.e = 0;
            while (true) {
                int i8 = this.c;
                int i9 = this.d;
                if (i8 >= i9 && i3 >= i2) {
                    break;
                } else if (i8 == i9) {
                    int i10 = i2 - i3;
                    System.arraycopy(tArr, i3, this.a, this.e, i10);
                    int i11 = this.e + i10;
                    this.e = i11;
                    this.h += i10;
                    this.f.a(i11 - i10, i10);
                    break;
                } else if (i3 == i2) {
                    int i12 = i9 - i8;
                    System.arraycopy(this.b, i8, this.a, this.e, i12);
                    this.e += i12;
                    break;
                } else {
                    T t2 = this.b[i8];
                    T t3 = tArr[i3];
                    int compare = this.f.compare(t2, t3);
                    if (compare > 0) {
                        T[] tArr2 = this.a;
                        int i13 = this.e;
                        int i14 = i13 + 1;
                        this.e = i14;
                        tArr2[i13] = t3;
                        this.h++;
                        i3++;
                        this.f.a(i14 - 1, 1);
                    } else if (compare != 0 || !this.f.f(t2, t3)) {
                        T[] tArr3 = this.a;
                        int i15 = this.e;
                        this.e = i15 + 1;
                        tArr3[i15] = t2;
                        this.c++;
                    } else {
                        T[] tArr4 = this.a;
                        int i16 = this.e;
                        this.e = i16 + 1;
                        tArr4[i16] = t3;
                        i3++;
                        this.c++;
                        if (!this.f.e(t2, t3)) {
                            b bVar = this.f;
                            bVar.c(this.e - 1, 1, bVar.g(t2, t3));
                        }
                    }
                }
            }
            this.b = null;
            if (z) {
                e();
            }
        }
    }

    private void f() {
        if (this.b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.g0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(Collection<T> collection) {
        Object[] array = collection.toArray((Object[]) Array.newInstance((Class<?>) this.i, collection.size()));
        f();
        if (array.length != 0) {
            b(array);
        }
    }

    public void c() {
        f();
        b bVar = this.f;
        if (!(bVar instanceof a)) {
            if (this.g == null) {
                this.g = new a(bVar);
            }
            this.f = this.g;
        }
    }

    public void d() {
        f();
        int i2 = this.h;
        if (i2 != 0) {
            Arrays.fill(this.a, 0, i2, (Object) null);
            this.h = 0;
            this.f.b(0, i2);
        }
    }

    public void e() {
        f();
        b bVar = this.f;
        if (bVar instanceof a) {
            ((a) bVar).h();
        }
        b bVar2 = this.f;
        a aVar = this.g;
        if (bVar2 == aVar) {
            this.f = aVar.a;
        }
    }
}
