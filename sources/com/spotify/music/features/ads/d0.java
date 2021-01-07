package com.spotify.music.features.ads;

import com.google.common.base.Charsets;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class d0 implements l {
    public static final /* synthetic */ d0 a = new d0();

    private /* synthetic */ d0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        try {
            return Boolean.valueOf(new JSONObject(new String(((Response) obj).getBody(), Charsets.UTF_8)).getBoolean("active"));
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }
}
