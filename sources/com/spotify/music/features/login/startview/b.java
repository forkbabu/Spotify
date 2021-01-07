package com.spotify.music.features.login.startview;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

public final /* synthetic */ class b implements View.OnLongClickListener {
    public final /* synthetic */ StartFragment a;

    public /* synthetic */ b(StartFragment startFragment) {
        this.a = startFragment;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        StartFragment startFragment = this.a;
        if (!startFragment.l0.isPresent()) {
            return true;
        }
        Intent intent = startFragment.l0.get();
        intent.getClass();
        Intent intent2 = intent;
        intent2.setData(Uri.parse("spotify:internal:debug:pre_sign_up_experiment"));
        startFragment.l4().startActivity(intent2);
        return true;
    }
}
