package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.base.Supplier;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.mobile.android.util.ui.g;
import com.spotify.music.C0707R;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable;
import com.spotify.playlist.models.offline.a;
import com.spotify.playlist.models.offline.c;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: pz3  reason: default package */
public class pz3 implements Object<View>, pk9 {
    private final Context a;
    private final Supplier<DownloadIndicatorDrawable> b = new dz3(this);

    pz3(Context context) {
        context.getClass();
        this.a = context;
    }

    public /* synthetic */ DownloadIndicatorDrawable a() {
        return new DownloadIndicatorDrawable(this.a);
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        g91.a(view, s81, aVar, iArr);
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        a aVar;
        int i = e90.i;
        Rows.i iVar = (Rows.i) l70.o(view, Rows.i.class);
        Context context = view.getContext();
        t51.a(w51, view, s81);
        iVar.setTitle(s81.text().title());
        iVar.setSubtitle(s81.text().subtitle());
        iVar.setActive("1".equals(s81.custom().get("hubs:glue:highlight")));
        iVar.setAppearsDisabled(s81.custom().boolValue("disabled", false));
        TextView subtitleView = iVar.getSubtitleView();
        byte[] byteArray = s81.custom().byteArray("availability");
        if (byteArray == null) {
            aVar = a.f.a;
        } else {
            c cVar = new c();
            Parcel obtain = Parcel.obtain();
            h.d(obtain, "Parcel.obtain()");
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            aVar = cVar.a(obtain);
            obtain.recycle();
        }
        aVar.b(new bz3(subtitleView), new fz3(this, subtitleView), new jz3(this, subtitleView), new cz3(this, subtitleView), new ez3(subtitleView), new hz3(subtitleView), new gz3(subtitleView), new iz3(subtitleView));
        TextLabelUtil.d(context, iVar.getSubtitleView(), s81.custom().string("label"));
        View k = z42.k(context, SpotifyIconV2.MORE_ANDROID);
        if (s81.events().containsKey("rightAccessoryClick")) {
            i91.b(w51.b()).e("rightAccessoryClick").d(s81).c(k).a();
        }
        iVar.z0(k);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.row_track_download_progress;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }

    public /* synthetic */ f f(TextView textView, a.h hVar) {
        ((DownloadIndicatorDrawable) g.a(this.a, textView, 0, C0707R.id.drawable_download_progress, this.b)).a(DownloadIndicatorDrawable.DownloadState.WAITING);
        return f.a;
    }

    public /* synthetic */ f g(TextView textView, a.b bVar) {
        ((DownloadIndicatorDrawable) g.a(this.a, textView, 0, C0707R.id.drawable_download_progress, this.b)).a(DownloadIndicatorDrawable.DownloadState.DOWNLOADING);
        return f.a;
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        View view = Rows.b(viewGroup.getContext(), viewGroup).getView();
        q4.I(view, new oz3());
        return view;
    }

    public /* synthetic */ f i(TextView textView, a.C0377a aVar) {
        ((DownloadIndicatorDrawable) g.a(this.a, textView, 0, C0707R.id.drawable_download_progress, this.b)).a(DownloadIndicatorDrawable.DownloadState.DOWNLOADED);
        return f.a;
    }
}
