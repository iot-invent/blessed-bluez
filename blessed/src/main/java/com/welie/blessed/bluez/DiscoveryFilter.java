package com.welie.blessed.bluez;

import org.freedesktop.dbus.types.UInt16;

/**
 * Supported discovery filter values.
 */
public enum DiscoveryFilter {

	UUIDs(String[].class),RSSI(Short.class),Pathloss(UInt16.class),Transport(DiscoveryTransport.class), DuplicateData(Boolean.class),
	Pattern(String.class);

	private final Class<?> valueClass;

	DiscoveryFilter(final Class<?> _valueClass) {
		valueClass = _valueClass;
	}

	public Class<?> getValueClass() {
		return valueClass;
	}
}


