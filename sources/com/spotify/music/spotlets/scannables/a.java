package com.spotify.music.spotlets.scannables;

public final /* synthetic */ class a implements sg0 {
    public final /* synthetic */ ScannablesActivity a;

    public /* synthetic */ a(ScannablesActivity scannablesActivity) {
        this.a = scannablesActivity;
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        ScannablesActivity scannablesActivity = this.a;
        jgd b = scannablesActivity.H.b(((Boolean) obj).booleanValue());
        scannablesActivity.I = b;
        return b;
    }
}
