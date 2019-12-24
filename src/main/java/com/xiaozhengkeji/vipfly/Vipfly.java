package com.xiaozhengkeji.vipfly;

import com.xiaozhengkeji.vipfly.listener.VipFlyListener;
import com.xiaozhengkeji.vipfly.utils.MsgUtils;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vipfly extends JavaPlugin {
    public static String 玩家飞行时间到期;
    public static String 玩家CD冷却;
    public static String 玩家没有VIP飞行权限;
    public static String 玩家冷却时候TIT提示_头;
    public static String 玩家冷却时候TIT提示_内容;

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        玩家飞行时间到期 = getConfig().getString("玩家飞行时间到期");
        玩家CD冷却 = getConfig().getString("玩家CD冷却");
        玩家没有VIP飞行权限 = getConfig().getString("玩家没有VIP飞行权限");
        玩家冷却时候TIT提示_头 = getConfig().getString("玩家冷却时候TIT提示.头");
        玩家冷却时候TIT提示_内容 = getConfig().getString("玩家冷却时候TIT提示.内容");
        MsgUtils.logServer("加载中!");
        //注册监听器
        MsgUtils.logServer("注册监听完成!");
        getServer().getPluginManager().registerEvents(new VipFlyListener(), this);
        PlaceholderAPI.registerPlaceholderHook("vipfly", new Api());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        MsgUtils.logServer("卸载完成!");
    }
}
