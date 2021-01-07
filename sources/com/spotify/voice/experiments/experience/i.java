package com.spotify.voice.experiments.experience;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.voice.experiments.experience.view.ExperimentsViewFactory;

public final class i implements fjf<ExperimentsViewFactory.Experiment> {
    private final wlf<Fragment> a;

    public i(wlf<Fragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Bundle D2 = this.a.get().D2();
        if (D2 != null) {
            return ExperimentsViewFactory.Experiment.h(D2.getString("com.spotify.com.voice.experiments.experience.KEY_DEEPLINK"));
        }
        Logger.n("Unable to access fragment bundle, using generic experience", new Object[0]);
        return ExperimentsViewFactory.Experiment.GENERIC;
    }
}
