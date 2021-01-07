package defpackage;

import android.view.View;

/* renamed from: k4  reason: default package */
public interface k4 {
    @Override // android.view.ViewGroup, defpackage.k4
    boolean onNestedFling(View view, float f, float f2, boolean z);

    @Override // android.view.ViewGroup, defpackage.k4
    boolean onNestedPreFling(View view, float f, float f2);

    @Override // android.view.ViewGroup, defpackage.k4
    void onNestedPreScroll(View view, int i, int i2, int[] iArr);

    @Override // android.view.ViewGroup, defpackage.k4
    void onNestedScroll(View view, int i, int i2, int i3, int i4);

    @Override // android.view.ViewGroup, defpackage.k4
    void onNestedScrollAccepted(View view, View view2, int i);

    @Override // android.view.ViewGroup, defpackage.k4
    boolean onStartNestedScroll(View view, View view2, int i);

    @Override // android.view.ViewGroup, defpackage.k4
    void onStopNestedScroll(View view);
}
