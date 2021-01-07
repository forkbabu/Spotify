package com.spotify.music.libs.freetiertrackpreview;

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
import kotlin.jvm.internal.h;

public final class b<T> {
    private final Context a;
    private final c b;
    private final ajf<b4<T>> c;

    public b(Context context, c cVar, ajf<b4<T>> ajf) {
        h.e(context, "context");
        h.e(cVar, "viewUri");
        h.e(ajf, "contextMenuListener");
        this.a = context;
        this.b = cVar;
        this.c = ajf;
    }

    private final View a(Context context, SpotifyIconV2 spotifyIconV2, int i, int i2, View.OnClickListener onClickListener) {
        Drawable drawable;
        if (i != 0) {
            drawable = z42.f(context, spotifyIconV2, nud.i(context, i));
        } else {
            drawable = z42.e(context, spotifyIconV2);
        }
        ImageButton h = z42.h(context, drawable);
        h.d(h, "imageButton");
        h.setContentDescription(h.getResources().getString(i2));
        h.setOnClickListener(onClickListener);
        return h;
    }

    public final List<View> b(boolean z, boolean z2, T t, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3) {
        h.e(onClickListener, "onHeartClickListener");
        h.e(onClickListener2, "onBannedClickListener");
        h.e(onClickListener3, "onContextMenuClickListener");
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(this.a, z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, z ? C0707R.attr.pasteColorAccessoryGreen : 0, z ? C0707R.string.free_tier_all_songs_content_description_collection_remove : C0707R.string.free_tier_all_songs_content_description_collection_add, onClickListener));
        arrayList.add(a(this.a, SpotifyIconV2.BLOCK, z2 ? C0707R.attr.pasteColorAccessoryRed : 0, z2 ? C0707R.string.free_tier_all_songs_content_description_collection_unban : C0707R.string.free_tier_all_songs_content_description_collection_ban, onClickListener2));
        Context context = this.a;
        Drawable e = z42.e(context, SpotifyIconV2.MORE_ANDROID);
        h.d(e, "createAccessoryDrawable(context, MORE_ANDROID)");
        b4<T> b4Var = this.c.get();
        h.d(b4Var, "contextMenuListener.get()");
        c cVar = this.b;
        ImageButton h = z42.h(context, e);
        h.d(h, "button");
        h.setContentDescription(context.getString(C0707R.string.content_description_show_context_menu));
        h.setOnClickListener(new a(onClickListener3, context, b4Var, t, cVar));
        arrayList.add(h);
        return arrayList;
    }

    public final View c(View.OnClickListener onClickListener) {
        h.e(onClickListener, "onInfoButtonClicked");
        return a(this.a, SpotifyIconV2.INFO, 0, C0707R.string.track_preview_tap_shuffle_play_for_full_song, onClickListener);
    }
}
