package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.s51;
import java.util.Locale;

/* renamed from: g91  reason: default package */
public final class g91 {
    private static final s51.a<View> a = new a();

    /* renamed from: g91$a */
    static class a implements s51.a<View> {
        a() {
        }

        public String toString() {
            return "SCROLL";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g91$b */
    public static class b implements RecyclerView.n {
        final /* synthetic */ int a;
        final /* synthetic */ RecyclerView b;
        final /* synthetic */ s51.a c;
        final /* synthetic */ int[] f;

        b(int i, RecyclerView recyclerView, s51.a aVar, int[] iArr) {
            this.a = i;
            this.b = recyclerView;
            this.c = aVar;
            this.f = iArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void b(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void d(View view) {
            if (this.a == this.b.X(view)) {
                i61.f0(this.b.a0(view)).f(this.c, this.f);
                this.b.B0(this);
            }
        }
    }

    public static void a(View view, s81 s81, s51.a<View> aVar, int[] iArr) {
        if (iArr.length <= 0) {
            ((a) aVar).getClass();
            return;
        }
        throw new UnsupportedOperationException("Component does not support scrolling");
    }

    public static void b(RecyclerView recyclerView, s51.a<View> aVar, int... iArr) {
        int[] iArr2;
        if (iArr.length > 0) {
            int i = iArr[0];
            boolean z = aVar != a;
            RecyclerView.e adapter = recyclerView.getAdapter();
            if (!(adapter instanceof i61)) {
                throw new IllegalArgumentException("RecyclerView not managed by Hubs!");
            } else if (i < 0 || (z && i >= adapter.u())) {
                throw new IllegalArgumentException(String.format(Locale.US, "Index out of bounds: %d (count: %d)", Integer.valueOf(i), Integer.valueOf(adapter.u())));
            } else {
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                recyclerView.R0();
                if (layoutManager instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) layoutManager).t2(i, 0);
                } else {
                    recyclerView.I0(i);
                }
                RecyclerView.b0 R = recyclerView.R(i);
                int length = iArr.length;
                if (length != 0) {
                    if (length != 1) {
                        int i2 = length - 1;
                        iArr2 = new int[i2];
                        System.arraycopy(iArr, 1, iArr2, 0, i2);
                    } else {
                        iArr2 = h91.a;
                    }
                    if (R != null) {
                        i61.f0(recyclerView.a0(R.a)).f(aVar, iArr2);
                    } else {
                        recyclerView.l(new b(i, recyclerView, aVar, iArr2));
                    }
                } else {
                    throw new IllegalArgumentException("Invalid empty path");
                }
            }
        }
    }

    public static void c(RecyclerView recyclerView, int... iArr) {
        b(recyclerView, a, iArr);
    }
}
