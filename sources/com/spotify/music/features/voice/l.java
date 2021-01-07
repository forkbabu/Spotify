package com.spotify.music.features.voice;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.voice.VoiceSourceElement;
import com.spotify.music.libs.voice.b;

public final /* synthetic */ class l implements dif {
    public final /* synthetic */ b a;

    public /* synthetic */ l(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.dif
    public final void a(Context context, boolean z) {
        b bVar = this.a;
        ifd ifd = kfd.w1;
        VoiceSourceElement voiceSourceElement = VoiceSourceElement.WAKEWORD;
        if (z) {
            Intent putExtra = new Intent("android.intent.action.VIEW", Uri.parse(ViewUris.f2.toString())).putExtra("com.spotify.voice.experience.KEY_EXTRA_ELEMENT_ID", voiceSourceElement.d()).putExtra("com.spotify.voice.experience.KEY_EXTRA_SOURCE_ID", ifd.getName());
            putExtra.addFlags(268435456);
            context.startActivity(putExtra);
            return;
        }
        bVar.b(context, voiceSourceElement, ifd);
    }
}
