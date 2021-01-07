package com.spotify.music.samsungpersonalization.customization;

import androidx.fragment.app.Fragment;
import io.reactivex.z;
import java.util.List;

public interface c {
    z<List<m60>> a(String str);

    z<Boolean> b(String str);

    z<Boolean> c(Fragment fragment, String str);

    boolean d();

    boolean e();

    z<Boolean> f(Fragment fragment, String str);
}
