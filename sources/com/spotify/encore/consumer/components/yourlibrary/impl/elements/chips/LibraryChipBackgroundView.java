package com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class LibraryChipBackgroundView extends View implements zud {
    private final yud animatorHelper;
    private Order order;
    private View sibling;

    public LibraryChipBackgroundView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LibraryChipBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LibraryChipBackgroundView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.animatorHelper.a();
    }

    public final Order getOrder$libs_encore_consumer_components_yourlibrary_impl() {
        return this.order;
    }

    public final View getSibling() {
        return this.sibling;
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        l b = this.animatorHelper.b();
        h.d(b, "animatorHelper.stateListAnimatorCompat");
        return b;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.animatorHelper.c();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArr;
        boolean z = true;
        if (this.order == null) {
            iArr = super.onCreateDrawableState(i);
        } else {
            int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
            Order order2 = this.order;
            h.c(order2);
            iArr = View.mergeDrawableStates(onCreateDrawableState, order2.getState());
        }
        View view = this.sibling;
        if (view != null) {
            h.d(iArr, "state");
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                if (iArr[i2] == 16842919) {
                    break;
                }
                i2++;
            }
            view.setPressed(z);
        }
        h.d(iArr, "state");
        return iArr;
    }

    public final void setOrder$libs_encore_consumer_components_yourlibrary_impl(Order order2) {
        this.order = order2;
        refreshDrawableState();
    }

    public final void setSibling(View view) {
        this.sibling = view;
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        h.e(lVar, "animatorCompat");
        this.animatorHelper.d(lVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LibraryChipBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.animatorHelper = new yud(this);
    }
}
