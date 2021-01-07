package com.google.android.material.datepicker;

import android.view.View;

class m implements View.OnClickListener {
    final /* synthetic */ MaterialDatePicker a;

    m(MaterialDatePicker materialDatePicker) {
        this.a = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.K0.setEnabled(this.a.z0.P1());
        this.a.I0.toggle();
        MaterialDatePicker materialDatePicker = this.a;
        materialDatePicker.n5(materialDatePicker.I0);
        this.a.l5();
    }
}
