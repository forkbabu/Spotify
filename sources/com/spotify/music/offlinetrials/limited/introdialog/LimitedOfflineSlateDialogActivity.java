package com.spotify.music.offlinetrials.limited.introdialog;

import android.os.Bundle;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.music.offlinetrials.limited.introdialog.a;
import com.spotify.music.slate.container.view.SlateView;
import com.spotify.music.slate.container.view.card.CardInteractionHandler;
import com.spotify.music.slate.model.u;

public class LimitedOfflineSlateDialogActivity extends ss2 implements c.a {
    public static final /* synthetic */ int I = 0;
    t G;
    private SlateView H;

    class a extends CardInteractionHandler.c {
        a() {
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void a(CardInteractionHandler.SwipeDirection swipeDirection) {
            LimitedOfflineSlateDialogActivity.this.finish();
        }
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.b0;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SlateView slateView = new SlateView(this);
        this.H = slateView;
        slateView.setInteractionListener(new a());
        setContentView(this.H);
        SlateView slateView2 = this.H;
        a.C0319a aVar = new a.C0319a();
        aVar.d(u.b(C0707R.string.user_mix_intro_dialog_title));
        aVar.c(u.b(C0707R.string.user_mix_intro_slate_dialog_subtitle));
        aVar.b(u.b(C0707R.string.user_mix_intro_dialog_button_ok));
        slateView2.d(new g(aVar.a(), this.G));
        this.H.setFooter(new d(this));
        this.H.setHeader(c.a);
    }
}
