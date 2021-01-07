package com.spotify.music.playlist.permissions;

import com.spotify.music.playlist.permissions.proto.Permission;
import io.reactivex.z;

public interface a {
    @zqf("playlist-permission/v1/playlist/{playlist-id}/permission/base")
    z<Permission> a(@mrf("playlist-id") String str);

    @jrf("playlist-permission/v1/playlist/{playlist-id}/permission/base")
    z<Permission> b(@mrf("playlist-id") String str, @uqf Permission permission);
}
