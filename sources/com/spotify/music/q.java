package com.spotify.music;

import android.view.View;
import com.google.common.base.Supplier;
import com.spotify.music.navigation.BackNavigationInteractionType;
import com.spotify.music.navigation.r;

public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ Supplier a;
    public final /* synthetic */ r b;

    public /* synthetic */ q(Supplier supplier, r rVar) {
        this.a = supplier;
        this.b = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Supplier supplier = this.a;
        r rVar = this.b;
        if (!((Boolean) supplier.get()).booleanValue()) {
            rVar.a(BackNavigationInteractionType.UP_BUTTON_PRESSED);
        }
    }
}
