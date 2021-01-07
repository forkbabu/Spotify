package com.spotify.music.features.voice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.z;
import java.util.List;

public class VoiceActivity extends ss2 {
    public static final /* synthetic */ int J = 0;
    g<PlayerState> G;
    s<d7a> H;
    private final q I = new q();

    public static Intent U0(Context context, String str, String str2, String str3, List<String> list) {
        return new Intent(context, VoiceActivity.class).putExtra("com.spotify.voice.experience.KEY_EXTRA_ELEMENT_ID", str).putExtra("com.spotify.voice.experience.KEY_EXTRA_SOURCE_ID", str2).putExtra("com.spotify.voice.experience.KEY_EXTRA_DEEPLINK", str3).putExtra("com.spotify.voice.experience.KEY_EXTRA_DEEPLINK_PARAM", TextUtils.join(",", list));
    }

    private static z<u3<String, String>> V0(g<PlayerState> gVar, s<d7a> sVar) {
        return z.R(gVar.O(c.a).D(""), sVar.R(d7a.b()), d.a);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_voice);
        if (v0().U("VoiceFragment") == null) {
            this.I.a(V0(this.G, this.H).subscribe(new e(this)));
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.I.c();
    }

    @Override // defpackage.ss2, androidx.fragment.app.c, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.I.a(V0(this.G, this.H).subscribe(new h(this, intent)));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, C0707R.anim.fade_out_hard);
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.VOICE_LISTENING, ViewUris.f2.toString());
    }
}
