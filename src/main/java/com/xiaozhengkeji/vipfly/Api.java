package com.xiaozhengkeji.vipfly;

import me.clip.placeholderapi.PlaceholderHook;
import org.bukkit.entity.Player;

public class Api extends PlaceholderHook {
    @Override
    public String onPlaceholderRequest(Player p, String identifier) {
        return String.valueOf(Data.playerHashMap.get(p.getName()));
    }
}
