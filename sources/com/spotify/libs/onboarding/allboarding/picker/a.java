package com.spotify.libs.onboarding.allboarding.picker;

import android.view.View;
import kotlin.jvm.internal.h;

/* compiled from: java-style lambda group */
public final class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        if (i == 0) {
            PickerFragment.N4((PickerFragment) this.c).v(((c) this.b).b());
        } else if (i == 1) {
            PickerFragment.N4((PickerFragment) this.c).m(((c) this.b).b());
        } else if (i == 2) {
            u N4 = PickerFragment.N4((PickerFragment) this.c);
            String b2 = ((c) this.b).b();
            N4.getClass();
            h.e(b2, "postUrl");
            N4.m(b2);
        } else {
            throw null;
        }
    }
}
