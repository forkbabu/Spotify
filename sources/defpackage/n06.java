package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.playlist.participants.ui.c;
import com.spotify.playlist.endpoints.d;
import java.util.List;

/* renamed from: n06  reason: default package */
public interface n06 {
    Parcelable a();

    void b(Parcelable parcelable);

    void c(List<d.a.C0369a> list);

    void d(int i);

    void e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, c cVar);

    View getView();

    void setTitle(String str);
}
