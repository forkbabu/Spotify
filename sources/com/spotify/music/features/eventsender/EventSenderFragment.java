package com.spotify.music.features.eventsender;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.messages.CoreIntegrationTestEvent;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.rxjava2.q;
import java.util.Arrays;
import java.util.List;

public class EventSenderFragment extends LifecycleListenableFragment implements s, mfd {
    static final List<String> j0 = Arrays.asList("one", "two", "three");
    m05 h0;
    private final q i0 = new q();

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.eventsender_fragment_title);
    }

    public /* synthetic */ void K4(CoreIntegrationTestEvent coreIntegrationTestEvent, View view) {
        this.i0.a(this.h0.a(coreIntegrationTestEvent).subscribe(a.a));
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        this.i0.c();
        super.P3();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public Fragment e() {
        return this;
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.EVENTSENDER_DEBUG;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "fragment_eventsender";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.EVENTSENDER_DEBUG, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.fragment_eventsender, viewGroup, false);
        CoreIntegrationTestEvent.b l = CoreIntegrationTestEvent.l();
        l.n("this is a test string");
        l.m(j0);
        ((Button) viewGroup2.findViewById(C0707R.id.eventsender_core_event_btn)).setOnClickListener(new b(this, (CoreIntegrationTestEvent) l.build()));
        return viewGroup2;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.U;
    }
}
