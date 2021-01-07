package com.spotify.music.features.freetierallsongsdialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import java.util.ArrayList;
import java.util.List;

public class b<T> {
    private final Context a;
    private final c b;
    private final ajf<b4<T>> c;

    public b(Context context, c cVar, ajf<b4<T>> ajf) {
        this.a = context;
        this.b = cVar;
        this.c = ajf;
    }

    private static View a(Context context, SpotifyIconV2 spotifyIconV2, int i, int i2, View.OnClickListener onClickListener) {
        Drawable drawable;
        if (i != 0) {
            drawable = z42.f(context, spotifyIconV2, nud.i(context, i));
        } else {
            drawable = z42.e(context, spotifyIconV2);
        }
        ImageButton h = z42.h(context, drawable);
        h.setContentDescription(h.getResources().getString(i2));
        h.setOnClickListener(onClickListener);
        return h;
    }

    public List<View> b(boolean z, boolean z2, T t, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        arrayList.add(a(this.a, z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, z ? C0707R.attr.pasteColorAccessoryGreen : 0, z ? C0707R.string.free_tier_all_songs_content_description_collection_remove : C0707R.string.free_tier_all_songs_content_description_collection_add, onClickListener));
        Context context = this.a;
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.BLOCK;
        if (z2) {
            i = C0707R.attr.pasteColorAccessoryRed;
        }
        arrayList.add(a(context, spotifyIconV2, i, z2 ? C0707R.string.free_tier_all_songs_content_description_collection_unban : C0707R.string.free_tier_all_songs_content_description_collection_ban, onClickListener2));
        Context context2 = this.a;
        arrayList.add(p42.b(context2, z42.e(context2, SpotifyIconV2.MORE_ANDROID), this.c.get(), t, this.b));
        return arrayList;
    }
}
