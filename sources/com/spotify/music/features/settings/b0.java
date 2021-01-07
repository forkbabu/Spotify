package com.spotify.music.features.settings;

import android.content.Context;
import android.view.View;
import com.spotify.music.libs.viewuri.ViewUris;

public final /* synthetic */ class b0 implements View.OnClickListener {
    public final /* synthetic */ SettingsFragment a;

    public /* synthetic */ b0(SettingsFragment settingsFragment) {
        this.a = settingsFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SettingsFragment settingsFragment = this.a;
        settingsFragment.getClass();
        Context context = view.getContext();
        String cVar = ViewUris.b1.toString();
        settingsFragment.N0.f("go_premium", ViewUris.c0.toString(), null, cVar);
        context.startActivity(settingsFragment.X0.b(context, cVar).a());
    }
}
