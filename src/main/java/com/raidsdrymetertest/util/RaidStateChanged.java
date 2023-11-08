package com.raidsdrymetertest.util;

import lombok.Value;

@Value
public class RaidStateChanged
{

	private final RaidState previousState;
	private final RaidState newState;

}
