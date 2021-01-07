package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.spotify.music.C0707R;

/* renamed from: tpb  reason: default package */
public final /* synthetic */ class tpb implements View.OnClickListener {
    public static final /* synthetic */ tpb a = new tpb();

    private /* synthetic */ tpb() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = view.getContext();
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(context.getString(C0707R.string.voice_legal_data_policy))));
    }
}
