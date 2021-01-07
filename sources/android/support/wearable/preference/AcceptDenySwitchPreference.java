package android.support.wearable.preference;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;
import android.preference.SwitchPreference;
import android.support.wearable.view.a;
import android.util.AttributeSet;

public class AcceptDenySwitchPreference extends SwitchPreference implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean f;
    private CharSequence n;
    private CharSequence o;
    private Drawable p;
    private a q;
    private int r;

    public AcceptDenySwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context, attributeSet, i, 0);
    }

    private void d(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.b, i, i2);
        String string = obtainStyledAttributes.getString(2);
        this.n = string;
        if (string == null) {
            this.n = getTitle();
        }
        this.o = obtainStyledAttributes.getString(1);
        this.p = obtainStyledAttributes.getDrawable(0);
        this.c = obtainStyledAttributes.getBoolean(6, true);
        this.f = obtainStyledAttributes.getBoolean(5, true);
        this.a = obtainStyledAttributes.getBoolean(4, true);
        this.b = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public void h(Bundle bundle) {
        Context context = getContext();
        this.r = -2;
        a aVar = new a(context);
        this.q = aVar;
        aVar.setTitle(this.n);
        this.q.b(this.p);
        this.q.c(this.o);
        if (this.c) {
            this.q.a(-1, this);
        }
        if (this.f) {
            this.q.a(-2, this);
        }
        g();
        if (bundle != null) {
            this.q.onRestoreInstanceState(bundle);
        }
        this.q.setOnDismissListener(this);
        this.q.show();
    }

    /* access modifiers changed from: protected */
    @Override // android.preference.TwoStatePreference, android.preference.Preference
    public void onClick() {
        a aVar = this.q;
        if (aVar == null || !aVar.isShowing()) {
            boolean z = !isChecked();
            if ((this.a && z) || (this.b && !z)) {
                h(null);
            } else if (callChangeListener(Boolean.valueOf(z))) {
                setChecked(z);
            }
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.q = null;
        if (this.r == -1) {
            boolean z = !isChecked();
            if (callChangeListener(Boolean.valueOf(z))) {
                setChecked(z);
            }
        }
    }

    @Override // android.preference.Preference
    public void onPrepareForRemoval() {
        a aVar = this.q;
        if (aVar != null && aVar.isShowing()) {
            this.q.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.preference.TwoStatePreference, android.preference.Preference
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.a) {
            h(savedState.b);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.preference.TwoStatePreference, android.preference.Preference
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        a aVar = this.q;
        if (aVar == null || !aVar.isShowing()) {
            return onSaveInstanceState;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.a = true;
        savedState.b = this.q.onSaveInstanceState();
        return savedState;
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean a;
        Bundle b;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() != 1 ? false : true;
            this.b = parcel.readBundle();
        }

        @Override // android.os.Parcelable, android.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
            parcel.writeBundle(this.b);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public AcceptDenySwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet, 0, 0);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.r = i;
    }
}
