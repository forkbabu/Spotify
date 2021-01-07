package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import com.spotify.music.C0707R;
import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.s;
import defpackage.hed;
import defpackage.pzc;
import io.reactivex.functions.g;
import java.util.ArrayList;

/* renamed from: qed  reason: default package */
public final /* synthetic */ class qed implements g {
    public final /* synthetic */ Context a;
    public final /* synthetic */ afd b;
    public final /* synthetic */ jzc c;

    public /* synthetic */ qed(Context context, afd afd, jzc jzc) {
        this.a = context;
        this.b = afd;
        this.c = jzc;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Context context = this.a;
        afd afd = this.b;
        jzc jzc = this.c;
        hed.e eVar = (hed.e) obj;
        r build = r.h(eVar.b()).build();
        s j = s.j(build, context.getString(C0707R.string.social_listening_share_session_message_subtitle));
        pzc.a a2 = pzc.a(Uri.EMPTY, "", "", build);
        a2.c(j);
        pzc build2 = a2.build();
        ted ted = new ted(afd, eVar.a());
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(C0707R.array.excluded_share_destinations);
        ArrayList arrayList = new ArrayList(obtainTypedArray.length());
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            arrayList.add(Integer.valueOf(obtainTypedArray.getResourceId(i, -1)));
        }
        obtainTypedArray.recycle();
        jzc.b(build2, ted, arrayList, C0707R.string.integration_id_social_listening);
    }
}
