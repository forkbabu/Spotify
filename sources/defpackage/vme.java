package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: vme  reason: default package */
public abstract class vme implements TextWatcher {
    public abstract void a(CharSequence charSequence);

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        a(charSequence);
    }
}
