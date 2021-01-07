package com.spotify.music.sociallistening.participantlist.impl;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.x;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarManager;
import com.spotify.android.goldenpath.a;
import com.spotify.android.paste.app.d;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;

public class SocialListeningActivity extends ss2 {
    public static final /* synthetic */ int H = 0;
    private c G;

    public c U0() {
        c cVar = this.G;
        cVar.getClass();
        return cVar;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, C0707R.anim.slide_out_from_right);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(C0707R.anim.slide_in_from_left, 0);
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_social_listening);
        ViewGroup viewGroup = (ViewGroup) findViewById(C0707R.id.toolbar_wrapper);
        a.b(this);
        c c = l70.c(this, viewGroup);
        this.G = c;
        d.d(((e) c).getView(), this);
        viewGroup.addView(this.G.getView());
        ToolbarManager toolbarManager = new ToolbarManager(this, this.G, new f(this));
        toolbarManager.h(true);
        toolbarManager.g(true);
        x i = v0().i();
        i.q(C0707R.id.fragment_container, new ParticipantListFragment(), "tag_participant_list_fragment");
        i.i();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.SOCIAL_LISTENING_PARTICIPANTLIST, null);
    }
}
