package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.b;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.facepile.FacePileView;
import com.spotify.libs.facepile.d;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.playlistentity.homemix.facepiledetail.FacePileDetailDialogActivity;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.libs.viewuri.c;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yd6  reason: default package */
public class yd6 {
    private final Picasso a;
    private final ajf<b4<ContextMenuItem>> b;
    private final c c;
    private final me6 d;
    private final String e;

    public yd6(Picasso picasso, me6 me6, String str, ajf<b4<ContextMenuItem>> ajf, c cVar) {
        this.a = picasso;
        this.d = me6;
        this.e = str;
        this.b = ajf;
        this.c = cVar;
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/content/Context;Lcom/spotify/music/features/playlistentity/itemlist/adapter/ContextMenuItem;Lcom/spotify/libs/facepile/d;Ljava/lang/String;ILcom/spotify/music/features/playlistentity/homemix/models/HomeMix;)Ljava/util/List<Landroid/view/View;>; */
    public List a(Context context, ContextMenuItem contextMenuItem, d dVar, String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (dVar != null && !dVar.b().isEmpty()) {
            FacePileView facePileView = new FacePileView(context);
            facePileView.setFacePile(this.a, dVar);
            facePileView.setOnClickListener(new ld6(this, str, i, context));
            arrayList.add(facePileView);
        }
        arrayList.add(p42.b(context, z42.e(context, SpotifyIconV2.MORE_ANDROID), this.b.get(), contextMenuItem, this.c));
        return arrayList;
    }

    public void b(String str, int i, Context context, View view) {
        this.d.b(str, i);
        String str2 = this.e;
        int i2 = FacePileDetailDialogActivity.L;
        Intent y = je.y(context, FacePileDetailDialogActivity.class, "KEY_PLAYLIST_URI", str2);
        y.putExtra("KEY_TRACK_URI", str);
        Bundle c2 = b.a(context, 17432576, 17432577).c();
        int i3 = a.b;
        int i4 = Build.VERSION.SDK_INT;
        context.startActivity(y, c2);
    }
}
