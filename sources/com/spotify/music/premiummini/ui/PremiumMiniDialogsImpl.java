package com.spotify.music.premiummini.ui;

import android.app.Activity;
import android.content.res.Resources;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.g;
import com.spotify.music.C0707R;
import com.spotify.ubi.specification.factories.d3;
import kotlin.jvm.internal.h;

public final class PremiumMiniDialogsImpl implements b {
    private final Resources a;
    private final g b;
    private final ere c;
    private final d3 d;

    public PremiumMiniDialogsImpl(Activity activity, g gVar, ere ere, d3 d3Var) {
        h.e(activity, "activity");
        h.e(gVar, "dialogBuilder");
        h.e(ere, "userBehaviourEventLogger");
        h.e(d3Var, "mobilePremiumMiniEventFactory");
        this.b = gVar;
        this.c = ere;
        this.d = d3Var;
        this.a = activity.getResources();
    }

    static void e(PremiumMiniDialogsImpl premiumMiniDialogsImpl, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, cmf cmf, cmf cmf2, int i) {
        String str;
        if ((i & 8) != 0) {
            str = premiumMiniDialogsImpl.a.getString(C0707R.string.dialog_button_negative);
            h.d(str, "resources.getString(R.st…g.dialog_button_negative)");
        } else {
            str = null;
        }
        if ((i & 32) != 0) {
            cmf2 = PremiumMiniDialogsImpl$showDialog$1.a;
        }
        f c2 = premiumMiniDialogsImpl.b.c(charSequence, charSequence2);
        c2.f(charSequence3, new a(0, cmf));
        c2.e(str, new a(1, cmf2));
        c2.b().a();
    }

    @Override // com.spotify.music.premiummini.ui.b
    public void a(cmf<kotlin.f> cmf) {
        h.e(cmf, "confirmClickListener");
        this.c.a(this.d.b().c());
        String string = this.a.getString(C0707R.string.remove_all_songs_dialog_title);
        h.d(string, "resources.getString(R.st…e_all_songs_dialog_title)");
        String string2 = this.a.getString(C0707R.string.remove_all_songs_dialog_text);
        h.d(string2, "resources.getString(R.st…ve_all_songs_dialog_text)");
        String string3 = this.a.getString(C0707R.string.remove_all_songs_dialog_positive);
        h.d(string3, "resources.getString(R.st…ll_songs_dialog_positive)");
        e(this, string, string2, string3, null, new PremiumMiniDialogsImpl$showRemoveAllSongsDialog$1(this, cmf), new PremiumMiniDialogsImpl$showRemoveAllSongsDialog$2(this), 8);
    }

    @Override // com.spotify.music.premiummini.ui.b
    public void b(cmf<kotlin.f> cmf) {
        h.e(cmf, "confirmClickListener");
        this.c.a(this.d.c().a());
        String quantityString = this.a.getQuantityString(C0707R.plurals.song_limit_dialog_title, 30, 30);
        h.d(quantityString, "resources.getQuantityStr…TRACK_LIMIT\n            )");
        String string = this.a.getString(C0707R.string.song_limit_dialog_message);
        h.d(string, "resources.getString(R.st…ong_limit_dialog_message)");
        String string2 = this.a.getString(C0707R.string.song_limit_dialog_button_positive);
        h.d(string2, "resources.getString(R.st…t_dialog_button_positive)");
        e(this, quantityString, string, string2, null, cmf, null, 40);
    }
}
