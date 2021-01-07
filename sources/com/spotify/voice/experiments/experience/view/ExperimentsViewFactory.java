package com.spotify.voice.experiments.experience.view;

import android.view.ViewGroup;
import com.spotify.mobius.g;
import com.spotify.music.C0707R;
import com.spotify.remoteconfig.AndroidLibsVoiceExperimentsProperties;
import com.squareup.picasso.Picasso;

public class ExperimentsViewFactory {
    private final Experiment a;
    private final x7f b;
    private final y7f c;
    private final z7f d;
    private final Picasso e;
    private final AndroidLibsVoiceExperimentsProperties f;

    public enum Experiment {
        GUESSING_GAME("spotify:voice-experiments:guessing-dialog", C0707R.layout.fragment_voice_guessing_game_experiments, true),
        INTRODUCER("spotify:voice-experiments:introducer", C0707R.layout.fragment_voice_introducer, false),
        GENERIC("", C0707R.layout.fragment_voice_generic_experiments, false);
        
        private final int mLayoutRes;
        private final boolean mStopOnDismiss;
        private final String mUri;

        private Experiment(String str, int i, boolean z) {
            this.mUri = str;
            this.mLayoutRes = i;
            this.mStopOnDismiss = z;
        }

        public static Experiment h(String str) {
            Experiment experiment = GUESSING_GAME;
            if (experiment.mUri.equals(str)) {
                return experiment;
            }
            Experiment experiment2 = INTRODUCER;
            if (experiment2.mUri.equals(str)) {
                return experiment2;
            }
            return GENERIC;
        }

        public String i() {
            if (this.mUri.isEmpty()) {
                return "";
            }
            String str = this.mUri;
            return str.substring(str.lastIndexOf(58) + 1);
        }
    }

    ExperimentsViewFactory(Experiment experiment, x7f x7f, y7f y7f, z7f z7f, Picasso picasso, AndroidLibsVoiceExperimentsProperties androidLibsVoiceExperimentsProperties) {
        this.a = experiment;
        this.b = x7f;
        this.c = y7f;
        this.d = z7f;
        this.e = picasso;
        this.f = androidLibsVoiceExperimentsProperties;
    }

    public g<t8f, q2f> a(ViewGroup viewGroup) {
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            return new GuessingGameVoiceViews(viewGroup, this.c, this.e);
        }
        if (ordinal != 1) {
            return new g1(viewGroup, this.b);
        }
        return new k1(viewGroup, this.d, this.e, this.f.b());
    }

    public int b() {
        return this.a.mLayoutRes;
    }

    public boolean c() {
        return this.a.mStopOnDismiss;
    }
}
