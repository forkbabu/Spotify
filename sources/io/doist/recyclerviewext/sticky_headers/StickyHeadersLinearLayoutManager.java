package io.doist.recyclerviewext.sticky_headers;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e;
import io.doist.recyclerviewext.sticky_headers.a;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Incorrect field signature: TT; */
public class StickyHeadersLinearLayoutManager<T extends RecyclerView.e<? extends RecyclerView.b0> & a> extends LinearLayoutManager {
    private RecyclerView.e Q;
    private List<Integer> R = new ArrayList(0);
    private RecyclerView.g S = new a(null);
    private View T;
    private int U = -1;
    private int V = -1;
    private int W;

    private class a extends RecyclerView.g {
        a(b bVar) {
        }

        private void g(int i) {
            int intValue = ((Integer) StickyHeadersLinearLayoutManager.this.R.remove(i)).intValue();
            int B2 = StickyHeadersLinearLayoutManager.B2(StickyHeadersLinearLayoutManager.this, intValue);
            if (B2 != -1) {
                StickyHeadersLinearLayoutManager.this.R.add(B2, Integer.valueOf(intValue));
            } else {
                StickyHeadersLinearLayoutManager.this.R.add(Integer.valueOf(intValue));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            StickyHeadersLinearLayoutManager.this.R.clear();
            int u = StickyHeadersLinearLayoutManager.this.Q.u();
            for (int i = 0; i < u; i++) {
                if (((a) StickyHeadersLinearLayoutManager.this.Q).k(i)) {
                    StickyHeadersLinearLayoutManager.this.R.add(Integer.valueOf(i));
                }
            }
            if (!(StickyHeadersLinearLayoutManager.this.T == null || StickyHeadersLinearLayoutManager.this.R.contains(Integer.valueOf(StickyHeadersLinearLayoutManager.this.U)))) {
                StickyHeadersLinearLayoutManager.this.O2(null);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void d(int i, int i2) {
            int size = StickyHeadersLinearLayoutManager.this.R.size();
            if (size > 0) {
                int B2 = StickyHeadersLinearLayoutManager.B2(StickyHeadersLinearLayoutManager.this, i);
                while (B2 != -1 && B2 < size) {
                    StickyHeadersLinearLayoutManager.this.R.set(B2, Integer.valueOf(((Integer) StickyHeadersLinearLayoutManager.this.R.get(B2)).intValue() + i2));
                    B2++;
                }
            }
            for (int i3 = i; i3 < i + i2; i3++) {
                if (((a) StickyHeadersLinearLayoutManager.this.Q).k(i3)) {
                    int B22 = StickyHeadersLinearLayoutManager.B2(StickyHeadersLinearLayoutManager.this, i3);
                    if (B22 != -1) {
                        StickyHeadersLinearLayoutManager.this.R.add(B22, Integer.valueOf(i3));
                    } else {
                        StickyHeadersLinearLayoutManager.this.R.add(Integer.valueOf(i3));
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void e(int i, int i2, int i3) {
            int size = StickyHeadersLinearLayoutManager.this.R.size();
            if (size <= 0) {
                return;
            }
            if (i < i2) {
                int B2 = StickyHeadersLinearLayoutManager.B2(StickyHeadersLinearLayoutManager.this, i);
                while (B2 != -1 && B2 < size) {
                    int intValue = ((Integer) StickyHeadersLinearLayoutManager.this.R.get(B2)).intValue();
                    if (intValue >= i && intValue < i + i3) {
                        StickyHeadersLinearLayoutManager.this.R.set(B2, Integer.valueOf(intValue - (i2 - i)));
                        g(B2);
                    } else if (intValue >= i + i3 && intValue <= i2) {
                        StickyHeadersLinearLayoutManager.this.R.set(B2, Integer.valueOf(intValue - i3));
                        g(B2);
                    } else {
                        return;
                    }
                    B2++;
                }
                return;
            }
            int B22 = StickyHeadersLinearLayoutManager.B2(StickyHeadersLinearLayoutManager.this, i2);
            while (B22 != -1 && B22 < size) {
                int intValue2 = ((Integer) StickyHeadersLinearLayoutManager.this.R.get(B22)).intValue();
                if (intValue2 >= i && intValue2 < i + i3) {
                    StickyHeadersLinearLayoutManager.this.R.set(B22, Integer.valueOf((i2 - i) + intValue2));
                    g(B22);
                } else if (intValue2 >= i2 && intValue2 <= i) {
                    StickyHeadersLinearLayoutManager.this.R.set(B22, Integer.valueOf(intValue2 + i3));
                    g(B22);
                } else {
                    return;
                }
                B22++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void f(int i, int i2) {
            int size = StickyHeadersLinearLayoutManager.this.R.size();
            if (size > 0) {
                int i3 = i + i2;
                for (int i4 = i3 - 1; i4 >= i; i4--) {
                    int L2 = StickyHeadersLinearLayoutManager.this.L2(i4);
                    if (L2 != -1) {
                        StickyHeadersLinearLayoutManager.this.R.remove(L2);
                        size--;
                    }
                }
                if (StickyHeadersLinearLayoutManager.this.T != null && !StickyHeadersLinearLayoutManager.this.R.contains(Integer.valueOf(StickyHeadersLinearLayoutManager.this.U))) {
                    StickyHeadersLinearLayoutManager.this.O2(null);
                }
                int B2 = StickyHeadersLinearLayoutManager.B2(StickyHeadersLinearLayoutManager.this, i3);
                while (B2 != -1 && B2 < size) {
                    StickyHeadersLinearLayoutManager.this.R.set(B2, Integer.valueOf(((Integer) StickyHeadersLinearLayoutManager.this.R.get(B2)).intValue() - i2));
                    B2++;
                }
            }
        }
    }

    public static class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        private Parcelable a;
        private int b;
        private int c;

        static class a implements Parcelable.Creator<b> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }

        public b(Parcel parcel) {
            this.a = parcel.readParcelable(b.class.getClassLoader());
            this.b = parcel.readInt();
            this.c = parcel.readInt();
        }
    }

    public StickyHeadersLinearLayoutManager(Context context) {
        super(1, false);
    }

    static int B2(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, int i) {
        int size = stickyHeadersLinearLayoutManager.R.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (stickyHeadersLinearLayoutManager.R.get(i4).intValue() >= i) {
                    size = i4;
                }
            }
            if (stickyHeadersLinearLayoutManager.R.get(i3).intValue() >= i) {
                return i3;
            }
            i2 = i3 + 1;
        }
        return -1;
    }

    static void F2(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, int i, int i2) {
        stickyHeadersLinearLayoutManager.V = i;
        stickyHeadersLinearLayoutManager.W = i2;
    }

    private void J2() {
        View view = this.T;
        if (view != null) {
            z(view, -1);
        }
    }

    private void K2() {
        View view = this.T;
        if (view != null) {
            O(view);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int L2(int i) {
        int size = this.R.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (this.R.get(i3).intValue() > i) {
                size = i3 - 1;
            } else if (this.R.get(i3).intValue() >= i) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private int M2(int i) {
        int size = this.R.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (this.R.get(i3).intValue() > i) {
                size = i3 - 1;
            } else {
                if (i3 < this.R.size() - 1) {
                    int i4 = i3 + 1;
                    if (this.R.get(i4).intValue() <= i) {
                        i2 = i4;
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    private void N2(View view) {
        H0(view, 0, 0);
        if (j2() == 1) {
            view.layout(getPaddingLeft(), 0, v0() - getPaddingRight(), view.getMeasuredHeight());
        } else {
            view.layout(0, getPaddingTop(), view.getMeasuredWidth(), g0() - getPaddingBottom());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void O2(RecyclerView.s sVar) {
        View view = this.T;
        this.T = null;
        this.U = -1;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        RecyclerView.e eVar = this.Q;
        if (eVar instanceof a.AbstractC0598a) {
            ((a.AbstractC0598a) eVar).b(view);
        }
        K1(view);
        r1(view);
        if (sVar != null) {
            sVar.k(view);
        }
    }

    private void P2(RecyclerView.e<? extends RecyclerView.b0> eVar) {
        RecyclerView.e eVar2 = this.Q;
        if (eVar2 != null) {
            eVar2.W(this.S);
        }
        if (eVar instanceof a) {
            this.Q = eVar;
            eVar.T(this.S);
            this.S.a();
            return;
        }
        this.Q = null;
        this.R.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if ((r8.getTranslationY() + ((float) r8.getTop())) <= (((float) g0()) + 0.0f)) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        if ((((float) r8.getBottom()) - r8.getTranslationY()) >= 0.0f) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        if ((r8.getTranslationX() + ((float) r8.getLeft())) <= (((float) v0()) + 0.0f)) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if ((((float) r8.getRight()) - r8.getTranslationX()) >= 0.0f) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
        if ((((float) r8.getBottom()) - r8.getTranslationY()) > (((float) g0()) + 0.0f)) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e6, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f4, code lost:
        if ((r8.getTranslationY() + ((float) r8.getTop())) < 0.0f) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010f, code lost:
        if ((((float) r8.getRight()) - r8.getTranslationX()) > (((float) v0()) + 0.0f)) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011e, code lost:
        if ((r8.getTranslationX() + ((float) r8.getLeft())) < 0.0f) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0121, code lost:
        if (r8 != false) goto L_0x0123;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x008b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090 A[LOOP:0: B:4:0x0010->B:28:0x0090, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Q2(androidx.recyclerview.widget.RecyclerView.s r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 605
        */
        throw new UnsupportedOperationException("Method not decompiled: io.doist.recyclerviewext.sticky_headers.StickyHeadersLinearLayoutManager.Q2(androidx.recyclerview.widget.RecyclerView$s, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void K0(RecyclerView.e eVar, RecyclerView.e eVar2) {
        P2(eVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void M0(RecyclerView recyclerView) {
        P2(recyclerView.getAdapter());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void c1(RecyclerView.s sVar, RecyclerView.y yVar) {
        K2();
        super.c1(sVar, yVar);
        J2();
        if (!yVar.e()) {
            Q2(sVar, true);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof b) {
            b bVar = (b) parcelable;
            this.V = bVar.b;
            this.W = bVar.c;
            parcelable = bVar.a;
        }
        super.h1(parcelable);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public Parcelable i1() {
        b bVar = new b();
        bVar.a = super.i1();
        bVar.b = this.V;
        bVar.c = this.W;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void t2(int i, int i2) {
        this.V = -1;
        this.W = Integer.MIN_VALUE;
        int M2 = M2(i);
        if (M2 == -1 || L2(i) != -1) {
            super.t2(i, i2);
            return;
        }
        int i3 = i - 1;
        if (L2(i3) != -1) {
            super.t2(i3, i2);
        } else if (this.T == null || M2 != L2(this.U)) {
            this.V = i;
            this.W = i2;
            super.t2(i, i2);
        } else {
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            super.t2(i, this.T.getHeight() + i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int u1(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
        K2();
        int u1 = super.u1(i, sVar, yVar);
        J2();
        if (u1 != 0) {
            Q2(sVar, false);
        }
        return u1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void v1(int i) {
        t2(i, Integer.MIN_VALUE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int w1(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
        K2();
        int w1 = super.w1(i, sVar, yVar);
        J2();
        if (w1 != 0) {
            Q2(sVar, false);
        }
        return w1;
    }
}
