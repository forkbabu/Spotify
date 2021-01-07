package com.spotify.music.playlist.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.facepile.FacePileView;
import com.spotify.libs.facepile.d;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class x<T> {
    private final Context a;
    private final c b;
    private final Picasso c;
    private final ajf<b4<T>> d;

    x(Context context, c cVar, Picasso picasso, ajf<b4<T>> ajf) {
        this.a = context;
        this.b = cVar;
        this.c = picasso;
        this.d = ajf;
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

    public List<View> b(d dVar, T t, View.OnClickListener onClickListener, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!dVar.b().isEmpty()) {
            FacePileView facePileView = new FacePileView(this.a);
            facePileView.setFacePile(this.c, dVar);
            facePileView.setOnClickListener(onClickListener);
            facePileView.setContentDescription(this.a.getString(C0707R.string.playlist_ui_components_content_description_accessory_profile, str3));
            arrayList.add(facePileView);
        }
        arrayList.add(e(t, str, str2));
        return arrayList;
    }

    public List<View> c(boolean z, T t, View.OnClickListener onClickListener, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(this.a, z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, z ? C0707R.attr.pasteColorAccessoryGreen : 0, z ? C0707R.string.playlist_ui_components_content_description_collection_remove : C0707R.string.playlist_ui_components_content_description_collection_add, onClickListener));
        arrayList.add(e(t, str, str2));
        return arrayList;
    }

    public List<View> d(boolean z, boolean z2, T t, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        arrayList.add(a(this.a, z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, z ? C0707R.attr.pasteColorAccessoryGreen : 0, z ? C0707R.string.playlist_ui_components_content_description_collection_remove : C0707R.string.playlist_ui_components_content_description_collection_add, onClickListener));
        Context context = this.a;
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.BLOCK;
        if (z2) {
            i = C0707R.attr.pasteColorAccessoryRed;
        }
        arrayList.add(a(context, spotifyIconV2, i, z2 ? C0707R.string.playlist_ui_components_content_description_collection_unban : C0707R.string.playlist_ui_components_content_description_collection_ban, onClickListener2));
        arrayList.add(e(t, str, str2));
        return arrayList;
    }

    public View e(T t, String str, String str2) {
        Context context = this.a;
        Drawable e = z42.e(context, SpotifyIconV2.MORE_ANDROID);
        c cVar = this.b;
        ImageButton h = z42.h(context, e);
        h.setContentDescription(context.getString(C0707R.string.content_description_show_context_menu_with_unique_name, str, str2));
        h.setOnClickListener(new o42(context, this.d.get(), t, cVar));
        return h;
    }

    public /* synthetic */ boolean f(Object obj, View view) {
        ContextMenuFragment.b5(this.a, this.d.get(), obj, this.b);
        return true;
    }
}
