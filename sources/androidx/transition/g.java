package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.spotify.music.C0707R;
import java.util.ArrayList;

class g extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    private ViewGroup a;
    private boolean b = true;

    g(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.a = viewGroup;
        viewGroup.setTag(C0707R.id.ghost_view_holder, this);
        d0.b(this.a).a(this);
    }

    private static void b(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            b((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        if (r9.getZ() > r10.getZ()) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        if (r1.size() == r7) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
        r7 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.transition.i r14) {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.View r1 = r14.c
            b(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r13.getChildCount()
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
            r5 = 0
        L_0x0017:
            if (r5 > r2) goto L_0x00b4
            int r6 = r5 + r2
            int r6 = r6 / 2
            android.view.View r7 = r13.getChildAt(r6)
            androidx.transition.i r7 = (androidx.transition.i) r7
            android.view.View r7 = r7.c
            b(r7, r1)
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L_0x00a6
            boolean r7 = r1.isEmpty()
            if (r7 != 0) goto L_0x00a6
            java.lang.Object r7 = r0.get(r4)
            java.lang.Object r8 = r1.get(r4)
            if (r7 == r8) goto L_0x0040
            goto L_0x00a6
        L_0x0040:
            int r7 = r0.size()
            int r8 = r1.size()
            int r7 = java.lang.Math.min(r7, r8)
            r8 = 1
        L_0x004d:
            if (r8 >= r7) goto L_0x009d
            java.lang.Object r9 = r0.get(r8)
            android.view.View r9 = (android.view.View) r9
            java.lang.Object r10 = r1.get(r8)
            android.view.View r10 = (android.view.View) r10
            if (r9 == r10) goto L_0x009a
            android.view.ViewParent r7 = r9.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r8 = r7.getChildCount()
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 21
            if (r11 < r12) goto L_0x0086
            float r11 = r9.getZ()
            float r12 = r10.getZ()
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 == 0) goto L_0x0086
            float r7 = r9.getZ()
            float r8 = r10.getZ()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x00a4
            goto L_0x00a6
        L_0x0086:
            r11 = 0
        L_0x0087:
            if (r11 >= r8) goto L_0x00a6
            int r12 = androidx.transition.d0.a(r7, r11)
            android.view.View r12 = r7.getChildAt(r12)
            if (r12 != r9) goto L_0x0094
            goto L_0x00a4
        L_0x0094:
            if (r12 != r10) goto L_0x0097
            goto L_0x00a6
        L_0x0097:
            int r11 = r11 + 1
            goto L_0x0087
        L_0x009a:
            int r8 = r8 + 1
            goto L_0x004d
        L_0x009d:
            int r8 = r1.size()
            if (r8 != r7) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r7 = 0
            goto L_0x00a7
        L_0x00a6:
            r7 = 1
        L_0x00a7:
            if (r7 == 0) goto L_0x00ac
            int r5 = r6 + 1
            goto L_0x00af
        L_0x00ac:
            int r6 = r6 + -1
            r2 = r6
        L_0x00af:
            r1.clear()
            goto L_0x0017
        L_0x00b4:
            if (r5 < 0) goto L_0x00c1
            int r0 = r13.getChildCount()
            if (r5 < r0) goto L_0x00bd
            goto L_0x00c1
        L_0x00bd:
            r13.addView(r14, r5)
            goto L_0x00c4
        L_0x00c1:
            r13.addView(r14)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.g.a(androidx.transition.i):void");
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.b) {
            d0.b(this.a).b(this);
            d0.b(this.a).a(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (this.b) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.a.setTag(C0707R.id.ghost_view_holder, null);
            d0.b(this.a).b(this);
            this.b = false;
        }
    }
}
