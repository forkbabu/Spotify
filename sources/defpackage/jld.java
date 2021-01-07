package defpackage;

import com.spotify.music.superbird.setup.model.CarThingDevice;
import io.reactivex.z;
import java.util.List;

/* renamed from: jld  reason: default package */
public interface jld {
    @zqf("carthing-proxy/device/v1/mydevices?platform=superbird")
    z<List<CarThingDevice>> a();
}
