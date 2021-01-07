package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.x;
import com.google.common.base.Optional;
import com.spotify.android.flags.c;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarManager;
import com.spotify.android.paste.app.d;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;

public class PremiumDestinationActivity extends ss2 {
    c G;
    r H;
    private final View.OnClickListener I = new a();

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PremiumDestinationActivity.this.finish();
        }
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_premium_destination);
        com.spotify.android.goldenpath.a.b(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(C0707R.id.toolbar_wrapper);
        com.spotify.android.glue.components.toolbar.c c = l70.c(this, viewGroup);
        e eVar = (e) c;
        d.d(eVar.getView(), this);
        viewGroup.addView(eVar.getView());
        ToolbarManager toolbarManager = new ToolbarManager(this, c, this.I);
        toolbarManager.h(true);
        toolbarManager.g(true);
        x i = v0().i();
        i.b(C0707R.id.fragment_container, this.H.b(Optional.absent(), this.G).e());
        i.i();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.PREMIUM_DESTINATION, ViewUris.b1.toString());
    }
}
