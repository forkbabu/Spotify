package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class MaterialTextInputPicker<S> extends PickerFragment<S> {
    private d<S> h0;
    private a i0;

    class a extends s<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.s
        public void a(S s) {
            Iterator<s<S>> it = MaterialTextInputPicker.this.g0.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        bundle.putParcelable("DATE_SELECTOR_KEY", this.h0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.i0);
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (bundle == null) {
            bundle = D2();
        }
        this.h0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.i0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.h0.C1(layoutInflater, viewGroup, bundle, this.i0, new a());
    }
}
