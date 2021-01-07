package com.spotify.music.features.settings.adapter;

import com.google.common.base.Predicate;
import com.spotify.music.features.settings.adapter.Item;
import java.util.EnumSet;

/* access modifiers changed from: package-private */
public final class k2 implements Predicate<Item> {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean f;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;

    k2(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.f = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.q = z8;
        this.r = z9;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.common.base.Predicate
    public boolean apply(Item item) {
        Item item2 = item;
        boolean z = false;
        if (item2 == null) {
            return false;
        }
        EnumSet<Item.DisableWhen> d = item2.d();
        boolean contains = d.contains(Item.DisableWhen.ALWAYS) | (this.a && d.contains(Item.DisableWhen.PLAYING_REMOTELY)) | (this.c && d.contains(Item.DisableWhen.DATA_SAVER_MODE)) | ((this.a || !this.b) && d.contains(Item.DisableWhen.PLAYING_REMOTELY_OR_NORMALIZATION_DISABLED)) | (this.f && d.contains(Item.DisableWhen.EXPLICIT_SETTINGS_LOCKED)) | (!this.n && d.contains(Item.DisableWhen.NO_HOMETHING_DEVICES)) | (this.o && d.contains(Item.DisableWhen.RECORD_AUDIO_PERMISSION_DISABLED)) | (this.p && d.contains(Item.DisableWhen.CAR_MODE_AUTO_ACTIVATION_DISABLED)) | (this.q && d.contains(Item.DisableWhen.CAR_MODE_PREVENT_SCREEN_LOCK_DISABLED));
        if (this.r && d.contains(Item.DisableWhen.IN_PRIVATE_SESSION)) {
            z = true;
        }
        return z | contains;
    }
}
