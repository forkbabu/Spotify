package android.support.wearable.preference;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.support.wearable.view.k;
import android.util.AttributeSet;

public class WearableDialogPreference extends DialogPreference {
    private k a;
    private CharSequence b;
    private int c;

    public WearableDialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context, attributeSet, i, 0);
    }

    private void d(Context context, AttributeSet attributeSet, int i, int i2) {
        this.a = new k(context.getResources(), context.getTheme());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.p, i, i2);
        this.a.f(obtainStyledAttributes.getDrawable(3));
        this.a.e(obtainStyledAttributes.getDrawable(1));
        this.a.d(obtainStyledAttributes.getDrawable(0));
        this.b = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
    }

    @Override // android.preference.DialogPreference, android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        super.onClick(dialogInterface, i);
        this.c = i;
    }

    @Override // android.preference.DialogPreference, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    /* access modifiers changed from: protected */
    @Override // android.preference.DialogPreference
    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder.setNeutralButton(this.b, this));
    }

    /* access modifiers changed from: protected */
    @Override // android.preference.DialogPreference
    public void showDialog(Bundle bundle) {
        super.showDialog(bundle);
        this.a.a((AlertDialog) getDialog());
        this.c = 0;
    }

    public WearableDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet, 0, 0);
    }
}
