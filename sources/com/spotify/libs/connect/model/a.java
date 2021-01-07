package com.spotify.libs.connect.model;

import java.util.List;

public interface a {
    List<GaiaDeviceCapability> getCapabilities();

    String getCosmosIdentifier();

    String getLoggingIdentifier();

    String getName();

    DeviceState getState();

    DeviceType getType();

    boolean hasIncarnations();

    boolean isActive();

    boolean isBeingActivated();

    boolean isDisabled();

    boolean isGrouped();

    boolean isSelf();

    void setActive();

    boolean supportsLogout();
}
