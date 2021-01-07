package defpackage;

import com.spotify.music.spotlets.radio.formatlist.RadioFormatListSourceModel;
import io.reactivex.z;

/* renamed from: sfd  reason: default package */
public interface sfd {
    @zqf("inspiredby-mix/v2/seed_to_playlist/{seed}?response-format=json")
    z<RadioFormatListSourceModel> a(@mrf("seed") String str);
}
