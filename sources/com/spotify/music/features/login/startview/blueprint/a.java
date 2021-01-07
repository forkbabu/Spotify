package com.spotify.music.features.login.startview.blueprint;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.loginflow.navigation.Destination;
import kotlin.jvm.internal.h;

public final /* synthetic */ class a implements x01 {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // defpackage.x01
    public final Fragment a(Destination destination) {
        Destination.BlueprintActions.Mode a2 = ((Destination.BlueprintActions) destination).a();
        int i = BlueprintActionsFragment.n0;
        h.e(a2, "mode");
        BlueprintActionsFragment blueprintActionsFragment = new BlueprintActionsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("mode", a2);
        blueprintActionsFragment.r4(bundle);
        return blueprintActionsFragment;
    }
}
