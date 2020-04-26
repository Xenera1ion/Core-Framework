package com.openrsc.server.plugins.triggers;

import com.openrsc.server.model.container.Item;
import com.openrsc.server.model.entity.player.Player;

public interface DropObjTrigger {
	/**
	 * Called when a user drops an item
	 */
	void onDropObj(Player player, Item item, Boolean fromInventory);

	/**
	 * Return true if you wish to prevent a user from dropping an item
	 */
	boolean blockDropObj(Player player, Item item, Boolean fromInventory);
}