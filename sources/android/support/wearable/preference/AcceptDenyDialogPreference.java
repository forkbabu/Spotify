package android.support.wearable.preference;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;
import android.support.wearable.view.a;
import android.util.AttributeSet;

public class AcceptDenyDialogPreference extends Preference implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
    private boolean a;
    private boolean b;
    private CharSequence c;
    private CharSequence f;
    private Drawable n;
    private a o;
    private int p;

    public AcceptDenyDialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context, attributeSet, i, 0);
    }

    private void d(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.a, i, i2);
        String string = obtainStyledAttributes.getString(2);
        this.c = string;
        if (string == null) {
            this.c = getTitle();
        }
        this.f = obtainStyledAttributes.getString(1);
        this.n = obtainStyledAttributes.getDrawable(0);
        this.a = obtainStyledAttributes.getBoolean(4, true);
        this.b = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public void h(Bundle bundle) {
        Context context = getContext();
        this.p = -2;
        a aVar = new a(context);
        this.o = aVar;
        aVar.setTitle(this.c);
        this.o.b(this.n);
        this.o.c(this.f);
        if (this.a) {
            this.o.a(-1, this);
        }
        if (this.b) {
            this.o.a(-2, this);
        }
        g();
        if (bundle != null) {
            this.o.onRestoreInstanceState(bundle);
        }
        this.o.setOnDismissListener(this);
        this.o.show();
    }

    /* access modifiers changed from: protected */
    @Override // android.preference.Preference
    public void onClick() {
        a aVar = this.o;
        if (aVar == null || !aVar.isShowing()) {
            h(null);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.o = null;
    }

    @Override // android.preference.Preference
    public void onPrepareForRemoval() {
        a aVar = this.o;
        if (aVar != null && aVar.isShowing()) {
            this.o.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.preference.Preference
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
    @Override // android.preference.Preference
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        a aVar = this.o;
        if (aVar == null || !aVar.isShowing()) {
            return onSaveInstanceState;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.a = true;
        savedState.b = this.o.onSaveInstanceState();
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

    public AcceptDenyDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet, 0, 0);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.p = i;
    }
}
