package com.spotify.mobile.android.util.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.mobile.android.util.ui.BadgesFactory;

public final /* synthetic */ class a implements sg0 {
    public final /* synthetic */ BadgesFactory.Badge a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ BadgesFactory.BadgeSize c;

    public /* synthetic */ a(BadgesFactory.Badge badge, Context context, BadgesFactory.BadgeSize badgeSize) {
        this.a = badge;
        this.b = context;
        this.c = badgeSize;
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        return this.a.d(this.b, (Drawable) obj, this.c);
    }
}
