package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.Collections2;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.playlist.synchronizer.d;
import java.util.Map;
import java.util.TreeMap;

public class x4 implements q4 {
    private final d a;
    private int b;
    private int c;
    private final TreeMap<Integer, String> d = new TreeMap<>();

    public x4(d dVar) {
        this.a = dVar;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.q4
    public MusicItem a(MusicItem musicItem, int i) {
        int i2 = this.b;
        boolean z = false;
        if (i < i2) {
            this.b = i;
            this.c = Math.max(0, Math.min(this.c, i + 16));
            Collections2.removeIf(this.d.entrySet(), new j2(this));
        } else if (i >= this.c) {
            int i3 = i + 1;
            this.c = i3;
            this.b = Math.max(i2, i3 - 16);
            Collections2.removeIf(this.d.entrySet(), new j2(this));
        }
        if (musicItem.type() == MusicItem.Type.PLAYLIST) {
            z = true;
        }
        if (z) {
            String A = musicItem.A();
            String str = this.d.get(Integer.valueOf(i));
            if (str != null && !str.equals(A)) {
                this.a.b(str);
            }
            if (str == null || !str.equals(A)) {
                this.d.put(Integer.valueOf(i), musicItem.A());
                this.a.a(A);
            }
        }
        return musicItem;
    }

    public boolean b(Map.Entry entry) {
        if (((Integer) entry.getKey()).intValue() >= this.b && ((Integer) entry.getKey()).intValue() <= this.c) {
            return false;
        }
        this.a.b((String) entry.getValue());
        return true;
    }
}
