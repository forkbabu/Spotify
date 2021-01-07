package defpackage;

import android.content.res.Resources;
import com.spotify.music.C0707R;
import com.spotify.music.features.eventshub.model.Artist;
import com.spotify.music.features.eventshub.model.Concert;
import java.util.List;

/* renamed from: d15  reason: default package */
public class d15 {
    private final Resources a;

    public d15(Resources resources) {
        this.a = resources;
    }

    public String a(Concert concert) {
        List<Artist> artists = concert.getArtists();
        int size = artists.size();
        if (size == 1) {
            return String.format(this.a.getString(C0707R.string.events_hub_concert_entity_title_one_artist), artists.get(0).getName());
        }
        if (size == 2) {
            return String.format(this.a.getString(C0707R.string.events_hub_concert_entity_title_two_artists), artists.get(0).getName(), artists.get(1).getName());
        }
        if (size == 3) {
            return String.format(this.a.getString(C0707R.string.events_hub_concert_entity_title_three_artists), artists.get(0).getName(), artists.get(1).getName(), artists.get(2).getName());
        }
        if (size == 4) {
            return String.format(this.a.getString(C0707R.string.events_hub_concert_entity_title_four_artists), artists.get(0).getName(), artists.get(1).getName(), artists.get(2).getName(), artists.get(3).getName());
        }
        if (size != 5) {
            return String.format(this.a.getString(C0707R.string.events_hub_concert_entity_title_one_artist), artists.get(0).getName());
        }
        return String.format(this.a.getString(C0707R.string.events_hub_concert_entity_title_five_artists), artists.get(0).getName(), artists.get(1).getName(), artists.get(2).getName(), artists.get(3).getName(), artists.get(4).getName());
    }
}
