package com.spotify.music.sociallistening.participantlist.impl;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.ui.fragments.s;

public final class m {
    public static yn0 a(Bundle bundle) {
        yn0 yn0 = (yn0) bundle.getParcelable("FeatureIdentifier.InternalReferrer");
        if (yn0 != null) {
            return yn0;
        }
        throw new IllegalArgumentException("The feature identifier is undeclared. Have you forgotten to set it with ArgumentsHelper?");
    }

    public static yn0 b(s sVar) {
        sVar.getClass();
        sVar.e().getClass();
        return a(sVar.e().k4());
    }

    public static void c(Intent intent, yn0 yn0) {
        intent.getClass();
        yn0.getClass();
        intent.putExtra("FeatureIdentifier.InternalReferrer", yn0);
    }

    public static void d(Fragment fragment, yn0 yn0) {
        fragment.getClass();
        yn0.getClass();
        Bundle D2 = fragment.D2();
        if (D2 == null) {
            D2 = je.D(fragment);
        }
        D2.putParcelable("FeatureIdentifier.InternalReferrer", yn0);
    }
}
