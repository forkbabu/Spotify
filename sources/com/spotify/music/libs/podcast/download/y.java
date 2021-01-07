package com.spotify.music.libs.podcast.download;

import android.content.Context;
import android.content.DialogInterface;
import com.google.common.base.Joiner;
import com.google.common.collect.FluentIterable;
import com.spotify.glue.dialogs.d;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.m;
import com.spotify.music.C0707R;
import com.spotify.playlist.endpoints.p;
import java.util.List;

public class y {
    private final Context a;

    public y(Context context) {
        this.a = context;
    }

    private d a(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        f c = m.c(this.a, str, str2);
        c.a(true);
        c.f(str3, onClickListener);
        c.e(str4, onClickListener2);
        return c.b();
    }

    public d b(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        return a(this.a.getString(C0707R.string.download_over_cellular_title), this.a.getString(C0707R.string.download_over_cellular_body), this.a.getString(C0707R.string.download_over_cellular_positive_settings_text), this.a.getString(C0707R.string.download_over_cellular_negative_cancel_text), onClickListener, onClickListener2);
    }

    public d c(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        return a(this.a.getString(C0707R.string.download_confirmation_title), this.a.getString(C0707R.string.download_confirmation_body), this.a.getString(C0707R.string.download_confirmation_positive_remove_text), this.a.getString(C0707R.string.download_confirmation_negative_cancel_text), onClickListener, onClickListener2);
    }

    public d d(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, List<p.b> list) {
        return a(this.a.getString(list.size() > 1 ? C0707R.string.download_confirmation_episode_in_playlist_multiple_title : C0707R.string.download_confirmation_episode_in_playlist_one_title), this.a.getString(list.size() > 1 ? C0707R.string.download_confirmation_episode_in_playlist_multiple_body : C0707R.string.download_confirmation_episode_in_playlist_one_body, Joiner.on(", ").join(FluentIterable.from(list).transform(s.a).toList())), this.a.getString(list.size() > 1 ? C0707R.string.download_confirmation_episode_in_playlist_multiple_positive_remove_text : C0707R.string.download_confirmation_episode_in_playlist_one_positive_remove_text), this.a.getString(C0707R.string.download_confirmation_episode_in_playlist_negative_cancel_text), onClickListener, onClickListener2);
    }

    public d e(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        return a(this.a.getString(C0707R.string.download_confirmation_episode_in_your_episodes_title), this.a.getString(C0707R.string.download_confirmation_episode_in_your_episodes_body), this.a.getString(C0707R.string.download_confirmation_positive_remove_text), this.a.getString(C0707R.string.download_confirmation_episode_in_playlist_negative_cancel_text), onClickListener, onClickListener2);
    }
}
