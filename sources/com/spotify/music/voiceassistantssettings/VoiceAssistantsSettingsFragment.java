package com.spotify.music.voiceassistantssettings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.voiceassistantssettings.alexacard.AlexaCardView;
import com.spotify.music.voiceassistantssettings.alexacard.b;
import dagger.android.support.a;
import kotlin.jvm.internal.h;

public final class VoiceAssistantsSettingsFragment extends Fragment implements s {
    private AlexaCardView g0;
    public b h0;
    public c i0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        String string = context.getString(C0707R.string.voice_assistants_settings_title);
        h.d(string, "context.getString(R.stri…ssistants_settings_title)");
        return string;
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        b bVar = this.h0;
        if (bVar != null) {
            AlexaCardView alexaCardView = this.g0;
            if (alexaCardView != null) {
                bVar.h(alexaCardView);
                c cVar = this.i0;
                if (cVar != null) {
                    AlexaCardView alexaCardView2 = this.g0;
                    if (alexaCardView2 != null) {
                        cVar.c(alexaCardView2);
                    } else {
                        h.k("alexaCardView");
                        throw null;
                    }
                } else {
                    h.k("voiceAssistantsPresenter");
                    throw null;
                }
            } else {
                h.k("alexaCardView");
                throw null;
            }
        } else {
            h.k("alexaCardPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        b bVar = this.h0;
        if (bVar != null) {
            bVar.i();
            c cVar = this.i0;
            if (cVar != null) {
                cVar.d();
            } else {
                h.k("voiceAssistantsPresenter");
                throw null;
            }
        } else {
            h.k("alexaCardPresenter");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        z1();
        String name = kfd.E1.getName();
        h.d(name, "featureIdentifier.name");
        return name;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.SETTINGS_VOICE_ASSISTANTS, null);
        h.d(b, "PageViewObservable.creat…ETTINGS_VOICE_ASSISTANTS)");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        View inflate = LayoutInflater.from(l4()).inflate(C0707R.layout.layout_voice_assistants_settings, viewGroup, false);
        View findViewById = inflate.findViewById(C0707R.id.alexa_card_view);
        h.d(findViewById, "rootView.findViewById(R.id.alexa_card_view)");
        AlexaCardView alexaCardView = (AlexaCardView) findViewById;
        this.g0 = alexaCardView;
        if (alexaCardView != null) {
            alexaCardView.setParentView((ViewGroup) inflate);
            return inflate;
        }
        h.k("alexaCardView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        b bVar = this.h0;
        if (bVar != null) {
            bVar.f();
        } else {
            h.k("alexaCardPresenter");
            throw null;
        }
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.E1;
        h.d(ifd, "FeatureIdentifiers.VOICE_ASSISTANTS_SETTINGS");
        return ifd;
    }
}
