package com.spotify.music.features.widget;

import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.a;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.player.controls.c;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import com.spotify.rxjava2.q;
import com.spotify.ubi.specification.factories.p;

public class g implements SpotifyServiceIntentProcessor, d {
    private final wlf<com.spotify.player.controls.d> a;
    private final ere b;
    private final p c;
    private final q f = new q();
    private com.spotify.player.controls.d n;

    g(wlf<com.spotify.player.controls.d> wlf, ere ere, p pVar) {
        this.a = wlf;
        this.b = ere;
        this.c = pVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result a(boolean z, Intent intent) {
        SpotifyServiceIntentProcessor.Result result = SpotifyServiceIntentProcessor.Result.NOT_PROCESSED;
        if (this.n == null) {
            return result;
        }
        intent.getAction().getClass();
        String action = intent.getAction();
        action.hashCode();
        char c2 = 65535;
        switch (action.hashCode()) {
            case -1280787186:
                if (action.equals("com.spotify.music.feature.widget.PAUSE")) {
                    c2 = 0;
                    break;
                }
                break;
            case -988802059:
                if (action.equals("com.spotify.music.feature.widget.RESUME")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1426729195:
                if (action.equals("com.spotify.music.feature.widget.SKIP_NEXT")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1426800683:
                if (action.equals("com.spotify.music.feature.widget.SKIP_PREV")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.b.a(this.c.b().b().b().b().a(""));
                this.f.a(this.n.a(c.c()).subscribe());
                break;
            case 1:
                this.b.a(this.c.b().b().b().b().b(""));
                this.f.a(this.n.a(c.e()).subscribe());
                break;
            case 2:
                this.b.a(this.c.b().b().b().c().a(""));
                this.f.a(this.n.a(c.i()).subscribe());
                break;
            case 3:
                this.b.a(this.c.b().b().b().d().a(""));
                this.f.a(this.n.a(c.l(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build())).subscribe());
                break;
            default:
                Assertion.g(String.format("SpotifyWidgetPlayerIntentProcessor cannot handle %s", intent));
                return result;
        }
        return SpotifyServiceIntentProcessor.Result.PROCESSED;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public /* synthetic */ SpotifyServiceIntentProcessor.Result b(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        return a.a(this, z, intent, aVar);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.n = this.a.get();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.n = null;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "SpotifyWidgetPlayerIntentProcessor";
    }
}
