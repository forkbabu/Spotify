package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.f;
import com.spotify.music.C0707R;

public class AppCompatSpinner extends Spinner implements p4 {
    private static final int[] r = {16843505};
    private final e a;
    private final Context b;
    private t c;
    private SpinnerAdapter f;
    private final boolean n;
    private f o;
    int p;
    final Rect q;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().b()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                int i = Build.VERSION.SDK_INT;
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    class b implements f, DialogInterface.OnClickListener {
        androidx.appcompat.app.f a;
        private ListAdapter b;
        private CharSequence c;

        b() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public boolean b() {
            androidx.appcompat.app.f fVar = this.a;
            if (fVar != null) {
                return fVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void dismiss() {
            androidx.appcompat.app.f fVar = this.a;
            if (fVar != null) {
                fVar.dismiss();
                this.a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void e(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public CharSequence f() {
            return this.c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public Drawable g() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void h(CharSequence charSequence) {
            this.c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void i(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void j(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void k(int i, int i2) {
            if (this.b != null) {
                f.a aVar = new f.a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.c;
                if (charSequence != null) {
                    aVar.n(charSequence);
                }
                aVar.l(this.b, AppCompatSpinner.this.getSelectedItemPosition(), this);
                androidx.appcompat.app.f a2 = aVar.a();
                this.a = a2;
                ListView d = a2.d();
                if (Build.VERSION.SDK_INT >= 17) {
                    d.setTextDirection(i);
                    d.setTextAlignment(i2);
                }
                this.a.show();
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public int l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void m(ListAdapter listAdapter) {
            this.b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.b.getItemId(i));
            }
            androidx.appcompat.app.f fVar = this.a;
            if (fVar != null) {
                fVar.dismiss();
                this.a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void p(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    /* access modifiers changed from: private */
    public static class c implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter a;
        private ListAdapter b;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof d0) {
                d0 d0Var = (d0) spinnerAdapter;
                if (d0Var.getDropDownViewTheme() == null) {
                    d0Var.setDropDownViewTheme(theme);
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class d extends ListPopupWindow implements f {
        private CharSequence M;
        ListAdapter N;
        private final Rect O = new Rect();
        private int P;

        class a implements AdapterView.OnItemClickListener {
            a(AppCompatSpinner appCompatSpinner) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    AppCompatSpinner.this.performItemClick(view, i, dVar.N.getItemId(i));
                }
                d.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                d dVar = d.this;
                if (!dVar.J(AppCompatSpinner.this)) {
                    d.this.dismiss();
                    return;
                }
                d.this.I();
                d.this.a();
            }
        }

        class c implements PopupWindow.OnDismissListener {
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.a);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            x(AppCompatSpinner.this);
            D(true);
            H(0);
            F(new a(AppCompatSpinner.this));
        }

        /* access modifiers changed from: package-private */
        public void I() {
            int i;
            int i2;
            Drawable g = g();
            int i3 = 0;
            if (g != null) {
                g.getPadding(AppCompatSpinner.this.q);
                if (o0.b(AppCompatSpinner.this)) {
                    i2 = AppCompatSpinner.this.q.right;
                } else {
                    i2 = -AppCompatSpinner.this.q.left;
                }
                i3 = i2;
            } else {
                Rect rect = AppCompatSpinner.this.q;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i4 = appCompatSpinner.p;
            if (i4 == -2) {
                int a2 = appCompatSpinner.a((SpinnerAdapter) this.N, g());
                int i5 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.q;
                int i6 = (i5 - rect2.left) - rect2.right;
                if (a2 > i6) {
                    a2 = i6;
                }
                z(Math.max(a2, (width - paddingLeft) - paddingRight));
            } else if (i4 == -1) {
                z((width - paddingLeft) - paddingRight);
            } else {
                z(i4);
            }
            if (o0.b(AppCompatSpinner.this)) {
                i = (((width - paddingRight) - v()) - this.P) + i3;
            } else {
                i = paddingLeft + this.P + i3;
            }
            e(i);
        }

        /* access modifiers changed from: package-private */
        public boolean J(View view) {
            return q4.v(view) && view.getGlobalVisibleRect(this.O);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public CharSequence f() {
            return this.M;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void h(CharSequence charSequence) {
            this.M = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void j(int i) {
            this.P = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public void k(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean b2 = b();
            I();
            this.I.setInputMethodMode(2);
            a();
            r rVar = this.c;
            rVar.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                rVar.setTextDirection(i);
                rVar.setTextAlignment(i2);
            }
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            r rVar2 = this.c;
            if (b() && rVar2 != null) {
                rVar2.setListSelectionHidden(false);
                rVar2.setSelection(selectedItemPosition);
                if (rVar2.getChoiceMode() != 0) {
                    rVar2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!b2 && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.I.setOnDismissListener(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.f
        public void m(ListAdapter listAdapter) {
            super.m(listAdapter);
            this.N = listAdapter;
        }
    }

    static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();
        boolean a;

        class a implements Parcelable.Creator<e> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : 0);
        }

        e(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }
    }

    /* access modifiers changed from: package-private */
    public interface f {
        boolean b();

        int c();

        void dismiss();

        void e(int i);

        CharSequence f();

        Drawable g();

        void h(CharSequence charSequence);

        void i(int i);

        void j(int i);

        void k(int i, int i2);

        int l();

        void m(ListAdapter listAdapter);

        void p(Drawable drawable);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.spinnerStyle);
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.q);
        Rect rect = this.q;
        return i2 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.o.k(getTextDirection(), getTextAlignment());
        } else {
            this.o.k(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.a;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        f fVar = this.o;
        if (fVar != null) {
            return fVar.c();
        }
        int i = Build.VERSION.SDK_INT;
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        f fVar = this.o;
        if (fVar != null) {
            return fVar.l();
        }
        int i = Build.VERSION.SDK_INT;
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.o != null) {
            return this.p;
        }
        int i = Build.VERSION.SDK_INT;
        return super.getDropDownWidth();
    }

    /* access modifiers changed from: package-private */
    public final f getInternalPopup() {
        return this.o;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        f fVar = this.o;
        if (fVar != null) {
            return fVar.g();
        }
        int i = Build.VERSION.SDK_INT;
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        f fVar = this.o;
        return fVar != null ? fVar.f() : super.getPrompt();
    }

    @Override // defpackage.p4
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // defpackage.p4
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.Spinner, android.view.View, android.widget.AdapterView, android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.o;
        if (fVar != null && fVar.b()) {
            this.o.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.o != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (eVar.a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.o;
        eVar.a = fVar != null && fVar.b();
        return eVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        t tVar = this.c;
        if (tVar == null || !tVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        f fVar = this.o;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.b()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.a;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        f fVar = this.o;
        if (fVar != null) {
            fVar.j(i);
            this.o.e(i);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        super.setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        f fVar = this.o;
        if (fVar != null) {
            fVar.i(i);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        super.setDropDownVerticalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.o != null) {
            this.p = i;
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        super.setDropDownWidth(i);
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.o;
        if (fVar != null) {
            fVar.p(drawable);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        super.setPopupBackgroundDrawable(drawable);
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(i0.b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        f fVar = this.o;
        if (fVar != null) {
            fVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // defpackage.p4
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    @Override // defpackage.p4
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r5 != null) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int[] r0 = defpackage.h0.w
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r9.q = r1
            android.content.Context r1 = r9.getContext()
            androidx.appcompat.widget.c0.a(r9, r1)
            r1 = 0
            androidx.appcompat.widget.h0 r2 = androidx.appcompat.widget.h0.v(r10, r11, r0, r12, r1)
            androidx.appcompat.widget.e r3 = new androidx.appcompat.widget.e
            r3.<init>(r9)
            r9.a = r3
            r3 = 4
            int r3 = r2.n(r3, r1)
            if (r3 == 0) goto L_0x002e
            s0 r4 = new s0
            r4.<init>(r10, r3)
            r9.b = r4
            goto L_0x0030
        L_0x002e:
            r9.b = r10
        L_0x0030:
            r3 = 0
            r4 = -1
            int[] r5 = androidx.appcompat.widget.AppCompatSpinner.r     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            android.content.res.TypedArray r5 = r10.obtainStyledAttributes(r11, r5, r12, r1)     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            boolean r6 = r5.hasValue(r1)     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            if (r6 == 0) goto L_0x0052
            int r4 = r5.getInt(r1, r1)     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            goto L_0x0052
        L_0x0043:
            r10 = move-exception
            r3 = r5
            goto L_0x0049
        L_0x0046:
            goto L_0x0050
        L_0x0048:
            r10 = move-exception
        L_0x0049:
            if (r3 == 0) goto L_0x004e
            r3.recycle()
        L_0x004e:
            throw r10
        L_0x004f:
            r5 = r3
        L_0x0050:
            if (r5 == 0) goto L_0x0055
        L_0x0052:
            r5.recycle()
        L_0x0055:
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x008e
            if (r4 == r6) goto L_0x005c
            goto L_0x009c
        L_0x005c:
            androidx.appcompat.widget.AppCompatSpinner$d r4 = new androidx.appcompat.widget.AppCompatSpinner$d
            android.content.Context r7 = r9.b
            r4.<init>(r7, r11, r12)
            android.content.Context r7 = r9.b
            androidx.appcompat.widget.h0 r0 = androidx.appcompat.widget.h0.v(r7, r11, r0, r12, r1)
            r7 = 3
            r8 = -2
            int r7 = r0.m(r7, r8)
            r9.p = r7
            android.graphics.drawable.Drawable r7 = r0.g(r6)
            android.widget.PopupWindow r8 = r4.I
            r8.setBackgroundDrawable(r7)
            java.lang.String r5 = r2.o(r5)
            r4.h(r5)
            r0.w()
            r9.o = r4
            androidx.appcompat.widget.k r0 = new androidx.appcompat.widget.k
            r0.<init>(r9, r9, r4)
            r9.c = r0
            goto L_0x009c
        L_0x008e:
            androidx.appcompat.widget.AppCompatSpinner$b r0 = new androidx.appcompat.widget.AppCompatSpinner$b
            r0.<init>()
            r9.o = r0
            java.lang.String r4 = r2.o(r5)
            r0.h(r4)
        L_0x009c:
            java.lang.CharSequence[] r0 = r2.q(r1)
            if (r0 == 0) goto L_0x00b3
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r10, r4, r0)
            r10 = 2131625001(0x7f0e0429, float:1.8877198E38)
            r1.setDropDownViewResource(r10)
            r9.setAdapter(r1)
        L_0x00b3:
            r2.w()
            r9.n = r6
            android.widget.SpinnerAdapter r10 = r9.f
            if (r10 == 0) goto L_0x00c1
            r9.setAdapter(r10)
            r9.f = r3
        L_0x00c1:
            androidx.appcompat.widget.e r10 = r9.a
            r10.d(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.n) {
            this.f = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.o != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            this.o.m(new c(spinnerAdapter, context.getTheme()));
        }
    }
}
