package com.spotify.music.superbird.setup.steps.testsound;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.superbird.setup.SetupView;
import com.spotify.music.superbird.setup.m;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class TestSoundFragment extends DaggerFragment implements s {
    public m h0;

    /* compiled from: java-style lambda group */
    static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                TestSoundFragment.K4((TestSoundFragment) this.b);
            } else if (i == 1) {
                TestSoundFragment.K4((TestSoundFragment) this.b);
            } else if (i == 2) {
                TestSoundFragment.K4((TestSoundFragment) this.b);
            } else {
                throw null;
            }
        }
    }

    public TestSoundFragment() {
        super(C0707R.layout.fragment_test_sound);
    }

    public static final void K4(TestSoundFragment testSoundFragment) {
        View a3 = testSoundFragment.a3();
        if (a3 != null) {
            View findViewById = a3.findViewById(C0707R.id.help_instruction_link_group);
            h.d(findViewById, "it.findViewById<Group>(R…p_instruction_link_group)");
            ((Group) findViewById).setVisibility(8);
            View findViewById2 = a3.findViewById(C0707R.id.test_sound_image);
            h.d(findViewById2, "it.findViewById<ImageView>(R.id.test_sound_image)");
            ((ImageView) findViewById2).setVisibility(8);
            View findViewById3 = a3.findViewById(C0707R.id.help_instruction_description_group);
            h.d(findViewById3, "it.findViewById<Group>(R…uction_description_group)");
            ((Group) findViewById3).setVisibility(0);
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        SetupView setupView = (SetupView) view.findViewById(C0707R.id.test_sound_setup_view);
        setupView.setOnButtonClick(new TestSoundFragment$onViewCreated$$inlined$apply$lambda$1(this));
        setupView.setOnCloseClick(new TestSoundFragment$onViewCreated$$inlined$apply$lambda$2(this));
        ((TextView) view.findViewById(C0707R.id.help_instruction_link)).setOnClickListener(new a(0, this));
        ((TextView) view.findViewById(C0707R.id.help_instruction)).setOnClickListener(new a(1, this));
        ((SpotifyIconView) view.findViewById(C0707R.id.arrow_down_icon)).setOnClickListener(new a(2, this));
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.SUPERBIRD_SETUP_TESTSOUND.name();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.SUPERBIRD_SETUP_TESTSOUND, ViewUris.B2.toString());
        h.d(b, "PageViewObservable.creat…ESTSOUND.toString()\n    )");
        return b;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.r1;
        h.d(ifd, "FeatureIdentifiers.SUPERBIRD");
        return ifd;
    }
}
